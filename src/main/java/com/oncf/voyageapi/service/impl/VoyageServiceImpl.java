/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.service.impl;

import com.oncf.voyageapi.bean.ElementItineraire;
import com.oncf.voyageapi.bean.Gare;
import com.oncf.voyageapi.bean.Train;
import com.oncf.voyageapi.bean.Voyage;
import com.oncf.voyageapi.dao.VoyageDao;
import com.oncf.voyageapi.service.ElementItineraireService;
import com.oncf.voyageapi.service.GareService;
import com.oncf.voyageapi.service.TrainService;
import com.oncf.voyageapi.service.VoyageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Salma
 */
@Service
public class VoyageServiceImpl implements VoyageService {

    @Autowired
    private VoyageDao voyageDao;
    @Autowired
    private GareService gareService;
    @Autowired
    private TrainService trainService;
    @Autowired
    private ElementItineraireService elementItineraireService;

    @Override
    public Voyage findByReference(String reference) {
        return voyageDao.findByReference(reference);
    }

    @Override
    public List<Voyage> findByGareDepartReference(String reference) {
        return voyageDao.findByGareDepartReference(reference);
    }

    @Override
    public int ajouter(Voyage voyage) {
        Gare gareDepart = gareService.findByReference(voyage.getGareDepart().getReference());
        Gare gareArrivee = gareService.findByReference(voyage.getGareArrivee().getReference());

        Voyage v = findByReference(voyage.getReference());
        if (v != null || voyage.getReference() == null) {
            return -1;
        } else if (gareDepart == null) {
            return -2;
        } else if (gareArrivee == null) {
            return -3;
        } else if (voyage.getElementItineraires() == null || voyage.getElementItineraires().isEmpty()) {
            return -4;
        } else if (voyage.getTrain() == null) {
            return -5;
        } else {
            Train tr = trainService.findByReference(voyage.getTrain().getReference());
            if (tr == null) {
                return -6;
            } else {
                voyage.setTrain(tr);
                voyage.setGareArrivee(gareArrivee);
                voyage.setGareDepart(gareDepart);
                voyageDao.save(voyage);
                List<ElementItineraire> elementItineraires = voyage.getElementItineraires();
                elementItineraireService.ajouter(voyage, voyage.getElementItineraires());
                return 1;
            }

        }

    }

//    private int validerVoyage(Voyage v) {
//        if (v == null) {
//            return -1;
//        } else if (v.getGareDepart() == null) {
//            return -2;
//        } else if (v.getGareArrivee() == null) {
//            return -2;
//        } else if (v.getElementItineraires() == null || v.getElementItineraires().isEmpty()) {
//            return -3;
//        } else if (v.getTrain() == null) {
//            return -4;
//        } else {
//            return 1;
//        }
//    }
    public VoyageDao getVoyageDao() {
        return voyageDao;
    }

    public void setVoyageDao(VoyageDao voyageDao) {
        this.voyageDao = voyageDao;
    }

    public ElementItineraireService getElementItineraireService() {
        return elementItineraireService;
    }

    public void setElementItineraireService(ElementItineraireService elementItineraireService) {
        this.elementItineraireService = elementItineraireService;
    }

    public GareService getGareService() {
        return gareService;
    }

    public void setGareService(GareService gareService) {
        this.gareService = gareService;
    }

    public TrainService getTrainService() {
        return trainService;
    }

    public void setTrainService(TrainService trainService) {
        this.trainService = trainService;
    }

}

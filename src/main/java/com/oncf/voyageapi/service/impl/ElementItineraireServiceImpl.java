/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.service.impl;

import com.oncf.voyageapi.bean.ElementItineraire;
import com.oncf.voyageapi.bean.Gare;
import com.oncf.voyageapi.bean.Voyage;
import com.oncf.voyageapi.dao.ElementItineraireDao;
import com.oncf.voyageapi.service.ElementItineraireService;
import com.oncf.voyageapi.service.GareService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Salma
 */
@Service
public class ElementItineraireServiceImpl implements ElementItineraireService {

    @Autowired
    private ElementItineraireDao elementItineraireDao;
    @Autowired
    private ElementItineraireService elementItineraireService;
    @Autowired
    private GareService gareService;

    @Override
    public List<ElementItineraire> findByVoyageReference(String reference) {
        return elementItineraireDao.findByVoyageReference(reference);
    }

    @Override
    public int ajouter(Voyage voyage, List<ElementItineraire> elementItineraires) {
        if (voyage == null) {
            return -1;
        } else if (elementItineraires == null || elementItineraires.isEmpty()) {
            return -2;
        } else {
            for (ElementItineraire elementItineraire : elementItineraires) {
                elementItineraire.setVoyage(voyage);
                ajouter(elementItineraire);
            }
            return 1;
        }
    }

    @Override
    public int ajouter(ElementItineraire elementItineraire) {
        if (elementItineraire == null) {
            return -1;
        } else if (elementItineraire.getVoyage() == null) {
            return -2;
        } else {
            Gare gareDepart = gareService.findByReference(elementItineraire.getGareDepart().getReference());
            Gare gareArrivee = gareService.findByReference(elementItineraire.getGareArrivee().getReference());
            if (gareDepart == null) {
                return -2;
            } else if (gareArrivee == null) {
                return -3;
            } else {
                elementItineraire.setGareArrivee(gareArrivee);
                elementItineraire.setGareDepart(gareDepart);
                elementItineraireDao.save(elementItineraire);
                return 1;
            }
        }

    }

    @Override
    public List<ElementItineraire> findByGareDepartReferenceAndGareArriveeReference(String gareDepartReference, String gareArriveeReference) {
        return elementItineraireDao.findByGareDepartReferenceAndGareArriveeReference(gareDepartReference, gareArriveeReference);
    }

    public ElementItineraireDao getElementItineraireDao() {
        return elementItineraireDao;
    }

    public void setElementItineraireDao(ElementItineraireDao elementItineraireDao) {
        this.elementItineraireDao = elementItineraireDao;
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

}

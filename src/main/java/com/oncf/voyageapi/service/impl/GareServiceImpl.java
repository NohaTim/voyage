/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.service.impl;

import com.oncf.voyageapi.bean.Gare;
import com.oncf.voyageapi.bean.Ville;
import com.oncf.voyageapi.dao.GareDao;
import com.oncf.voyageapi.service.GareService;
import com.oncf.voyageapi.service.VilleService;
import com.oncf.voyageapi.service.VoyageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Salma
 */
@Service
public class GareServiceImpl implements GareService {

    @Autowired
    private GareDao gareDao;
    @Autowired
    private VilleService villeService;

    @Override
    public int ajouter(Gare gare) {
        if (gare == null) {
            return -1;
        }
        Gare g = gareDao.findByReference(gare.getReference());
        if (g != null) {
            return -2;
        } else if (gare.getVille() == null) {
            return -3;
        } else {
            Ville ville = villeService.findByReference(gare.getVille().getReference());
            gare.setVille(ville);
            gareDao.save(gare);
            return 1;
        }
    }

    @Override
    public List<Gare> findByVilleReference(String reference) {
        return gareDao.findByVilleReference(reference);
    }

    @Override
    public Gare findByReference(String reference) {
        return gareDao.findByReference(reference);
    }

    public GareDao getGareDao() {
        return gareDao;
    }

    public void setGareDao(GareDao gareDao) {
        this.gareDao = gareDao;
    }

    public VilleService getVilleService() {
        return villeService;
    }

    public void setVilleService(VilleService villeService) {
        this.villeService = villeService;
    }

}

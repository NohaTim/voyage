/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.service.impl;

import com.oncf.voyageapi.bean.Gare;
import com.oncf.voyageapi.bean.Ville;
import com.oncf.voyageapi.dao.VilleDao;
import com.oncf.voyageapi.service.GareService;
import com.oncf.voyageapi.service.VilleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Salma
 */
@Service
public class VilleServiceImpl implements VilleService {

    @Autowired
    private VilleDao villeDao;
    @Autowired

    private GareService gareService;

    @Override
    public int ajouter(Ville ville) {
        Ville v = findByReference(ville.getReference());
        if (v != null) {
            return -1;
        } else {
            villeDao.save(ville);
            return 1;
        }
    }

    @Override
    public Ville findByReference(String reference) {
        return villeDao.findByReference(reference);

    }

    public VilleDao getVilleDao() {
        return villeDao;
    }

    public void setVilleDao(VilleDao villeDao) {
        this.villeDao = villeDao;
    }

    public GareService getGareService() {
        return gareService;
    }

    public void setGareService(GareService gareService) {
        this.gareService = gareService;
    }

}

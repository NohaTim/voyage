/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.service.impl;

import com.oncf.voyageapi.bean.Train;
import com.oncf.voyageapi.dao.TrainDao;
import com.oncf.voyageapi.service.TrainService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Salma
 */
@Service
public class TrainServiceImpl implements TrainService {
    @Autowired
    private TrainDao trainDao;
    @Autowired 

    private TrainService trainService;    

    @Override
    public Train findByReference(String reference) {
        return trainDao.findByReference(reference);
    }

    @Override
    public int ajouter(Train train) {
        Train t = trainDao.findByReference(train.getReference());
        if(t!=null)
        {
            return-1;
        }
        else{
        trainDao.save(train);
        return 1;
    }

   
}
    
    @Override
    public List<Train> findAll() {
        return trainDao.findAll();
    }

    public TrainDao getTrainDao() {
        return trainDao;
    }

    public void setTrainDao(TrainDao trainDao) {
        this.trainDao = trainDao;
    }

    public TrainService getTrainService() {
        return trainService;
    }

    public void setTrainService(TrainService trainService) {
        this.trainService = trainService;
    }

    
}

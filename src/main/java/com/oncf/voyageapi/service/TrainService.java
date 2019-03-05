/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.service;

import com.oncf.voyageapi.bean.Train;
import java.util.List;

/**
 *
 * @author Salma
 */
public interface TrainService {
            public Train findByReference(String reference);
            public int ajouter(Train  train);
            public List<Train> findAll();
            
}

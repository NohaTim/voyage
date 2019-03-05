/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.dao;

import com.oncf.voyageapi.bean.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Salma
 */
@Repository
public interface TrainDao extends JpaRepository<Train,Long>{
        public Train findByReference(String reference);

}

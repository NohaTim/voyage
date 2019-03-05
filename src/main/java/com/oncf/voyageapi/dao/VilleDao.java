/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.dao;

import com.oncf.voyageapi.bean.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Salma
 */
@Repository
public interface VilleDao extends JpaRepository<Ville,Long> {
    
    public Ville findByReference(String reference);
    
}
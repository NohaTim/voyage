/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.dao;

import com.oncf.voyageapi.bean.Gare;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Salma
 */
@Repository
public interface GareDao extends JpaRepository<Gare, Long> {

    public List<Gare> findByVilleReference(String reference);

    public Gare findByReference(String reference);

}

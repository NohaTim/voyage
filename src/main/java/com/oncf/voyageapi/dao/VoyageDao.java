/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.dao;

import com.oncf.voyageapi.bean.Voyage;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @auhor Salma
 */
@Repository
public interface VoyageDao extends JpaRepository<Voyage, Long> {

    public Voyage findByReference(String reference);

    public List<Voyage> findByGareDepartReference(String reference);

}

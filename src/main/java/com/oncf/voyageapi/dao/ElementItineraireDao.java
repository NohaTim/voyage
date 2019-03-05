/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.dao;

import com.oncf.voyageapi.bean.ElementItineraire;
import com.oncf.voyageapi.bean.Gare;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Salma
 */
@Repository
public  interface ElementItineraireDao extends JpaRepository<ElementItineraire,Long> {
    
    public List<ElementItineraire> findByVoyageReference(String reference);
    public List<ElementItineraire> findByGareDepartReferenceAndGareArriveeReference(String gareDepartReference, String gareArriveeReference);

}



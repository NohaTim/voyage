/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.service;

import com.oncf.voyageapi.bean.ElementItineraire;
import com.oncf.voyageapi.bean.Voyage;
import java.util.List;

/**
 *
 * @author Salma
 */
public interface ElementItineraireService {

    public List<ElementItineraire> findByVoyageReference(String reference);

    public List<ElementItineraire> findByGareDepartReferenceAndGareArriveeReference(String gareDepartReference, String gareArriveeReference);

    public int ajouter(ElementItineraire elementItineraire);

    public int ajouter(Voyage voyage, List<ElementItineraire> elementItineraires);
}

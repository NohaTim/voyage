/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.rest;

import com.oncf.voyageapi.bean.ElementItineraire;
import com.oncf.voyageapi.service.ElementItineraireService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Salma
 */
@RestController()
@RequestMapping({"/voyage-api/elementItineraires"})//chemin: nom du paquege+nom de la classe 
public class ElementItineraireRest {
     
    @Autowired
    private ElementItineraireService elementItineraireService;
       @PostMapping("/")
    public int ajouter(@RequestBody  ElementItineraire elementItineraire) {
        return elementItineraireService.ajouter(elementItineraire);
    }
    
     @GetMapping("/reference/{reference}")   
      public List<ElementItineraire> findByVoyageReference(@PathVariable String reference) {
          return elementItineraireService.findByVoyageReference(reference);
    
    
}
     @GetMapping("/gareDepart/{gareDepartReference}/gareArrivee/{gareArriveeReference}")   

    public List<ElementItineraire> findByGareDepartReferenceAndGareArriveeReference(@PathVariable String gareDepartReference,@PathVariable String gareArriveeReference) {
        return elementItineraireService.findByGareDepartReferenceAndGareArriveeReference(gareDepartReference, gareArriveeReference);
    }

    public ElementItineraireService getElementItineraireService() {
        return elementItineraireService;
    }

    public void setElementItineraireService(ElementItineraireService elementItineraireService) {
        this.elementItineraireService = elementItineraireService;
    }
      
}
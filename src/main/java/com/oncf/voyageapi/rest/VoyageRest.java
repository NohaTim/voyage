 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.rest;

import com.oncf.voyageapi.bean.Gare;
import com.oncf.voyageapi.bean.Voyage;
import com.oncf.voyageapi.rest.converter.VoyageConverter;
import com.oncf.voyageapi.rest.vo.VoyageVo;
import com.oncf.voyageapi.service.GareService;
import com.oncf.voyageapi.service.VoyageService;
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
@RequestMapping({"/voyage-api/voyages"})//chemin: nom du paquege+nom de la classe 
public class VoyageRest {

    @Autowired
    private VoyageService voyageService;
    @Autowired
    private VoyageConverter voyageConverter;

    @PostMapping("/")
    public int ajouter(@RequestBody VoyageVo voyageVo) {
        System.out.println("ha Objet Vo ");
        System.out.println(voyageVo);
        Voyage v = voyageConverter.toItem(voyageVo);
        System.out.println("ha objet Item");
        System.out.println(v);
        int res = voyageService.ajouter(v);
        return res;
    }

    @GetMapping("/reference/{reference}")
    public VoyageVo findByReference(@PathVariable String reference) {
        return new VoyageConverter().toVO(voyageService.findByReference(reference));

    }

    public VoyageService getVoyageService() {
        return voyageService;
    }

    public void setVoyageService(VoyageService voyageService) {
        this.voyageService = voyageService;
    }

    public VoyageConverter getVoyageConverter() {
        return voyageConverter;
    }

    public void setVoyageConverter(VoyageConverter voyageConverter) {
        this.voyageConverter = voyageConverter;
    }

}

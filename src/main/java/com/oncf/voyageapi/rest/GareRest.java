/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.rest;

import com.oncf.voyageapi.bean.Gare;
import com.oncf.voyageapi.rest.converter.GareConverter;
import com.oncf.voyageapi.rest.vo.GareVo;
import com.oncf.voyageapi.service.GareService;
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
@RequestMapping({"/voyage-api/gares"})//chemin: nom du paquege+nom de la classe 
public class GareRest {

    @Autowired
    private GareService gareService;
    @Autowired
    private GareConverter gareConverter;

    @PostMapping("/")
    public int ajouter(@RequestBody GareVo gareVo) {
        System.out.println("hahahaha");
        System.out.println(gareVo);
        Gare g = gareConverter.toItem(gareVo);
        System.out.println("hada Item");
        System.out.println(g);
        return gareService.ajouter(g);
    }

//    @GetMapping("/reference/{reference}")
//    public List<Gare> findByVilleReference(@PathVariable String reference) {
//        return gareService.findByVilleReference(reference);
//
//    }
    @GetMapping("/reference/{reference}")

    public Gare findByReference(@PathVariable String reference) {
        return gareService.findByReference(reference);
    }

    public GareService getGareService() {
        return gareService;
    }

    public void setGareService(GareService gareService) {
        this.gareService = gareService;
    }

}

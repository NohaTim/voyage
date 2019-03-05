/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.rest;

import com.oncf.voyageapi.bean.Ville;
import com.oncf.voyageapi.rest.converter.VilleConverter;
import com.oncf.voyageapi.rest.vo.VilleVo;
import com.oncf.voyageapi.service.VilleService;
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
@RequestMapping({"/voyage-api/villes"})
public class VilleRest {

    @Autowired
    private VilleService villeService;
    @Autowired
    private VilleConverter villeConverter;

    @GetMapping("/reference/{reference}")
    public VilleVo findByReference(@PathVariable String reference) {
        Ville ville = villeService.findByReference(reference);
        return villeConverter.toVO(ville);

    }

    @PostMapping("/")
    public int ajouter(@RequestBody VilleVo villeVo) {
        Ville v = villeConverter.toItem(villeVo);
        int res = villeService.ajouter(v);
        return res;
    }

    public VilleService getVilleService() {
        return villeService;
    }

    public void setVilleService(VilleService villeService) {
        this.villeService = villeService;
    }

    public VilleConverter getVilleConverter() {
        return villeConverter;
    }

    public void setVilleConverter(VilleConverter villeConverter) {
        this.villeConverter = villeConverter;
    }
    
}

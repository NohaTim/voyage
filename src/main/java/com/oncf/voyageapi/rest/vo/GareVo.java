/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.rest.vo;

/**
 *
 * @author Salma
 */
public class GareVo {
     private Long id;
    private String nom;
    private String reference;
    
    private VilleVo villeVo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public VilleVo getVilleVo() {
        return villeVo;
    }

    public void setVilleVo(VilleVo villeVo) {
        this.villeVo = villeVo;
    }
    
}

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
public class TrainVo {
     private Long id;
    private String reference;
    private String nombrePlace;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getNombrePlace() {
        return nombrePlace;
    }

    public void setNombrePlace(String nombrePlace) {
        this.nombrePlace = nombrePlace;
    }
    
    
}

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
public class ElementItineraireVo {

    private Long id;
    private GareVo gareDepartVo;
    private GareVo gareArriveeVo;
    private VoyageVo voyageVo;
    private String reference;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GareVo getGareDepartVo() {
        return gareDepartVo;
    }

    public void setGareDepartVo(GareVo gareDepartVo) {
        this.gareDepartVo = gareDepartVo;
    }

    public GareVo getGareArriveeVo() {
        return gareArriveeVo;
    }

    public void setGareArriveeVo(GareVo gareArriveeVo) {
        this.gareArriveeVo = gareArriveeVo;
    }

    public VoyageVo getVoyageVo() {
        return voyageVo;
    }

    public void setVoyageVo(VoyageVo voyageVo) {
        this.voyageVo = voyageVo;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "ElementItineraireVo{" + "id=" + id + ", gareDepartVo=" + gareDepartVo + ", gareArriveeVo=" + gareArriveeVo + ", voyageVo=" + voyageVo + ", reference=" + reference + '}';
    }

}

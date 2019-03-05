/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.rest.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
import org.springframework.data.web.JsonPath;

/**
 *
 * @author Salma
 */
public class VoyageVo {

    private Long id;
    private String reference;
    private String dateDepart;
    private String dateArrivee;
    private GareVo gareDepartVo;
    private GareVo gareArriveeVo;
    private String nbrPlaceDisponible;
    private String nbrPlaceReservee;
    private String nbrPlaceReel;
    private List<ElementItineraireVo> elementItinerairesVo;

    private TrainVo trainVo;

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

    public String getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    public String getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(String dateArrivee) {
        this.dateArrivee = dateArrivee;
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

    public String getNbrPlaceDisponible() {
        return nbrPlaceDisponible;
    }

    public void setNbrPlaceDisponible(String nbrPlaceDisponible) {
        this.nbrPlaceDisponible = nbrPlaceDisponible;
    }

    public String getNbrPlaceReservee() {
        return nbrPlaceReservee;
    }

    public void setNbrPlaceReservee(String nbrPlaceReservee) {
        this.nbrPlaceReservee = nbrPlaceReservee;
    }

    public String getNbrPlaceReel() {
        return nbrPlaceReel;
    }

    public void setNbrPlaceReel(String nbrPlaceReel) {
        this.nbrPlaceReel = nbrPlaceReel;
    }

    public TrainVo getTrainVo() {
        return trainVo;
    }

    public void setTrainVo(TrainVo trainVo) {
        this.trainVo = trainVo;
    }

    @JsonIgnore
    public List<ElementItineraireVo> getElementItinerairesVo() {
        return elementItinerairesVo;
    }

    @JsonSetter
    public void setElementItinerairesVo(List<ElementItineraireVo> elementItinerairesVo) {
        this.elementItinerairesVo = elementItinerairesVo;
    }

    @Override
    public String toString() {
        return "VoyageVo{" + "id=" + id + ", reference=" + reference + ", dateDepart=" + dateDepart + ", dateArrivee=" + dateArrivee + ", gareDepartVo=" + gareDepartVo + ", gareArriveeVo=" + gareArriveeVo + ", nbrPlaceDisponible=" + nbrPlaceDisponible + ", nbrPlaceReservee=" + nbrPlaceReservee + ", nbrPlaceReel=" + nbrPlaceReel + ", elementItinerairesVo=" + elementItinerairesVo + ", trainVo=" + trainVo + '}';
    }

}

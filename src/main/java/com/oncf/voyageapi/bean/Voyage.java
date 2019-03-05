/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Salma
 */
@Entity
public class Voyage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateDepart;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateArrivee;
    @ManyToOne
    private Gare gareDepart;
    @ManyToOne
    private Gare gareArrivee;
    private int nbrPlaceDisponible;
    private int nbrPlaceReservee;
    private int nbrPlaceReel;
    @ManyToOne
    private Train train;
    @OneToMany(mappedBy = "voyage")
    private List<ElementItineraire> elementItineraires;

    @JsonIgnore
    public List<ElementItineraire> getElementItineraires() {
        return elementItineraires;
    }

    @JsonSetter
    public void setElementItineraires(List<ElementItineraire> elementItineraires) {
        if (elementItineraires != null) {
            this.elementItineraires = elementItineraires;
        }
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public Gare getGareDepart() {
        return gareDepart;
    }

    public void setGareDepart(Gare gareDepart) {
        this.gareDepart = gareDepart;
    }

    public Gare getGareArrivee() {
        return gareArrivee;
    }

    public void setGareArrivee(Gare gareArrivee) {
        this.gareArrivee = gareArrivee;
    }

    public int getNbrPlaceDisponible() {
        return nbrPlaceDisponible;
    }

    public void setNbrPlaceDisponible(int nbrPlaceDisponible) {
        this.nbrPlaceDisponible = nbrPlaceDisponible;
    }

    public int getNbrPlaceReservee() {
        return nbrPlaceReservee;
    }

    public void setNbrPlaceReservee(int nbrPlaceReservee) {
        this.nbrPlaceReservee = nbrPlaceReservee;
    }

    public int getNbrPlaceReel() {
        return nbrPlaceReel;
    }

    public void setNbrPlaceReel(int nbrPlaceReel) {
        this.nbrPlaceReel = nbrPlaceReel;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Voyage)) {
            return false;
        }
        Voyage other = (Voyage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Voyage{" + "id=" + id + ", reference=" + reference + ", dateDepart=" + dateDepart + ", dateArrivee=" + dateArrivee + ", gareDepart=" + gareDepart + ", gareArrivee=" + gareArrivee + ", nbrPlaceDisponible=" + nbrPlaceDisponible + ", nbrPlaceReservee=" + nbrPlaceReservee + ", nbrPlaceReel=" + nbrPlaceReel + ", train=" + train + ", elementItineraires=" + elementItineraires + '}';
    }

}

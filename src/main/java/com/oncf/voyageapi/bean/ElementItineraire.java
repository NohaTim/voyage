/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Salma
 */
@Entity
public class ElementItineraire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    @ManyToOne
    private Gare gareDepart;
    @ManyToOne
    private Gare gareArrivee;
    @ManyToOne
    private Voyage voyage;

    public ElementItineraire(Long id, Gare gareDepart, Gare gareArrivee, Voyage voyage, String reference) {
        this.id = id;
        this.gareDepart = gareDepart;
        this.gareArrivee = gareArrivee;
        this.voyage = voyage;
        this.reference = reference;
    }

    public ElementItineraire() {
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
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

    public Voyage getVoyage() {
        return voyage;
    }

    public void setVoyage(Voyage voyage) {
        this.voyage = voyage;
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
        if (!(object instanceof ElementItineraire)) {
            return false;
        }
        ElementItineraire other = (ElementItineraire) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ElementItineraire{" + "id=" + id + ", reference=" + reference + ", gareDepart=" + gareDepart + ", gareArrivee=" + gareArrivee + ", voyage=" + voyage + '}';
    }



}

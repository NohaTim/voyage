/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.service;

import com.oncf.voyageapi.bean.Gare;
import java.util.List;

/**
 *
 * @author Salma
 */
public interface GareService {

    public int ajouter(Gare gare);

    public List<Gare> findByVilleReference(String reference);

    public Gare findByReference(String reference);

    // public Gare findByReference(String reference);
}

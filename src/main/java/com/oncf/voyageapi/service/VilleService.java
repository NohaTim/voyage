/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.service;

import com.oncf.voyageapi.bean.Ville;

/**
 *
 * @author Salma
 */
public interface VilleService {
     public int ajouter(Ville ville);//signature
    public Ville findByReference(String reference);
}

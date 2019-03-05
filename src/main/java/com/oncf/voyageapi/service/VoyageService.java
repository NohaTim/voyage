/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.service;

import com.oncf.voyageapi.bean.Voyage;
import java.util.List;

/**
 *
 * @author Salma
 */
public interface VoyageService {

    public Voyage findByReference(String reference);

    public int ajouter(Voyage voyage);

    public List<Voyage> findByGareDepartReference(String reference);

}

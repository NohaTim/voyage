/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.rest.converter;

import com.oncf.voyageapi.bean.Ville;
import com.oncf.voyageapi.rest.vo.VilleVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author Salma
 */
@Component
public class VilleConverter extends AbstractConverter<Ville, VilleVo> {

    @Override
    public Ville toItem(VilleVo vo) {
        if (vo == null) {
            return null;
        } else {
            Ville ville = new Ville();
            ville.setId(vo.getId());
            ville.setNom(vo.getNom());
            ville.setReference(vo.getReference());
            return ville;
        }
    }

    @Override
    public VilleVo toVO(Ville item) {
        if (item == null) {
            return null;
        } else {
            VilleVo vo = new VilleVo();
            vo.setId(item.getId());
            vo.setNom(item.getNom());
            vo.setReference(item.getReference());
            return vo;
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.rest.converter;

import com.oncf.voyageapi.bean.Gare;
import com.oncf.voyageapi.rest.vo.GareVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author Salma
 */
@Component
public class GareConverter extends AbstractConverter<Gare, GareVo> {

    @Override
    public Gare toItem(GareVo vo) {
        if (vo == null) {
            return null;
        } else {
            Gare gare = new Gare();
            gare.setId(vo.getId());
            gare.setNom(vo.getNom());
            gare.setReference(vo.getReference());
            gare.setVille(new VilleConverter().toItem(vo.getVilleVo()));
            return gare;
        }

    }

    @Override
    public GareVo toVO(Gare item) {
        if (item == null) {
            return null;
        } else {
            GareVo vo = new GareVo();
            vo.setId(item.getId());
            vo.setNom(item.getNom());
            vo.setReference(item.getReference());
            return vo;
        }
    }

}

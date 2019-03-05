/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.rest.converter;

import com.oncf.voyageapi.bean.Voyage;
import com.oncf.voyageapi.common.util.DateUtil;
import com.oncf.voyageapi.common.util.NumberUtil;
import com.oncf.voyageapi.rest.vo.VoyageVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author Salma
 */
@Component
public class VoyageConverter extends AbstractConverter<Voyage, VoyageVo> {

    @Override
    public Voyage toItem(VoyageVo vo) {
        if (vo == null) {
            return null;
        } else {
            Voyage voyage = new Voyage();
            voyage.setId(vo.getId());
            voyage.setReference(vo.getReference());
            voyage.setNbrPlaceDisponible(NumberUtil.toInteger(vo.getNbrPlaceDisponible()));
            voyage.setNbrPlaceReel(NumberUtil.toInteger(vo.getNbrPlaceReel()));
            voyage.setNbrPlaceReservee(NumberUtil.toInteger(vo.getNbrPlaceReservee()));
            voyage.setDateDepart(DateUtil.parse(vo.getDateDepart()));
            voyage.setDateArrivee(DateUtil.parse(vo.getDateArrivee()));
            voyage.setGareArrivee(new GareConverter().toItem(vo.getGareArriveeVo()));
            voyage.setGareDepart(new GareConverter().toItem(vo.getGareDepartVo()));
            voyage.setTrain(new TrainConverter().toItem(vo.getTrainVo()));
            voyage.setElementItineraires(new ElementItineraireConverter().toItem(vo.getElementItinerairesVo()));
            return voyage;
        }
    }

    @Override
    public VoyageVo toVO(Voyage item) {
        if (item == null) {
            return null;
        } else {
            VoyageVo vo = new VoyageVo();
            vo.setId(item.getId());
            vo.setReference(item.getReference());
            vo.setDateDepart(DateUtil.formateDate(item.getDateDepart()));
            vo.setDateArrivee(DateUtil.formateDate(item.getDateArrivee()));
            vo.setElementItinerairesVo(new ElementItineraireConverter().toVo(item.getElementItineraires()));
            vo.setNbrPlaceDisponible(NumberUtil.toString(item.getNbrPlaceDisponible()));
            vo.setNbrPlaceReel(NumberUtil.toString(item.getNbrPlaceDisponible()));
            vo.setNbrPlaceReservee(NumberUtil.toString(item.getNbrPlaceReservee()));
            vo.setTrainVo(new TrainConverter().toVO(item.getTrain()));
            return vo;

        }
    }

}

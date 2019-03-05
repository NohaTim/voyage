/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.rest.converter;

import com.oncf.voyageapi.bean.ElementItineraire;
import com.oncf.voyageapi.bean.Gare;
import com.oncf.voyageapi.rest.vo.ElementItineraireVo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Salma
 */
public class ElementItineraireConverter extends AbstractConverter<ElementItineraire, ElementItineraireVo> {

   // @Autowired
    //private GareConverter gareConverter;

    @Override
    public ElementItineraire toItem(ElementItineraireVo vo) {
        if (vo == null) {
            return null;
        } else {
            ElementItineraire elementItineraire = new ElementItineraire();
            elementItineraire.setId(vo.getId());
            elementItineraire.setReference(vo.getReference());
            if (vo.getGareArriveeVo() != null) {
              //  elementItineraire.setGareArrivee(new Gare(vo.getGareArriveeVo().getReference()));
                elementItineraire.setGareDepart(new GareConverter().toItem(vo.getGareDepartVo()));

            }
            if (vo.getGareDepartVo() != null) {
               // elementItineraire.setGareDepart(new Gare(vo.getGareDepartVo().getReference()));
                           elementItineraire.setGareArrivee(new GareConverter().toItem(vo.getGareArriveeVo()));

            }
            return elementItineraire;
        }
    }

    @Override
    public ElementItineraireVo toVO(ElementItineraire item) {
        if (item == null) {
            return null;
        } else {
            ElementItineraireVo vo = new ElementItineraireVo();
            vo.setId(item.getId());
            vo.setReference(item.getReference());
            return vo;
        }
    }

    @Override
    public List<ElementItineraire> toItem(List<ElementItineraireVo> vos) {
        return super.toItem(vos); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ElementItineraireVo> toVo(List<ElementItineraire> items) {
        return super.toVo(items); //To change body of generated methods, choose Tools | Templates.
    }

   // public GareConverter getGareConverter() {
     //   return gareConverter;
    //}

    //public void setGareConverter(GareConverter gareConverter) {
      //  this.gareConverter = gareConverter;
    //}

}

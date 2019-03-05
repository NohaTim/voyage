/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.rest.converter;

import com.oncf.voyageapi.bean.Train;
import com.oncf.voyageapi.common.util.NumberUtil;
import com.oncf.voyageapi.rest.vo.TrainVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author Salma
 */
@Component
public class TrainConverter extends AbstractConverter<Train,TrainVo>{

    @Override
    public Train toItem(TrainVo vo) {
          if(vo==null){
            return null;
        }else{  
              Train train = new Train();
              train.setId(vo.getId());
              train.setNombrePlace(NumberUtil.toInteger(vo.getNombrePlace()));
              train.setReference(vo.getReference());
              return train;
          }
       
        
    }

    @Override
    public TrainVo toVO(Train item) {
          if(item==null){
            return null;
        }else{
              TrainVo vo = new TrainVo();
              vo.setId(item.getId());
              vo.setNombrePlace(NumberUtil.toString(item.getNombrePlace()));
              vo.setReference(item.getReference());
              return vo;
          }
        
        
    }

  
}

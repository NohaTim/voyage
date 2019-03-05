/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.rest;

import com.oncf.voyageapi.bean.Train;
import com.oncf.voyageapi.rest.converter.TrainConverter;
import com.oncf.voyageapi.rest.vo.TrainVo;
import com.oncf.voyageapi.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Salma
 */
@RestController()
@RequestMapping({"/voyage-api/trains"})
@CrossOrigin(origins = {"http://localhost:4200  " })
public class TrainRest {

    @Autowired
    private TrainService trainService;
    @Autowired
    private TrainConverter trainConverter;
 @Qualifier("trainConverter")
    @PostMapping("/")
    public int ajouter(@RequestBody TrainVo trainVo) {
        Train t = trainConverter.toItem(trainVo);
        return trainService.ajouter(t);

    }

    @GetMapping("/reference/{reference}")
    public TrainVo findByReference(@PathVariable String reference) {
        return new TrainConverter().toVO(trainService.findByReference(reference));

    }

    public TrainService getTrainService() {
        return trainService;
    }

    public void setTrainService(TrainService trainService) {
        this.trainService = trainService;
    }

    public TrainConverter getTrainConverter() {
        return trainConverter;
    }

    public void setTrainConverter(TrainConverter trainConverter) {
        this.trainConverter = trainConverter;
    }
    
}

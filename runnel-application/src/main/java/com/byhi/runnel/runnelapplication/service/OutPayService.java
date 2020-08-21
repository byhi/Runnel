package com.byhi.runnel.runnelapplication.service;

import com.byhi.runnel.dataloader.helper.GenericDataLoader;
import com.byhi.runnel.dataloader.helper.OutPayDataLoader;
import com.byhi.runnel.dataloader.modal.OutPay;
import com.byhi.runnel.dataloader.modal.Policy;
import com.byhi.runnel.runnelapplication.modal.OutPayEntity;
import com.byhi.runnel.runnelapplication.repository.OutPayRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class OutPayService {

    @Autowired
    OutPayRepository outPayRepository;

    @Autowired
    private ModelMapper modelMapper;

   public void outPayProcessing(InputStream inputStream){
       OutPayDataLoader dataLoader = new OutPayDataLoader();
       int expectedLineSize = 13;

       try {
           List<OutPay> list = dataLoader.loader(inputStream, "Windows-1250", ";", expectedLineSize);
           List<OutPayEntity> outPayEntities = new ArrayList<>();

           for (OutPay outPay: list) {
               outPayEntities.add(this.convertToEntity(outPay));
           }
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
   }

    private OutPayEntity convertToEntity(OutPay outPay) {
        return  modelMapper.map(outPay, OutPayEntity.class);
    }
}

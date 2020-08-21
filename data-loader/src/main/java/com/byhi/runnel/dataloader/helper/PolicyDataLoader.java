package com.byhi.runnel.dataloader.helper;

import com.byhi.runnel.dataloader.modal.Policy;

import java.util.*;

public class PolicyDataLoader extends GenericDataLoader<Policy> {

    @Override
    public Policy parsingGenericList(List<String> lines, int expectedSize) {
        Policy newProduct = null;

        if(lines.size()==expectedSize){
            newProduct = new Policy(Long.valueOf(lines.get(0)),lines.get(1),  lines.get(2), lines.get(3), lines.get(4), lines.get(5), lines.get(6), lines.get(7));
           // this.genericList.add(newProduct);
        }else{
            System.out.println("Kivétel");
        }
        return newProduct;
    }
}

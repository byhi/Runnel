package com.byhi.runnel.dataloader.helper;

import com.byhi.runnel.dataloader.modal.OutPay;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class OutPayDataLoader extends GenericDataLoader<OutPay> {

    @Override
    public OutPay parsingGenericList(List<String> lines, int expectedSize) {
        OutPay newProduct = null;
        if(lines.size()==expectedSize){
            newProduct = new OutPay(lines.get(0),lines.get(1),  lines.get(2), this.convertTo(lines.get(3)), null,lines.get(4), lines.get(5), lines.get(6),
                    this.convertTo(lines.get(7)),new BigDecimal(lines.get(8)), lines.get(9), lines.get(10), lines.get(11), lines.get(12));
        }else{
            System.out.println("Kivétel" + lines.size());
        }
        return newProduct;
    }
}

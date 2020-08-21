package com.byhi.runnel.dataloader.helper;

import com.byhi.runnel.dataloader.modal.Repurchase;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepurchaseDataLoader extends GenericDataLoader<Repurchase> {

    @Override
    public List<Repurchase> loader(InputStream source, String charset, String des, int expectedSize) throws FileNotFoundException {
        Scanner input = new Scanner(source,charset);
        this.genericList =  new ArrayList<>();

        while(input.hasNextLine()) {
            List<String> line =  new ArrayList<>();
            String nextLine = input.nextLine();
            int start=0;
            int end = start + 1;
            line.add(nextLine.substring(start, end));
            start = end;
            end = end + 8;
            line.add(nextLine.substring(start, end));
            start = end;
            end = end + 15;
            line.add(nextLine.substring(start, end));
            start = end;
            end = end + 20;
            line.add(nextLine.substring(start, end));
            start = end;
            end = end + 10;
            line.add(nextLine.substring(start, end));
            start = end;
            end = nextLine.length() < end + 26 ?  nextLine.length() : end + 26;
            line.add(nextLine.substring(start, end));

            this.genericList.add(this.parsingGenericList(line,expectedSize));
        }
        return this.genericList;
    }

    @Override
    public Repurchase parsingGenericList(List<String> lines, int expectedSize) {
        Repurchase newProduct  = null;
        if (lines.size() == expectedSize) {
            newProduct = new Repurchase(lines.get(0), lines.get(1), new BigDecimal(lines.get(2).trim()), lines.get(3), lines.get(4), lines.get(5));
        } else {
            System.out.println("Kivétel");
        }
        return newProduct;
    }
}

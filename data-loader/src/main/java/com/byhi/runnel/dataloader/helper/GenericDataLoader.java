package com.byhi.runnel.dataloader.helper;

import java.io.InputStream;
import java.io.FileNotFoundException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public abstract class GenericDataLoader<T> {

    List<T> genericList;

    public List<T> loader(InputStream source, String charset, String des, int expectedSize) throws FileNotFoundException {
        Scanner input = new Scanner(source, charset);
        this.genericList = new ArrayList<>();
        while (input.hasNextLine()) {
            List<String> line = new ArrayList<>();
            String nextLine = input.nextLine();

            try {
                int start = 0;
                int end = nextLine.indexOf(des);

                while (end < nextLine.length() && start < nextLine.length() && end > 0) {
                    if (end > nextLine.length()) {
                        break;
                    } else {
                        line.add(nextLine.substring(start, end));
                        start = end + 1;
                        end = nextLine.indexOf(des, start);
                    }
                }
                this.genericList.add(this.parsingGenericList(line, expectedSize));
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return this.genericList;
    }

    public abstract T parsingGenericList(List<String> lines, int expectedSize);

    public Timestamp convertTo(String date) {
        return  date==null || date.equals("") ? null : Timestamp.valueOf(date);
    }
}

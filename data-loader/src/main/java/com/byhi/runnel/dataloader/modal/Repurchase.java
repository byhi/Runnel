package com.byhi.runnel.dataloader.modal;

import java.math.BigDecimal;

public class Repurchase extends Clnt{
    String ID;
    BigDecimal Survalue;
    String Company;
    String Currency;
    String ValiDate;

    public Repurchase(String company, String chdrnumv, BigDecimal survalue,   String jobUser, String currency, String valiDate) {
        Chdrnum = chdrnumv;
        Survalue = survalue;
        Company = company;
        Currency = currency;
        ValiDate = valiDate;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public BigDecimal getSurvalue() {
        return Survalue;
    }

    public void setSurvalue(BigDecimal survalue) {
        Survalue = survalue;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getValiDate() {
        return ValiDate;
    }

    public void setValiDate(String valiDate) {
        ValiDate = valiDate;
    }

    @Override
    public String toString() {
        return "Repurchase{" +
                "ID=" + ID +
                ", Survalue=" + Survalue +
                ", Company='" + Company + '\'' +
                ", Currency='" + Currency + '\'' +
                ", ValiDate='" + ValiDate + '\'' +
                ", Chdrnum='" + Chdrnum + '\'' +
                '}';
    }
}

package com.byhi.runnel.dataloader.modal;

public class Policy extends Clnt{
    Long ID;
    String Chdrnum;
    String OwnerName;
    String LifcNum;
    String LifcName;
    String Aracde;
    String Agntnum;
    String MailAddress;

    public Policy(Long ID, String chdrnum, String ownerName, String lifcNum, String lifcName, String aracde, String agntnum, String mailAddress) {
        this.ID = ID;
        Chdrnum = chdrnum;
        OwnerName = ownerName;
        LifcNum = lifcNum;
        LifcName = lifcName;
        Aracde = aracde;
        Agntnum = agntnum;
        MailAddress = mailAddress;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getChdrnum() {
        return Chdrnum;
    }

    public void setChdrnum(String chdrnum) {
        Chdrnum = chdrnum;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public String getLifcNum() {
        return LifcNum;
    }

    public void setLifcNum(String lifcNum) {
        LifcNum = lifcNum;
    }

    public String getLifcName() {
        return LifcName;
    }

    public void setLifcName(String lifcName) {
        LifcName = lifcName;
    }

    public String getAracde() {
        return Aracde;
    }

    public void setAracde(String aracde) {
        Aracde = aracde;
    }

    public String getAgntnum() {
        return Agntnum;
    }

    public void setAgntnum(String agntnum) {
        Agntnum = agntnum;
    }

    public String getMailAddress() {
        return MailAddress;
    }

    public void setMailAddress(String mailAddress) {
        MailAddress = mailAddress;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "ID=" + ID +
                ", Chdrnum='" + Chdrnum + '\'' +
                ", OwnerName='" + OwnerName + '\'' +
                ", LifcNum='" + LifcNum + '\'' +
                ", LifcName='" + LifcName + '\'' +
                ", Aracde='" + Aracde + '\'' +
                ", Agntnum='" + Agntnum + '\'' +
                ", MailAddress='" + MailAddress + '\'' +
                '}';
    }
}

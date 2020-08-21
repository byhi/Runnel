package com.byhi.runnel.dataloader.modal;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class OutPay extends Clnt{
    Long OutPay_Header_ID;
    String Clntnum;
    String LetterType;
    Timestamp PrintDate;
    String DataID;
    String ClntName;
    String ClntAddress;
    Timestamp RegDate;
    BigDecimal BenPercent;
    String Role1;
    String Role2;
    String CownNum;
    String CownName;
    String Notice01;
    String Notice02;
    String Notice03;
    String Notice04;
    String Notice05;
    String Notice06;
    String Claim_ID;
    Timestamp TP2ProcessDate;

    public OutPay(String clntnum, String chdrnum, String letterType, Timestamp printDate, String claim_ID,String dataID, String clntName
            , String clntAddress, Timestamp regDate,  BigDecimal benPercent, String role1, String role2, String cownNum, String cownName) {
        Clntnum = clntnum;
        Chdrnum = chdrnum;
        LetterType = letterType;
        PrintDate = printDate;
        DataID = dataID;
        ClntName = clntName;
        ClntAddress = clntAddress;
        RegDate = regDate;
        BenPercent = benPercent;
        Role1 = role1;
        Role2 = role2;
        CownNum = cownNum;
        CownName = cownName;
        Claim_ID = claim_ID;
    }

    public String getClntnum() {
        return Clntnum;
    }

    public void setClntnum(String clntnum) {
        Clntnum = clntnum;
    }

    public Long getOutPay_Header_ID() {
        return OutPay_Header_ID;
    }

    public void setOutPay_Header_ID(Long outPay_Header_ID) {
        OutPay_Header_ID = outPay_Header_ID;
    }

    public String getLetterType() {
        return LetterType;
    }

    public void setLetterType(String letterType) {
        LetterType = letterType;
    }

    public Timestamp getPrintDate() {
        return PrintDate;
    }

    public void setPrintDate(Timestamp printDate) {
        PrintDate = printDate;
    }

    public String getDataID() {
        return DataID;
    }

    public void setDataID(String dataID) {
        DataID = dataID;
    }

    public String getClntName() {
        return ClntName;
    }

    public void setClntName(String clntName) {
        ClntName = clntName;
    }

    public String getClntAddress() {
        return ClntAddress;
    }

    public void setClntAddress(String clntAddress) {
        ClntAddress = clntAddress;
    }

    public Timestamp getRegDate() {
        return RegDate;
    }

    public void setRegDate(Timestamp regDate) {
        RegDate = regDate;
    }

    public BigDecimal getBenPercent() {
        return BenPercent;
    }

    public void setBenPercent(BigDecimal benPercent) {
        BenPercent = benPercent;
    }

    public String getRole1() {
        return Role1;
    }

    public void setRole1(String role1) {
        Role1 = role1;
    }

    public String getRole2() {
        return Role2;
    }

    public void setRole2(String role2) {
        Role2 = role2;
    }

    public String getCownNum() {
        return CownNum;
    }

    public void setCownNum(String cownNum) {
        CownNum = cownNum;
    }

    public String getCownName() {
        return CownName;
    }

    public void setCownName(String cownName) {
        CownName = cownName;
    }

    public String getNotice01() {
        return Notice01;
    }

    public void setNotice01(String notice01) {
        Notice01 = notice01;
    }

    public String getNotice02() {
        return Notice02;
    }

    public void setNotice02(String notice02) {
        Notice02 = notice02;
    }

    public String getNotice03() {
        return Notice03;
    }

    public void setNotice03(String notice03) {
        Notice03 = notice03;
    }

    public String getNotice04() {
        return Notice04;
    }

    public void setNotice04(String notice04) {
        Notice04 = notice04;
    }

    public String getNotice05() {
        return Notice05;
    }

    public void setNotice05(String notice05) {
        Notice05 = notice05;
    }

    public String getNotice06() {
        return Notice06;
    }

    public void setNotice06(String notice06) {
        Notice06 = notice06;
    }

    public String getClaim_ID() {
        return Claim_ID;
    }

    public void setClaim_ID(String claim_ID) {
        Claim_ID = claim_ID;
    }

    public Timestamp getTP2ProcessDate() {
        return TP2ProcessDate;
    }

    public void setTP2ProcessDate(Timestamp TP2ProcessDate) {
        this.TP2ProcessDate = TP2ProcessDate;
    }

    @Override
    public String toString() {
        return "OutPay{" +
                " Clntnum='" + Clntnum + '\'' +
                ", OutPay_Header_ID=" + OutPay_Header_ID +
                ", Chdrnum='" + Chdrnum + '\'' +
                ", LetterType='" + LetterType + '\'' +
                ", PrintDate='" + PrintDate + '\'' +
                ", DataID='" + DataID + '\'' +
                ", ClntName='" + ClntName + '\'' +
                ", ClntAddress='" + ClntAddress + '\'' +
                ", RegDate='" + RegDate + '\'' +
                ", BenPercent=" + BenPercent +
                ", Role1='" + Role1 + '\'' +
                ", Role2='" + Role2 + '\'' +
                ", CownNum='" + CownNum + '\'' +
                ", CownName='" + CownName + '\'' +
                ", Notice01='" + Notice01 + '\'' +
                ", Notice02='" + Notice02 + '\'' +
                ", Notice03='" + Notice03 + '\'' +
                ", Notice04='" + Notice04 + '\'' +
                ", Notice05='" + Notice05 + '\'' +
                ", Notice06='" + Notice06 + '\'' +
                ", Claim_ID='" + Claim_ID + '\'' +
                ", TP2ProcessDate='" + TP2ProcessDate + '\'' +
                '}';
    }
}

package com.byhi.runnel.runnelapplication.modal;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table
public class OutPayEntity {
    @Id
    Long OutPay_Header_ID;
    @Column(nullable = false, columnDefinition = "char(8)")
    String Clntnum;
    @Column(nullable = false, columnDefinition = "char(8)")
    String Chdrnum;
    @Column(nullable = false, columnDefinition = "char(12)")
    String LetterType;
    @Column(nullable = false)
    String PrintDate;
    @Column(nullable = true, columnDefinition = "char(6)")
    String DataID;
    @Column(nullable = true, columnDefinition = "char(80)")
    String ClntName;
    @Column(nullable = true, columnDefinition = "char(80)")
    String ClntAddress;
    @Column(nullable = true)
    Timestamp RegDate;

    @Column(nullable = true, columnDefinition = "char(20)")
    BigDecimal BenPercent;
    @Column(nullable = true, columnDefinition = "char(2)")
    String Role1;
    @Column(nullable = true, columnDefinition = "char(2)")
    String Role2;
    @Column(nullable = true, columnDefinition = "char(8)")
    String CownNum;
    @Column(nullable = true, columnDefinition = "char(80)")
    String CownName;
    @Column(nullable = true, columnDefinition = "char(80)")
    String Notice01;
    @Column(nullable = true, columnDefinition = "char(80)")
    String Notice02;
    @Column(nullable = true, columnDefinition = "char(80)")
    String Notice03;
    @Column(nullable = true, columnDefinition = "char(80)")
    String Notice04;
    @Column(nullable = true, columnDefinition = "char(80)")
    String Notice05;
    @Column(nullable = true, columnDefinition = "char(80)")
    String Notice06;
    @Column(nullable = true, columnDefinition = "char(9)")
    String Claim_ID;
    @Column(nullable = true)
    Timestamp  TP2ProcessDate;

    public OutPayEntity() {
    }

    public OutPayEntity(Long outPay_Header_ID, String clntnum, String chdrnum, String letterType, String printDate, String dataID, String clntName, String clntAddress, Timestamp regDate, BigDecimal benPercent, String role1, String role2, String cownNum, String cownName, String notice01, String notice02, String notice03, String notice04, String notice05, String notice06, String claim_ID, Timestamp TP2ProcessDate) {
        OutPay_Header_ID = outPay_Header_ID;
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
        Notice01 = notice01;
        Notice02 = notice02;
        Notice03 = notice03;
        Notice04 = notice04;
        Notice05 = notice05;
        Notice06 = notice06;
        Claim_ID = claim_ID;
        this.TP2ProcessDate = TP2ProcessDate;
    }

    public String getChdrnum() {
        return Chdrnum;
    }

    public void setChdrnum(String chdrnum) {
        Chdrnum = chdrnum;
    }

    public Long getOutPay_Header_ID() {
        return OutPay_Header_ID;
    }

    public void setOutPay_Header_ID(Long outPay_Header_ID) {
        OutPay_Header_ID = outPay_Header_ID;
    }

    public String getClntnum() {
        return Clntnum;
    }

    public void setClntnum(String clntnum) {
        Clntnum = clntnum;
    }

    public String getLetterType() {
        return LetterType;
    }

    public void setLetterType(String letterType) {
        LetterType = letterType;
    }

    public String getPrintDate() {
        return PrintDate;
    }

    public void setPrintDate(String printDate) {
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
        return "OutPayEntity{" +
                "OutPay_Header_ID=" + OutPay_Header_ID +
                ", Clntnum='" + Clntnum + '\'' +
                ", Chdrnum='" + Chdrnum + '\'' +
                ", LetterType='" + LetterType + '\'' +
                ", PrintDate='" + PrintDate + '\'' +
                ", DataID='" + DataID + '\'' +
                ", ClntName='" + ClntName + '\'' +
                ", ClntAddress='" + ClntAddress + '\'' +
                ", RegDate=" + RegDate +
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
                ", TP2ProcessDate=" + TP2ProcessDate +
                '}';
    }
}

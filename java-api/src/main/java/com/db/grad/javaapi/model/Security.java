package com.db.grad.javaapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="security")
public class Security {
   @Id
    private long id;
    private String isin;
    private String cusip;
    private String issuerName;
    private String maturityDate;
    private float coupon;
    private String type;
    private float faceValue;
    private String currency;
    private String status;

    @Id
    @Column(name="id", nullable=false)
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    @Column(name="isin", nullable=false)
    public String getIsin(){
        return isin;
    }

    public void setIsin(String isin){
        this.isin = isin;
    }

    @Column(name="cusip", nullable=false)
    public String getCusip(){
        return cusip;
    }

    public void setCusip(String cusip){
        this.cusip = cusip;
    }

    @Column(name="issuer_name", nullable=false)
    public String getIssuerName(){
        return issuerName;
    }

    public void setIssuerName(String issuerName){
        this.issuerName = issuerName;
    }

    @Column(name="maturity_date", nullable=false)
    public String getMaturityDate(){
        return maturityDate;
    }

    public void setMaturityDate(String maturityDate){
        this.maturityDate = maturityDate;
    }

    @Column(name="coupon", nullable=false)
    public float getCoupon(){
        return coupon;
    }

    public void setCoupon(float coupon){
        this.coupon = coupon;
    }

    @Column(name="type", nullable=false)
    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    @Column(name="face_value", nullable=false)
    public float getFaceValue(){
        return faceValue;
    }

    public void setFaceValue(float faceValue){
        this.faceValue = faceValue;
    }

    @Column(name="currency", nullable=false)
    public String getCurrency(){
        return currency;
    }

    public void setCurrency(String currency){
        this.currency = currency;
    }

    @Column(name="status", nullable=false)
    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    @Override
    public String toString(){
        return "Security{" +
                "id=" + id +
                ", isin='" + isin + '\'' +
                ", cusip='" + cusip + '\'' +
                ", issuerName='" + issuerName + '\'' +
                ", maturityDate='" + maturityDate + '\'' +
                ", coupon=" + coupon +
                ", type='" + type + '\'' +
                ", faceValue=" + faceValue +
                ", currency='" + currency + '\'' +
                ", status='" + status + '\'' +
                "}";
    }
}

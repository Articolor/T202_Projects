package com.wl.model;

import java.math.BigDecimal;
import java.util.Date;

public class ACC_Businessadmissibility {
    private BigDecimal id;

    private String businessnoticeno;

    private Date reservationtime;

    private String customname;

    private String pickupaddress;

    private String customcode;

    private String linkman;

    private String telphone;

    private BigDecimal weight;

    private BigDecimal volume;

    private String importanthints;

    private String arrivecity;

    private BigDecimal pickerinfo;

    private String sendaddress;

    private BigDecimal processingunit;

    private BigDecimal notificationsource;

    private BigDecimal customnomodifyflag;

    private String singletype;

    private BigDecimal packagesnum;

    private BigDecimal actualweight;

    private BigDecimal billingweight;

    private BigDecimal packingfee;

    private BigDecimal actualpacking;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getBusinessnoticeno() {
        return businessnoticeno;
    }

    public void setBusinessnoticeno(String businessnoticeno) {
        this.businessnoticeno = businessnoticeno == null ? null : businessnoticeno.trim();
    }

    public Date getReservationtime() {
        return reservationtime;
    }

    public void setReservationtime(Date reservationtime) {
        this.reservationtime = reservationtime;
    }

    public String getCustomname() {
        return customname;
    }

    public void setCustomname(String customname) {
        this.customname = customname == null ? null : customname.trim();
    }

    public String getPickupaddress() {
        return pickupaddress;
    }

    public void setPickupaddress(String pickupaddress) {
        this.pickupaddress = pickupaddress == null ? null : pickupaddress.trim();
    }

    public String getCustomcode() {
        return customcode;
    }

    public void setCustomcode(String customcode) {
        this.customcode = customcode == null ? null : customcode.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public String getImportanthints() {
        return importanthints;
    }

    public void setImportanthints(String importanthints) {
        this.importanthints = importanthints == null ? null : importanthints.trim();
    }

    public String getArrivecity() {
        return arrivecity;
    }

    public void setArrivecity(String arrivecity) {
        this.arrivecity = arrivecity == null ? null : arrivecity.trim();
    }

    public BigDecimal getPickerinfo() {
        return pickerinfo;
    }

    public void setPickerinfo(BigDecimal pickerinfo) {
        this.pickerinfo = pickerinfo;
    }

    public String getSendaddress() {
        return sendaddress;
    }

    public void setSendaddress(String sendaddress) {
        this.sendaddress = sendaddress == null ? null : sendaddress.trim();
    }

    public BigDecimal getProcessingunit() {
        return processingunit;
    }

    public void setProcessingunit(BigDecimal processingunit) {
        this.processingunit = processingunit;
    }

    public BigDecimal getNotificationsource() {
        return notificationsource;
    }

    public void setNotificationsource(BigDecimal notificationsource) {
        this.notificationsource = notificationsource;
    }

    public BigDecimal getCustomnomodifyflag() {
        return customnomodifyflag;
    }

    public void setCustomnomodifyflag(BigDecimal customnomodifyflag) {
        this.customnomodifyflag = customnomodifyflag;
    }

    public String getSingletype() {
        return singletype;
    }

    public void setSingletype(String singletype) {
        this.singletype = singletype == null ? null : singletype.trim();
    }

    public BigDecimal getPackagesnum() {
        return packagesnum;
    }

    public void setPackagesnum(BigDecimal packagesnum) {
        this.packagesnum = packagesnum;
    }

    public BigDecimal getActualweight() {
        return actualweight;
    }

    public void setActualweight(BigDecimal actualweight) {
        this.actualweight = actualweight;
    }

    public BigDecimal getBillingweight() {
        return billingweight;
    }

    public void setBillingweight(BigDecimal billingweight) {
        this.billingweight = billingweight;
    }

    public BigDecimal getPackingfee() {
        return packingfee;
    }

    public void setPackingfee(BigDecimal packingfee) {
        this.packingfee = packingfee;
    }

    public BigDecimal getActualpacking() {
        return actualpacking;
    }

    public void setActualpacking(BigDecimal actualpacking) {
        this.actualpacking = actualpacking;
    }
}
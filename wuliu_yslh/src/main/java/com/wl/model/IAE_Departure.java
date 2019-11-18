package com.wl.model;

import java.math.BigDecimal;
import java.util.Date;

public class IAE_Departure {
    private String id;

    private String packingid;

    private BigDecimal transfer;

    private BigDecimal actualcount;

    private String destination;

    private BigDecimal warename;

    private BigDecimal cargocount;

    private BigDecimal weight;

    private BigDecimal volume;

    private BigDecimal actualvolume;

    private Date timelimit;

    private String ask;

    private String takecargoperson;

    private String tackcargoaddress;

    private BigDecimal payment;

    private String importanthints;

    private Date surplustime;

    private String entrustcompany;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPackingid() {
        return packingid;
    }

    public void setPackingid(String packingid) {
        this.packingid = packingid == null ? null : packingid.trim();
    }

    public BigDecimal getTransfer() {
        return transfer;
    }

    public void setTransfer(BigDecimal transfer) {
        this.transfer = transfer;
    }

    public BigDecimal getActualcount() {
        return actualcount;
    }

    public void setActualcount(BigDecimal actualcount) {
        this.actualcount = actualcount;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public BigDecimal getWarename() {
        return warename;
    }

    public void setWarename(BigDecimal warename) {
        this.warename = warename;
    }

    public BigDecimal getCargocount() {
        return cargocount;
    }

    public void setCargocount(BigDecimal cargocount) {
        this.cargocount = cargocount;
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

    public BigDecimal getActualvolume() {
        return actualvolume;
    }

    public void setActualvolume(BigDecimal actualvolume) {
        this.actualvolume = actualvolume;
    }

    public Date getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Date timelimit) {
        this.timelimit = timelimit;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask == null ? null : ask.trim();
    }

    public String getTakecargoperson() {
        return takecargoperson;
    }

    public void setTakecargoperson(String takecargoperson) {
        this.takecargoperson = takecargoperson == null ? null : takecargoperson.trim();
    }

    public String getTackcargoaddress() {
        return tackcargoaddress;
    }

    public void setTackcargoaddress(String tackcargoaddress) {
        this.tackcargoaddress = tackcargoaddress == null ? null : tackcargoaddress.trim();
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public String getImportanthints() {
        return importanthints;
    }

    public void setImportanthints(String importanthints) {
        this.importanthints = importanthints == null ? null : importanthints.trim();
    }

    public Date getSurplustime() {
        return surplustime;
    }

    public void setSurplustime(Date surplustime) {
        this.surplustime = surplustime;
    }

    public String getEntrustcompany() {
        return entrustcompany;
    }

    public void setEntrustcompany(String entrustcompany) {
        this.entrustcompany = entrustcompany == null ? null : entrustcompany.trim();
    }
}
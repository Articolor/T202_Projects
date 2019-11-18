package com.wl.model;

import java.math.BigDecimal;
import java.util.Date;

public class SOR_Package {
    private BigDecimal id;

    private BigDecimal packageperson;

    private String sealint;

    private String destination;

    private String reckondes;

    private Date timelimit;

    private BigDecimal ticketsum;

    private BigDecimal cargosum;

    private BigDecimal weightsum;

    private BigDecimal volumesum;

    private BigDecimal state;

    private BigDecimal ask;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getPackageperson() {
        return packageperson;
    }

    public void setPackageperson(BigDecimal packageperson) {
        this.packageperson = packageperson;
    }

    public String getSealint() {
        return sealint;
    }

    public void setSealint(String sealint) {
        this.sealint = sealint == null ? null : sealint.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getReckondes() {
        return reckondes;
    }

    public void setReckondes(String reckondes) {
        this.reckondes = reckondes == null ? null : reckondes.trim();
    }

    public Date getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Date timelimit) {
        this.timelimit = timelimit;
    }

    public BigDecimal getTicketsum() {
        return ticketsum;
    }

    public void setTicketsum(BigDecimal ticketsum) {
        this.ticketsum = ticketsum;
    }

    public BigDecimal getCargosum() {
        return cargosum;
    }

    public void setCargosum(BigDecimal cargosum) {
        this.cargosum = cargosum;
    }

    public BigDecimal getWeightsum() {
        return weightsum;
    }

    public void setWeightsum(BigDecimal weightsum) {
        this.weightsum = weightsum;
    }

    public BigDecimal getVolumesum() {
        return volumesum;
    }

    public void setVolumesum(BigDecimal volumesum) {
        this.volumesum = volumesum;
    }

    public BigDecimal getState() {
        return state;
    }

    public void setState(BigDecimal state) {
        this.state = state;
    }

    public BigDecimal getAsk() {
        return ask;
    }

    public void setAsk(BigDecimal ask) {
        this.ask = ask;
    }
}
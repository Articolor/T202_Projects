package com.wl.model;

import java.math.BigDecimal;
import java.util.Date;

public class SOR_Packagedetails {
    private BigDecimal id;

    private String warename;

    private String destination;

    private BigDecimal ticket;

    private BigDecimal actualcargoint;

    private BigDecimal cargoint;

    private BigDecimal weight;

    private BigDecimal volume;

    private Date service;

    private String importanthints;

    private String ask;

    private String inputtype;

    @Override
    public String toString() {
        return "SOR_Packagedetails{" +
                "id=" + id +
                ", warename='" + warename + '\'' +
                ", destination='" + destination + '\'' +
                ", ticket=" + ticket +
                ", actualcargoint=" + actualcargoint +
                ", cargoint=" + cargoint +
                ", weight=" + weight +
                ", volume=" + volume +
                ", service=" + service +
                ", importanthints='" + importanthints + '\'' +
                ", ask='" + ask + '\'' +
                ", inputtype='" + inputtype + '\'' +
                '}';
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getWarename() {
        return warename;
    }

    public void setWarename(String warename) {
        this.warename = warename;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public BigDecimal getTicket() {
        return ticket;
    }

    public void setTicket(BigDecimal ticket) {
        this.ticket = ticket;
    }

    public BigDecimal getActualcargoint() {
        return actualcargoint;
    }

    public void setActualcargoint(BigDecimal actualcargoint) {
        this.actualcargoint = actualcargoint;
    }

    public BigDecimal getCargoint() {
        return cargoint;
    }

    public void setCargoint(BigDecimal cargoint) {
        this.cargoint = cargoint;
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

    public Date getService() {
        return service;
    }

    public void setService(Date service) {
        this.service = service;
    }

    public String getImportanthints() {
        return importanthints;
    }

    public void setImportanthints(String importanthints) {
        this.importanthints = importanthints;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getInputtype() {
        return inputtype;
    }

    public void setInputtype(String inputtype) {
        this.inputtype = inputtype;
    }
}
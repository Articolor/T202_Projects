package com.wl.model;

import java.math.BigDecimal;

public class SOR_Packagedetails {
    private BigDecimal id;

    private BigDecimal warename;

    private String destination;

    private BigDecimal ticket;

    private BigDecimal actualcargoint;

    private BigDecimal cargoint;

    private BigDecimal weight;

    private BigDecimal volume;

    private BigDecimal service;

    private String importanthints;

    private String ask;

    private String inputtype;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getWarename() {
        return warename;
    }

    public void setWarename(BigDecimal warename) {
        this.warename = warename;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
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

    public BigDecimal getService() {
        return service;
    }

    public void setService(BigDecimal service) {
        this.service = service;
    }

    public String getImportanthints() {
        return importanthints;
    }

    public void setImportanthints(String importanthints) {
        this.importanthints = importanthints == null ? null : importanthints.trim();
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask == null ? null : ask.trim();
    }

    public String getInputtype() {
        return inputtype;
    }

    public void setInputtype(String inputtype) {
        this.inputtype = inputtype == null ? null : inputtype.trim();
    }
}
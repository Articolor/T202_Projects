package com.wl.model;

import java.math.BigDecimal;

public class ACC_Worksheet {
    private BigDecimal id;

    private String worksheetno;

    private String destination;

    private String producttime;

    private BigDecimal total;

    private BigDecimal weight;

    private String stowagerequirements;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getWorksheetno() {
        return worksheetno;
    }

    public void setWorksheetno(String worksheetno) {
        this.worksheetno = worksheetno == null ? null : worksheetno.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getProducttime() {
        return producttime;
    }

    public void setProducttime(String producttime) {
        this.producttime = producttime == null ? null : producttime.trim();
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getStowagerequirements() {
        return stowagerequirements;
    }

    public void setStowagerequirements(String stowagerequirements) {
        this.stowagerequirements = stowagerequirements == null ? null : stowagerequirements.trim();
    }
}
package com.wl.model;

import java.math.BigDecimal;
import java.util.Date;

public class BAS_Deliverystandard {
    private BigDecimal id;

    private String name;

    private BigDecimal minweight;

    private BigDecimal maxweight;

    private BigDecimal operatorid;

    private BigDecimal operationunitid;

    private Date operationtime;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getMinweight() {
        return minweight;
    }

    public void setMinweight(BigDecimal minweight) {
        this.minweight = minweight;
    }

    public BigDecimal getMaxweight() {
        return maxweight;
    }

    public void setMaxweight(BigDecimal maxweight) {
        this.maxweight = maxweight;
    }

    public BigDecimal getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(BigDecimal operatorid) {
        this.operatorid = operatorid;
    }

    public BigDecimal getOperationunitid() {
        return operationunitid;
    }

    public void setOperationunitid(BigDecimal operationunitid) {
        this.operationunitid = operationunitid;
    }

    public Date getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }
}
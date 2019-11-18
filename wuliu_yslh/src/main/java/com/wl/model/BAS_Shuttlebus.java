package com.wl.model;

import java.math.BigDecimal;
import java.util.Date;

public class BAS_Shuttlebus {
    private BigDecimal id;

    private BigDecimal linetype;

    private BigDecimal lineid;

    private String licenseplateint;

    private String carrier;

    private String models;

    private String driver;

    private String telephone;

    private BigDecimal ton;

    private String remarks;

    private BigDecimal operatorid;

    private BigDecimal operationunitid;

    private Date operationtime;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getLinetype() {
        return linetype;
    }

    public void setLinetype(BigDecimal linetype) {
        this.linetype = linetype;
    }

    public BigDecimal getLineid() {
        return lineid;
    }

    public void setLineid(BigDecimal lineid) {
        this.lineid = lineid;
    }

    public String getLicenseplateint() {
        return licenseplateint;
    }

    public void setLicenseplateint(String licenseplateint) {
        this.licenseplateint = licenseplateint == null ? null : licenseplateint.trim();
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier == null ? null : carrier.trim();
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models == null ? null : models.trim();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public BigDecimal getTon() {
        return ton;
    }

    public void setTon(BigDecimal ton) {
        this.ton = ton;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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
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

    private SY_Units sy_units;

    private SY_Emp sy_emp;

    private LOG_Logistics log_logistics;

    public BAS_Shuttlebus() {
    }

    public BAS_Shuttlebus(BigDecimal id, BigDecimal linetype, BigDecimal lineid, String licenseplateint, String carrier, String models, String driver, String telephone, BigDecimal ton, String remarks, BigDecimal operatorid, BigDecimal operationunitid, Date operationtime, SY_Units sy_units, SY_Emp sy_emp, LOG_Logistics log_logistics) {
        this.id = id;
        this.linetype = linetype;
        this.lineid = lineid;
        this.licenseplateint = licenseplateint;
        this.carrier = carrier;
        this.models = models;
        this.driver = driver;
        this.telephone = telephone;
        this.ton = ton;
        this.remarks = remarks;
        this.operatorid = operatorid;
        this.operationunitid = operationunitid;
        this.operationtime = operationtime;
        this.sy_units = sy_units;
        this.sy_emp = sy_emp;
        this.log_logistics = log_logistics;
    }

    @Override
    public String toString() {
        return "BAS_Shuttlebus{" +
                "id=" + id +
                ", linetype=" + linetype +
                ", lineid=" + lineid +
                ", licenseplateint='" + licenseplateint + '\'' +
                ", carrier='" + carrier + '\'' +
                ", models='" + models + '\'' +
                ", driver='" + driver + '\'' +
                ", telephone='" + telephone + '\'' +
                ", ton=" + ton +
                ", remarks='" + remarks + '\'' +
                ", operatorid=" + operatorid +
                ", operationunitid=" + operationunitid +
                ", operationtime=" + operationtime +
                ", sy_units=" + sy_units +
                ", sy_emp=" + sy_emp +
                ", log_logistics=" + log_logistics +
                '}';
    }

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
        this.licenseplateint = licenseplateint;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
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
        this.remarks = remarks;
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

    public SY_Units getSy_units() {
        return sy_units;
    }

    public void setSy_units(SY_Units sy_units) {
        this.sy_units = sy_units;
    }

    public SY_Emp getSy_emp() {
        return sy_emp;
    }

    public void setSy_emp(SY_Emp sy_emp) {
        this.sy_emp = sy_emp;
    }

    public LOG_Logistics getLog_logistics() {
        return log_logistics;
    }

    public void setLog_logistics(LOG_Logistics log_logistics) {
        this.log_logistics = log_logistics;
    }
}
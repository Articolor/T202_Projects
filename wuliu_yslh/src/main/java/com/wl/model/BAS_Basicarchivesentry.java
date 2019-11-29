package com.wl.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class BAS_Basicarchivesentry {
    private BigDecimal id;

    private String name;

    private BigDecimal parentid;

    private String mnemoniccode;

    private BigDecimal available;

    private String remarks;

    private BigDecimal operatorid;

    private BigDecimal operationunitid;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date operationtime;

    private SY_Emp sy_emp;

    private SY_Units sy_units;

   private BAS_Basicarchives bas_basicarchives;

    public BAS_Basicarchivesentry() {
    }

    public BAS_Basicarchivesentry(BigDecimal id, String name, BigDecimal parentid, String mnemoniccode, BigDecimal available, String remarks, BigDecimal operatorid, BigDecimal operationunitid, Date operationtime, SY_Emp sy_emp, SY_Units sy_units, BAS_Basicarchives bas_basicarchives) {
        this.id = id;
        this.name = name;
        this.parentid = parentid;
        this.mnemoniccode = mnemoniccode;
        this.available = available;
        this.remarks = remarks;
        this.operatorid = operatorid;
        this.operationunitid = operationunitid;
        this.operationtime = operationtime;
        this.sy_emp = sy_emp;
        this.sy_units = sy_units;
        this.bas_basicarchives = bas_basicarchives;
    }

    @Override
    public String toString() {
        return "BAS_Basicarchivesentry{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentid=" + parentid +
                ", mnemoniccode='" + mnemoniccode + '\'' +
                ", available=" + available +
                ", remarks='" + remarks + '\'' +
                ", operatorid=" + operatorid +
                ", operationunitid=" + operationunitid +
                ", operationtime=" + operationtime +
                ", sy_emp=" + sy_emp +
                ", sy_units=" + sy_units +
                ", bas_basicarchives=" + bas_basicarchives +
                '}';
    }

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
        this.name = name;
    }

    public BigDecimal getParentid() {
        return parentid;
    }

    public void setParentid(BigDecimal parentid) {
        this.parentid = parentid;
    }

    public String getMnemoniccode() {
        return mnemoniccode;
    }

    public void setMnemoniccode(String mnemoniccode) {
        this.mnemoniccode = mnemoniccode;
    }

    public BigDecimal getAvailable() {
        return available;
    }

    public void setAvailable(BigDecimal available) {
        this.available = available;
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

    public SY_Emp getSy_emp() {
        return sy_emp;
    }

    public void setSy_emp(SY_Emp sy_emp) {
        this.sy_emp = sy_emp;
    }

    public SY_Units getSy_units() {
        return sy_units;
    }

    public void setSy_units(SY_Units sy_units) {
        this.sy_units = sy_units;
    }

    public BAS_Basicarchives getBas_basicarchives() {
        return bas_basicarchives;
    }

    public void setBas_basicarchives(BAS_Basicarchives bas_basicarchives) {
        this.bas_basicarchives = bas_basicarchives;
    }
}
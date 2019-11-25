package com.wl.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class BAS_Deliverystandard {
    private BigDecimal id;

    private String name;

    private BigDecimal minweight;

    private BigDecimal maxweight;

    private BigDecimal invalidatemark;

    private BigDecimal operatorid;

    private BigDecimal operationunitid;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date operationtime=new Date();

    private SY_Units sy_units;

    private SY_Emp sy_emp;

    public BAS_Deliverystandard(BigDecimal id, String name, BigDecimal minweight, BigDecimal maxweight, BigDecimal invalidatemark, BigDecimal operatorid, BigDecimal operationunitid, Date operationtime, SY_Units sy_units, SY_Emp sy_emp) {
        this.id = id;
        this.name = name;
        this.minweight = minweight;
        this.maxweight = maxweight;
        this.invalidatemark = invalidatemark;
        this.operatorid = operatorid;
        this.operationunitid = operationunitid;
        this.operationtime = operationtime;
        this.sy_units = sy_units;
        this.sy_emp = sy_emp;
    }

    public BAS_Deliverystandard() {
    }


    public BAS_Deliverystandard(int id, int invalidatemark) {
        this.id = new BigDecimal(id);
        this.invalidatemark = new BigDecimal(invalidatemark);
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

    public BigDecimal getInvalidatemark() {
        return invalidatemark;
    }

    public void setInvalidatemark(BigDecimal invalidatemark) {
        this.invalidatemark = invalidatemark;
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

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
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

    @Override
    public String toString() {
        return "BAS_DeliverystandardService{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", minweight=" + minweight +
                ", maxweight=" + maxweight +
                ", invalidatemark=" + invalidatemark +
                ", operatorid=" + operatorid +
                ", operationunitid=" + operationunitid +
                ", operationtime=" + operationtime +
                ", sy_units=" + sy_units +
                ", sy_emp=" + sy_emp +
                '}';
    }
}
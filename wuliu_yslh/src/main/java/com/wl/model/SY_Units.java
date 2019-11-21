package com.wl.model;

import java.math.BigDecimal;
import java.util.Date;

public class SY_Units {
    private BigDecimal id;

    private String name;

    private String remarks;

    private BigDecimal operatorid;

    private Date operationtime;

    private BAS_Deliverystandard bas_deliverystandard;

    private BAS_Basicarchives bas_basicArchives;

    public SY_Units() {
    }

    public SY_Units(BigDecimal id, String name, String remarks, BigDecimal operatorid, Date operationtime, BAS_Deliverystandard bas_deliverystandard, BAS_Basicarchives bas_basicArchives) {
        this.id = id;
        this.name = name;
        this.remarks = remarks;
        this.operatorid = operatorid;
        this.operationtime = operationtime;
        this.bas_deliverystandard = bas_deliverystandard;
        this.bas_basicArchives = bas_basicArchives;
    }

    @Override
    public String toString() {
        return "SY_Units{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remarks='" + remarks + '\'' +
                ", operatorid=" + operatorid +
                ", operationtime=" + operationtime +
                ", bas_deliverystandard=" + bas_deliverystandard +
                ", bas_basicArchives=" + bas_basicArchives +
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

    public Date getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }

    public BAS_Deliverystandard getBas_deliverystandard() {
        return bas_deliverystandard;
    }

    public void setBas_deliverystandard(BAS_Deliverystandard bas_deliverystandard) {
        this.bas_deliverystandard = bas_deliverystandard;
    }

    public BAS_Basicarchives getBas_basicArchives() {
        return bas_basicArchives;
    }

    public void setBas_basicArchives(BAS_Basicarchives bas_basicArchives) {
        this.bas_basicArchives = bas_basicArchives;
    }
}
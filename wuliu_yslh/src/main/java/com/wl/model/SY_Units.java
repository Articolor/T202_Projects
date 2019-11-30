package com.wl.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class SY_Units {
    private BigDecimal id;

    private String name;

    private String remarks;

    private BigDecimal operatorid;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date operationtime=new Date();


    private BAS_Deliverystandard bas_deliverystandard;
    private BAS_Basicarchives bas_basicArchives;


    //一个单位对应一个员工
    private SY_Emp sy_emp;

    private Integer page=1;

    private Integer rows=5;

    public SY_Emp getSy_emp() {
        return sy_emp;
    }

    public void setSy_emp(SY_Emp sy_emp) {
        this.sy_emp = sy_emp;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
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
        this.name = name == null ? null : name.trim();
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
                ", sy_emp=" + sy_emp +
                ", page=" + page +
                ", rows=" + rows +
                '}';
    }
}
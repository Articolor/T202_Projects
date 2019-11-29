package com.wl.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class BAS_Basicarchives {
    private BigDecimal id;

    private String name;

    private BigDecimal grade;

    private String remarks;

    private BigDecimal operatorid;

    private BigDecimal operationunitid;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date operationtime;

    private SY_Units sy_units;

    private SY_Emp sy_emp;

    private BAS_Basicarchivesentry bas_basicarchivesentry;

    public BAS_Basicarchives() {
    }

    public BAS_Basicarchives(String name, BigDecimal grade, String remarks, BigDecimal operatorid, BigDecimal operationunitid, Date operationtime) {
        this.name = name;
        this.grade = grade;
        this.remarks = remarks;
        this.operatorid = operatorid;
        this.operationunitid = operationunitid;
        this.operationtime = operationtime;
    }

    public BAS_Basicarchives(String name, BigDecimal grade, String remarks, BigDecimal operatorid, BigDecimal operationunitid, Date operationtime, SY_Units sy_units, SY_Emp sy_emp, BAS_Basicarchivesentry bas_basicarchivesentry) {
        this.name = name;
        this.grade = grade;
        this.remarks = remarks;
        this.operatorid = operatorid;
        this.operationunitid = operationunitid;
        this.operationtime = operationtime;
        this.sy_units = sy_units;
        this.sy_emp = sy_emp;
        this.bas_basicarchivesentry = bas_basicarchivesentry;
    }

    @Override
    public String toString() {
        return "BAS_Basicarchives{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", remarks='" + remarks + '\'' +
                ", operatorid=" + operatorid +
                ", operationunitid=" + operationunitid +
                ", operationtime=" + operationtime +
                ", sy_units=" + sy_units +
                ", sy_emp=" + sy_emp +
                ", bas_basicarchivesentry=" + bas_basicarchivesentry +
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

    public BigDecimal getGrade() {
        return grade;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
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

    public BAS_Basicarchivesentry getBas_basicarchivesentry() {
        return bas_basicarchivesentry;
    }

    public void setBas_basicarchivesentry(BAS_Basicarchivesentry bas_basicarchivesentry) {
        this.bas_basicarchivesentry = bas_basicarchivesentry;
    }
}
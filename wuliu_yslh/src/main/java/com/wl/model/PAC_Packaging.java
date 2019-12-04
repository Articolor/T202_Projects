package com.wl.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class PAC_Packaging {




    private BigDecimal id;

    private String itemcode;

    private String itemname;

    private BigDecimal plannedprice;

    private String specifications;

    private BigDecimal type;

    private String measurementunit;


    private BigDecimal status;
    private  SY_Emp syemp;
    private BigDecimal operatorid;


    @DateTimeFormat(pattern="YYYY-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date operationtime;
    private String operatorqq;
    private String invalidatejobqq;

    private SY_Emp emp;
    private BigDecimal invalidatejobint;



    private BigDecimal invalidatename;



    @DateTimeFormat(pattern="YYYY-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date invalidatetime;

    private Integer page=1;

    private Integer rows=5;

    public SY_Emp getSyemp() {
        return syemp;
    }

    public void setSyemp(SY_Emp syemp) {
        this.syemp = syemp;
    }

    public SY_Emp getEmp() {
        return emp;
    }

    public void setEmp(SY_Emp emp) {
        this.emp = emp;
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

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode == null ? null : itemcode.trim();
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public BigDecimal getPlannedprice() {
        return plannedprice;
    }

    public void setPlannedprice(BigDecimal plannedprice) {
        this.plannedprice = plannedprice;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public BigDecimal getType() {
        return type;
    }

    public void setType(BigDecimal type) {
        this.type = type;
    }

    public String getMeasurementunit() {
        return measurementunit;
    }

    public void setMeasurementunit(String measurementunit) {
        this.measurementunit = measurementunit == null ? null : measurementunit.trim();
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
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

    public BigDecimal getInvalidatejobint() {
        return invalidatejobint;
    }

    public void setInvalidatejobint(BigDecimal invalidatejobint) {
        this.invalidatejobint = invalidatejobint;
    }

    public BigDecimal getInvalidatename() {
        return invalidatename;
    }

    public void setInvalidatename(BigDecimal invalidatename) {
        this.invalidatename = invalidatename;
    }

    public Date getInvalidatetime() {
        return invalidatetime;
    }

    public void setInvalidatetime(Date invalidatetime) {
        this.invalidatetime = invalidatetime;
    }

    @Override
    public String toString() {
        return "PAC_Packaging{" +
                "id=" + id +
                ", itemcode='" + itemcode + '\'' +
                ", itemname='" + itemname + '\'' +
                ", plannedprice=" + plannedprice +
                ", specifications='" + specifications + '\'' +
                ", type=" + type +
                ", measurementunit='" + measurementunit + '\'' +
                ", status=" + status +
                ", operatorid=" + operatorid +
                ", operationtime=" + operationtime +
                ", invalidatejobint=" + invalidatejobint +
                ", invalidatename=" + invalidatename +
                ", invalidatetime=" + invalidatetime +
                '}';
    }
}
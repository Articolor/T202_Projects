package com.wl.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class BIGLOG_Logisticscontroltable {
    private BigDecimal id;

    private String worksheetno;

    private BigDecimal ctype;

    private String corporation;

    private String waybillid;

    private String remarks;

    private BigDecimal inputperson;
    private SY_Emp sy_emp;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date inputdate;

    private BigDecimal inputcompany;
    private SY_Units sy_units;
    private Integer page=1;
    public Integer getPage() {
        return page;
    }

    public BIGLOG_Logisticscontroltable() {
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    } private Integer rows=5;
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

    public BigDecimal getCtype() {
        return ctype;
    }

    public void setCtype(BigDecimal ctype) {
        this.ctype = ctype;
    }

    public String getCorporation() {
        return corporation;
    }

    public void setCorporation(String corporation) {
        this.corporation = corporation == null ? null : corporation.trim();
    }

    public String getWaybillid() {
        return waybillid;
    }

    public void setWaybillid(String waybillid) {
        this.waybillid = waybillid == null ? null : waybillid.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public BigDecimal getInputperson() {
        return inputperson;
    }

    public void setInputperson(BigDecimal inputperson) {
        this.inputperson = inputperson;
    }

    public Date getInputdate() {
        return inputdate;
    }

    public void setInputdate(Date inputdate) {
        this.inputdate = inputdate;
    }

    public BigDecimal getInputcompany() {
        return inputcompany;
    }

    public void setInputcompany(BigDecimal inputcompany) {
        this.inputcompany = inputcompany;
    }
}
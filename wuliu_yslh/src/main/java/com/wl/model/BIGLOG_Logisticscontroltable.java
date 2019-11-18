package com.wl.model;

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

    private Date inputdate;

    private BigDecimal inputcompany;

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
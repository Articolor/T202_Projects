package com.wl.model;

import java.math.BigDecimal;
import java.util.Date;

public class SOR_Checkbound {
    private BigDecimal id;

    private BigDecimal scanid;

    private BigDecimal cargosum;

    private BigDecimal checkperson;

    private Date checkdate;

    private String checkcompany;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getScanid() {
        return scanid;
    }

    public void setScanid(BigDecimal scanid) {
        this.scanid = scanid;
    }

    public BigDecimal getCargosum() {
        return cargosum;
    }

    public void setCargosum(BigDecimal cargosum) {
        this.cargosum = cargosum;
    }

    public BigDecimal getCheckperson() {
        return checkperson;
    }

    public void setCheckperson(BigDecimal checkperson) {
        this.checkperson = checkperson;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public String getCheckcompany() {
        return checkcompany;
    }

    public void setCheckcompany(String checkcompany) {
        this.checkcompany = checkcompany == null ? null : checkcompany.trim();
    }
}
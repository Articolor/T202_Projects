package com.wl.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class SOR_Checkbound {
    private BigDecimal id;

    private BigDecimal scanid;

    private BigDecimal cargosum;

    private BigDecimal checkperson;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date checkdate;

    private String checkcompany;

    private Integer page=1;

    private Integer rows=5;

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

    @Override
    public String toString() {
        return "SOR_Checkbound{" +
                "id=" + id +
                ", scanid=" + scanid +
                ", cargosum=" + cargosum +
                ", checkperson=" + checkperson +
                ", checkdate=" + checkdate +
                ", checkcompany='" + checkcompany + '\'' +
                ", page=" + page +
                ", rows=" + rows +
                '}';
    }
}
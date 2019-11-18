package com.wl.model;

import java.math.BigDecimal;
import java.util.Date;

public class ACC_Workorder {
    private BigDecimal id;

    private String businessnoticeno;

    private String jobno;

    private BigDecimal jobtype;

    private BigDecimal pickupstatus;

    private BigDecimal shortmessageint;

    private Date workgenerationtime;

    private BigDecimal aftersinglenum;

    private BigDecimal smallmembernum;

    private BigDecimal pickupunit;

    private Date pickuptime;

    private String sortingcode;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getBusinessnoticeno() {
        return businessnoticeno;
    }

    public void setBusinessnoticeno(String businessnoticeno) {
        this.businessnoticeno = businessnoticeno == null ? null : businessnoticeno.trim();
    }

    public String getJobno() {
        return jobno;
    }

    public void setJobno(String jobno) {
        this.jobno = jobno == null ? null : jobno.trim();
    }

    public BigDecimal getJobtype() {
        return jobtype;
    }

    public void setJobtype(BigDecimal jobtype) {
        this.jobtype = jobtype;
    }

    public BigDecimal getPickupstatus() {
        return pickupstatus;
    }

    public void setPickupstatus(BigDecimal pickupstatus) {
        this.pickupstatus = pickupstatus;
    }

    public BigDecimal getShortmessageint() {
        return shortmessageint;
    }

    public void setShortmessageint(BigDecimal shortmessageint) {
        this.shortmessageint = shortmessageint;
    }

    public Date getWorkgenerationtime() {
        return workgenerationtime;
    }

    public void setWorkgenerationtime(Date workgenerationtime) {
        this.workgenerationtime = workgenerationtime;
    }

    public BigDecimal getAftersinglenum() {
        return aftersinglenum;
    }

    public void setAftersinglenum(BigDecimal aftersinglenum) {
        this.aftersinglenum = aftersinglenum;
    }

    public BigDecimal getSmallmembernum() {
        return smallmembernum;
    }

    public void setSmallmembernum(BigDecimal smallmembernum) {
        this.smallmembernum = smallmembernum;
    }

    public BigDecimal getPickupunit() {
        return pickupunit;
    }

    public void setPickupunit(BigDecimal pickupunit) {
        this.pickupunit = pickupunit;
    }

    public Date getPickuptime() {
        return pickuptime;
    }

    public void setPickuptime(Date pickuptime) {
        this.pickuptime = pickuptime;
    }

    public String getSortingcode() {
        return sortingcode;
    }

    public void setSortingcode(String sortingcode) {
        this.sortingcode = sortingcode == null ? null : sortingcode.trim();
    }
}
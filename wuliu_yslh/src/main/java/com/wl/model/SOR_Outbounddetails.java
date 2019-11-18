package com.wl.model;

import java.math.BigDecimal;
import java.util.Date;

public class SOR_Outbounddetails {
    private BigDecimal id;

    private String packageid;

    private BigDecimal weight;

    private BigDecimal volume;

    private Date scandate;

    private BigDecimal isscan;

    private BigDecimal isnextstorage;

    private BigDecimal isdoublestorage;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getPackageid() {
        return packageid;
    }

    public void setPackageid(String packageid) {
        this.packageid = packageid == null ? null : packageid.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public Date getScandate() {
        return scandate;
    }

    public void setScandate(Date scandate) {
        this.scandate = scandate;
    }

    public BigDecimal getIsscan() {
        return isscan;
    }

    public void setIsscan(BigDecimal isscan) {
        this.isscan = isscan;
    }

    public BigDecimal getIsnextstorage() {
        return isnextstorage;
    }

    public void setIsnextstorage(BigDecimal isnextstorage) {
        this.isnextstorage = isnextstorage;
    }

    public BigDecimal getIsdoublestorage() {
        return isdoublestorage;
    }

    public void setIsdoublestorage(BigDecimal isdoublestorage) {
        this.isdoublestorage = isdoublestorage;
    }
}
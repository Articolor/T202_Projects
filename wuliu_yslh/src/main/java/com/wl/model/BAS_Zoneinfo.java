package com.wl.model;

import java.math.BigDecimal;

public class BAS_Zoneinfo {
    private BigDecimal id;

    private String zonecode;

    private String zonename;

    private BigDecimal zonepeople;

    private String telphone;

    private BigDecimal subordinateunit;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getZonecode() {
        return zonecode;
    }

    public void setZonecode(String zonecode) {
        this.zonecode = zonecode == null ? null : zonecode.trim();
    }

    public String getZonename() {
        return zonename;
    }

    public void setZonename(String zonename) {
        this.zonename = zonename == null ? null : zonename.trim();
    }

    public BigDecimal getZonepeople() {
        return zonepeople;
    }

    public void setZonepeople(BigDecimal zonepeople) {
        this.zonepeople = zonepeople;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public BigDecimal getSubordinateunit() {
        return subordinateunit;
    }

    public void setSubordinateunit(BigDecimal subordinateunit) {
        this.subordinateunit = subordinateunit;
    }
}
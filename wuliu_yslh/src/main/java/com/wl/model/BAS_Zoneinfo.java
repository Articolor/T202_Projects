package com.wl.model;

import java.math.BigDecimal;

public class BAS_Zoneinfo {
    private BigDecimal id;

    private String zonecode;

    private String zonename;

    private BigDecimal zonepeople;

    private String telphone;

    private BigDecimal subordinateunit;

    private SY_Units sy_units;

    private SY_Emp emp;

    public SY_Emp getEmp() {
        return emp;
    }

    public void setEmp(SY_Emp emp) {
        this.emp = emp;
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


    public BAS_Zoneinfo() {
    }

    public BAS_Zoneinfo(BigDecimal id, String zonecode, String zonename, BigDecimal zonepeople, String telphone, BigDecimal subordinateunit, SY_Units sy_units) {
        this.id = id;
        this.zonecode = zonecode;
        this.zonename = zonename;
        this.zonepeople = zonepeople;
        this.telphone = telphone;
        this.subordinateunit = subordinateunit;
        this.sy_units = sy_units;
    }
}
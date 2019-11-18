package com.wl.model;

import java.math.BigDecimal;

public class BAS_Partition {
    private BigDecimal id;

    private String province;

    private String city;

    private String county;

    private String zonecode;

    private String keyword;

    private BigDecimal startint;

    private BigDecimal terminateint;

    private BigDecimal sdint;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getZonecode() {
        return zonecode;
    }

    public void setZonecode(String zonecode) {
        this.zonecode = zonecode == null ? null : zonecode.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public BigDecimal getStartint() {
        return startint;
    }

    public void setStartint(BigDecimal startint) {
        this.startint = startint;
    }

    public BigDecimal getTerminateint() {
        return terminateint;
    }

    public void setTerminateint(BigDecimal terminateint) {
        this.terminateint = terminateint;
    }

    public BigDecimal getSdint() {
        return sdint;
    }

    public void setSdint(BigDecimal sdint) {
        this.sdint = sdint;
    }
}
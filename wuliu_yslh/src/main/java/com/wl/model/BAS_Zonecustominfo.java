package com.wl.model;

import java.math.BigDecimal;

public class BAS_Zonecustominfo {
    private BigDecimal customcode;

    private String customname;

    private BigDecimal mobileno;

    private String cityname;

    private String cstomaddress;

    private BigDecimal zoneinfoid;

    private BAS_Zoneinfo bas_zoneinfo;

    public BAS_Zoneinfo getBas_zoneinfo() {
        return bas_zoneinfo;
    }

    public void setBas_zoneinfo(BAS_Zoneinfo bas_zoneinfo) {
        this.bas_zoneinfo = bas_zoneinfo;
    }

    public BigDecimal getCustomcode() {
        return customcode;
    }

    public void setCustomcode(BigDecimal customcode) {
        this.customcode = customcode;
    }

    public String getCustomname() {
        return customname;
    }

    public void setCustomname(String customname) {
        this.customname = customname == null ? null : customname.trim();
    }

    public BigDecimal getMobileno() {
        return mobileno;
    }

    public void setMobileno(BigDecimal mobileno) {
        this.mobileno = mobileno;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public String getCstomaddress() {
        return cstomaddress;
    }

    public void setCstomaddress(String cstomaddress) {
        this.cstomaddress = cstomaddress == null ? null : cstomaddress.trim();
    }

    public BigDecimal getZoneinfoid() {
        return zoneinfoid;
    }

    public void setZoneinfoid(BigDecimal zoneinfoid) {
        this.zoneinfoid = zoneinfoid;
    }
}
package com.wl.model;

import java.math.BigDecimal;

public class BAS_Area {
    private BigDecimal id;

    private String province;

    private String city;

    private String county;

    private BigDecimal postalcode;

    private String simplecode;

    private BigDecimal citycode;

    private String entryunitid;

    private String complementunitid;

    private BigDecimal nature;

    private BigDecimal thearea;

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

    public BigDecimal getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(BigDecimal postalcode) {
        this.postalcode = postalcode;
    }

    public String getSimplecode() {
        return simplecode;
    }

    public void setSimplecode(String simplecode) {
        this.simplecode = simplecode == null ? null : simplecode.trim();
    }

    public BigDecimal getCitycode() {
        return citycode;
    }

    public void setCitycode(BigDecimal citycode) {
        this.citycode = citycode;
    }

    public String getEntryunitid() {
        return entryunitid;
    }

    public void setEntryunitid(String entryunitid) {
        this.entryunitid = entryunitid == null ? null : entryunitid.trim();
    }

    public String getComplementunitid() {
        return complementunitid;
    }

    public void setComplementunitid(String complementunitid) {
        this.complementunitid = complementunitid == null ? null : complementunitid.trim();
    }

    public BigDecimal getNature() {
        return nature;
    }

    public void setNature(BigDecimal nature) {
        this.nature = nature;
    }

    public BigDecimal getThearea() {
        return thearea;
    }

    public void setThearea(BigDecimal thearea) {
        this.thearea = thearea;
    }
}
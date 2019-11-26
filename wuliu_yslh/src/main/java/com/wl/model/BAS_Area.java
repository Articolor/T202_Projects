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

    private SY_Units sy_units;

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
    public BAS_Area() {
    }

    public BAS_Area(BigDecimal id, String province, String city, String county, BigDecimal postalcode, String simplecode, BigDecimal citycode, String entryunitid, String complementunitid, BigDecimal nature, BigDecimal thearea, SY_Units sy_units) {
        this.id = id;
        this.province = province;
        this.city = city;
        this.county = county;
        this.postalcode = postalcode;
        this.simplecode = simplecode;
        this.citycode = citycode;
        this.entryunitid = entryunitid;
        this.complementunitid = complementunitid;
        this.nature = nature;
        this.thearea = thearea;
        this.sy_units = sy_units;
    }

    @Override
    public String toString() {
        return "BAS_Area{" +
                "id=" + id +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", postalcode=" + postalcode +
                ", simplecode='" + simplecode + '\'' +
                ", citycode=" + citycode +
                ", entryunitid='" + entryunitid + '\'' +
                ", complementunitid='" + complementunitid + '\'' +
                ", nature=" + nature +
                ", thearea=" + thearea +
                ", sy_units=" + sy_units +
                '}';
    }
}
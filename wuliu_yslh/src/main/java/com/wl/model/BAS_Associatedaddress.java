package com.wl.model;

import java.math.BigDecimal;

public class BAS_Associatedaddress {
    private BigDecimal id;

    private String zonecode;

    private String city;

    private String customaddress;

    private BigDecimal associatedpartitions;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCustomaddress() {
        return customaddress;
    }

    public void setCustomaddress(String customaddress) {
        this.customaddress = customaddress == null ? null : customaddress.trim();
    }

    public BigDecimal getAssociatedpartitions() {
        return associatedpartitions;
    }

    public void setAssociatedpartitions(BigDecimal associatedpartitions) {
        this.associatedpartitions = associatedpartitions;
    }
}
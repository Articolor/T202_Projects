package com.wl.model;

import java.math.BigDecimal;
import java.util.Date;

public class SOR_Storage {
    private BigDecimal id;

    private Date acceptdate;

    private BigDecimal acceptperson;

    private String acceptcompany;

    private BigDecimal deliveryperson;

    private String deliverycompany;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Date getAcceptdate() {
        return acceptdate;
    }

    public void setAcceptdate(Date acceptdate) {
        this.acceptdate = acceptdate;
    }

    public BigDecimal getAcceptperson() {
        return acceptperson;
    }

    public void setAcceptperson(BigDecimal acceptperson) {
        this.acceptperson = acceptperson;
    }

    public String getAcceptcompany() {
        return acceptcompany;
    }

    public void setAcceptcompany(String acceptcompany) {
        this.acceptcompany = acceptcompany == null ? null : acceptcompany.trim();
    }

    public BigDecimal getDeliveryperson() {
        return deliveryperson;
    }

    public void setDeliveryperson(BigDecimal deliveryperson) {
        this.deliveryperson = deliveryperson;
    }

    public String getDeliverycompany() {
        return deliverycompany;
    }

    public void setDeliverycompany(String deliverycompany) {
        this.deliverycompany = deliverycompany == null ? null : deliverycompany.trim();
    }
}
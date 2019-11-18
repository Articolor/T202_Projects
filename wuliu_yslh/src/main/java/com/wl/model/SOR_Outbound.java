package com.wl.model;

import java.math.BigDecimal;
import java.util.Date;

public class SOR_Outbound {
    private BigDecimal id;

    private BigDecimal handovertype;

    private String line;

    private BigDecimal direction;

    private BigDecimal acceptperson;

    private BigDecimal carriers;

    private BigDecimal deliveryperson;

    private Date deliverydate;

    private String deliverycompany;

    private BigDecimal enterperson;

    private Date enterdate;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getHandovertype() {
        return handovertype;
    }

    public void setHandovertype(BigDecimal handovertype) {
        this.handovertype = handovertype;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line == null ? null : line.trim();
    }

    public BigDecimal getDirection() {
        return direction;
    }

    public void setDirection(BigDecimal direction) {
        this.direction = direction;
    }

    public BigDecimal getAcceptperson() {
        return acceptperson;
    }

    public void setAcceptperson(BigDecimal acceptperson) {
        this.acceptperson = acceptperson;
    }

    public BigDecimal getCarriers() {
        return carriers;
    }

    public void setCarriers(BigDecimal carriers) {
        this.carriers = carriers;
    }

    public BigDecimal getDeliveryperson() {
        return deliveryperson;
    }

    public void setDeliveryperson(BigDecimal deliveryperson) {
        this.deliveryperson = deliveryperson;
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public String getDeliverycompany() {
        return deliverycompany;
    }

    public void setDeliverycompany(String deliverycompany) {
        this.deliverycompany = deliverycompany == null ? null : deliverycompany.trim();
    }

    public BigDecimal getEnterperson() {
        return enterperson;
    }

    public void setEnterperson(BigDecimal enterperson) {
        this.enterperson = enterperson;
    }

    public Date getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(Date enterdate) {
        this.enterdate = enterdate;
    }
}
package com.wl.model;

import java.math.BigDecimal;
import java.util.Date;

public class LOG_Logisticstransfer {
    private BigDecimal id;

    private String transferint;

    private String startstation;

    private String endstation;

    private String dispatcher;

    private String driver;

    private BigDecimal deliveryperson;

    private Date deliverydate;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getTransferint() {
        return transferint;
    }

    public void setTransferint(String transferint) {
        this.transferint = transferint == null ? null : transferint.trim();
    }

    public String getStartstation() {
        return startstation;
    }

    public void setStartstation(String startstation) {
        this.startstation = startstation == null ? null : startstation.trim();
    }

    public String getEndstation() {
        return endstation;
    }

    public void setEndstation(String endstation) {
        this.endstation = endstation == null ? null : endstation.trim();
    }

    public String getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(String dispatcher) {
        this.dispatcher = dispatcher == null ? null : dispatcher.trim();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
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
}
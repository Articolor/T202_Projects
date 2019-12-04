package com.wl.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class SOR_Storage {
    private BigDecimal id;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date acceptdate;

    private BigDecimal acceptperson;

    private String acceptcompany;

    private BigDecimal deliveryperson;

    private String deliverycompany;

    private SOR_Storagedetails storagedetails;

    public SOR_Storagedetails getStoragedetails() {
        return storagedetails;
    }

    public void setStoragedetails(SOR_Storagedetails storagedetails) {
        this.storagedetails = storagedetails;
    }

    private Integer page=1;//起始页数

    private Integer rows=5;//到哪一行结束

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

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

    @Override
    public String toString() {
        return "SOR_Storage{" +
                "id=" + id +
                ", acceptdate=" + acceptdate +
                ", acceptperson=" + acceptperson +
                ", acceptcompany='" + acceptcompany + '\'' +
                ", deliveryperson=" + deliveryperson +
                ", deliverycompany='" + deliverycompany + '\'' +
                ", page=" + page +
                ", rows=" + rows +
                '}';
    }
}
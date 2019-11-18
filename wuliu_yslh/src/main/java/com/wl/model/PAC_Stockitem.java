package com.wl.model;

import java.math.BigDecimal;

public class PAC_Stockitem {
    private BigDecimal id;

    private String warehouseno;

    private String goodscode;

    private String goodsname;

    private BigDecimal storagenum;

    private BigDecimal actualnum;

    private BigDecimal plannedprice;

    private String specifications;

    private BigDecimal type;

    private BigDecimal status;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getWarehouseno() {
        return warehouseno;
    }

    public void setWarehouseno(String warehouseno) {
        this.warehouseno = warehouseno == null ? null : warehouseno.trim();
    }

    public String getGoodscode() {
        return goodscode;
    }

    public void setGoodscode(String goodscode) {
        this.goodscode = goodscode == null ? null : goodscode.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public BigDecimal getStoragenum() {
        return storagenum;
    }

    public void setStoragenum(BigDecimal storagenum) {
        this.storagenum = storagenum;
    }

    public BigDecimal getActualnum() {
        return actualnum;
    }

    public void setActualnum(BigDecimal actualnum) {
        this.actualnum = actualnum;
    }

    public BigDecimal getPlannedprice() {
        return plannedprice;
    }

    public void setPlannedprice(BigDecimal plannedprice) {
        this.plannedprice = plannedprice;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public BigDecimal getType() {
        return type;
    }

    public void setType(BigDecimal type) {
        this.type = type;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }
}
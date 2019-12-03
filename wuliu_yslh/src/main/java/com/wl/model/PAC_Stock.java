package com.wl.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PAC_Stock {

    private BigDecimal id;

    private String warehouseno;

    private BigDecimal reservoirtype;

    private String transport;

    private String subordinateunit;

    private BigDecimal drawerno;

    private String drawername;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date drawertime;

    private String remark;
    private PAC_Stockitem pac_stockitem;
    private Integer page=1;
    private List<PAC_Stockitem> pacStockitem;

    private SY_Units units;

    private String goodscode;

    private String goodsname;

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public SY_Units getUnits() {
        return units;
    }

    public void setUnits(SY_Units units) {
        this.units = units;
    }

    public String getGoodscode() {
        return goodscode;
    }

    public void setGoodscode(String goodscode) {
        this.goodscode = goodscode;
    }

    public List<PAC_Stockitem> getPacStockitem() {
        return pacStockitem;
    }

    public void setPacStockitem(List<PAC_Stockitem> pacStockitem) {
        this.pacStockitem = pacStockitem;
    }

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
    } private Integer rows=5;



    public PAC_Stockitem getPac_stockitem() {
        return pac_stockitem;
    }

    public void setPac_stockitem(PAC_Stockitem pac_stockitem) {
        this.pac_stockitem = pac_stockitem;
    }

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

    public BigDecimal getReservoirtype() {
        return reservoirtype;
    }

    public void setReservoirtype(BigDecimal reservoirtype) {
        this.reservoirtype = reservoirtype;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport == null ? null : transport.trim();
    }

    public String getSubordinateunit() {
        return subordinateunit;
    }

    public void setSubordinateunit(String subordinateunit) {
        this.subordinateunit = subordinateunit == null ? null : subordinateunit.trim();
    }

    public BigDecimal getDrawerno() {
        return drawerno;
    }

    public void setDrawerno(BigDecimal drawerno) {
        this.drawerno = drawerno;
    }

    public String getDrawername() {
        return drawername;
    }

    public void setDrawername(String drawername) {
        this.drawername = drawername == null ? null : drawername.trim();
    }

    public Date getDrawertime() {
        return drawertime;
    }

    public void setDrawertime(Date drawertime) {
        this.drawertime = drawertime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "PAC_Stock{" +
                "id=" + id +
                ", warehouseno='" + warehouseno + '\'' +
                ", reservoirtype=" + reservoirtype +
                ", transport='" + transport + '\'' +
                ", subordinateunit='" + subordinateunit + '\'' +
                ", drawerno=" + drawerno +
                ", drawername='" + drawername + '\'' +
                ", drawertime=" + drawertime +
                ", remark='" + remark + '\'' +
                ", pac_stockitem=" + pac_stockitem +
                '}';
    }
}
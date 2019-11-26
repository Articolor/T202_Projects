package com.wl.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class ACC_Businessadmissibility {
    private BigDecimal id;

    private String businessnoticeno;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date reservationtime;

    private String customname;

    private String pickupaddress;

    private String customcode;

    private String linkman;

    private String telphone;

    private BigDecimal weight;

    private BigDecimal volume;

    private String importanthints;

    private String arrivecity;

    private BigDecimal pickerinfo;

    private String sendaddress;

    private BigDecimal processingunit;

    private BigDecimal notificationsource;

    private BigDecimal customnomodifyflag;

    private String singletype;

    private BigDecimal packagesnum;

    private BigDecimal actualweight;

    private BigDecimal billingweight;

    private BigDecimal packingfee;

    private BigDecimal actualpacking;

    //起始页数
    private Integer page=1;

    //到第几页
    private Integer rows=5;

    //一个员工对象
    private SY_Units units;

    //一个单位对象
    private SY_Emp emp;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getBusinessnoticeno() {
        return businessnoticeno;
    }

    public void setBusinessnoticeno(String businessnoticeno) {
        this.businessnoticeno = businessnoticeno == null ? null : businessnoticeno.trim();
    }

    public Date getReservationtime() {
        return reservationtime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public void setReservationtime(Date reservationtime) {
        this.reservationtime = reservationtime;
    }

    public String getCustomname() {
        return customname;
    }

    public void setCustomname(String customname) {
        this.customname = customname == null ? null : customname.trim();
    }

    public String getPickupaddress() {
        return pickupaddress;
    }

    public void setPickupaddress(String pickupaddress) {
        this.pickupaddress = pickupaddress == null ? null : pickupaddress.trim();
    }

    public String getCustomcode() {
        return customcode;
    }

    public void setCustomcode(String customcode) {
        this.customcode = customcode == null ? null : customcode.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public String getImportanthints() {
        return importanthints;
    }

    public void setImportanthints(String importanthints) {
        this.importanthints = importanthints == null ? null : importanthints.trim();
    }

    public String getArrivecity() {
        return arrivecity;
    }

    public void setArrivecity(String arrivecity) {
        this.arrivecity = arrivecity == null ? null : arrivecity.trim();
    }

    public BigDecimal getPickerinfo() {
        return pickerinfo;
    }

    public void setPickerinfo(BigDecimal pickerinfo) {
        this.pickerinfo = pickerinfo;
    }

    public String getSendaddress() {
        return sendaddress;
    }

    public void setSendaddress(String sendaddress) {
        this.sendaddress = sendaddress == null ? null : sendaddress.trim();
    }

    public BigDecimal getProcessingunit() {
        return processingunit;
    }

    public void setProcessingunit(BigDecimal processingunit) {
        this.processingunit = processingunit;
    }

    public BigDecimal getNotificationsource() {
        return notificationsource;
    }

    public void setNotificationsource(BigDecimal notificationsource) {
        this.notificationsource = notificationsource;
    }

    public BigDecimal getCustomnomodifyflag() {
        return customnomodifyflag;
    }

    public void setCustomnomodifyflag(BigDecimal customnomodifyflag) {
        this.customnomodifyflag = customnomodifyflag;
    }

    public String getSingletype() {
        return singletype;
    }

    public void setSingletype(String singletype) {
        this.singletype = singletype == null ? null : singletype.trim();
    }

    public BigDecimal getPackagesnum() {
        return packagesnum;
    }

    public void setPackagesnum(BigDecimal packagesnum) {
        this.packagesnum = packagesnum;
    }

    public BigDecimal getActualweight() {
        return actualweight;
    }

    public void setActualweight(BigDecimal actualweight) {
        this.actualweight = actualweight;
    }

    public BigDecimal getBillingweight() {
        return billingweight;
    }

    public void setBillingweight(BigDecimal billingweight) {
        this.billingweight = billingweight;
    }

    public BigDecimal getPackingfee() {
        return packingfee;
    }

    public void setPackingfee(BigDecimal packingfee) {
        this.packingfee = packingfee;
    }

    public BigDecimal getActualpacking() {
        return actualpacking;
    }

    public void setActualpacking(BigDecimal actualpacking) {
        this.actualpacking = actualpacking;
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
    }

    public SY_Units getUnits() {
        return units;
    }

    public void setUnits(SY_Units units) {
        this.units = units;
    }

    public SY_Emp getEmp() {
        return emp;
    }

    public void setEmp(SY_Emp emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "ACC_Businessadmissibility{" +
                "id=" + id +
                ", businessnoticeno='" + businessnoticeno + '\'' +
                ", reservationtime=" + reservationtime +
                ", customname='" + customname + '\'' +
                ", pickupaddress='" + pickupaddress + '\'' +
                ", customcode='" + customcode + '\'' +
                ", linkman='" + linkman + '\'' +
                ", telphone='" + telphone + '\'' +
                ", weight=" + weight +
                ", volume=" + volume +
                ", importanthints='" + importanthints + '\'' +
                ", arrivecity='" + arrivecity + '\'' +
                ", pickerinfo=" + pickerinfo +
                ", sendaddress='" + sendaddress + '\'' +
                ", processingunit=" + processingunit +
                ", notificationsource=" + notificationsource +
                ", customnomodifyflag=" + customnomodifyflag +
                ", singletype='" + singletype + '\'' +
                ", packagesnum=" + packagesnum +
                ", actualweight=" + actualweight +
                ", billingweight=" + billingweight +
                ", packingfee=" + packingfee +
                ", actualpacking=" + actualpacking +
                ", page=" + page +
                ", rows=" + rows +
                ", units=" + units +
                ", emp=" + emp +
                '}';
    }
}
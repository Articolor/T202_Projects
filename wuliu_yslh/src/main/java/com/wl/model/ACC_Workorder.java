package com.wl.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class ACC_Workorder {
    private BigDecimal id;

    private String businessnoticeno;

    private String jobno;

    private BigDecimal jobtype;

    private BigDecimal pickupstatus;

    private BigDecimal shortmessageint;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date workgenerationtime;

    private BigDecimal aftersinglenum;

    private BigDecimal smallmembernum;

    private BigDecimal pickupunit;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date pickuptime;

    private String sortingcode;

    //起始页数
    private Integer page=1;
    //到哪一行结束
    private Integer rows=5;

    //一个工作单号对应一个公司
    private SY_Units units;

    //一个受理对象
    private ACC_Businessadmissibility businessadmissibility;

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

    public String getJobno() {
        return jobno;
    }

    public void setJobno(String jobno) {
        this.jobno = jobno == null ? null : jobno.trim();
    }

    public BigDecimal getJobtype() {
        return jobtype;
    }

    public void setJobtype(BigDecimal jobtype) {
        this.jobtype = jobtype;
    }

    public BigDecimal getPickupstatus() {
        return pickupstatus;
    }

    public void setPickupstatus(BigDecimal pickupstatus) {
        this.pickupstatus = pickupstatus;
    }

    public BigDecimal getShortmessageint() {
        return shortmessageint;
    }

    public void setShortmessageint(BigDecimal shortmessageint) {
        this.shortmessageint = shortmessageint;
    }

    public Date getWorkgenerationtime() {
        return workgenerationtime;
    }

    public void setWorkgenerationtime(Date workgenerationtime) {
        this.workgenerationtime = workgenerationtime;
    }

    public BigDecimal getAftersinglenum() {
        return aftersinglenum;
    }

    public void setAftersinglenum(BigDecimal aftersinglenum) {
        this.aftersinglenum = aftersinglenum;
    }

    public BigDecimal getSmallmembernum() {
        return smallmembernum;
    }

    public void setSmallmembernum(BigDecimal smallmembernum) {
        this.smallmembernum = smallmembernum;
    }

    public BigDecimal getPickupunit() {
        return pickupunit;
    }

    public void setPickupunit(BigDecimal pickupunit) {
        this.pickupunit = pickupunit;
    }

    public Date getPickuptime() {
        return pickuptime;
    }

    public void setPickuptime(Date pickuptime) {
        this.pickuptime = pickuptime;
    }

    public String getSortingcode() {
        return sortingcode;
    }

    public void setSortingcode(String sortingcode) {
        this.sortingcode = sortingcode == null ? null : sortingcode.trim();
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

    public ACC_Businessadmissibility getBusinessadmissibility() {
        return businessadmissibility;
    }

    public void setBusinessadmissibility(ACC_Businessadmissibility businessadmissibility) {
        this.businessadmissibility = businessadmissibility;
    }

    public ACC_Workorder() {
    }

    public ACC_Workorder(String businessnoticeno, String jobno, BigDecimal jobtype, BigDecimal pickupstatus, BigDecimal shortmessageint, Date workgenerationtime, BigDecimal aftersinglenum, BigDecimal smallmembernum, BigDecimal pickupunit, Date pickuptime, String sortingcode) {
        this.businessnoticeno = businessnoticeno;
        this.jobno = jobno;
        this.jobtype = jobtype;
        this.pickupstatus = pickupstatus;
        this.shortmessageint = shortmessageint;
        this.workgenerationtime = workgenerationtime;
        this.aftersinglenum = aftersinglenum;
        this.smallmembernum = smallmembernum;
        this.pickupunit = pickupunit;
        this.pickuptime = pickuptime;
        this.sortingcode = sortingcode;
    }

    public ACC_Workorder(String businessnoticeno, BigDecimal jobtype, BigDecimal pickupstatus, BigDecimal aftersinglenum, BigDecimal smallmembernum, BigDecimal pickupunit, Date pickuptime) {
        this.businessnoticeno = businessnoticeno;
        this.jobtype = jobtype;
        this.pickupstatus = pickupstatus;
        this.aftersinglenum = aftersinglenum;
        this.smallmembernum = smallmembernum;
        this.pickupunit = pickupunit;
        this.pickuptime = pickuptime;
    }


    public ACC_Workorder(BigDecimal id, BigDecimal smallmembernum, BigDecimal pickupunit, String sortingcode) {
        this.id = id;
        this.smallmembernum = smallmembernum;
        this.pickupunit = pickupunit;
        this.sortingcode = sortingcode;
    }

    @Override
    public String toString() {
        return "ACC_Workorder{" +
                "id=" + id +
                ", businessnoticeno='" + businessnoticeno + '\'' +
                ", jobno='" + jobno + '\'' +
                ", jobtype=" + jobtype +
                ", pickupstatus=" + pickupstatus +
                ", shortmessageint=" + shortmessageint +
                ", workgenerationtime=" + workgenerationtime +
                ", aftersinglenum=" + aftersinglenum +
                ", smallmembernum=" + smallmembernum +
                ", pickupunit=" + pickupunit +
                ", pickuptime=" + pickuptime +
                ", sortingcode='" + sortingcode + '\'' +
                ", page=" + page +
                ", rows=" + rows +
                ", units=" + units +
                ", businessadmissibility=" + businessadmissibility +
                '}';
    }
}
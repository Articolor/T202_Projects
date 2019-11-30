package com.wl.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class DIS_Workordersign {
    private BigDecimal id;

    private BigDecimal workorderid;

    private String worksheetno;

    private BigDecimal workordertype;

    private BigDecimal signtype;

    private BigDecimal courierint;

    private String couriername;//暂时接受录入人姓名

    private String recipient;//暂时接受单位

    private BigDecimal signunit;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date signtime;

    private BigDecimal invalidatemark;

    public DIS_Workordersign() {
    }

    private String abnormalmark;

    @Override
    public String toString() {
        return "DIS_Workordersign{" +
                "id=" + id +
                ", workorderid=" + workorderid +
                ", worksheetno='" + worksheetno + '\'' +
                ", workordertype=" + workordertype +
                ", signtype=" + signtype +
                ", courierint=" + courierint +
                ", couriername='" + couriername + '\'' +
                ", recipient='" + recipient + '\'' +
                ", signunit=" + signunit +
                ", signtime=" + signtime +
                ", invalidatemark=" + invalidatemark +
                ", abnormalmark='" + abnormalmark + '\'' +
                ", inputpersoncode=" + inputpersoncode +
                ", inputpersonid=" + inputpersonid +
                ", inputid=" + inputid +
                ", inputtime=" + inputtime +
                '}';
    }

    public DIS_Workordersign(BigDecimal id, BigDecimal workorderid, String worksheetno, BigDecimal workordertype, BigDecimal signtype, BigDecimal courierint, String couriername, String recipient, BigDecimal signunit, Date signtime, BigDecimal invalidatemark, String abnormalmark, BigDecimal inputpersoncode, BigDecimal inputpersonid, BigDecimal inputid, Date inputtime) {
        this.id = id;
        this.workorderid = workorderid;
        this.worksheetno = worksheetno;
        this.workordertype = workordertype;
        this.signtype = signtype;
        this.courierint = courierint;
        this.couriername = couriername;
        this.recipient = recipient;
        this.signunit = signunit;
        this.signtime = signtime;
        this.invalidatemark = invalidatemark;
        this.abnormalmark = abnormalmark;
        this.inputpersoncode = inputpersoncode;
        this.inputpersonid = inputpersonid;
        this.inputid = inputid;
        this.inputtime = inputtime;
    }

    private BigDecimal inputpersoncode;

    private BigDecimal inputpersonid;

    private BigDecimal inputid;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date inputtime;

    private Integer page=1;//起始页数

    private Integer rows=5;//到哪一页结束

    private SY_Emp emp;//一个员工对象

    private SY_Units units;//一个单位对象

    private String singunitname;//签收单位

    public String getSingunitname() {
        return singunitname;
    }

    public void setSingunitname(String singunitname) {
        this.singunitname = singunitname;
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

    public SY_Emp getEmp() {
        return emp;
    }

    public void setEmp(SY_Emp emp) {
        this.emp = emp;
    }

    public SY_Units getUnits() {
        return units;
    }

    public void setUnits(SY_Units units) {
        this.units = units;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getWorkorderid() {
        return workorderid;
    }

    public void setWorkorderid(BigDecimal workorderid) {
        this.workorderid = workorderid;
    }

    public String getWorksheetno() {
        return worksheetno;
    }

    public void setWorksheetno(String worksheetno) {
        this.worksheetno = worksheetno == null ? null : worksheetno.trim();
    }

    public BigDecimal getWorkordertype() {
        return workordertype;
    }

    public void setWorkordertype(BigDecimal workordertype) {
        this.workordertype = workordertype;
    }

    public BigDecimal getSigntype() {
        return signtype;
    }

    public void setSigntype(BigDecimal signtype) {
        this.signtype = signtype;
    }

    public BigDecimal getCourierint() {
        return courierint;
    }

    public void setCourierint(BigDecimal courierint) {
        this.courierint = courierint;
    }

    public String getCouriername() {
        return couriername;
    }

    public void setCouriername(String couriername) {
        this.couriername = couriername == null ? null : couriername.trim();
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient == null ? null : recipient.trim();
    }

    public BigDecimal getSignunit() {
        return signunit;
    }

    public void setSignunit(BigDecimal signunit) {
        this.signunit = signunit;
    }

    public Date getSigntime() {
        return signtime;
    }

    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    public BigDecimal getInvalidatemark() {
        return invalidatemark;
    }

    public void setInvalidatemark(BigDecimal invalidatemark) {
        this.invalidatemark = invalidatemark;
    }

    public String getAbnormalmark() {
        return abnormalmark;
    }

    public void setAbnormalmark(String abnormalmark) {
        this.abnormalmark = abnormalmark == null ? null : abnormalmark.trim();
    }

    public BigDecimal getInputpersoncode() {
        return inputpersoncode;
    }

    public void setInputpersoncode(BigDecimal inputpersoncode) {
        this.inputpersoncode = inputpersoncode;
    }

    public BigDecimal getInputpersonid() {
        return inputpersonid;
    }

    public void setInputpersonid(BigDecimal inputpersonid) {
        this.inputpersonid = inputpersonid;
    }

    public BigDecimal getInputid() {
        return inputid;
    }

    public void setInputid(BigDecimal inputid) {
        this.inputid = inputid;
    }

    public Date getInputtime() {
        return inputtime;
    }

    public void setInputtime(Date inputtime) {
        this.inputtime = inputtime;
    }

}
package com.wl.model;

import java.math.BigDecimal;
import java.util.Date;

public class DIS_Workordersign {
    private BigDecimal id;

    private BigDecimal workorderid;

    private String worksheetno;

    private BigDecimal workordertype;

    private BigDecimal signtype;

    private BigDecimal courierint;

    private String couriername;

    private String recipient;

    private BigDecimal signunit;

    private Date signtime;

    private BigDecimal invalidatemark;

    private String abnormalmark;

    private BigDecimal inputpersoncode;

    private BigDecimal inputpersonid;

    private BigDecimal inputid;

    private Date inputtime;

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
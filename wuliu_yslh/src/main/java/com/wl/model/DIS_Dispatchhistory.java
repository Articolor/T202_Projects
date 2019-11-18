package com.wl.model;

import java.math.BigDecimal;
import java.util.Date;

public class DIS_Dispatchhistory {
    private BigDecimal id;

    private BigDecimal dispatchsequence;

    private BigDecimal transferredunit;

    private BigDecimal operatorid;

    private BigDecimal operationunitid;

    private Date operationtime;

    private String remark;

    private BigDecimal status;

    private String reason;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getDispatchsequence() {
        return dispatchsequence;
    }

    public void setDispatchsequence(BigDecimal dispatchsequence) {
        this.dispatchsequence = dispatchsequence;
    }

    public BigDecimal getTransferredunit() {
        return transferredunit;
    }

    public void setTransferredunit(BigDecimal transferredunit) {
        this.transferredunit = transferredunit;
    }

    public BigDecimal getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(BigDecimal operatorid) {
        this.operatorid = operatorid;
    }

    public BigDecimal getOperationunitid() {
        return operationunitid;
    }

    public void setOperationunitid(BigDecimal operationunitid) {
        this.operationunitid = operationunitid;
    }

    public Date getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}
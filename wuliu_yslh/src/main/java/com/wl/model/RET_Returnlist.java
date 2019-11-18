package com.wl.model;

import java.math.BigDecimal;
import java.util.Date;

public class RET_Returnlist {
    private BigDecimal id;

    private String applicationno;

    private String worksheetno;

    private BigDecimal returntype;

    private String apremark;

    private BigDecimal aploss;

    private Date entrytime;

    private BigDecimal receivegunit;

    private BigDecimal invalidatesign;

    private BigDecimal returnunit;

    private Date recordingtime;

    private BigDecimal entryunit;

    private String personname;

    private Date confirmationtime;

    private BigDecimal confirmationunit;

    private String confirmationpersonname;

    private BigDecimal treatmentstate;

    private BigDecimal apreturnstatus;

    private BigDecimal identificationsign;

    private String handlingopinions;

    private String denialtype;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getApplicationno() {
        return applicationno;
    }

    public void setApplicationno(String applicationno) {
        this.applicationno = applicationno == null ? null : applicationno.trim();
    }

    public String getWorksheetno() {
        return worksheetno;
    }

    public void setWorksheetno(String worksheetno) {
        this.worksheetno = worksheetno == null ? null : worksheetno.trim();
    }

    public BigDecimal getReturntype() {
        return returntype;
    }

    public void setReturntype(BigDecimal returntype) {
        this.returntype = returntype;
    }

    public String getApremark() {
        return apremark;
    }

    public void setApremark(String apremark) {
        this.apremark = apremark == null ? null : apremark.trim();
    }

    public BigDecimal getAploss() {
        return aploss;
    }

    public void setAploss(BigDecimal aploss) {
        this.aploss = aploss;
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public BigDecimal getReceivegunit() {
        return receivegunit;
    }

    public void setReceivegunit(BigDecimal receivegunit) {
        this.receivegunit = receivegunit;
    }

    public BigDecimal getInvalidatesign() {
        return invalidatesign;
    }

    public void setInvalidatesign(BigDecimal invalidatesign) {
        this.invalidatesign = invalidatesign;
    }

    public BigDecimal getReturnunit() {
        return returnunit;
    }

    public void setReturnunit(BigDecimal returnunit) {
        this.returnunit = returnunit;
    }

    public Date getRecordingtime() {
        return recordingtime;
    }

    public void setRecordingtime(Date recordingtime) {
        this.recordingtime = recordingtime;
    }

    public BigDecimal getEntryunit() {
        return entryunit;
    }

    public void setEntryunit(BigDecimal entryunit) {
        this.entryunit = entryunit;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname == null ? null : personname.trim();
    }

    public Date getConfirmationtime() {
        return confirmationtime;
    }

    public void setConfirmationtime(Date confirmationtime) {
        this.confirmationtime = confirmationtime;
    }

    public BigDecimal getConfirmationunit() {
        return confirmationunit;
    }

    public void setConfirmationunit(BigDecimal confirmationunit) {
        this.confirmationunit = confirmationunit;
    }

    public String getConfirmationpersonname() {
        return confirmationpersonname;
    }

    public void setConfirmationpersonname(String confirmationpersonname) {
        this.confirmationpersonname = confirmationpersonname == null ? null : confirmationpersonname.trim();
    }

    public BigDecimal getTreatmentstate() {
        return treatmentstate;
    }

    public void setTreatmentstate(BigDecimal treatmentstate) {
        this.treatmentstate = treatmentstate;
    }

    public BigDecimal getApreturnstatus() {
        return apreturnstatus;
    }

    public void setApreturnstatus(BigDecimal apreturnstatus) {
        this.apreturnstatus = apreturnstatus;
    }

    public BigDecimal getIdentificationsign() {
        return identificationsign;
    }

    public void setIdentificationsign(BigDecimal identificationsign) {
        this.identificationsign = identificationsign;
    }

    public String getHandlingopinions() {
        return handlingopinions;
    }

    public void setHandlingopinions(String handlingopinions) {
        this.handlingopinions = handlingopinions == null ? null : handlingopinions.trim();
    }

    public String getDenialtype() {
        return denialtype;
    }

    public void setDenialtype(String denialtype) {
        this.denialtype = denialtype == null ? null : denialtype.trim();
    }
}
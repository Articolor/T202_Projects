package com.wl.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class RET_Returnlist {
    private BigDecimal id;

    private String applicationno;

    private String worksheetno;

    private BigDecimal returntype;

    private String apremark;

    private BigDecimal aploss;

    @DateTimeFormat(pattern="YYYY-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date entrytime;

    private BigDecimal receivegunit;

    private BigDecimal invalidatesign;

    private BigDecimal returnunit;

    @DateTimeFormat(pattern="YYYY-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date recordingtime;

    private BigDecimal entryunit;

    private String personname;

    @DateTimeFormat(pattern="YYYY-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date confirmationtime;

    private BigDecimal confirmationunit;

    private String confirmationpersonname;

    private BigDecimal treatmentstate;

    private BigDecimal apreturnstatus;

    private BigDecimal identificationsign;

    private String handlingopinions;

    private String denialtype;

    private  SY_Units receivegunit1;

    private SY_Units returnunit2;

    private SY_Units entryunit3;

    private DIS_Workordersign  disWorkordersign=new DIS_Workordersign();

    @Override
    public String toString() {
        return "RET_Returnlist{" +
                "id=" + id +
                ", applicationno='" + applicationno + '\'' +
                ", worksheetno='" + worksheetno + '\'' +
                ", returntype=" + returntype +
                ", apremark='" + apremark + '\'' +
                ", aploss=" + aploss +
                ", entrytime=" + entrytime +
                ", receivegunit=" + receivegunit +
                ", invalidatesign=" + invalidatesign +
                ", returnunit=" + returnunit +
                ", recordingtime=" + recordingtime +
                ", entryunit=" + entryunit +
                ", personname='" + personname + '\'' +
                ", confirmationtime=" + confirmationtime +
                ", confirmationunit=" + confirmationunit +
                ", confirmationpersonname='" + confirmationpersonname + '\'' +
                ", treatmentstate=" + treatmentstate +
                ", apreturnstatus=" + apreturnstatus +
                ", identificationsign=" + identificationsign +
                ", handlingopinions='" + handlingopinions + '\'' +
                ", denialtype='" + denialtype + '\'' +
                ", receivegunit1=" + receivegunit1 +
                ", returnunit2=" + returnunit2 +
                ", entryunit3=" + entryunit3 +
                ", disWorkordersign=" + disWorkordersign +
                '}';
    }

    public DIS_Workordersign getDisWorkordersign() {
        return disWorkordersign;
    }

    public void setDisWorkordersign(DIS_Workordersign disWorkordersign) {
        this.disWorkordersign = disWorkordersign;
    }

    public RET_Returnlist() {
    }

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
        this.applicationno = applicationno;
    }

    public String getWorksheetno() {
        return worksheetno;
    }

    public void setWorksheetno(String worksheetno) {
        this.worksheetno = worksheetno;
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
        this.apremark = apremark;
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
        this.personname = personname;
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
        this.confirmationpersonname = confirmationpersonname;
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
        this.handlingopinions = handlingopinions;
    }

    public String getDenialtype() {
        return denialtype;
    }

    public void setDenialtype(String denialtype) {
        this.denialtype = denialtype;
    }

    public SY_Units getReceivegunit1() {
        return receivegunit1;
    }

    public void setReceivegunit1(SY_Units receivegunit1) {
        this.receivegunit1 = receivegunit1;
    }

    public SY_Units getReturnunit2() {
        return returnunit2;
    }

    public void setReturnunit2(SY_Units returnunit2) {
        this.returnunit2 = returnunit2;
    }

    public SY_Units getEntryunit3() {
        return entryunit3;
    }

    public void setEntryunit3(SY_Units entryunit3) {
        this.entryunit3 = entryunit3;
    }
}
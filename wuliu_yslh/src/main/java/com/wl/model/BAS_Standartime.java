package com.wl.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class BAS_Standartime {
    private BigDecimal id;

    private String timename;

    private BigDecimal subordinateunit;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = " HH:mm:ss",timezone = "GMT+8")
    private Date workingtime;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "HH:mm:ss",timezone = "GMT+8")
    private Date closingtime;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "HH:mm:ss",timezone = "GMT+8")
    private Date saturdayworkingtime;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "HH:mm:ss",timezone = "GMT+8")
    private Date saturdayclosingtime;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "HH:mm:ss",timezone = "GMT+8")
    private Date sundayworkingtime;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "HH:mm:ss",timezone = "GMT+8")
    private Date sundayclosingtime;

    private SY_Units sy_units;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getTimename() {
        return timename;
    }

    public void setTimename(String timename) {
        this.timename = timename == null ? null : timename.trim();
    }

    public BigDecimal getSubordinateunit() {
        return subordinateunit;
    }

    public void setSubordinateunit(BigDecimal subordinateunit) {
        this.subordinateunit = subordinateunit;
    }

    public Date getWorkingtime() {
        return workingtime;
    }

    public void setWorkingtime(Date workingtime) {
        this.workingtime = workingtime;
    }

    public Date getClosingtime() {
        return closingtime;
    }

    public void setClosingtime(Date closingtime) {
        this.closingtime = closingtime;
    }

    public Date getSaturdayworkingtime() {
        return saturdayworkingtime;
    }

    public void setSaturdayworkingtime(Date saturdayworkingtime) {
        this.saturdayworkingtime = saturdayworkingtime;
    }

    public Date getSaturdayclosingtime() {
        return saturdayclosingtime;
    }

    public void setSaturdayclosingtime(Date saturdayclosingtime) {
        this.saturdayclosingtime = saturdayclosingtime;
    }

    public Date getSundayworkingtime() {
        return sundayworkingtime;
    }

    public void setSundayworkingtime(Date sundayworkingtime) {
        this.sundayworkingtime = sundayworkingtime;
    }

    public Date getSundayclosingtime() {
        return sundayclosingtime;
    }

    public void setSundayclosingtime(Date sundayclosingtime) {
        this.sundayclosingtime = sundayclosingtime;
    }

    public SY_Units getSy_units() {
        return sy_units;
    }

    public void setSy_units(SY_Units sy_units) {
        this.sy_units = sy_units;
    }
}
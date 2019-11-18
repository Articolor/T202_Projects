package com.wl.model;

import java.math.BigDecimal;

public class BAS_Substitute {
    private BigDecimal id;

    private String empno;

    private String empname;

    private BigDecimal mobileno;

    private BigDecimal type;

    private BigDecimal pda;

    private BigDecimal standardkg;

    private BigDecimal standardlength;

    private String models;

    private String plateint;

    private BigDecimal invalidatemark;

    private BigDecimal subordinateunit;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno == null ? null : empno.trim();
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public BigDecimal getMobileno() {
        return mobileno;
    }

    public void setMobileno(BigDecimal mobileno) {
        this.mobileno = mobileno;
    }

    public BigDecimal getType() {
        return type;
    }

    public void setType(BigDecimal type) {
        this.type = type;
    }

    public BigDecimal getPda() {
        return pda;
    }

    public void setPda(BigDecimal pda) {
        this.pda = pda;
    }

    public BigDecimal getStandardkg() {
        return standardkg;
    }

    public void setStandardkg(BigDecimal standardkg) {
        this.standardkg = standardkg;
    }

    public BigDecimal getStandardlength() {
        return standardlength;
    }

    public void setStandardlength(BigDecimal standardlength) {
        this.standardlength = standardlength;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models == null ? null : models.trim();
    }

    public String getPlateint() {
        return plateint;
    }

    public void setPlateint(String plateint) {
        this.plateint = plateint == null ? null : plateint.trim();
    }

    public BigDecimal getInvalidatemark() {
        return invalidatemark;
    }

    public void setInvalidatemark(BigDecimal invalidatemark) {
        this.invalidatemark = invalidatemark;
    }

    public BigDecimal getSubordinateunit() {
        return subordinateunit;
    }

    public void setSubordinateunit(BigDecimal subordinateunit) {
        this.subordinateunit = subordinateunit;
    }
}
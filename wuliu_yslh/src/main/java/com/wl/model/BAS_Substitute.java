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

    private SY_Units sy_units;

    private SY_Emp sy_emp;


    public SY_Emp getSy_emp() {
        return sy_emp;
    }

    public void setSy_emp(SY_Emp sy_emp) {
        this.sy_emp = sy_emp;
    }

    public BAS_Substitute() {
    }

    public BAS_Substitute(BigDecimal id, String empno, String empname, BigDecimal mobileno, BigDecimal type, BigDecimal pda, BigDecimal standardkg, BigDecimal standardlength, String models, String plateint, BigDecimal invalidatemark, BigDecimal subordinateunit, SY_Units sy_units) {
        this.id = id;
        this.empno = empno;
        this.empname = empname;
        this.mobileno = mobileno;
        this.type = type;
        this.pda = pda;
        this.standardkg = standardkg;
        this.standardlength = standardlength;
        this.models = models;
        this.plateint = plateint;
        this.invalidatemark = invalidatemark;
        this.subordinateunit = subordinateunit;
        this.sy_units = sy_units;
    }


    @Override
    public String toString() {
        return "BAS_Substitute{" +
                "id=" + id +
                ", empno='" + empno + '\'' +
                ", empname='" + empname + '\'' +
                ", mobileno=" + mobileno +
                ", type=" + type +
                ", pda=" + pda +
                ", standardkg=" + standardkg +
                ", standardlength=" + standardlength +
                ", models='" + models + '\'' +
                ", plateint='" + plateint + '\'' +
                ", invalidatemark=" + invalidatemark +
                ", subordinateunit=" + subordinateunit +
                ", sy_units=" + sy_units +
                '}';
    }

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
        this.empno = empno;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
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
        this.models = models;
    }

    public String getPlateint() {
        return plateint;
    }

    public void setPlateint(String plateint) {
        this.plateint = plateint;
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

    public SY_Units getSy_units() {
        return sy_units;
    }

    public void setSy_units(SY_Units sy_units) {
        this.sy_units = sy_units;
    }
}
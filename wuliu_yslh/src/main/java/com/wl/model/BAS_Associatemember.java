package com.wl.model;

import java.math.BigDecimal;
import java.util.Date;

public class BAS_Associatemember {
    private BigDecimal id;

    private String zonecode;

    private String empno;

    private String empname;

    private BigDecimal standardkg;

    private BigDecimal standardlength;

    private Date standardtime;

    private BigDecimal subordinateunit;

    private String type;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getZonecode() {
        return zonecode;
    }

    public void setZonecode(String zonecode) {
        this.zonecode = zonecode == null ? null : zonecode.trim();
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

    public Date getStandardtime() {
        return standardtime;
    }

    public void setStandardtime(Date standardtime) {
        this.standardtime = standardtime;
    }

    public BigDecimal getSubordinateunit() {
        return subordinateunit;
    }

    public void setSubordinateunit(BigDecimal subordinateunit) {
        this.subordinateunit = subordinateunit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}
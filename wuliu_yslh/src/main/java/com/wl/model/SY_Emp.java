package com.wl.model;

import java.math.BigDecimal;

public class SY_Emp {
    private BigDecimal id;

    private String empname;

    private String empno;

    private String pwd;

    private String querypwd;

    private BigDecimal roleid;

    private BigDecimal empunit;

    private String remark;

    private BigDecimal disabled;

   private BAS_Deliverystandard bas_deliverystandard;

   private BAS_Basicarchives bas_basicArchives;

    public SY_Emp() {
    }

    public SY_Emp(BigDecimal id, String empname, String empno, String pwd, String querypwd, BigDecimal roleid, BigDecimal empunit, String remark, BigDecimal disabled, BAS_Deliverystandard bas_deliverystandard, BAS_Basicarchives bas_basicArchives) {
        this.id = id;
        this.empname = empname;
        this.empno = empno;
        this.pwd = pwd;
        this.querypwd = querypwd;
        this.roleid = roleid;
        this.empunit = empunit;
        this.remark = remark;
        this.disabled = disabled;
        this.bas_deliverystandard = bas_deliverystandard;
        this.bas_basicArchives = bas_basicArchives;
    }

    @Override
    public String toString() {
        return "SY_Emp{" +
                "id=" + id +
                ", empname='" + empname + '\'' +
                ", empno='" + empno + '\'' +
                ", pwd='" + pwd + '\'' +
                ", querypwd='" + querypwd + '\'' +
                ", roleid=" + roleid +
                ", empunit=" + empunit +
                ", remark='" + remark + '\'' +
                ", disabled=" + disabled +
                ", bas_deliverystandard=" + bas_deliverystandard +
                ", bas_basicArchives=" + bas_basicArchives +
                '}';
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getQuerypwd() {
        return querypwd;
    }

    public void setQuerypwd(String querypwd) {
        this.querypwd = querypwd;
    }

    public BigDecimal getRoleid() {
        return roleid;
    }

    public void setRoleid(BigDecimal roleid) {
        this.roleid = roleid;
    }

    public BigDecimal getEmpunit() {
        return empunit;
    }

    public void setEmpunit(BigDecimal empunit) {
        this.empunit = empunit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getDisabled() {
        return disabled;
    }

    public void setDisabled(BigDecimal disabled) {
        this.disabled = disabled;
    }

    public BAS_Deliverystandard getBas_deliverystandard() {
        return bas_deliverystandard;
    }

    public void setBas_deliverystandard(BAS_Deliverystandard bas_deliverystandard) {
        this.bas_deliverystandard = bas_deliverystandard;
    }

    public BAS_Basicarchives getBas_basicArchives() {
        return bas_basicArchives;
    }

    public void setBas_basicArchives(BAS_Basicarchives bas_basicArchives) {
        this.bas_basicArchives = bas_basicArchives;
    }
}
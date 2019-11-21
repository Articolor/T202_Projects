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




    private Integer page=1;//起始页数

    private Integer rows=5;//到哪一行结束

    //一个用户对应一个角色
    private SY_Role sy_role;

    //一个用户对应一个单位
    private SY_Units sy_units;

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

    public SY_Role getSy_role() {
        return sy_role;
    }

    public void setSy_role(SY_Role sy_role) {
        this.sy_role = sy_role;
    }

    public SY_Units getSy_units() {
        return sy_units;
    }

    public void setSy_units(SY_Units sy_units) {
        this.sy_units = sy_units;
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
        this.empname = empname == null ? null : empname.trim();
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno == null ? null : empno.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getQuerypwd() {
        return querypwd;
    }

    public void setQuerypwd(String querypwd) {
        this.querypwd = querypwd == null ? null : querypwd.trim();
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
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getDisabled() {
        return disabled;
    }

    public void setDisabled(BigDecimal disabled) {
        this.disabled = disabled;
    }
}
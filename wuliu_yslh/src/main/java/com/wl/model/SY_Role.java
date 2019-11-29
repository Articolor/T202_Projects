package com.wl.model;

import java.math.BigDecimal;
import java.util.List;

public class SY_Role {
    private BigDecimal id;

    private String rolename;

    private String roledesc;

    private BigDecimal disabled;

    //一个角色中有多个用户
    private List<SY_Emp> sy_emps;

    //一个角色中有多个菜单
    private List<SY_Menus> menus;

    private Integer page=1;
    private Integer rows=5;


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

    public List<SY_Menus> getMenus() {
        return menus;
    }

    public void setMenus(List<SY_Menus> menus) {
        this.menus = menus;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc == null ? null : roledesc.trim();
    }

    public BigDecimal getDisabled() {
        return disabled;
    }

    public void setDisabled(BigDecimal disabled) {
        this.disabled = disabled;
    }

    public List<SY_Emp> getSy_emps() {
        return sy_emps;
    }

    public void setSy_emps(List<SY_Emp> sy_emps) {
        this.sy_emps = sy_emps;
    }

    public SY_Role() {
    }

    public SY_Role(String rolename, String roledesc, BigDecimal disabled) {
        this.rolename = rolename;
        this.roledesc = roledesc;
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        return "SY_Role{" +
                "id=" + id +
                ", rolename='" + rolename + '\'' +
                ", roledesc='" + roledesc + '\'' +
                ", disabled=" + disabled +
                ", sy_emps=" + sy_emps +
                '}';
    }
}
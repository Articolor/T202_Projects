package com.wl.model;

import java.math.BigDecimal;
import java.util.List;

public class SY_Menus {
    private BigDecimal id;

    private String parentid;

    private String type;

    private String text;

    private String url;

    private String tip;

    private List<SY_Role> roles;

    //一级菜单的所有子菜单
    private List<SY_Menus> children;

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

    public List<SY_Role> getRoles() {
        return roles;
    }

    public void setRoles(List<SY_Role> roles) {
        this.roles = roles;
    }

    public SY_Menus(String parentid, String text, Integer page, Integer rows) {
        this.parentid = parentid;
        this.text = text;
        this.page = page;
        this.rows = rows;
    }

    public SY_Menus() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip == null ? null : tip.trim();
    }

    public List<SY_Menus> getChildren() {
        return children;
    }

    public void setChildren(List<SY_Menus> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "SY_Menus{" +
                "id=" + id +
                ", parentid='" + parentid + '\'' +
                ", type='" + type + '\'' +
                ", text='" + text + '\'' +
                ", url='" + url + '\'' +
                ", tip='" + tip + '\'' +
                ", roles=" + roles +
                ", page=" + page +
                ", rows=" + rows +
                '}';
    }
}
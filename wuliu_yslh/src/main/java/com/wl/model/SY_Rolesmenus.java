package com.wl.model;

import java.math.BigDecimal;

public class SY_Rolesmenus {
    private BigDecimal id;

    private BigDecimal roleid;

    private BigDecimal menuid;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getRoleid() {
        return roleid;
    }

    public void setRoleid(BigDecimal roleid) {
        this.roleid = roleid;
    }

    public BigDecimal getMenuid() {
        return menuid;
    }

    public void setMenuid(BigDecimal menuid) {
        this.menuid = menuid;
    }

    public SY_Rolesmenus() {
    }

    public SY_Rolesmenus(BigDecimal roleid, BigDecimal menuid) {
        this.roleid = roleid;
        this.menuid = menuid;
    }
}
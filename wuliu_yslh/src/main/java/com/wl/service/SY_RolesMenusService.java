package com.wl.service;

import com.wl.model.SY_Rolesmenus;

import java.math.BigDecimal;

public interface SY_RolesMenusService {
    //删除x
    void deleteByPrimaryKey(BigDecimal id);

    //新增x
    void insert(SY_Rolesmenus record);
}

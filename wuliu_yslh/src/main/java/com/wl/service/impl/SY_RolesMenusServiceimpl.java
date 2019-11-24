package com.wl.service.impl;

import com.wl.mapper.SY_RolesmenusMapper;
import com.wl.model.SY_Rolesmenus;
import com.wl.service.SY_RolesMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class SY_RolesMenusServiceimpl implements SY_RolesMenusService {
    @Autowired
    private SY_RolesmenusMapper rolesmenusMapper;


    //删除角色对应的菜单
    @Override
    public void deleteByPrimaryKey(BigDecimal id) {
        rolesmenusMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insert(SY_Rolesmenus record) {
        rolesmenusMapper.insert(record);
    }
}

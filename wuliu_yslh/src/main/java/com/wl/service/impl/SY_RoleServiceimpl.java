package com.wl.service.impl;

import com.wl.mapper.SY_RoleMapper;
import com.wl.model.SY_Role;
import com.wl.service.SY_RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SY_RoleServiceimpl implements SY_RoleService {
    @Autowired
    private SY_RoleMapper sy_roleMapper;


    @Override
    public List<SY_Role> findAllRoleAndEmp() {
        return sy_roleMapper.findAllRoleAndEmp();
    }

    @Override
    public List<SY_Role> findAllRole() {
        return sy_roleMapper.findAllRole();
    }

    @Override
    public List<SY_Role> findAllRoleAndMenu(SY_Role role) {
        return sy_roleMapper.findAllRoleAndMenu(role);
    }
}

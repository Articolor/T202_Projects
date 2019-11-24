package com.wl.service.impl;

import com.wl.mapper.SY_RoleMapper;
import com.wl.model.SY_Role;
import com.wl.service.SY_RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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

    //查询全部的角色和菜单
    @Override
    public List<SY_Role> findAllRoleAndMenu(SY_Role role) {
        return sy_roleMapper.findAllRoleAndMenu(role);
    }

    @Override
    public void deleteByPrimaryKey(BigDecimal id) {
        sy_roleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insert(SY_Role record) {
        sy_roleMapper.insert(record);
    }

    @Override
    public void updateByPrimaryKeySelective(SY_Role record) {
        sy_roleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Integer sumCount(SY_Role role) {
        return sy_roleMapper.sumCount(role);
    }

    @Override
    public SY_Role selectByPrimaryKey(BigDecimal id) {
        return sy_roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public SY_Role findRoleOrMenuByIdParents(SY_Role role) {
        return sy_roleMapper.findRoleOrMenuByIdParents(role);
    }
}

package com.wl.service;

import com.wl.model.SY_Role;

import java.util.List;

public interface SY_RoleService {
    //查询角色和用户
    List<SY_Role> findAllRoleAndEmp();

    //查询所有的  角色
    List<SY_Role> findAllRole();

    //查询出所有的角色和菜单分页加模糊查询
    List<SY_Role> findAllRoleAndMenu(SY_Role role);
}

package com.wl.mapper;

import com.wl.model.SY_Role;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface SY_RoleMapper {

    //查询出所有的角色和用户
    List<SY_Role> findAllRoleAndEmp();

    //查询所有的角色
    List<SY_Role> findAllRole();

     //查询出所 有的角色和菜单分页加模糊查询
    List<SY_Role> findAllRoleAndMenu(SY_Role role);

    //查询角色所对应的一级菜单
    SY_Role findRoleOrMenuByIdParents(SY_Role role);

    //删除角色
    void deleteByPrimaryKey(BigDecimal id);

    //新增角色
    void insert(SY_Role record);

    //修改角色
    void updateByPrimaryKeySelective(SY_Role record);

    //查询总行数
    Integer sumCount(SY_Role role);

    //查询单个角色和对应的权限
    SY_Role selectByPrimaryKey(BigDecimal id);

    void insertSelective(SY_Role record);





    int updateByPrimaryKey(SY_Role record);
}
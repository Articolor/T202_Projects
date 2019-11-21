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

    //查询出所有的角色和菜单分页加模糊查询
    List<SY_Role> findAllRoleAndMenu(SY_Role role);

    void deleteByPrimaryKey(BigDecimal id);

    int insert(SY_Role record);

    int insertSelective(SY_Role record);

    SY_Role selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SY_Role record);

    int updateByPrimaryKey(SY_Role record);
}
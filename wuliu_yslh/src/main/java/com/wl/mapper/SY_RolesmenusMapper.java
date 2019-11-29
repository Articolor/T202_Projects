package com.wl.mapper;

import com.wl.model.SY_Rolesmenus;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public interface SY_RolesmenusMapper {
    //删除
    void deleteByPrimaryKey(BigDecimal id);

    //新增
    void insert(SY_Rolesmenus record);

    int insertSelective(SY_Rolesmenus record);

    SY_Rolesmenus selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SY_Rolesmenus record);

    int updateByPrimaryKey(SY_Rolesmenus record);
}
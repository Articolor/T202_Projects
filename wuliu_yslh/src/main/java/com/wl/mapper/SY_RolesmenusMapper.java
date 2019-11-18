package com.wl.mapper;

import com.wl.model.SY_Rolesmenus;
import java.math.BigDecimal;

public interface SY_RolesmenusMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SY_Rolesmenus record);

    int insertSelective(SY_Rolesmenus record);

    SY_Rolesmenus selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SY_Rolesmenus record);

    int updateByPrimaryKey(SY_Rolesmenus record);
}
package com.wl.mapper;

import com.wl.model.SY_Role;
import java.math.BigDecimal;

public interface SY_RoleMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SY_Role record);

    int insertSelective(SY_Role record);

    SY_Role selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SY_Role record);

    int updateByPrimaryKey(SY_Role record);
}
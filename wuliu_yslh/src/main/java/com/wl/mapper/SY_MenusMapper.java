package com.wl.mapper;

import com.wl.model.SY_Menus;
import java.math.BigDecimal;

public interface SY_MenusMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SY_Menus record);

    int insertSelective(SY_Menus record);

    SY_Menus selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SY_Menus record);

    int updateByPrimaryKey(SY_Menus record);
}
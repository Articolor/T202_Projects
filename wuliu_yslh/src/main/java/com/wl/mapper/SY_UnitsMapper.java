package com.wl.mapper;

import com.wl.model.SY_Units;
import java.math.BigDecimal;

public interface SY_UnitsMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SY_Units record);

    int insertSelective(SY_Units record);

    SY_Units selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SY_Units record);

    int updateByPrimaryKey(SY_Units record);
}
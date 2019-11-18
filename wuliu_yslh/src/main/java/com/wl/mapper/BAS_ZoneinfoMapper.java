package com.wl.mapper;

import com.wl.model.BAS_Zoneinfo;
import java.math.BigDecimal;

public interface BAS_ZoneinfoMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(BAS_Zoneinfo record);

    int insertSelective(BAS_Zoneinfo record);

    BAS_Zoneinfo selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BAS_Zoneinfo record);

    int updateByPrimaryKey(BAS_Zoneinfo record);
}
package com.wl.mapper;

import com.wl.model.BAS_Zonecustominfo;
import java.math.BigDecimal;

public interface BAS_ZonecustominfoMapper {
    int deleteByPrimaryKey(BigDecimal customcode);

    int insert(BAS_Zonecustominfo record);

    int insertSelective(BAS_Zonecustominfo record);

    BAS_Zonecustominfo selectByPrimaryKey(BigDecimal customcode);

    int updateByPrimaryKeySelective(BAS_Zonecustominfo record);

    int updateByPrimaryKey(BAS_Zonecustominfo record);
}
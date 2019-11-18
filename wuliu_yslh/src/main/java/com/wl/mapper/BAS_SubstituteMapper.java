package com.wl.mapper;

import com.wl.model.BAS_Substitute;
import java.math.BigDecimal;

public interface BAS_SubstituteMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(BAS_Substitute record);

    int insertSelective(BAS_Substitute record);

    BAS_Substitute selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BAS_Substitute record);

    int updateByPrimaryKey(BAS_Substitute record);
}
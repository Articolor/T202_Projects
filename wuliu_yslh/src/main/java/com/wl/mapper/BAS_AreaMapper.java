package com.wl.mapper;

import com.wl.model.BAS_Area;
import java.math.BigDecimal;

public interface BAS_AreaMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(BAS_Area record);

    int insertSelective(BAS_Area record);

    BAS_Area selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BAS_Area record);

    int updateByPrimaryKey(BAS_Area record);
}
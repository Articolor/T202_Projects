package com.wl.mapper;

import com.wl.model.BAS_Shuttlebus;
import java.math.BigDecimal;

public interface BAS_ShuttlebusMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(BAS_Shuttlebus record);

    int insertSelective(BAS_Shuttlebus record);

    BAS_Shuttlebus selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BAS_Shuttlebus record);

    int updateByPrimaryKey(BAS_Shuttlebus record);
}
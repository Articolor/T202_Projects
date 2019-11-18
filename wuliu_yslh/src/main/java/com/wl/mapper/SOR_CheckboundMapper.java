package com.wl.mapper;

import com.wl.model.SOR_Checkbound;
import java.math.BigDecimal;

public interface SOR_CheckboundMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SOR_Checkbound record);

    int insertSelective(SOR_Checkbound record);

    SOR_Checkbound selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SOR_Checkbound record);

    int updateByPrimaryKey(SOR_Checkbound record);
}
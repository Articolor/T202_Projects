package com.wl.mapper;

import com.wl.model.SOR_Outbound;
import java.math.BigDecimal;

public interface SOR_OutboundMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SOR_Outbound record);

    int insertSelective(SOR_Outbound record);

    SOR_Outbound selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SOR_Outbound record);

    int updateByPrimaryKey(SOR_Outbound record);
}
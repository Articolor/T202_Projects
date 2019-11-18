package com.wl.mapper;

import com.wl.model.SOR_Checkbounddetails;
import java.math.BigDecimal;

public interface SOR_CheckbounddetailsMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SOR_Checkbounddetails record);

    int insertSelective(SOR_Checkbounddetails record);

    SOR_Checkbounddetails selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SOR_Checkbounddetails record);

    int updateByPrimaryKey(SOR_Checkbounddetails record);
}
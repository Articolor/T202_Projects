package com.wl.mapper;

import com.wl.model.SOR_Outbounddetails;
import java.math.BigDecimal;

public interface SOR_OutbounddetailsMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SOR_Outbounddetails record);

    int insertSelective(SOR_Outbounddetails record);

    SOR_Outbounddetails selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SOR_Outbounddetails record);

    int updateByPrimaryKey(SOR_Outbounddetails record);
}
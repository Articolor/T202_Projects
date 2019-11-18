package com.wl.mapper;

import com.wl.model.LOG_Logisticsdetails;
import java.math.BigDecimal;

public interface LOG_LogisticsdetailsMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(LOG_Logisticsdetails record);

    int insertSelective(LOG_Logisticsdetails record);

    LOG_Logisticsdetails selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(LOG_Logisticsdetails record);

    int updateByPrimaryKey(LOG_Logisticsdetails record);
}
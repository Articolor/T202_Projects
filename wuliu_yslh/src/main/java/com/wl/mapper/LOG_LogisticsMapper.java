package com.wl.mapper;

import com.wl.model.LOG_Logistics;
import java.math.BigDecimal;

public interface LOG_LogisticsMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(LOG_Logistics record);

    int insertSelective(LOG_Logistics record);

    LOG_Logistics selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(LOG_Logistics record);

    int updateByPrimaryKey(LOG_Logistics record);
}
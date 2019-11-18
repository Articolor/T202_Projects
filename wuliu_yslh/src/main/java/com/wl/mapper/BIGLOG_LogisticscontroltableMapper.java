package com.wl.mapper;

import com.wl.model.BIGLOG_Logisticscontroltable;
import java.math.BigDecimal;

public interface BIGLOG_LogisticscontroltableMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(BIGLOG_Logisticscontroltable record);

    int insertSelective(BIGLOG_Logisticscontroltable record);

    BIGLOG_Logisticscontroltable selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BIGLOG_Logisticscontroltable record);

    int updateByPrimaryKey(BIGLOG_Logisticscontroltable record);
}
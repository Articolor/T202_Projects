package com.wl.mapper;

import com.wl.model.LOG_Logisticstransfer;
import java.math.BigDecimal;

public interface LOG_LogisticstransferMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(LOG_Logisticstransfer record);

    int insertSelective(LOG_Logisticstransfer record);

    LOG_Logisticstransfer selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(LOG_Logisticstransfer record);

    int updateByPrimaryKey(LOG_Logisticstransfer record);
}
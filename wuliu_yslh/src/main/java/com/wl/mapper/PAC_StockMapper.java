package com.wl.mapper;

import com.wl.model.PAC_Stock;
import java.math.BigDecimal;

public interface PAC_StockMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(PAC_Stock record);

    int insertSelective(PAC_Stock record);

    PAC_Stock selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(PAC_Stock record);

    int updateByPrimaryKey(PAC_Stock record);
}
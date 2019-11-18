package com.wl.mapper;

import com.wl.model.PAC_Stockitem;
import java.math.BigDecimal;

public interface PAC_StockitemMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(PAC_Stockitem record);

    int insertSelective(PAC_Stockitem record);

    PAC_Stockitem selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(PAC_Stockitem record);

    int updateByPrimaryKey(PAC_Stockitem record);
}
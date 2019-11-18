package com.wl.mapper;

import com.wl.model.BAS_Standartime;
import java.math.BigDecimal;

public interface BAS_StandartimeMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(BAS_Standartime record);

    int insertSelective(BAS_Standartime record);

    BAS_Standartime selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BAS_Standartime record);

    int updateByPrimaryKey(BAS_Standartime record);
}
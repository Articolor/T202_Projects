package com.wl.mapper;

import com.wl.model.ACC_Worksheet;
import java.math.BigDecimal;

public interface ACC_WorksheetMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(ACC_Worksheet record);

    int insertSelective(ACC_Worksheet record);

    ACC_Worksheet selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(ACC_Worksheet record);

    int updateByPrimaryKey(ACC_Worksheet record);
}
package com.wl.mapper;

import com.wl.model.ACC_Workorder;
import java.math.BigDecimal;

public interface ACC_WorkorderMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(ACC_Workorder record);

    int insertSelective(ACC_Workorder record);

    ACC_Workorder selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(ACC_Workorder record);

    int updateByPrimaryKey(ACC_Workorder record);
}
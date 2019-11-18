package com.wl.mapper;

import com.wl.model.SY_Emp;
import java.math.BigDecimal;

public interface SY_EmpMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SY_Emp record);

    int insertSelective(SY_Emp record);

    SY_Emp selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SY_Emp record);

    int updateByPrimaryKey(SY_Emp record);
}
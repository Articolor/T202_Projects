package com.wl.mapper;

import com.wl.model.IAE_Timeinput;
import java.math.BigDecimal;

public interface IAE_TimeinputMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(IAE_Timeinput record);

    int insertSelective(IAE_Timeinput record);

    IAE_Timeinput selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(IAE_Timeinput record);

    int updateByPrimaryKey(IAE_Timeinput record);
}
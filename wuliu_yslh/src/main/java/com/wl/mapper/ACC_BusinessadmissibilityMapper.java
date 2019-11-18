package com.wl.mapper;

import com.wl.model.ACC_Businessadmissibility;
import java.math.BigDecimal;

public interface ACC_BusinessadmissibilityMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(ACC_Businessadmissibility record);

    int insertSelective(ACC_Businessadmissibility record);

    ACC_Businessadmissibility selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(ACC_Businessadmissibility record);

    int updateByPrimaryKey(ACC_Businessadmissibility record);
}
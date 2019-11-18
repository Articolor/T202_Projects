package com.wl.mapper;

import com.wl.model.RET_Returnlist;
import java.math.BigDecimal;

public interface RET_ReturnlistMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(RET_Returnlist record);

    int insertSelective(RET_Returnlist record);

    RET_Returnlist selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(RET_Returnlist record);

    int updateByPrimaryKey(RET_Returnlist record);
}
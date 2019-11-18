package com.wl.mapper;

import com.wl.model.DIS_Propagandatask;
import java.math.BigDecimal;

public interface DIS_PropagandataskMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(DIS_Propagandatask record);

    int insertSelective(DIS_Propagandatask record);

    DIS_Propagandatask selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(DIS_Propagandatask record);

    int updateByPrimaryKey(DIS_Propagandatask record);
}
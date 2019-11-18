package com.wl.mapper;

import com.wl.model.IAE_Arrival;

public interface IAE_ArrivalMapper {
    int deleteByPrimaryKey(String id);

    int insert(IAE_Arrival record);

    int insertSelective(IAE_Arrival record);

    IAE_Arrival selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IAE_Arrival record);

    int updateByPrimaryKey(IAE_Arrival record);
}
package com.wl.mapper;

import com.wl.model.IAE_Departure;

public interface IAE_DepartureMapper {
    int deleteByPrimaryKey(String id);

    int insert(IAE_Departure record);

    int insertSelective(IAE_Departure record);

    IAE_Departure selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IAE_Departure record);

    int updateByPrimaryKey(IAE_Departure record);
}
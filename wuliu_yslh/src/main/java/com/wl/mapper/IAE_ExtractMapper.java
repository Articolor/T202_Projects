package com.wl.mapper;

import com.wl.model.IAE_Extract;

public interface IAE_ExtractMapper {
    int deleteByPrimaryKey(String id);

    int insert(IAE_Extract record);

    int insertSelective(IAE_Extract record);

    IAE_Extract selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IAE_Extract record);

    int updateByPrimaryKey(IAE_Extract record);
}
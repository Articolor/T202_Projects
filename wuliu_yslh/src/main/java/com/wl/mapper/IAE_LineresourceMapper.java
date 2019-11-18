package com.wl.mapper;

import com.wl.model.IAE_Lineresource;

public interface IAE_LineresourceMapper {
    int deleteByPrimaryKey(String id);

    int insert(IAE_Lineresource record);

    int insertSelective(IAE_Lineresource record);

    IAE_Lineresource selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IAE_Lineresource record);

    int updateByPrimaryKey(IAE_Lineresource record);
}
package com.wl.mapper;

import com.wl.model.SOR_Storage;
import java.math.BigDecimal;

public interface SOR_StorageMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SOR_Storage record);

    int insertSelective(SOR_Storage record);

    SOR_Storage selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SOR_Storage record);

    int updateByPrimaryKey(SOR_Storage record);
}
package com.wl.mapper;

import com.wl.model.SOR_Storagedetails;
import java.math.BigDecimal;

public interface SOR_StoragedetailsMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SOR_Storagedetails record);

    int insertSelective(SOR_Storagedetails record);

    SOR_Storagedetails selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SOR_Storagedetails record);

    int updateByPrimaryKey(SOR_Storagedetails record);
}
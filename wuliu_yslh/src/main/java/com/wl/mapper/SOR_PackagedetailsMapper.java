package com.wl.mapper;

import com.wl.model.SOR_Packagedetails;
import java.math.BigDecimal;

public interface SOR_PackagedetailsMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SOR_Packagedetails record);

    int insertSelective(SOR_Packagedetails record);

    SOR_Packagedetails selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SOR_Packagedetails record);

    int updateByPrimaryKey(SOR_Packagedetails record);
}
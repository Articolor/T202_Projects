package com.wl.mapper;

import com.wl.model.SOR_Packagedetails;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
public interface SOR_PackagedetailsMapper {
    int deleteByPrimaryKey(BigDecimal id);

    //新增和包详细信息
    int insert(SOR_Packagedetails record);

    int insertSelective(SOR_Packagedetails record);

    SOR_Packagedetails selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SOR_Packagedetails record);

    int updateByPrimaryKey(SOR_Packagedetails record);
}
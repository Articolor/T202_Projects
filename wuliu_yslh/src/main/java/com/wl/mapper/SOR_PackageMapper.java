package com.wl.mapper;

import com.wl.model.SOR_Package;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
public interface SOR_PackageMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SOR_Package record);

    int insertSelective(SOR_Package record);

    SOR_Package selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SOR_Package record);

    int updateByPrimaryKey(SOR_Package record);


}
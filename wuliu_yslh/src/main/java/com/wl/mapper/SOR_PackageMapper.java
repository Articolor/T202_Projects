package com.wl.mapper;

import com.wl.model.SOR_Package;
import java.math.BigDecimal;
import java.util.List;

public interface SOR_PackageMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(SOR_Package record);

    int insertSelective(SOR_Package record);

    SOR_Package selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SOR_Package record);

    int updateByPrimaryKey(SOR_Package record);

    //合包查询
    List<SOR_Package> findSORPackage(SOR_Package s, int page, int rows);

    List<SOR_Package> findSORPackageCount(SOR_Package s);
}
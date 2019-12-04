package com.wl.mapper;

import com.wl.model.SOR_Package;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface SOR_PackageMapper {
    int deleteByPrimaryKey(BigDecimal id);
    //查询全部的合包信息
    List<SOR_Package> findAllPackYWY(SOR_Package p);

    //新增和包信息
    int insert(SOR_Package record);

    //根据时间查询对象
    List<SOR_Package> findNewDate();

    int insertSelective(SOR_Package record);

    SOR_Package selectByPrimaryKey(BigDecimal id);

    //修改合包信息
    int updateByPrimaryKeySelective(SOR_Package record);

    int updateByPrimaryKey(SOR_Package record);



    //合包查询
    List<SOR_Package> findSORPackage(SOR_Package s,int page,int rows);

    Integer findSORPackageCount(SOR_Package s);

}
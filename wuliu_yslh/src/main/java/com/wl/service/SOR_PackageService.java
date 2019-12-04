package com.wl.service;

import com.wl.model.SOR_Package;

import java.util.List;

public interface SOR_PackageService {

    //新增和包信息
    int insert(SOR_Package record);

    //根据时间查询对象
    List<SOR_Package> findNewDate();

    //查询全部的合包信息
    List<SOR_Package> findAllPackYWY(SOR_Package p);

    //修改合包信息
    int updateByPrimaryKeySelective(SOR_Package record);

    List<SOR_Package> findSORPackage(SOR_Package s, int page, int rows);

    Integer findSORPackageCount(SOR_Package s);




}

package com.wl.service;

import com.wl.model.SOR_Storage;

import java.util.List;

public interface SOR_StorageService {

    //查询所有的入库信息-----无关系---分页叫模糊查询
    List<SOR_Storage> findAllStrYWY(SOR_Storage str);

    //查询所有的入库信息-----总行数
    Integer sumcount(SOR_Storage str);

    //新增入库表
    int insert(SOR_Storage record);

    //根据时间查询出最新对象
    List<SOR_Storage> findTimeNew();
}

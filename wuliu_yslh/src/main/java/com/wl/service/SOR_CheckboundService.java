package com.wl.service;

import com.wl.model.SOR_Checkbound;

import java.util.List;

public interface SOR_CheckboundService {

    //查询全部的盘库信息-----分页加高级查询
    List<SOR_Checkbound> findAllCheckBound(SOR_Checkbound o);

    //查询全部的盘库信息-----分页加高级查询--总行数
    Integer sumCount(SOR_Checkbound o);

    //新增盘库信息
    int insert(SOR_Checkbound record);

    //根据时间排序查询
    List<SOR_Checkbound> findNewDate();
}

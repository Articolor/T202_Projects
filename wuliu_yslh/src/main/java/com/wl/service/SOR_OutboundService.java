package com.wl.service;

import com.wl.model.SOR_Outbound;

import java.util.List;

public interface SOR_OutboundService {

    //查询全部的出库信息----无关系
    List<SOR_Outbound> findAllByOut(SOR_Outbound o);

    //查询全部方法------无关系----分页加高级查询
    List<SOR_Outbound> findAllOutBo(SOR_Outbound o);

    //查询总行数方法------无关系----分页加高级查询
    Integer sumCount(SOR_Outbound o);

    //新增出库表数据
    int insert(SOR_Outbound record);

    //根据时间查询出最新新增的数据
    List<SOR_Outbound> findNewDate();
}

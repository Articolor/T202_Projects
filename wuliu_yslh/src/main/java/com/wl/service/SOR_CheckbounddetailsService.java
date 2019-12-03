package com.wl.service;

import com.wl.model.SOR_Checkbounddetails;

import java.util.List;

public interface SOR_CheckbounddetailsService {

    //根据扫描设备号查询出对象
    List<SOR_Checkbounddetails> findByIDBound(SOR_Checkbounddetails c);

    //新增盘库详细信息
    int insert(SOR_Checkbounddetails record);
}

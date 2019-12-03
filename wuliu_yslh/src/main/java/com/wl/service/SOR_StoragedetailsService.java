package com.wl.service;

import com.wl.model.SOR_Storage;
import com.wl.model.SOR_Storagedetails;

import java.util.List;

public interface SOR_StoragedetailsService {

    //根据入库单号查询出入库详情详细---有可能一个有可能有多个
    List<SOR_Storagedetails> fingByIdDateils(SOR_Storage s);

    //新增数据
    int insert(SOR_Storagedetails record);
}

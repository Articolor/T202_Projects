package com.wl.service;

import com.wl.model.BAS_Partition;

import java.util.List;

public interface BAS_PartitionService {
    //管理分区
    List<BAS_Partition> findBAS_Partition(Integer page, Integer rows);
    //高级查询管理分区
    List<BAS_Partition> findBAS_PartitionGAOJI(String province, String city, String county, String zonecode, String keyword, Integer page, Integer rows);

}

package com.wl.service;

import com.wl.model.BAS_Partition;

import java.math.BigDecimal;
import java.util.List;

public interface BAS_PartitionService {
    //管理分区
    List<BAS_Partition> findBAS_Partition(Integer page, Integer rows);
    //高级查询管理分区
    List<BAS_Partition> findBAS_PartitionGAOJI(String province,String city,String county,Integer page, Integer rows);
    //新增分区
    int insert(BAS_Partition record);
    //修改分区
    int updateByPrimaryKey(BAS_Partition record);
    //删除分区
    int deleteByPrimaryKey(BigDecimal id);
}

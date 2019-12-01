package com.wl.mapper;

import com.wl.model.BAS_Partition;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface BAS_PartitionMapper {
    //管理分区
    List<BAS_Partition> findBAS_Partition(Integer page, Integer rows);
    //高级查询管理分区
    List<BAS_Partition> findBAS_PartitionGAOJI(String province,String city,String county,Integer page, Integer rows);
    //删除分区
    int deleteByPrimaryKey(BigDecimal id);
    //新增分区
    int insert(BAS_Partition record);

    int insertSelective(BAS_Partition record);

    BAS_Partition selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BAS_Partition record);
    //修改分区
    int updateByPrimaryKey(BAS_Partition record);
}
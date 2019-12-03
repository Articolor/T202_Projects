package com.wl.service.impl;

import com.wl.mapper.BAS_PartitionMapper;
import com.wl.model.BAS_Partition;
import com.wl.service.BAS_PartitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class BAS_PartitionServiceImpl implements  BAS_PartitionService {
    @Autowired
    private BAS_PartitionMapper bas_partitionMapper;
    @Override
    public List<BAS_Partition> findBAS_Partition(Integer page, Integer rows) {
        return bas_partitionMapper.findBAS_Partition(page,rows);
    }

    @Override
    public List<BAS_Partition> findBAS_PartitionGAOJI(String province,String city,String county,Integer page, Integer rows) {
        List<BAS_Partition> gaoji = bas_partitionMapper.findBAS_PartitionGAOJI(province, city, county,  page, rows);
        return gaoji;
    }

    @Override
    public int insert(BAS_Partition record) {
        return bas_partitionMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(BAS_Partition record) {
        return bas_partitionMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey(BigDecimal id) {
        return bas_partitionMapper.deleteByPrimaryKey(id);
    }
}

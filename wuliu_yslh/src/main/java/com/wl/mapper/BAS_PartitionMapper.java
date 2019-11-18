package com.wl.mapper;

import com.wl.model.BAS_Partition;
import java.math.BigDecimal;

public interface BAS_PartitionMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(BAS_Partition record);

    int insertSelective(BAS_Partition record);

    BAS_Partition selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BAS_Partition record);

    int updateByPrimaryKey(BAS_Partition record);
}
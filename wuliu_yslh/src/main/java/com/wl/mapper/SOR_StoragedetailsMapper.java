package com.wl.mapper;

import com.wl.model.SOR_Storage;
import com.wl.model.SOR_Storagedetails;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface SOR_StoragedetailsMapper {
    //根据入库单号查询出入库详情详细---有可能一个有可能有多个
    List<SOR_Storagedetails> fingByIdDateils(SOR_Storage s);



    int deleteByPrimaryKey(BigDecimal id);

    //新增数据
    int insert(SOR_Storagedetails record);

    int insertSelective(SOR_Storagedetails record);

    SOR_Storagedetails selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SOR_Storagedetails record);

    int updateByPrimaryKey(SOR_Storagedetails record);
}
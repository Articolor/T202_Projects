package com.wl.mapper;

import com.wl.model.SOR_Checkbounddetails;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface SOR_CheckbounddetailsMapper {
    //根据扫描设备号查询出对象
    List<SOR_Checkbounddetails> findByIDBound(SOR_Checkbounddetails c);

    int deleteByPrimaryKey(BigDecimal id);


    //新增盘库详细信息
    int insert(SOR_Checkbounddetails record);

    int insertSelective(SOR_Checkbounddetails record);

    SOR_Checkbounddetails selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SOR_Checkbounddetails record);

    int updateByPrimaryKey(SOR_Checkbounddetails record);
}
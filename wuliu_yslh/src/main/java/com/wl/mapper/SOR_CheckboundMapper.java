package com.wl.mapper;

import com.wl.model.SOR_Checkbound;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface SOR_CheckboundMapper {
    //查询全部的盘库信息-----分页加高级查询
    List<SOR_Checkbound> findAllCheckBound(SOR_Checkbound o);

    //查询全部的盘库信息-----分页加高级查询--总行数
    Integer sumCount(SOR_Checkbound o);

    //根据时间排序查询
    List<SOR_Checkbound> findNewDate();

    int deleteByPrimaryKey(BigDecimal id);

    //新增盘库信息
    int insert(SOR_Checkbound record);

    int insertSelective(SOR_Checkbound record);

    SOR_Checkbound selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SOR_Checkbound record);

    int updateByPrimaryKey(SOR_Checkbound record);
}
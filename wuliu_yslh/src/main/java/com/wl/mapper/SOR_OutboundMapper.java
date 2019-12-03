package com.wl.mapper;

import com.wl.model.SOR_Outbound;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface SOR_OutboundMapper {
    //查询全部的出库信息----无关系
    List<SOR_Outbound> findAllByOut(SOR_Outbound o);

    //查询全部方法------无关系----分页加高级查询
    List<SOR_Outbound> findAllOutBo(SOR_Outbound o);

    //查询总行数方法------无关系----分页加高级查询
    Integer sumCount(SOR_Outbound o);

    //根据时间查询出最新新增的数据
    List<SOR_Outbound> findNewDate();

    int deleteByPrimaryKey(BigDecimal id);

    //新增出库表数据
    int insert(SOR_Outbound record);

    int insertSelective(SOR_Outbound record);

    SOR_Outbound selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SOR_Outbound record);

    int updateByPrimaryKey(SOR_Outbound record);
}
package com.wl.mapper;

import com.wl.model.SOR_Outbound;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface SOR_OutboundMapper {
    //查询全部的出库信息----无关系
    List<SOR_Outbound> findAllByOut(SOR_Outbound o);


    int deleteByPrimaryKey(BigDecimal id);

    int insert(SOR_Outbound record);

    int insertSelective(SOR_Outbound record);

    SOR_Outbound selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SOR_Outbound record);

    int updateByPrimaryKey(SOR_Outbound record);
}
package com.wl.mapper;

import com.wl.model.SOR_Outbounddetails;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface SOR_OutbounddetailsMapper {
    //根据出库单号查询出库详细信息---有可能有多个
    List<SOR_Outbounddetails> findByIdOutDeta(SOR_Outbounddetails o);


    int deleteByPrimaryKey(BigDecimal id);

    //新增出库明细信息
    int insert(SOR_Outbounddetails record);

    int insertSelective(SOR_Outbounddetails record);

    SOR_Outbounddetails selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SOR_Outbounddetails record);

    int updateByPrimaryKey(SOR_Outbounddetails record);
}
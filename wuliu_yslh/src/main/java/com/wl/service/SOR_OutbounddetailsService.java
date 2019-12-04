package com.wl.service;

import com.wl.model.SOR_Outbounddetails;

import java.util.List;

public interface SOR_OutbounddetailsService {

    //根据出库单号查询出库详细信息---有可能有多个
    List<SOR_Outbounddetails> findByIdOutDeta(SOR_Outbounddetails o);

    //新增出库明细信息
    int insert(SOR_Outbounddetails record);
}

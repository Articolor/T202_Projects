package com.wl.service;

import com.wl.model.SOR_Outbound;

import java.util.List;

public interface SOR_OutboundService {

    //查询全部的出库信息----无关系
    List<SOR_Outbound> findAllByOut(SOR_Outbound o);
}

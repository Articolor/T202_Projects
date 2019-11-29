package com.wl.service;

import com.wl.model.BAS_Zonecustominfo;

import java.util.List;

public interface BAS_ZonecustominfoService {
    //查询单个客户信息
    List<BAS_Zonecustominfo> findBAS_ZonecustominfoANDBAS_ZONEINFO(Integer id);
}

package com.wl.service;

import com.wl.model.BAS_Zoneinfo;

import java.util.List;

public interface BAS_ZoneinfoService {
    //管理定区
    List<BAS_Zoneinfo> findBAS_ZoneinfoAndSY_EmpAndSY_Units(Integer page, Integer rows);

}

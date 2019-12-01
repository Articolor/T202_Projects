package com.wl.service;

import com.wl.model.BAS_Zoneinfo;

import java.math.BigDecimal;
import java.util.List;

public interface BAS_ZoneinfoService {
    //管理定区
    List<BAS_Zoneinfo> findBAS_ZoneinfoAndSY_EmpAndSY_Units(Integer page, Integer rows);
    //管理定区查询
    List<BAS_Zoneinfo> findBAS_ZoneinfoAndSY_EmpAndSY_Unitsfenye(String name,String zonecode,Integer page,Integer rows);
    //新增定区管理
    int insert(BAS_Zoneinfo record);
    //修改定区管理
    int updateByPrimaryKey(BAS_Zoneinfo record);
    //删除定区
    int deleteByPrimaryKey(BigDecimal id);
}

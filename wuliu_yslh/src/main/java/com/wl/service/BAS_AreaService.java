package com.wl.service;

import com.wl.model.BAS_Area;

import java.util.List;

public interface BAS_AreaService {
    //区派查询
    List<BAS_Area> findBASAreaAndsy_units(Integer page, Integer rows);

    //高级区派
    List<BAS_Area> findBASAreaAndsy_unitsFenye(String province,String city,String county,Integer page, Integer rows);

    //总和
    int getcount();
}

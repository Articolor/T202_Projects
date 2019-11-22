package com.wl.service;

import com.wl.model.SY_Units;

import java.util.List;

public interface SY_UnitsService {

    //查询出单位和用户  
    List<SY_Units> findAllUnitsAndEmp(SY_Units units);

    //查询所有的单位
    List<SY_Units> findAllUnits();

    //查询总行数
    public Integer findCount();

    //模糊查询后的总行数
    public Integer findMhCount(SY_Units units);
}

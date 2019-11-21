package com.wl.service;

import com.wl.model.SY_Units;

import java.util.List;

public interface SY_UnitsService {

    //查询出单位和用户
    List<SY_Units> findAllUnitsAndEmp(SY_Units units);

    //查询所有的单位
    List<SY_Units> findAllUnits();
}

package com.wl.service;

import com.wl.model.BAS_Standartime;

import java.math.BigDecimal;
import java.util.List;

public interface BAS_Standartimeservice {
    //收派时间管理
    List<BAS_Standartime> findBAS_StandartimeAndSy_units(Integer page, Integer rows);
    //分页收派时间管理
    List<BAS_Standartime> findBAS_StandartimeAndSy_unitsfenye(String timename, String name, Integer page, Integer rows);
    //新增
    int insert(BAS_Standartime record);
    //删除genjuid
    int deleteByPrimaryKey(BigDecimal id);
}

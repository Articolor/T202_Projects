package com.wl.service;

import com.wl.model.BAS_Standartime;

import java.util.List;

public interface BAS_Standartimeservice {
    //收派时间管理
    List<BAS_Standartime> findBAS_StandartimeAndSy_units(Integer page, Integer rows);
    //分页收派时间管理
    List<BAS_Standartime> findBAS_StandartimeAndSy_unitsfenye(String timename, String name, Integer page, Integer rows);

}

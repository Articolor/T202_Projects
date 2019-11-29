package com.wl.service.impl;

import com.wl.mapper.BAS_StandartimeMapper;
import com.wl.model.BAS_Standartime;
import com.wl.service.BAS_Standartimeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BAS_StandartimeserviceImpl implements BAS_Standartimeservice {
@Autowired
private BAS_StandartimeMapper bas_standartimeMapper;
    @Override
    public List<BAS_Standartime> findBAS_StandartimeAndSy_units(Integer page, Integer rows) {
        return bas_standartimeMapper.findBAS_StandartimeAndSy_units(page,rows);
    }

    @Override
    public List<BAS_Standartime> findBAS_StandartimeAndSy_unitsfenye(String timename, String name, Integer page, Integer rows) {
        return bas_standartimeMapper.findBAS_StandartimeAndSy_unitsfenye(timename, name, page, rows);
    }
}

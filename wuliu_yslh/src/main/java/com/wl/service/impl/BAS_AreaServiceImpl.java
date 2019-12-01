package com.wl.service.impl;

import com.wl.mapper.BAS_AreaMapper;
import com.wl.model.BAS_Area;
import com.wl.service.BAS_AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class BAS_AreaServiceImpl implements BAS_AreaService {
    @Autowired
    private BAS_AreaMapper bas_areaMapper;

    @Override
    public List<BAS_Area> findBASAreaAndsy_units(Integer page, Integer rows) {
        List<BAS_Area> units = bas_areaMapper.findBASAreaAndsy_units(page, rows);
        return units;
    }

    @Override
    public List<BAS_Area> findBASAreaAndsy_unitsFenye(String province,String city,String county,Integer page, Integer rows) {
        return bas_areaMapper.findBASAreaAndsy_unitsFenye( province,  city,  county,  page,  rows);
    }

    @Override
    public int insert(BAS_Area record) {
        return bas_areaMapper.insert(record);
    }

    @Override
    public int getcount() {
        return bas_areaMapper.getcount();
    }

    @Override
    public int updateByPrimaryKey(BAS_Area record) {
        return bas_areaMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey(BigDecimal id) {
        return bas_areaMapper.deleteByPrimaryKey(id);
    }
}

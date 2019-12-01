package com.wl.service.impl;

import com.wl.mapper.SY_UnitsMapper;
import com.wl.model.SY_Units;
import com.wl.service.SY_UnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class SY_UnitsServiceimpl implements SY_UnitsService {

    @Autowired
    private SY_UnitsMapper unitsMapper;

    //查询全部的部门xx
    @Override
    public List<SY_Units> findAllUnitsAndEmp(SY_Units units) {
        return unitsMapper.findAllUnitsAndEmp(units);
    }

    @Override
    public List<SY_Units> findAllUnits() {
        return unitsMapper.findAllUnits();
    }

    @Override
    public Integer findCount() {
        return unitsMapper.findCount();
    }

    @Override
    public Integer findMhCount(SY_Units units) {
        return unitsMapper.findMhCount(units);
    }

    @Override
    public List<SY_Units> selectfindALL() {
        return unitsMapper.selectfindALL();
    }

    @Override
    public void updateByPrimaryKeySelective(SY_Units record) {
        unitsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public void deleteByPrimaryKey(BigDecimal id) {
        unitsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insertUnits(SY_Units record) {
        unitsMapper.insertUnits(record);
    }
}

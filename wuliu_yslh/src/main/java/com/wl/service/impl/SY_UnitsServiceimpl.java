package com.wl.service.impl;

import com.wl.mapper.SY_UnitsMapper;
import com.wl.model.SY_Units;
import com.wl.service.SY_UnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SY_UnitsServiceimpl implements SY_UnitsService {

    @Autowired
    private SY_UnitsMapper unitsMapper;

    //查询全部的部门
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
}

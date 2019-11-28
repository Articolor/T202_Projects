package com.wl.service.impl;

import com.wl.mapper.BAS_ZoneinfoMapper;
import com.wl.model.BAS_Zoneinfo;
import com.wl.service.BAS_ZoneinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BAS_ZoneinfoServiceImpl implements BAS_ZoneinfoService{
       @Autowired
       private BAS_ZoneinfoMapper bas_zoneinfoMapper;

    @Override
    public List<BAS_Zoneinfo> findBAS_ZoneinfoAndSY_EmpAndSY_Units(Integer page, Integer rows) {
        return bas_zoneinfoMapper.findBAS_ZoneinfoAndSY_EmpAndSY_Units(page, rows);
    }

    @Override
    public List<BAS_Zoneinfo> findBAS_ZoneinfoAndSY_EmpAndSY_Unitsfenye(String name, String zonecode,Integer page,Integer rows) {
        return bas_zoneinfoMapper.findBAS_ZoneinfoAndSY_EmpAndSY_Unitsfenye(name, zonecode,page,rows);
    }
}

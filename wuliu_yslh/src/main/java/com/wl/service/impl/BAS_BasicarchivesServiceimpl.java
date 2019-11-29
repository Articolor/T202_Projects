package com.wl.service.impl;

import com.wl.mapper.BAS_BasicarchivesMapper;
import com.wl.mapper.BAS_DeliverystandardMapper;
import com.wl.model.BAS_Basicarchives;
import com.wl.service.BAS_BasicarchivesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class BAS_BasicarchivesServiceimpl implements BAS_BasicarchivesService {
    @Autowired
    private BAS_BasicarchivesMapper basicarchivesMapper;


    @Override
    public List<BAS_Basicarchives> findBAS_BasicarchivesAndSY_EmpAndSY_Units(Integer page, Integer rows) {
        return basicarchivesMapper.findBAS_BasicarchivesAndSY_EmpAndSY_Units(page, rows);
    }

    @Override
    public List<BAS_Basicarchives> findfindBASBasicarchivesAndSYEmpAndSYUnitsKey( String ename,  int page, int rows) {
        return basicarchivesMapper.findfindBASBasicarchivesAndSYEmpAndSYUnitsKey(ename,page,rows);
    }

    @Override
    public int insert(BAS_Basicarchives record) {
        int i = basicarchivesMapper.insert(record);
        return i;
    }

    @Override
    public int updateByPrimaryKey(BAS_Basicarchives record) {
        int i = basicarchivesMapper.updateByPrimaryKey(record);
        return i;
    }
}

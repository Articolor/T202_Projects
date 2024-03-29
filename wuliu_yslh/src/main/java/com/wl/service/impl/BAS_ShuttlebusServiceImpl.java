package com.wl.service.impl;

import com.wl.mapper.BAS_ShuttlebusMapper;
import com.wl.model.BAS_Shuttlebus;
import com.wl.service.BAS_ShuttlebusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class BAS_ShuttlebusServiceImpl implements BAS_ShuttlebusService {
     @Autowired
    private BAS_ShuttlebusMapper bas_shuttlebusMapper;

    @Override
    public List<BAS_Shuttlebus> findBUSANDEMPANDUNITS(Integer page, int rows) {
        List<BAS_Shuttlebus> list = bas_shuttlebusMapper.findBUSANDEMPANDUNITS(page, rows);
        return list;
    }

    @Override
    public List<BAS_Shuttlebus> findBUSANDEMPANDUNITSfenye(String licenseplateint,String driver,String carrier, Integer page,Integer rows) {
        return bas_shuttlebusMapper.findBUSANDEMPANDUNITSfenye(   licenseplateint,  driver,  carrier , page,  rows);
    }

    @Override
    public int GetBUSCOUNT() {
        int i = bas_shuttlebusMapper.GetBUSCOUNT();
        return i;
    }

    @Override
    public int insert(BAS_Shuttlebus record) {
        return bas_shuttlebusMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(BAS_Shuttlebus record) {
        return bas_shuttlebusMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey(BigDecimal id) {
        return bas_shuttlebusMapper.deleteByPrimaryKey(id);
    }
}

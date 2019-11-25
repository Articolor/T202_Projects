package com.wl.service.impl;

import com.wl.mapper.BAS_ShuttlebusMapper;
import com.wl.model.BAS_Shuttlebus;
import com.wl.service.BAS_ShuttlebusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<BAS_Shuttlebus> findBUSANDEMPANDUNITSfenye(Integer lineid, Integer linetype, String licenseplateint, String driver, String carrier, Integer page, int rows) {
        return bas_shuttlebusMapper.findBUSANDEMPANDUNITSfenye( lineid,  linetype,  licenseplateint,  driver,  carrier,  page,  rows);
    }

    @Override
    public int GetBUSCOUNT() {
        int i = bas_shuttlebusMapper.GetBUSCOUNT();
        return i;
    }
}

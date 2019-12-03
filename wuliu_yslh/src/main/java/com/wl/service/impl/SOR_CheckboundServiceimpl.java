package com.wl.service.impl;

import com.wl.mapper.SOR_CheckboundMapper;
import com.wl.model.SOR_Checkbound;
import com.wl.service.SOR_CheckboundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SOR_CheckboundServiceimpl implements SOR_CheckboundService {

    @Autowired
    private SOR_CheckboundMapper checkboundMapper;
    @Override
    public List<SOR_Checkbound> findAllCheckBound(SOR_Checkbound o) {
        return checkboundMapper.findAllCheckBound(o);
    }

    @Override
    public Integer sumCount(SOR_Checkbound o) {
        return checkboundMapper.sumCount(o);
    }

    @Override
    public int insert(SOR_Checkbound record) {
        return checkboundMapper.insert(record);
    }

    @Override
    public List<SOR_Checkbound> findNewDate() {
        return checkboundMapper.findNewDate();
    }
}

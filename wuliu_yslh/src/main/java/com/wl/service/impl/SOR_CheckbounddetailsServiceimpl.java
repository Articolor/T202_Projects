package com.wl.service.impl;

import com.wl.mapper.SOR_CheckbounddetailsMapper;
import com.wl.model.SOR_Checkbounddetails;
import com.wl.service.SOR_CheckbounddetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SOR_CheckbounddetailsServiceimpl implements SOR_CheckbounddetailsService {
    @Autowired
    private SOR_CheckbounddetailsMapper checkbounddetailsMapper;

    @Override
    public List<SOR_Checkbounddetails> findByIDBound(SOR_Checkbounddetails c) {
        return checkbounddetailsMapper.findByIDBound(c);
    }

    @Override
    public int insert(SOR_Checkbounddetails record) {
        return checkbounddetailsMapper.insert(record);
    }
}

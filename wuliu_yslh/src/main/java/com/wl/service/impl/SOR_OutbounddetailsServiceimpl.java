package com.wl.service.impl;

import com.wl.mapper.SOR_OutbounddetailsMapper;
import com.wl.model.SOR_Outbounddetails;
import com.wl.service.SOR_OutbounddetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SOR_OutbounddetailsServiceimpl implements SOR_OutbounddetailsService {
    @Autowired
    private SOR_OutbounddetailsMapper outbounddetailsMapper;

    @Override
    public List<SOR_Outbounddetails> findByIdOutDeta(SOR_Outbounddetails o) {
        return outbounddetailsMapper.findByIdOutDeta(o);
    }

    @Override
    public int insert(SOR_Outbounddetails record) {
        return outbounddetailsMapper.insert(record);
    }
}

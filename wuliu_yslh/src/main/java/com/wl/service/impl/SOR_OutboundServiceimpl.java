package com.wl.service.impl;

import com.wl.mapper.SOR_OutboundMapper;
import com.wl.model.SOR_Outbound;
import com.wl.service.SOR_OutboundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SOR_OutboundServiceimpl implements SOR_OutboundService {
    @Autowired
    private SOR_OutboundMapper outboundMapper;

    @Override
    public List<SOR_Outbound> findAllByOut(SOR_Outbound o) {
        return outboundMapper.findAllByOut(o);
    }

    @Override
    public List<SOR_Outbound> findAllOutBo(SOR_Outbound o) {
        return outboundMapper.findAllOutBo(o);
    }

    @Override
    public Integer sumCount(SOR_Outbound o) {
        return outboundMapper.sumCount(o);
    }

    @Override
    public int insert(SOR_Outbound record) {
        return outboundMapper.insert(record);
    }

    @Override
    public List<SOR_Outbound> findNewDate() {
        return outboundMapper.findNewDate();
    }

    @Override
    public List<SOR_Outbound> findOutD(int page, int rows) {
        return outboundMapper.findOutD(page, rows);
    }

    @Override
    public Integer findOutDCount() {
        return outboundMapper.findOutDCount();
    }
}

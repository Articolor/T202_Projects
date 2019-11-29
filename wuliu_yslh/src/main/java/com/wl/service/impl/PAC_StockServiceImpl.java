package com.wl.service.impl;

import com.wl.mapper.PAC_StockMapper;
import com.wl.model.PAC_Stock;
import com.wl.service.PAC_StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PAC_StockServiceImpl implements PAC_StockService {
    @Autowired
    private PAC_StockMapper mapper;
    @Override
    public List<PAC_Stock> selectAll(PAC_Stock o) {
        return mapper.selectAll(o);
    }

    @Override
    public List<PAC_Stock> mhselect(PAC_Stock o) {
        return mapper.mhselect(o);
    }

    @Override
    public void insert(PAC_Stock p) {
        mapper.insert(p);
    }

    @Override
    public PAC_Stock selectbyid(PAC_Stock p) {
        return mapper.selectbyid(p);
    }

    @Override
    public int updatepacsk(PAC_Stock record) {
        return mapper.updatepacsk(record);
    }

    @Override
    public int querycount(Object o) {
        return mapper.querycount(o);
    }
}

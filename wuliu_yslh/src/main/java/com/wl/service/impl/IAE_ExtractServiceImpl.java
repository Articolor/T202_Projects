package com.wl.service.impl;

import com.wl.mapper.IAE_ExtractMapper;
import com.wl.model.IAE_Extract;
import com.wl.service.IAE_ExtractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAE_ExtractServiceImpl implements IAE_ExtractService {
    @Autowired
    private IAE_ExtractMapper mapper;
    @Override
    public List<IAE_Extract> queryextract(IAE_Extract e) {
        return mapper.queryextract(e);
    }

    @Override
    public int querycount(IAE_Extract e) {
        return mapper.querycount(e);
    }

    @Override
    public int insert(IAE_Extract record) {
        return mapper.insert(record);
    }
}

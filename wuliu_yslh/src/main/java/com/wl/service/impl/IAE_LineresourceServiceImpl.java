package com.wl.service.impl;

import com.wl.mapper.IAE_LineresourceMapper;
import com.wl.model.IAE_Lineresource;
import com.wl.service.IAE_LineresourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAE_LineresourceServiceImpl implements IAE_LineresourceService {
    @Autowired
    private IAE_LineresourceMapper mapper;

    @Override
    public List<IAE_Lineresource> queryline(IAE_Lineresource l) {
        return mapper.queryline(l);
    }

    @Override
    public int getcount(IAE_Lineresource l) {
        return mapper.getcount(l);
    }
}

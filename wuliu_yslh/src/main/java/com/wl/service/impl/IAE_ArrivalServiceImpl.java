package com.wl.service.impl;

import com.wl.mapper.IAE_ArrivalMapper;
import com.wl.model.IAE_Arrival;
import com.wl.service.IAE_ArrivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAE_ArrivalServiceImpl implements IAE_ArrivalService {
    @Autowired
    private IAE_ArrivalMapper mapper;
    @Override
    public List<IAE_Arrival> queryarrival(IAE_Arrival a) {
        return mapper.queryarrival(a);
    }

    @Override
    public int getcount(IAE_Arrival a) {
        return mapper.getcount(a);
    }
}

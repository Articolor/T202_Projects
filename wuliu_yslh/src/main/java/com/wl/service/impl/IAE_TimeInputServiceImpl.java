package com.wl.service.impl;

import com.wl.mapper.IAE_TimeinputMapper;
import com.wl.model.IAE_Timeinput;
import com.wl.service.IAE_TimeInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAE_TimeInputServiceImpl implements IAE_TimeInputService {
    @Autowired
    private IAE_TimeinputMapper mapper;

    @Override
    public List<IAE_Timeinput> queryinput(IAE_Timeinput i) {
        return mapper.queryinput(i);
    }

    @Override
    public int querycount(IAE_Timeinput i) {
        return mapper.querycount(i);
    }
}

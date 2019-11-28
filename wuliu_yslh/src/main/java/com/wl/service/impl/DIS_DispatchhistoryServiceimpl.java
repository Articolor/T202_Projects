package com.wl.service.impl;

import com.wl.mapper.DIS_DispatchhistoryMapper;
import com.wl.model.DIS_Dispatchhistory;
import com.wl.service.DIS_DispatchhistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DIS_DispatchhistoryServiceimpl implements DIS_DispatchhistoryService {

    @Autowired
    private DIS_DispatchhistoryMapper dispatchhistoryMapper;
    @Override
    public void insert(DIS_Dispatchhistory record) {
        dispatchhistoryMapper.insert(record);
    }

    @Override
    public DIS_Dispatchhistory findByDisp(BigDecimal no) {
        return dispatchhistoryMapper.findByDisp(no);
    }
}

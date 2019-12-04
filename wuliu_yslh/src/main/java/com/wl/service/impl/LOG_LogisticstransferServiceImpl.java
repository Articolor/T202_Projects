package com.wl.service.impl;

import com.wl.mapper.LOG_LogisticstransferMapper;
import com.wl.model.LOG_Logisticstransfer;
import com.wl.service.LOG_LogisticstransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LOG_LogisticstransferServiceImpl implements LOG_LogisticstransferService {
    @Autowired
    private LOG_LogisticstransferMapper logisticstransferMapper;

    @Override
    public List<LOG_Logisticstransfer> selectfindtransfer(String transferint, String driver, Integer page, Integer rows) {
        return logisticstransferMapper.selectfindtransfer(transferint, driver, page, rows);
    }
}

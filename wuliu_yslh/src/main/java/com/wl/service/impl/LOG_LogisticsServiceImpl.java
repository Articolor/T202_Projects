package com.wl.service.impl;

import com.wl.mapper.LOG_LogisticsMapper;
import com.wl.model.LOG_Logistics;
import com.wl.service.LOG_LogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LOG_LogisticsServiceImpl implements LOG_LogisticsService {
    @Autowired
    private LOG_LogisticsMapper log_logisticsMapper;
    @Override
    public List<LOG_Logistics> selectfindLogistics(String logisticsint, Integer iscancel, Integer page, Integer rows) {
        return log_logisticsMapper.selectfindLogistics(logisticsint, iscancel, page, rows);
    }
}

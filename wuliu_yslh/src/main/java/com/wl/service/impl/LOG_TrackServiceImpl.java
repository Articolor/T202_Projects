package com.wl.service.impl;

import com.wl.mapper.LOG_TrackMapper;
import com.wl.model.LOG_Track;
import com.wl.service.LOG_TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class LOG_TrackServiceImpl implements LOG_TrackService {
    @Autowired
    private LOG_TrackMapper trackMapper;

    @Override
    public List<LOG_Track> findalltracck(String linename, String logisticscar, Integer page, Integer rows) {
        return trackMapper.findalltracck(linename, logisticscar, page, rows);
    }

    @Override
    public int deleteByPrimaryKey(BigDecimal id) {
        return trackMapper.deleteByPrimaryKey(id);
    }
}

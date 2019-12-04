package com.wl.service;

import com.wl.model.LOG_Track;

import java.math.BigDecimal;
import java.util.List;

public interface LOG_TrackService {
    //查询跟踪记录
    List<LOG_Track> findalltracck(String linename, String logisticscar, Integer page, Integer rows);
    //删除记录
    int deleteByPrimaryKey(BigDecimal id);

}

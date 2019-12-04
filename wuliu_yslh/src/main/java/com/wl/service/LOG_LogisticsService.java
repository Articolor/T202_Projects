package com.wl.service;

import com.wl.model.LOG_Logistics;
import com.wl.model.LOG_Track;

import java.math.BigDecimal;
import java.util.List;

public interface LOG_LogisticsService {

    //查询跟踪表查询
    List<LOG_Logistics> selectfindLogistics(String logisticsint, Integer iscancel, Integer page, Integer rows);


}

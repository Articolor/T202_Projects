package com.wl.service;

import com.wl.model.BIGLOG_Logisticscontroltable;

import java.math.BigDecimal;
import java.util.List;

public interface LQLogisticsControlService {
    public List<BIGLOG_Logisticscontroltable> selectAll(BIGLOG_Logisticscontroltable b);
    public int insert(BIGLOG_Logisticscontroltable record);
    public BIGLOG_Logisticscontroltable selectByPrimaryKey(BigDecimal id);
    public int updateByPrimaryKey(BIGLOG_Logisticscontroltable record);
    public BIGLOG_Logisticscontroltable selectById(int id);
    public int querycount(Object o);
    public int update(BIGLOG_Logisticscontroltable record);
    int delete(BIGLOG_Logisticscontroltable b);
}

package com.wl.service.impl;

import com.wl.mapper.BIGLOG_LogisticscontroltableMapper;
import com.wl.model.BIGLOG_Logisticscontroltable;
import com.wl.service.LQLogisticsControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class LQLogisticsDControlServiceImpl  implements LQLogisticsControlService {
    @Autowired
    private BIGLOG_LogisticscontroltableMapper mapper;
    @Override
    public List<BIGLOG_Logisticscontroltable> selectAll(BIGLOG_Logisticscontroltable b) {
        return mapper.selectAll(b);
    }

    @Override
    public int insert(BIGLOG_Logisticscontroltable record) {
        return mapper.insert(record);
    }

    @Override
    public BIGLOG_Logisticscontroltable selectByPrimaryKey(BigDecimal id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(BIGLOG_Logisticscontroltable record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public BIGLOG_Logisticscontroltable selectById(int id) {
        return mapper.selectById(id);
    }

    @Override
    public int querycount(Object o) {
        return mapper.querycount(o);
    }

    @Override
    public int update(BIGLOG_Logisticscontroltable record) {
        return mapper.update(record);
    }

    @Override
    public int delete(BIGLOG_Logisticscontroltable id) {
        return mapper.delete(id);
    }
}

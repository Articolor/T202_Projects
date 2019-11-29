package com.wl.mapper;

import com.wl.model.BIGLOG_Logisticscontroltable;
import com.wl.model.SY_Emp;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface BIGLOG_LogisticscontroltableMapper {
    public List<BIGLOG_Logisticscontroltable> selectAll(BIGLOG_Logisticscontroltable b);
    public BIGLOG_Logisticscontroltable selectById(int id);
    int delete(BIGLOG_Logisticscontroltable b);
    public int querycount(Object o);
    public int insert(BIGLOG_Logisticscontroltable record);

    int insertSelective(BIGLOG_Logisticscontroltable record);

    public BIGLOG_Logisticscontroltable selectByPrimaryKey(BigDecimal id);

    int update(BIGLOG_Logisticscontroltable record);

    public int updateByPrimaryKey(BIGLOG_Logisticscontroltable record);

}
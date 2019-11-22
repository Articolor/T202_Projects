package com.wl.mapper;

import com.wl.model.SY_Units;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface SY_UnitsMapper {

    //查询单位和员工
    List<SY_Units> findAllUnitsAndEmp(SY_Units units);

    //查询所有的单位
    List<SY_Units> findAllUnits();

    //查询总行数
    public Integer findCount();

    //模糊查询后的总行数
    public Integer findMhCount(SY_Units units);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SY_Units record);

    int insertSelective(SY_Units record);

    SY_Units selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SY_Units record);

    int updateByPrimaryKey(SY_Units record);
}
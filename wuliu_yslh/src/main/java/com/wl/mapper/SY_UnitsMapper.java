package com.wl.mapper;

import com.wl.model.SY_Units;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface SY_UnitsMapper {

    //查询单位和员工
    List<SY_Units> findAllUnitsAndEmp(SY_Units units);

    //查询所 有的单位
    List<SY_Units> findAllUnits();


    int deleteByPrimaryKey(BigDecimal id);

    int insert(SY_Units record);

    int insertSelective(SY_Units record);

    SY_Units selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SY_Units record);

    int updateByPrimaryKey(SY_Units record);
}
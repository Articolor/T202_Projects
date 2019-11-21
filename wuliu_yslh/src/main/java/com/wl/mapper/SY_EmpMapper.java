package com.wl.mapper;

import com.wl.model.SY_Emp;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface SY_EmpMapper {

    //查询全部的方   法有用户和角色和单位
    List<SY_Emp> findAllEmpAndRole(SY_Emp sy_emp);

    int deleteByPrimaryKey(BigDecimal id);

    void insertEMP(SY_Emp emp);

    int insertSelective(SY_Emp record);

    SY_Emp selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SY_Emp record);

    int updateByPrimaryKey(SY_Emp record);
}
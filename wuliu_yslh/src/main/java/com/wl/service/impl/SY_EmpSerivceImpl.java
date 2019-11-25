package com.wl.service.impl;

import com.wl.mapper.SY_EmpMapper;
import com.wl.model.SY_Emp;
import com.wl.service.SY_EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class SY_EmpSerivceImpl implements SY_EmpService {
    @Autowired
    private SY_EmpMapper sy_empMapper;



    //查询全部的方法有用户和角色
    @Override
    public List<SY_Emp> findAllEmpAndRole(SY_Emp sy_emp) {
        return sy_empMapper.findAllEmpAndRole(sy_emp);
    }

    @Override
    public void insertEMP(SY_Emp emp) {
        //新增用户
        sy_empMapper.insertEMP(emp);
    }

    @Override
    public void deleteByPrimaryKey(BigDecimal id) {
        sy_empMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer findsumCount(SY_Emp e) {
        return sy_empMapper.findsumCount(e);
    }

    @Override
    public void updateByPrimaryKeySelective(SY_Emp record) {
        sy_empMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public SY_Emp findEmpByLogin(SY_Emp emp) {
        return sy_empMapper.findEmpByLogin(emp);
    }
}

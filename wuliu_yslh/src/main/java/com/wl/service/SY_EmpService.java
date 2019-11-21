package com.wl.service;

import com.wl.model.SY_Emp;

import java.math.BigDecimal;
import java.util.List;

public interface SY_EmpService {
    //查询全部的方法有用户和角色
    List<SY_Emp> findAllEmpAndRole(SY_Emp sy_emp);

    //xx新增用户
    void insertEMP(SY_Emp emp);

    //删除用户
    void deleteByPrimaryKey(BigDecimal id);
}

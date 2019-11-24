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

    //查询总行数
    Integer findsumCount(SY_Emp e);

    //修改员工
    void updateByPrimaryKeySelective(SY_Emp record);


}

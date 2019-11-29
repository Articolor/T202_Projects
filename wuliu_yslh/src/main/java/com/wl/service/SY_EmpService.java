package com.wl.service;

import com.wl.model.SY_Emp;

import java.math.BigDecimal;
import java.util.List;

public interface SY_EmpService {
    //查询全部的方法有用户和角色xx
    List<SY_Emp> findAllEmpAndRole(SY_Emp sy_emp);

    //xx新增用户xx
    void insertEMP(SY_Emp emp);

    //删除用户xx
    void deleteByPrimaryKey(BigDecimal id);

    //查询总行数xx
    Integer findsumCount(SY_Emp e);

    //修改员xx工
    void updateByPrimaryKeySelective(SY_Emp record);


    //根据姓名和密码登录
    SY_Emp findEmpByLogin(SY_Emp emp);

    //查询出所有的小件员
    List<SY_Emp> findXJY();

    //根据员工工号查询出查台密码-
    SY_Emp findByQueryPwd(String querypwd);
}

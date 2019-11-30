package com.wl.mapper;

import com.wl.model.SY_Emp;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface SY_EmpMapper {

    //查询全部的方   法有用户和角色和单位
    List<SY_Emp> findAllEmpAndRole(SY_Emp sy_emp);

    //查询总行数
    Integer findsumCount(SY_Emp e);

    //根据姓名和密码登录
    SY_Emp findEmpByLogin(SY_Emp emp);

      //查询出所有的小件员
    List<SY_Emp> findXJY();

    //根据员工工号查询出查台密码-
    SY_Emp findByQueryPwd(SY_Emp emp);

    //查询工号
    List<SY_Emp> findemono();

    //查询名称
    SY_Emp findbyid(SY_Emp emp);
    int deleteByPrimaryKey(BigDecimal id);

    void insertEMP(SY_Emp emp);

    int insertSelective(SY_Emp record);

    SY_Emp selectByPrimaryKey(BigDecimal id);

    //修改员工
    void updateByPrimaryKeySelective(SY_Emp record);

    int updateByPrimaryKey(SY_Emp record);
}
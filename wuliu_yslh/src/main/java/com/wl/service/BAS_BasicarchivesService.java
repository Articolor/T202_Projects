package com.wl.service;

import com.wl.model.BAS_Basicarchives;

import java.util.Date;
import java.util.List;

public interface BAS_BasicarchivesService {
    //查询基础档案
    List<BAS_Basicarchives> findBAS_BasicarchivesAndSY_EmpAndSY_Units(Integer page, Integer rows);
    //分页查询基础数据
    List<BAS_Basicarchives> findfindBASBasicarchivesAndSYEmpAndSYUnitsKey( String ename,  int page, int rows);
    //新增数据
    int insert(BAS_Basicarchives record);
    //修改基础数据
    int updateByPrimaryKey(BAS_Basicarchives record);
}

package com.wl.service;

import com.wl.model.BAS_Basicarchives;

import java.util.Date;
import java.util.List;

public interface BAS_BasicarchivesService {
    //查询基础档案
    List<BAS_Basicarchives> findBAS_BasicarchivesAndSY_EmpAndSY_Units(int page, int rows);
    //分页查询基础数据
    List<BAS_Basicarchives> findfindBASBasicarchivesAndSYEmpAndSYUnitsKey(Integer parentid, String ename, String empname, Date boperationtime   , int page, int rows);
}

package com.wl.mapper;

import com.wl.model.BAS_Basicarchives;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
@Service
public interface BAS_BasicarchivesMapper {
    //查询基础档案
    List<BAS_Basicarchives> findBAS_BasicarchivesAndSY_EmpAndSY_Units(int page,int rows);

    //分页查询基础数据
    List<BAS_Basicarchives> findfindBASBasicarchivesAndSYEmpAndSYUnitsKey(Integer parentid, String ename, String empname, Date boperationtime   ,  int page, int rows);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(BAS_Basicarchives record);

    int insertSelective(BAS_Basicarchives record);

    BAS_Basicarchives selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BAS_Basicarchives record);

    int updateByPrimaryKey(BAS_Basicarchives record);
}
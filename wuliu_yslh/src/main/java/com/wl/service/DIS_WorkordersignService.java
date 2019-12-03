package com.wl.service;

import com.wl.model.DIS_Workordersign;

import java.util.List;

public interface DIS_WorkordersignService {
    //查询全部的签收信息有员工和单位
    List<DIS_Workordersign> findAllByUnitsAndEmp(DIS_Workordersign w);

    //查询总行数
    Integer findSumCount(DIS_Workordersign o);

    //根据编号查询出签收单号信息
    DIS_Workordersign findByIdUnitsAndEmp(DIS_Workordersign o);

    //新增
    void insert(DIS_Workordersign record);

    //签收录入中的查询---查询出全部的签收信息和量个单位和一个员工
    List<DIS_Workordersign> findAllByUnits2AndEmp(DIS_Workordersign o);

    //查询总行数2
    Integer findSumCount2(DIS_Workordersign o);

    //根据编号查询出签收单号2
    DIS_Workordersign findByID2UnitsAndEmp(DIS_Workordersign o);

    //根据id修改作废标记
    void updateByIDOMark(DIS_Workordersign o);
}

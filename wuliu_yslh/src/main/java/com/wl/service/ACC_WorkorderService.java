package com.wl.service;

import com.wl.model.ACC_Workorder;

import java.math.BigDecimal;
import java.util.List;

public interface ACC_WorkorderService {

    //新增受理对应的工单表
    void  insertOrder(ACC_Workorder record);

    //修改工单表的工单类型
    void updateJobTypeById(ACC_Workorder workorder);

    //查询全部的工作单和对应的公司---和受理表对应
    List<ACC_Workorder> findAllWorderAndBility(ACC_Workorder w);

    //查询总行数
    Integer sumCount(ACC_Workorder o);

    //查询单个工单数据
    ACC_Workorder selectByPrimaryKey(BigDecimal id);

    //根据业务通知单号查询单个对象
    ACC_Workorder selecByBusineNo(String businessnoticeno);

    //根据工单表和单位表和受理表连接---分页和高级查询
    List<ACC_Workorder> findAllWorAndUnitAndBli(ACC_Workorder w);

    //查询总行数  根据工单表和单位表和受理表连接---分页和高级查询
    Integer findsumcountUB(ACC_Workorder w);
}

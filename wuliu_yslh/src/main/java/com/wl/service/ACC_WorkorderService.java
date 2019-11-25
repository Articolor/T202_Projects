package com.wl.service;

import com.wl.model.ACC_Workorder;

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
}

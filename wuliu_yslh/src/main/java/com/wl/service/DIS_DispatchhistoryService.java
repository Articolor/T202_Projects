package com.wl.service;

import com.wl.model.DIS_Dispatchhistory;

import java.math.BigDecimal;

public interface DIS_DispatchhistoryService {

    //新增一条调度历史数据
    void  insert(DIS_Dispatchhistory record);

    //根据工单表的id查询出对应的调度历史表
    DIS_Dispatchhistory findByDisp(BigDecimal no);
}

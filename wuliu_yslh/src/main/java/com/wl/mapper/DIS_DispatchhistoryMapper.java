package com.wl.mapper;

import com.wl.model.DIS_Dispatchhistory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
public interface DIS_DispatchhistoryMapper {
    int deleteByPrimaryKey(BigDecimal id);

    //新增一条调度历史数据
    void  insert(DIS_Dispatchhistory record);

    //根据工单表的id查询出对应的调度历史表
    DIS_Dispatchhistory findByDisp(BigDecimal no);

    int insertSelective(DIS_Dispatchhistory record);

    DIS_Dispatchhistory selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(DIS_Dispatchhistory record);

    int updateByPrimaryKey(DIS_Dispatchhistory record);
}
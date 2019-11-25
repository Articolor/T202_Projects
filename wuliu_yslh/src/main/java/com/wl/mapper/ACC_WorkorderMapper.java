package com.wl.mapper;

import com.wl.model.ACC_Workorder;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface ACC_WorkorderMapper {
    int deleteByPrimaryKey(BigDecimal id);

    //新增受理对应的工单表
    void  insertOrder(ACC_Workorder record);

    //修改工单表的工单类型
    void updateJobTypeById(ACC_Workorder workorder);

    //查询全部的工作单和对应的公司---和受理表对应
    List<ACC_Workorder> findAllWorderAndBility(ACC_Workorder w);

    //查询总行数
    Integer sumCount(ACC_Workorder o);

    int insertSelective(ACC_Workorder record);

    ACC_Workorder selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(ACC_Workorder record);

    int updateByPrimaryKey(ACC_Workorder record);
}
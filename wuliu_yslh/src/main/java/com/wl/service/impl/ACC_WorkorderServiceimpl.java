package com.wl.service.impl;

import com.wl.mapper.ACC_WorkorderMapper;
import com.wl.model.ACC_Workorder;
import com.wl.service.ACC_WorkorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ACC_WorkorderServiceimpl implements ACC_WorkorderService {

    @Autowired
    private ACC_WorkorderMapper workorderMapper;

    @Override
    public void insertOrder(ACC_Workorder record) {
        workorderMapper.insertOrder(record);
    }

    @Override
    public void updateJobTypeById(ACC_Workorder workorder) {
        workorderMapper.updateJobTypeById(workorder);
    }

    @Override
    public List<ACC_Workorder> findAllWorderAndBility(ACC_Workorder w) {
        return workorderMapper.findAllWorderAndBility(w);
    }

    @Override
    public Integer sumCount(ACC_Workorder o) {
        return workorderMapper.sumCount(o);
    }

    @Override
    public ACC_Workorder selectByPrimaryKey(BigDecimal id) {
        return workorderMapper.selectByPrimaryKey(id);
    }

    @Override
    public ACC_Workorder selecByBusineNo(String businessnoticeno) {
        return workorderMapper.selecByBusineNo(businessnoticeno);
    }

    @Override
    public List<ACC_Workorder> findAllWorAndUnitAndBli(ACC_Workorder w) {
        return workorderMapper.findAllWorAndUnitAndBli(w);
    }

    @Override
    public Integer findsumcountUB(ACC_Workorder w) {
        return workorderMapper.findsumcountUB(w);
    }
}

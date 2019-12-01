package com.wl.service.impl;

import com.wl.mapper.DIS_WorkordersignMapper;
import com.wl.model.DIS_Workordersign;
import com.wl.service.DIS_WorkordersignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DIS_WorkordersignServiceimpl implements DIS_WorkordersignService {

    @Autowired
    private DIS_WorkordersignMapper workordersignMapper;
    @Override
    public List<DIS_Workordersign> findAllByUnitsAndEmp(DIS_Workordersign w) {
        return workordersignMapper.findAllByUnitsAndEmp(w);
    }

    @Override
    public Integer findSumCount(DIS_Workordersign o) {
        return workordersignMapper.findSumCount(o);
    }

    @Override
    public DIS_Workordersign findByIdUnitsAndEmp(DIS_Workordersign o) {
        return workordersignMapper.findByIdUnitsAndEmp(o);
    }

    @Override
    public void insert(DIS_Workordersign record) {
        workordersignMapper.insert(record);
    }

    @Override
    public List<DIS_Workordersign> findAllByUnits2AndEmp(DIS_Workordersign o) {
        return workordersignMapper.findAllByUnits2AndEmp(o);
    }

    @Override
    public Integer findSumCount2(DIS_Workordersign o) {
        return workordersignMapper.findSumCount2(o);
    }

    @Override
    public DIS_Workordersign findByID2UnitsAndEmp(DIS_Workordersign o) {
        return workordersignMapper.findByID2UnitsAndEmp(o);
    }

    @Override
    public void updateByIDOMark(DIS_Workordersign o) {
       workordersignMapper.updateByIDOMark(o);
    }
}

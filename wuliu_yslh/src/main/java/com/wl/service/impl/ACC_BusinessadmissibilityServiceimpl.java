package com.wl.service.impl;

import com.wl.mapper.ACC_BusinessadmissibilityMapper;
import com.wl.model.ACC_Businessadmissibility;
import com.wl.service.ACC_BusinessadmissibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ACC_BusinessadmissibilityServiceimpl implements ACC_BusinessadmissibilityService {
    @Autowired
    private ACC_BusinessadmissibilityMapper businessadmissibilityMapper;


    @Override
    public List<ACC_Businessadmissibility> findAllBusinessM(ACC_Businessadmissibility b) {
        return businessadmissibilityMapper.findAllBusinessM(b);
    }

    @Override
    public List<ACC_Businessadmissibility> findAllBusinessR(ACC_Businessadmissibility b) {
        return businessadmissibilityMapper.findAllBusinessR(b);
    }

    @Override
    public Integer sumCountR(ACC_Businessadmissibility b) {
        return businessadmissibilityMapper.sumCountR(b);
    }

    @Override
    public Integer sumCount(ACC_Businessadmissibility b) {
        return businessadmissibilityMapper.sumCount(b);
    }

    @Override
    public void insertBusin(ACC_Businessadmissibility record) {
        businessadmissibilityMapper.insertBusin(record);
    }

    @Override
    public ACC_Businessadmissibility findBilityAndUnityAndEmp(String businessnoticeno) {
        return businessadmissibilityMapper.findBilityAndUnityAndEmp(businessnoticeno);
    }

    @Override
    public List<ACC_Businessadmissibility> findByNewDate() {
        return businessadmissibilityMapper.findByNewDate();
    }

    @Override
    public void updateByPrimaryKeySelective(ACC_Businessadmissibility record) {
        businessadmissibilityMapper.updateByPrimaryKeySelective(record);
    }
}

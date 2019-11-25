package com.wl.service;

import com.wl.model.ACC_Businessadmissibility;

import java.util.List;

public interface ACC_BusinessadmissibilityService {
    //查询全部的业务受理加分页高级查询-----无关系
    List<ACC_Businessadmissibility> findAllBusinessM(ACC_Businessadmissibility b);

    //查询总行数
    Integer sumCount(ACC_Businessadmissibility b);

    //新增受理表
    void insertBusin(ACC_Businessadmissibility record);

    //根据工单表的业务通知单号查询出对应的受理数据和员工，单位
    ACC_Businessadmissibility findBilityAndUnityAndEmp(String businessnoticeno);
}

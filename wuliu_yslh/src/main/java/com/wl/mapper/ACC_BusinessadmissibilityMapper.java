package com.wl.mapper;

import com.wl.model.ACC_Businessadmissibility;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface ACC_BusinessadmissibilityMapper {
    //查询全部的业务受理加分页高级查询-----无关系
    List<ACC_Businessadmissibility> findAllBusinessM(ACC_Businessadmissibility b);

    //查询总行数
    Integer sumCount(ACC_Businessadmissibility b);

    //根据工单表的业务通知单号查询出对应的受理数据和员工，单位
    ACC_Businessadmissibility findBilityAndUnityAndEmp(String businessnoticeno);

    int deleteByPrimaryKey(BigDecimal id);

    //新增受理表
    void insertBusin(ACC_Businessadmissibility record);

    int insertSelective(ACC_Businessadmissibility record);

    ACC_Businessadmissibility selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(ACC_Businessadmissibility record);

    int updateByPrimaryKey(ACC_Businessadmissibility record);
}
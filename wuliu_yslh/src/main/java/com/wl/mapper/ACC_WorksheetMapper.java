package com.wl.mapper;

import com.wl.model.ACC_Worksheet;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
public interface ACC_WorksheetMapper {
    int deleteByPrimaryKey(BigDecimal id);

    //工作单快速入录
    void insertWSheet(ACC_Worksheet record);

    int insertSelective(ACC_Worksheet record);

    ACC_Worksheet selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(ACC_Worksheet record);

    int updateByPrimaryKey(ACC_Worksheet record);
}
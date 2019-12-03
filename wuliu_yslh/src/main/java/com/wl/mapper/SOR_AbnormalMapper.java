package com.wl.mapper;

import com.wl.model.SOR_Abnormal;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
public interface SOR_AbnormalMapper {
    int deleteByPrimaryKey(BigDecimal id);

    //新增异单数据
    int insert(SOR_Abnormal record);

    int insertSelective(SOR_Abnormal record);

    SOR_Abnormal selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SOR_Abnormal record);

    int updateByPrimaryKey(SOR_Abnormal record);
}
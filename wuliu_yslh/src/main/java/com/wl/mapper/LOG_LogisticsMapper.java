package com.wl.mapper;

import com.wl.model.LOG_Logistics;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface LOG_LogisticsMapper {
    //查询跟踪表查询
    List<LOG_Logistics> selectfindLogistics(String logisticsint, Integer iscancel, Integer page, Integer rows);
    int deleteByPrimaryKey(BigDecimal id);

    int insert(LOG_Logistics record);

    int insertSelective(LOG_Logistics record);

    LOG_Logistics selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(LOG_Logistics record);

    int updateByPrimaryKey(LOG_Logistics record);
}
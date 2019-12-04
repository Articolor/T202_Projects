package com.wl.mapper;

import com.wl.model.LOG_Logisticstransfer;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface LOG_LogisticstransferMapper {
    //交接单物流查询
    List<LOG_Logisticstransfer> selectfindtransfer(String transferint, String driver, Integer page, Integer rows);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(LOG_Logisticstransfer record);

    int insertSelective(LOG_Logisticstransfer record);

    LOG_Logisticstransfer selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(LOG_Logisticstransfer record);

    int updateByPrimaryKey(LOG_Logisticstransfer record);
}
package com.wl.mapper;

import com.wl.model.DIS_Dispatchhistory;
import java.math.BigDecimal;

public interface DIS_DispatchhistoryMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(DIS_Dispatchhistory record);

    int insertSelective(DIS_Dispatchhistory record);

    DIS_Dispatchhistory selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(DIS_Dispatchhistory record);

    int updateByPrimaryKey(DIS_Dispatchhistory record);
}
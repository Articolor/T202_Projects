package com.wl.mapper;

import com.wl.model.BAS_Deliverystandard;
import java.math.BigDecimal;

public interface BAS_DeliverystandardMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(BAS_Deliverystandard record);

    int insertSelective(BAS_Deliverystandard record);

    BAS_Deliverystandard selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BAS_Deliverystandard record);

    int updateByPrimaryKey(BAS_Deliverystandard record);
}
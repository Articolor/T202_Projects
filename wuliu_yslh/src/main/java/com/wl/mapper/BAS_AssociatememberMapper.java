package com.wl.mapper;

import com.wl.model.BAS_Associatemember;
import java.math.BigDecimal;

public interface BAS_AssociatememberMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(BAS_Associatemember record);

    int insertSelective(BAS_Associatemember record);

    BAS_Associatemember selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BAS_Associatemember record);

    int updateByPrimaryKey(BAS_Associatemember record);
}
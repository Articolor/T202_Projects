package com.wl.mapper;

import com.wl.model.BAS_Basicarchives;
import java.math.BigDecimal;

public interface BAS_BasicarchivesMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(BAS_Basicarchives record);

    int insertSelective(BAS_Basicarchives record);

    BAS_Basicarchives selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BAS_Basicarchives record);

    int updateByPrimaryKey(BAS_Basicarchives record);
}
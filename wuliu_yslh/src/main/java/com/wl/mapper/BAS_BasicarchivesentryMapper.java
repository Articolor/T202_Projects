package com.wl.mapper;

import com.wl.model.BAS_Basicarchivesentry;
import java.math.BigDecimal;

public interface BAS_BasicarchivesentryMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(BAS_Basicarchivesentry record);

    int insertSelective(BAS_Basicarchivesentry record);

    BAS_Basicarchivesentry selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BAS_Basicarchivesentry record);

    int updateByPrimaryKey(BAS_Basicarchivesentry record);
}
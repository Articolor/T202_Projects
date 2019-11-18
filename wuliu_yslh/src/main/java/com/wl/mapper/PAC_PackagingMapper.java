package com.wl.mapper;

import com.wl.model.PAC_Packaging;
import java.math.BigDecimal;

public interface PAC_PackagingMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(PAC_Packaging record);

    int insertSelective(PAC_Packaging record);

    PAC_Packaging selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(PAC_Packaging record);

    int updateByPrimaryKey(PAC_Packaging record);
}
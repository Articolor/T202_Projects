package com.wl.mapper;

import com.wl.model.PAC_Packaging;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface PAC_PackagingMapper {
    public List<PAC_Packaging> querypack(PAC_Packaging p);
    int deleteByPrimaryKey(BigDecimal id);

    int insert(PAC_Packaging record);

    int insertSelective(PAC_Packaging record);

    PAC_Packaging selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(PAC_Packaging record);

    int updateByPrimaryKey(PAC_Packaging record);
}
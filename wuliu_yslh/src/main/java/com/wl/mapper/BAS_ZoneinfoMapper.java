package com.wl.mapper;

import com.wl.model.BAS_Zoneinfo;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface BAS_ZoneinfoMapper {
    //管理定区
    List<BAS_Zoneinfo> findBAS_ZoneinfoAndSY_EmpAndSY_Units(Integer page,Integer rows);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(BAS_Zoneinfo record);

    int insertSelective(BAS_Zoneinfo record);

    BAS_Zoneinfo selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BAS_Zoneinfo record);

    int updateByPrimaryKey(BAS_Zoneinfo record);
}
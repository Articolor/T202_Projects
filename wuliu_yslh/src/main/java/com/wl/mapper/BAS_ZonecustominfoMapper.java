package com.wl.mapper;

import com.wl.model.BAS_Zonecustominfo;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface BAS_ZonecustominfoMapper {
    //查询单个客户信息
   List<BAS_Zonecustominfo> findBAS_ZonecustominfoANDBAS_ZONEINFO(Integer id);


    int deleteByPrimaryKey(BigDecimal customcode);

    int insert(BAS_Zonecustominfo record);

    int insertSelective(BAS_Zonecustominfo record);

    BAS_Zonecustominfo selectByPrimaryKey(BigDecimal customcode);

    int updateByPrimaryKeySelective(BAS_Zonecustominfo record);

    int updateByPrimaryKey(BAS_Zonecustominfo record);
}
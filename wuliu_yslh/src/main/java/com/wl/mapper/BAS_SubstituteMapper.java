package com.wl.mapper;

import com.wl.model.BAS_Substitute;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface BAS_SubstituteMapper {

    //取派员设置查询
    List<BAS_Substitute> findBAS_SubstituteAndSY_Units(Integer page,Integer rows);

    //取派员查询
    List<BAS_Substitute> findBAS_SubstituteAndSY_Unitsfenye(String empno,String empname,Integer mobileno,Integer type,BigDecimal pda,Integer page,Integer rows);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(BAS_Substitute record);

    int insertSelective(BAS_Substitute record);

    BAS_Substitute selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BAS_Substitute record);

    int updateByPrimaryKey(BAS_Substitute record);
}
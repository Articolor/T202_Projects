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
    List<BAS_Substitute> findBAS_SubstituteAndSY_Unitsfenye(String empno,String empname,Integer mobileno,Integer page,Integer rows);
    //删除取派员
    int deleteByPrimaryKey(BigDecimal id);
    //新增
    int insert(BAS_Substitute record);

    int insertSelective(BAS_Substitute record);

    BAS_Substitute selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BAS_Substitute record);
    //修改
    int updateByPrimaryKey(BAS_Substitute record);
}
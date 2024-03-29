package com.wl.mapper;

import com.wl.model.BAS_Area;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface BAS_AreaMapper {
    //查询区派
    List<BAS_Area> findBASAreaAndsy_units(Integer page, Integer rows);

    //高级区派
    List<BAS_Area> findBASAreaAndsy_unitsFenye(String province,String city,String county,Integer page, Integer rows);

    //总和
    int getcount();
    //删除
    int deleteByPrimaryKey(BigDecimal id);
    //新增区域
    int insert(BAS_Area record);

    int insertSelective(BAS_Area record);

    BAS_Area selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BAS_Area record);
    //修改区域
    int updateByPrimaryKey(BAS_Area record);
}
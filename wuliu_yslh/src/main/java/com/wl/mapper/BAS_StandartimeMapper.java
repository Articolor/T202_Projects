package com.wl.mapper;

import com.wl.model.BAS_Standartime;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface BAS_StandartimeMapper {
    //收派时间管理
    List<BAS_Standartime> findBAS_StandartimeAndSy_units(Integer page, Integer rows);
    //分页收派时间管理
    List<BAS_Standartime> findBAS_StandartimeAndSy_unitsfenye(String timename,String name,Integer page,Integer rows);

    //删除genjuid
    int deleteByPrimaryKey(BigDecimal id);
    //新增
    int insert(BAS_Standartime record);

    int insertSelective(BAS_Standartime record);

    BAS_Standartime selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BAS_Standartime record);

    int updateByPrimaryKey(BAS_Standartime record);
}
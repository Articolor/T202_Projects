package com.wl.mapper;

import com.wl.model.SY_Menus;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface SY_MenusMapper {

    //查询出所有 的菜单和角色
    List<SY_Menus> findAllMenuAndRole(SY_Menus menus);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SY_Menus record);

    int insertSelective(SY_Menus record);

    SY_Menus selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SY_Menus record);

    int updateByPrimaryKey(SY_Menus record);
}
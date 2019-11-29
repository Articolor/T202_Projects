package com.wl.service;

import com.wl.model.SY_Menus;

import java.math.BigDecimal;
import java.util.List;

public interface SY_MenusService {
    //查询出所 有的菜单和角色xx
    List<SY_Menus> findAllMenuAndRole(SY_Menus menus);

    //删除的方法xx
    void deleteByPrimaryKey(BigDecimal id);

    //新增xx
    void insert(SY_Menus record);
    //查询总行数
    Integer sumCount(SY_Menus menus);

    //修改
    void updateByPrimaryKeySelective(SY_Menus record);

    //查询出所有一级菜单   parentid==-1
    List<SY_Menus> findMenuParent();

    //查询出一级菜单下对应的二级菜单
    List<SY_Menus> findMenuChild(BigDecimal parentid);
}

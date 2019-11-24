package com.wl.mapper;

import com.wl.model.SY_Menus;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface SY_MenusMapper {

    //查询出所有 的菜单和角色
    List<SY_Menus> findAllMenuAndRole(SY_Menus menus);

    //删除的方法
    void deleteByPrimaryKey(BigDecimal id);

    //新增
    void insert(SY_Menus record);
    //查询总行数
    Integer sumCount(SY_Menus menus);

    //修改
    void updateByPrimaryKeySelective(SY_Menus record);

    //查询出所有一级菜单   parentid==-1
    List<SY_Menus> findMenuParent();

    //查询出一级菜单下对应的二级菜单
    List<SY_Menus> findMenuChild(BigDecimal parentid);

    int insertSelective(SY_Menus record);

    SY_Menus selectByPrimaryKey(BigDecimal id);



    int updateByPrimaryKey(SY_Menus record);
}
package com.wl.service;

import com.wl.model.SY_Menus;

import java.util.List;

public interface SY_MenusService {
    //查询出所 有的菜单和角色
    List<SY_Menus> findAllMenuAndRole(SY_Menus menus);
}

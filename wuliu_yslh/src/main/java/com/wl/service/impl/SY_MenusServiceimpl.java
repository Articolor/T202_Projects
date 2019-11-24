package com.wl.service.impl;

import com.wl.mapper.SY_MenusMapper;
import com.wl.model.SY_Menus;
import com.wl.service.SY_MenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class SY_MenusServiceimpl implements SY_MenusService {
    @Autowired
    private SY_MenusMapper menusMapper;
    //查询全部的菜单和角色xx
    @Override
    public List<SY_Menus> findAllMenuAndRole(SY_Menus menus) {
        return menusMapper.findAllMenuAndRole(menus);
    }

    @Override
    public void deleteByPrimaryKey(BigDecimal id) {
        menusMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insert(SY_Menus record) {
        menusMapper.insert(record);
    }

    @Override
    public Integer sumCount(SY_Menus menus) {
        return menusMapper.sumCount(menus);
    }

    @Override
    public void updateByPrimaryKeySelective(SY_Menus record) {
        menusMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<SY_Menus> findMenuParent() {
        return menusMapper.findMenuParent();
    }

    @Override
    public List<SY_Menus> findMenuChild(BigDecimal parentid) {
        return menusMapper.findMenuChild(parentid);
    }
}

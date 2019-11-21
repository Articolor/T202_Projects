package com.wl.service.impl;

import com.wl.mapper.SY_MenusMapper;
import com.wl.model.SY_Menus;
import com.wl.service.SY_MenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SY_MenusServiceimpl implements SY_MenusService {
    @Autowired
    private SY_MenusMapper menusMapper;
    @Override
    public List<SY_Menus> findAllMenuAndRole(SY_Menus menus) {
        return menusMapper.findAllMenuAndRole(menus);
    }
}

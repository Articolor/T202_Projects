package com.wl.service.impl;

import com.wl.mapper.BAS_ZonecustominfoMapper;
import com.wl.model.BAS_Zonecustominfo;
import com.wl.service.BAS_ZonecustominfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BAS_ZonecustominfoServiceImpl implements BAS_ZonecustominfoService {
    @Autowired
    private BAS_ZonecustominfoMapper bas_zonecustominfoMapper;


    @Override
    public List<BAS_Zonecustominfo> findBAS_ZonecustominfoANDBAS_ZONEINFO(Integer id) {
        return bas_zonecustominfoMapper.findBAS_ZonecustominfoANDBAS_ZONEINFO(id);
    }
}

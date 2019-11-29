package com.wl.service.impl;

import com.wl.mapper.DIS_PropagandataskMapper;
import com.wl.model.DIS_Propagandatask;
import com.wl.service.DIS_PropagandataskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DIS_PropagandataskServiceimpl implements DIS_PropagandataskService {
    @Autowired
    private DIS_PropagandataskMapper propagandataskMapper;

    @Override
    public List<DIS_Propagandatask> findAllProTask(DIS_Propagandatask p) {
        return propagandataskMapper.findAllProTask(p);
    }

    @Override
    public Integer findsumCount(DIS_Propagandatask p) {
        return propagandataskMapper.findsumCount(p);
    }

    @Override
    public void insert(DIS_Propagandatask record) {
        propagandataskMapper.insert(record);
    }

    @Override
    public void updateByPrimaryKeySelective(DIS_Propagandatask record) {
        propagandataskMapper.updateByPrimaryKeySelective(record);
    }
}

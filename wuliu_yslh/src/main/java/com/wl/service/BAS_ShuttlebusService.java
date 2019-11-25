package com.wl.service;

import com.wl.model.BAS_Shuttlebus;

import java.util.List;

public interface BAS_ShuttlebusService {
    //班车设置查询
    List<BAS_Shuttlebus> findBUSANDEMPANDUNITS(Integer page, int rows);
    //班车分页高级查询
    List<BAS_Shuttlebus> findBUSANDEMPANDUNITSfenye(Integer lineid, Integer linetype, String licenseplateint, String driver, String carrier, Integer page, int rows);
    //班车总行数查询
    int GetBUSCOUNT();
}

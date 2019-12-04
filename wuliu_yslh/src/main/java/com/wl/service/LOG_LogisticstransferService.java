package com.wl.service;

import com.wl.model.LOG_Logisticstransfer;

import java.util.List;

public interface LOG_LogisticstransferService {
    //交接单物流查询
    List<LOG_Logisticstransfer> selectfindtransfer(String transferint, String driver, Integer page, Integer rows);

}

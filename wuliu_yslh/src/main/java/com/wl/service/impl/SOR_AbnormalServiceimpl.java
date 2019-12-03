package com.wl.service.impl;

import com.wl.mapper.SOR_AbnormalMapper;
import com.wl.model.SOR_Abnormal;
import com.wl.service.SOR_AbnormalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SOR_AbnormalServiceimpl implements SOR_AbnormalService {

    @Autowired
    private SOR_AbnormalMapper abnormalMapper;

    @Override
    public int insert(SOR_Abnormal record) {
        return abnormalMapper.insert(record);
    }
}

package com.wl.service.impl;

import com.wl.mapper.SOR_AbnormalMapper;
import com.wl.model.SOR_Abnormal;
import com.wl.service.SOR_AbnormalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SOR_AbnormalServiceimpl implements SOR_AbnormalService {

    @Autowired
    private SOR_AbnormalMapper abnormalMapper;

    @Override
    public int insert(SOR_Abnormal record) {
        return abnormalMapper.insert(record);
    }

    @Override
    public List<SOR_Abnormal> findAbnormals(SOR_Abnormal a, int page, int rows) {
        return abnormalMapper.findAbnormals(a, page, rows);
    }

    @Override
    public Integer findAbnormalCount(SOR_Abnormal a) {
        return abnormalMapper.findAbnormalCount(a);
    }
}

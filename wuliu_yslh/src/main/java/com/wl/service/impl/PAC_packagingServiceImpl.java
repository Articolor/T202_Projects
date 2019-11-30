package com.wl.service.impl;

import com.wl.mapper.PAC_PackagingMapper;
import com.wl.model.PAC_Packaging;
import com.wl.service.PAC_packagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PAC_packagingServiceImpl implements PAC_packagingService {
    @Autowired
    private PAC_PackagingMapper packagingMapper;
    @Override
    public List<PAC_Packaging> selectPacking(PAC_Packaging p, int page, int rows) {
        return packagingMapper.selectPacking(p,page,rows);
    }

    @Override
    public Integer selectPackingCount(PAC_Packaging p) {
        return packagingMapper.selectPackingCount(p);
    }

    @Override
    public int updateByPrimaryKeySelective(PAC_Packaging record) {
        return packagingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int insertSelective(PAC_Packaging record) {
        return packagingMapper.insertSelective(record);
    }
}

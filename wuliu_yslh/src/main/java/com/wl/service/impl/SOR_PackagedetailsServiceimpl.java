package com.wl.service.impl;

import com.wl.mapper.SOR_PackagedetailsMapper;
import com.wl.model.SOR_Packagedetails;
import com.wl.service.SOR_PackagedetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SOR_PackagedetailsServiceimpl implements SOR_PackagedetailsService {
    @Autowired
    private SOR_PackagedetailsMapper packagedetailsMapper;

    @Override
    public int insert(SOR_Packagedetails record) {
        return packagedetailsMapper.insert(record);
    }
}

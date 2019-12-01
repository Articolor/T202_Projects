package com.wl.service.impl;

import com.wl.mapper.PAC_PackagingMapper;
import com.wl.model.PAC_Packaging;
import com.wl.service.PAC_PackagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PAC_PackagingServiceImpl implements PAC_PackagingService {
    @Autowired
    private PAC_PackagingMapper mapper;
    @Override

    public List<PAC_Packaging> querypack(PAC_Packaging p) {
        return mapper.querypack(p);
    }

    @Override
    public int getcountlq(PAC_Packaging p) {
        return mapper.getcountlq(p);
    }
}

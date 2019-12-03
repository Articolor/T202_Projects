package com.wl.service.impl;

import com.wl.mapper.SOR_PackageMapper;
import com.wl.service.SOR_PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SOR_PackageServiceImpl implements SOR_PackageService {
    @Autowired
    private SOR_PackageMapper packageMapper;
}

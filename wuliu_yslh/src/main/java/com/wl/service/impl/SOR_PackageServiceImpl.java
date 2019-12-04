package com.wl.service.impl;

import com.wl.mapper.SOR_PackageMapper;
import com.wl.model.SOR_Package;
import com.wl.service.SOR_PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SOR_PackageServiceImpl implements SOR_PackageService {
    @Autowired
    private SOR_PackageMapper packageMapper;

    @Override
    public List<SOR_Package> findSORPackage(SOR_Package s, int page, int rows) {
        return packageMapper.findSORPackage(s, page, rows);
    }

    @Override
    public Integer findSORPackageCount(SOR_Package s) {
        return packageMapper.findSORPackageCount(s);
    }

    @Override
    public int insert(SOR_Package record) {
        return packageMapper.insert(record);
    }

    @Override
    public List<SOR_Package> findNewDate() {
        return packageMapper.findNewDate();
    }

    @Override
    public List<SOR_Package> findAllPackYWY(SOR_Package p) {
        return packageMapper.findAllPackYWY(p);
    }

    @Override
    public int updateByPrimaryKeySelective(SOR_Package record) {
        return packageMapper.updateByPrimaryKeySelective(record);
    }
}

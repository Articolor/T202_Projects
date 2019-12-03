package com.wl.service.impl;

import com.wl.mapper.SOR_StorageMapper;
import com.wl.model.SOR_Storage;
import com.wl.service.SOR_StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SOR_StorageServiceImpl implements SOR_StorageService {
    @Autowired
    private SOR_StorageMapper storageMapper;

    @Override
    public List<SOR_Storage> findAllStrYWY(SOR_Storage str) {
        return storageMapper.findAllStrYWY(str);
    }

    @Override
    public Integer sumcount(SOR_Storage str) {
        return storageMapper.sumcount(str);
    }

    @Override
    public int insert(SOR_Storage record) {
        return storageMapper.insert(record);
    }

    @Override
    public List<SOR_Storage> findTimeNew() {
        return storageMapper.findTimeNew();
    }
}

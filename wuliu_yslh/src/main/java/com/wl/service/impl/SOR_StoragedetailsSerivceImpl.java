package com.wl.service.impl;

import com.wl.mapper.SOR_StoragedetailsMapper;
import com.wl.model.SOR_Storage;
import com.wl.model.SOR_Storagedetails;
import com.wl.service.SOR_StoragedetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SOR_StoragedetailsSerivceImpl implements SOR_StoragedetailsService {

    @Autowired
    private SOR_StoragedetailsMapper storagedetailsMapper;

    @Override
    public List<SOR_Storagedetails> fingByIdDateils(SOR_Storage s) {
        return storagedetailsMapper.fingByIdDateils(s);
    }

    @Override
    public int insert(SOR_Storagedetails record) {
        return storagedetailsMapper.insert(record);
    }
}

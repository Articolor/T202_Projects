package com.wl.service.impl;

import com.wl.mapper.ACC_WorksheetMapper;
import com.wl.model.ACC_Worksheet;
import com.wl.service.ACC_WorksheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ACC_WorksheetServiceimpl implements ACC_WorksheetService {

    @Autowired
    private ACC_WorksheetMapper worksheetMapper;

    @Override
    public void insertWSheet(ACC_Worksheet record) {
        worksheetMapper.insertWSheet(record);
    }
}

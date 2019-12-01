package com.wl.service.impl;

import com.wl.mapper.RET_ReturnlistMapper;
import com.wl.model.RET_Returnlist;
import com.wl.service.Ret_YpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ret_YpsServiceImpl implements Ret_YpsService {
    @Autowired
    private RET_ReturnlistMapper ret;
    @Override
    public List<RET_Returnlist> selectResult(RET_Returnlist r, int page, int rows) {
        return ret.selectResult(r,page,rows);
    }

    @Override
    public int updateByPrimaryKeySelective(RET_Returnlist record) {
        return ret.updateByPrimaryKeySelective(record);
    }

    @Override
    public int insert(RET_Returnlist record) {
        return ret.insert(record);
    }

    @Override
    public Integer selectCount(RET_Returnlist r) {
        return ret.selectCount(r);
    }

    @Override
    public List<RET_Returnlist> selectRetWork(RET_Returnlist r, int page, int rows) {
        return ret.selectRetWork(r,page,rows);
    }

    @Override
    public Integer selectRetWorkCount(RET_Returnlist r) {
        return ret.selectRetWorkCount(r);
    }
}

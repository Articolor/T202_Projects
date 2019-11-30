package com.wl.service;

import com.wl.mapper.RET_ReturnlistMapper;
import com.wl.model.RET_Returnlist;

import java.util.List;

public interface Ret_YpsService {
    //返货查询+模糊查+分页（一体）
    public List<RET_Returnlist> selectResult(RET_Returnlist r, int page, int rows);

    //修改返货单
    public int updateByPrimaryKeySelective(RET_Returnlist record);

    //新增
    public int insert(RET_Returnlist record);

    //查询总行数
    public Integer selectCount(RET_Returnlist r);

    //返货申请确认+模糊查询分页一体
    public List<RET_Returnlist> selectRetWork(RET_Returnlist r,int page,int rows);

    //查询总行数
    public Integer selectRetWorkCount(RET_Returnlist r);
}

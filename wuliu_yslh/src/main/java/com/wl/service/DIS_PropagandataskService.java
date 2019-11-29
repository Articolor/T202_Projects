package com.wl.service;

import com.wl.model.DIS_Propagandatask;

import java.util.List;

public interface DIS_PropagandataskService {
    //查询全部的宣传任务----分页，高级查询
    List<DIS_Propagandatask> findAllProTask(DIS_Propagandatask p);

    //查询总行数
    Integer findsumCount(DIS_Propagandatask p);

    //新增宣传任务
    void insert(DIS_Propagandatask record);


    //修改宣传任务
    void updateByPrimaryKeySelective(DIS_Propagandatask record);
}

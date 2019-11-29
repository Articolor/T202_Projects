package com.wl.mapper;

import com.wl.model.DIS_Propagandatask;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface DIS_PropagandataskMapper {
    //查询全部的宣传任务----分页，高级查询
    List<DIS_Propagandatask> findAllProTask(DIS_Propagandatask p);

    //查询总行数
    Integer findsumCount(DIS_Propagandatask p);

    void deleteByPrimaryKey(BigDecimal id);

    //新增宣传任务
    void insert(DIS_Propagandatask record);

    int insertSelective(DIS_Propagandatask record);

    DIS_Propagandatask selectByPrimaryKey(BigDecimal id);

    //修改宣传任务
    void updateByPrimaryKeySelective(DIS_Propagandatask record);

    int updateByPrimaryKey(DIS_Propagandatask record);
}
package com.wl.mapper;

import com.wl.model.SOR_Storage;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface SOR_StorageMapper {
    //查询所有的入库信息-----无关系---分页叫模糊查询
    List<SOR_Storage> findAllStrYWY(SOR_Storage str);

    //查询所有的入库信息-----总行数
    Integer sumcount(SOR_Storage str);

    int deleteByPrimaryKey(BigDecimal id);

    //根据时间查询出最新对象
    List<SOR_Storage> findTimeNew();

    //新增入库表
    int insert(SOR_Storage record);

    int insertSelective(SOR_Storage record);

    SOR_Storage selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(SOR_Storage record);

    int updateByPrimaryKey(SOR_Storage record);
}
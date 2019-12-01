package com.wl.mapper;

import com.wl.model.RET_Returnlist;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface RET_ReturnlistMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(RET_Returnlist record);

    int insertSelective(RET_Returnlist record);

    RET_Returnlist selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(RET_Returnlist record);

    int updateByPrimaryKey(RET_Returnlist record);

    List<RET_Returnlist> selectResult(RET_Returnlist r, int page, int rows);

    Integer selectCount(RET_Returnlist r);

    List<RET_Returnlist> selectRetWork(RET_Returnlist r,int page, int rows);

    Integer selectRetWorkCount(RET_Returnlist r);
}
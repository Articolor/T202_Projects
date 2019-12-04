package com.wl.mapper;

import com.wl.model.LOG_Track;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface LOG_TrackMapper {
    //查询跟踪记录
    List<LOG_Track> findalltracck(String linename, String logisticscar, Integer page, Integer rows);
    //删除记录
    int deleteByPrimaryKey(BigDecimal id);

    int insert(LOG_Track record);

    int insertSelective(LOG_Track record);

    LOG_Track selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(LOG_Track record);

    int updateByPrimaryKey(LOG_Track record);
}
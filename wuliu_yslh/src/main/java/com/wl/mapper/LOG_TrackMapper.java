package com.wl.mapper;

import com.wl.model.LOG_Track;
import java.math.BigDecimal;

public interface LOG_TrackMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(LOG_Track record);

    int insertSelective(LOG_Track record);

    LOG_Track selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(LOG_Track record);

    int updateByPrimaryKey(LOG_Track record);
}
package com.wl.mapper;

import com.wl.model.IAE_Extract;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IAE_ExtractMapper {
    public List<IAE_Extract> queryextract(IAE_Extract e);
    public int querycount(IAE_Extract e);
    int deleteByPrimaryKey(String id);

    public int insert(IAE_Extract record);

    int insertSelective(IAE_Extract record);

    IAE_Extract selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IAE_Extract record);

    int updateByPrimaryKey(IAE_Extract record);
}
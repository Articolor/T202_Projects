package com.wl.mapper;

import com.wl.model.IAE_Arrival;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IAE_ArrivalMapper {
    public List<IAE_Arrival> queryarrival(IAE_Arrival a);
    public int getcount(IAE_Arrival a);
    int deleteByPrimaryKey(String id);

    int insert(IAE_Arrival record);

    int insertSelective(IAE_Arrival record);

    IAE_Arrival selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IAE_Arrival record);

    int updateByPrimaryKey(IAE_Arrival record);
}
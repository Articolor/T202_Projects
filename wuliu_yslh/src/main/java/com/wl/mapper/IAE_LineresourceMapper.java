package com.wl.mapper;

import com.wl.model.IAE_Lineresource;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IAE_LineresourceMapper {
    public List<IAE_Lineresource> queryline(IAE_Lineresource l);
    public int getcount(IAE_Lineresource l);
    int deleteByPrimaryKey(String id);

    int insert(IAE_Lineresource record);

    int insertSelective(IAE_Lineresource record);

    IAE_Lineresource selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IAE_Lineresource record);

    int updateByPrimaryKey(IAE_Lineresource record);
}
package com.wl.mapper;

import com.wl.model.IAE_Timeinput;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface IAE_TimeinputMapper {
    public List<IAE_Timeinput> queryinput(IAE_Timeinput i);
    public int querycount(IAE_Timeinput i);
    int deleteByPrimaryKey(BigDecimal id);

    int insert(IAE_Timeinput record);

    int insertSelective(IAE_Timeinput record);

    IAE_Timeinput selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(IAE_Timeinput record);

    int updateByPrimaryKey(IAE_Timeinput record);
}
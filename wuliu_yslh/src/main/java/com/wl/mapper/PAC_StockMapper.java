package com.wl.mapper;

import com.wl.model.PAC_Stock;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface PAC_StockMapper {
    public List<PAC_Stock> selectAll(PAC_Stock o);
    public List<PAC_Stock> mhselect(PAC_Stock o);
    public void insert(PAC_Stock p);
    public PAC_Stock selectbyid(PAC_Stock p);
    int deleteByPrimaryKey(BigDecimal id);
    public int querycount(Object o);


    int insertSelective(PAC_Stock record);

    PAC_Stock selectByPrimaryKey(BigDecimal id);

    public int updatepacsk(PAC_Stock record);

    int updateByPrimaryKey(PAC_Stock record);
}
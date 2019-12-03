package com.wl.mapper;

import com.wl.model.PAC_Stockitem;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface PAC_StockitemMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(PAC_Stockitem record);

    int insertSelective(PAC_Stockitem record);

    //PAC_Stockitem selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PAC_Stockitem record);

    int updateByPrimaryKey(PAC_Stockitem record);



    List<PAC_Stockitem> selectByPrimaryKey(String warehouseno);



    List<PAC_Stockitem> selectStock(PAC_Stockitem p,int page,int rows,String symbol,String symbol2);

    Integer selectStockCount(PAC_Stockitem p,String symbol,String symbol2);
}
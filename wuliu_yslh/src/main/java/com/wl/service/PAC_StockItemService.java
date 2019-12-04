package com.wl.service;

import com.wl.model.PAC_Stockitem;

import java.util.List;

public interface PAC_StockItemService {
    List<PAC_Stockitem> selectByPrimaryKey(String warehouseno);

    int updateByPrimaryKey(PAC_Stockitem record);

    int insert(PAC_Stockitem record);

    List<PAC_Stockitem> selectStock(PAC_Stockitem p, int page, int rows, String symbol, String symbol2);

    Integer selectStockCount(PAC_Stockitem p, String symbol, String symbol2);
}
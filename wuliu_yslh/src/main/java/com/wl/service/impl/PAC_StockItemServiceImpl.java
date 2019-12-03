package com.wl.service.impl;

import com.wl.mapper.PAC_StockitemMapper;
import com.wl.model.PAC_Stock;
import com.wl.model.PAC_Stockitem;
import com.wl.service.PAC_StockItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PAC_StockItemServiceImpl implements PAC_StockItemService {
    @Autowired
    private PAC_StockitemMapper mapper;

    @Override
    public List<PAC_Stockitem> selectByPrimaryKey(String warehouseno) {
        return mapper.selectByPrimaryKey(warehouseno);
    }

    @Override
    public int updateByPrimaryKey(PAC_Stockitem record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public int insert(PAC_Stockitem record) {
        return mapper.insert(record);
    }

    @Override
    public List<PAC_Stockitem> selectStock(PAC_Stockitem p, int page, int rows, String symbol, String symbol2) {
        return mapper.selectStock(p,page,rows,symbol,symbol2);
    }

    @Override
    public Integer selectStockCount(PAC_Stockitem p,String symbol,String symbol2) {
        return mapper.selectStockCount(p,symbol,symbol2);
    }
}

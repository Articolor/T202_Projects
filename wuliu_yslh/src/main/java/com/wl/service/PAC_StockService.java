package com.wl.service;

import com.wl.model.PAC_Stock;

import java.util.List;

public interface PAC_StockService {
    public List<PAC_Stock> selectAll(PAC_Stock o);
    public List<PAC_Stock> mhselect(PAC_Stock o);
    public void insert(PAC_Stock p);
    public PAC_Stock selectbyid(PAC_Stock p);
    public int updatepacsk(PAC_Stock record);
    public int querycount(Object o);

    public List<PAC_Stock> findStockManage(PAC_Stock p,int page,int rows);

    public Integer findStockManageCount(PAC_Stock p);

    public   int insertStock(PAC_Stock p);
}

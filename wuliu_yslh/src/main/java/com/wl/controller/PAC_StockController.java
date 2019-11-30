package com.wl.controller;

import com.wl.model.PAC_Stock;
import com.wl.service.PAC_StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PAC_StockController {
    @Autowired
    private PAC_StockService service;
    @RequestMapping("select")
    public Map<String,Object> select(PAC_Stock p){
        Integer page = p.getPage();
        Integer rows = p.getRows();
        p.setPage((page-1)*rows+1);
        p.setRows(page*rows);
        List<PAC_Stock> list = service.selectAll(p);
        int querycount = service.querycount(p);
        Map<String,Object> map=new HashMap<>();
        map.put("list",list);
        map.put("count",querycount);
        map.put("stock",p);
        for (PAC_Stock stock : list) {
            System.out.println(stock.getDrawername());
        }
        return map;
    }
    @RequestMapping("mhselect")
    public Map<String,Object> mhselect(PAC_Stock p){

        List<PAC_Stock> list = service.mhselect(p);
        int i = service.querycount(p);
        Map<String,Object> map=new HashMap<>();
        map.put("list",list);
        map.put("count",i);
        for (PAC_Stock stock : list) {
            System.out.println(stock.getDrawername());
        }
        return map;
    }
    @RequestMapping("addpacsk")
    public void addpacsk(PAC_Stock p){
        System.out.println("成功");
        System.out.println(p);
        service.insert(p);
    }
    @RequestMapping("selectbyid")
    public PAC_Stock selectbyid(PAC_Stock p){
        PAC_Stock pacStock = service.selectbyid(p);
        return pacStock;
    }
    @RequestMapping("updatepacsk")
    public int updatepacsk(PAC_Stock p){

        int updatepacsk = service.updatepacsk(p);
        System.out.println(p);
        return updatepacsk;
    }
}

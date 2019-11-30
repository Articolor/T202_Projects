package com.wl.controller;

import com.wl.model.BIGLOG_Logisticscontroltable;
import com.wl.service.LQLogisticsControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LQLogisticsControlController {
    @Autowired
    private LQLogisticsControlService service;
    @RequestMapping("selectAll")
    public Map<String,Object> selectAll(BIGLOG_Logisticscontroltable b){
        Integer page=b.getPage();
        Integer rows=b.getRows();
        b.setPage((page-1)*rows+1);
        b.setRows(page*rows);
        List<BIGLOG_Logisticscontroltable> list = service.selectAll(b);
        for (BIGLOG_Logisticscontroltable i : list) {
            System.out.println(i.getSy_emp().getEmpname());
        }
        int i = service.querycount(b);
        Map<String,Object> map=new HashMap<>();
        map.put("list",list);
        map.put("count",i);
        map.put("big",b);
        return map;
    }
    @RequestMapping("addLCT")
    public int addLCT(BIGLOG_Logisticscontroltable logisticscontroltable){
        System.out.println(logisticscontroltable);
        int i = service.insert(logisticscontroltable);
        return i;
    }
    @RequestMapping("querybyid")
    public BIGLOG_Logisticscontroltable querybyid(int id){
         id=3;
        return service.selectById(id);
    }
    @RequestMapping("updateLCT")
    public int updateLCT(BIGLOG_Logisticscontroltable b){
        //zj
        int i = service.update(b);
        System.out.println(b);
        System.out.println(i);
        return i;
    }
    @RequestMapping("delLCT")
    public int delLCT(BIGLOG_Logisticscontroltable i){
        int a = service.delete(i);
        return a;
    }

}

package com.wl.controller;

import com.wl.model.IAE_Extract;
import com.wl.service.IAE_ExtractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IAE_ExtractController {
    @Autowired
    private IAE_ExtractService service;
    @RequestMapping("queryextract")
    public Map<String,Object> queryextract(IAE_Extract e){
        int page=e.getPage();
        int rows=e.getRows();
        e.setPage((page-1)*rows+1);
        e.setRows(page*rows);
        List<IAE_Extract> list = service.queryextract(e);
        int i = service.querycount(e);
        Map<String,Object> map=new HashMap<>();
        map.put("list",list);
        map.put("count",i);
        map.put("e",e);
        return map;
    }
    @RequestMapping("addextract")
    public int addextract(IAE_Extract e){
        int i = service.insert(e);
        System.out.println(i);
        return i;
    }
}

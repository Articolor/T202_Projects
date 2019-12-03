package com.wl.controller;

import com.wl.model.IAE_Arrival;
import com.wl.service.IAE_ArrivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IAE_ArrivalController {
    @Autowired
    private IAE_ArrivalService service;
    @RequestMapping("queryarrival")
    public Map<String,Object> queryarrival(IAE_Arrival a){
        int page=a.getPage();
        int rows=a.getRows();
        a.setPage((page-1)*rows+1);
        a.setRows(page*rows);
        List<IAE_Arrival> list = service.queryarrival(a);
        int i = service.getcount(a);
        Map<String,Object> map=new HashMap<>();
        map.put("list",list);
        map.put("count",i);
        map.put("a",a);
        return map;
    }
}

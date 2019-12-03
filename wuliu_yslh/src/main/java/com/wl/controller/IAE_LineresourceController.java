package com.wl.controller;

import com.wl.model.IAE_Lineresource;
import com.wl.service.IAE_LineresourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IAE_LineresourceController {
    @Autowired
    private IAE_LineresourceService service;
    @RequestMapping("queryline")
    public Map<String,Object> queryline(IAE_Lineresource l){
        int page=l.getPage();
        int rows=l.getRows();
        l.setPage((page-1)*rows+1);
        l.setRows(page*rows);
        List<IAE_Lineresource> list = service.queryline(l);
        int i = service.getcount(l);
        Map<String,Object> map=new HashMap<>();
        map.put("list",list);
        map.put("count",i);
        map.put("l",l);
        return map;
    }
}

package com.wl.controller;

import com.wl.model.PAC_Packaging;
import com.wl.service.PAC_packagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LQPAC_PackagingController {
    @Autowired
    private PAC_packagingService service;
    @RequestMapping("querypack")
    public Map<String,Object> querypack(PAC_Packaging p){
        int page=p.getPage();
        int rows=p.getRows();
        p.setPage((page-1)*rows+1);
        p.setRows(page*rows);
        Map<String,Object> map=new HashMap<>();
        List<PAC_Packaging> list=service.querypack(p);
        int count =service.getcountlq(p);
        map.put("list",list);
        map.put("count",count);
        for (PAC_Packaging pi : list) {
            System.out.println(pi.getEmp().getEmpname());
        }
        return map;
    }
}

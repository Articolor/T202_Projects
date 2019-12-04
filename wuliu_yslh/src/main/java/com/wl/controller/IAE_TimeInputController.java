package com.wl.controller;

import com.wl.model.IAE_Timeinput;
import com.wl.model.PAC_Packaging;
import com.wl.service.IAE_TimeInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IAE_TimeInputController {
    @Autowired
    private IAE_TimeInputService service;
    @RequestMapping("queryinput")
    public Map<String,Object> queryinput(IAE_Timeinput i){
        System.out.println("qqqqqqqqqqqqqqqqq");
        int page=i.getPage();
        int rows=i.getRows();
        i.setPage((page-1)*rows+1);
        i.setRows(page*rows);
        Map<String,Object> map=new HashMap<>();
        List<IAE_Timeinput> list=service.queryinput(i);
        int count =service.querycount(i);
        for (IAE_Timeinput l : list) {
            System.out.println(l.getEmp().getEmpname());
        }
        map.put("list",list);
        map.put("count",count);
        map.put("i",i);
        return map;
    }
}

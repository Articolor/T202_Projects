package com.wl.controller;

import com.wl.model.ACC_Businessadmissibility;
import com.wl.model.ACC_Workorder;
import com.wl.model.ACC_Worksheet;
import com.wl.service.ACC_BusinessadmissibilityService;
import com.wl.service.ACC_WorkorderService;
import com.wl.service.ACC_WorksheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ACC_AllWorkYContorller {
    //受理
    @Autowired
    private ACC_BusinessadmissibilityService businessadmissibilityService;
    @Autowired
    private ACC_WorkorderService workorderService;
    @Autowired
    private ACC_WorksheetService worksheetService;


    //查询全部的受理信息----业务受理
    @RequestMapping("findAllBusinBility")
    public Map<String,Object> findAllBusinBility(ACC_Businessadmissibility b){
        Map<String,Object> map=new HashMap<>();
        Integer page = b.getPage();
        Integer rows = b.getRows();
        b.setPage((page-1)*rows+1);
        b.setRows(page*rows);
        List<ACC_Businessadmissibility> list = businessadmissibilityService.findAllBusinessM(b);
        map.put("buss",list);
        map.put("sums",businessadmissibilityService.sumCount(b));
        map.put("bus",b);
        return map;
    }

    //新增受理表---业务受理
    @RequestMapping("insertBusinessYWY")
    public String insertBusinessYWY(ACC_Businessadmissibility b, ACC_Workorder w){
        //新增受理的同时要新增工单表
        businessadmissibilityService.insertBusin(b);//新增受理表
        //新增工单表
        w.setJobtype(new BigDecimal(1));//默认是新
        w.setPickupstatus(new BigDecimal(1));//默认新单
        w.setAftersinglenum(new BigDecimal(0));//默认是0次
        workorderService.insertOrder(w);
        return "ok";
    }

    //根据受理表的业务通知单号修改工单表的工单类型  ----业务受理
    @RequestMapping("updateWOrderYWY")
    public String updateWOrderYWY(ACC_Workorder o){
        workorderService.updateJobTypeById(o);
        return "ok";
    }



    //新增工单表的--------工作单快速入录
    @RequestMapping("insertWSheetYWY")
    public String insertWSheetYWY(ACC_Worksheet sheet){
        worksheetService.insertWSheet(sheet);
        return "ok";
    }

    @RequestMapping("findWOrderAndUnityYWY")
    public Map<String,Object> findWOrderAndUnityYWY(ACC_Workorder o){
        Map<String,Object> map=new HashMap<>();
        Integer rows = o.getRows();
        Integer page = o.getPage();
        o.setPage((page-1)*rows+1);
        o.setRows(page*rows);
        //查询全部的工作单表
        List<ACC_Workorder> list = workorderService.findAllWorderAndBility(o);
        for (ACC_Workorder acc_workorder : list) {
            finddd(acc_workorder.getBusinessnoticeno(),acc_workorder);
        }
        //查询工作单号对应的受理表数据
        map.put("works",list);
        map.put("work",o);
        map.put("sums",workorderService.sumCount(o));
        return map;
    }

    //根据业务通知单号查询出受理对象
    public void finddd(String id,ACC_Workorder w){
        ACC_Businessadmissibility b1 = businessadmissibilityService.findBilityAndUnityAndEmp(id);
       w.setBusinessadmissibility(b1);
    }
}



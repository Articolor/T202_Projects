package com.wl.controller;

import com.wl.model.*;
import com.wl.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SOR_AllYController {

    @Autowired
    private SOR_StorageService storageService;
    @Autowired
    private SY_EmpService empService;
    @Autowired
    private SY_UnitsService unitsService;
    @Autowired
    private SOR_StoragedetailsService storagedetailsService;
    @Autowired
    private SOR_OutboundService outboundService;
    @Autowired
    private SOR_AbnormalService abnormalService;

    //分拣管理----入库----入库查询
    @RequestMapping("findAllSorageYWY")
    public Map<String,Object> findAllSorageYWY(SOR_Storage s){
        Map<String,Object> map=new HashMap<>();
        Integer page = s.getPage();
        Integer rows = s.getRows();
        s.setPage((page-1)*rows+1);
        s.setRows(page*rows);
        List<SOR_Storage> list = storageService.findAllStrYWY(s);
        map.put("stors",list);
        map.put("str",s);
        map.put("sums",storageService.sumcount(s));
        map.put("emps",empService.findemono());//查询全部的用户名
        map.put("units",unitsService.findAllUnits());//查询全部的单位
        map.put("outs",outboundService.findAllByOut(new SOR_Outbound()));
        return map;
    }



    //分拣管理---入库--查看明细
    @RequestMapping("findByIDStorageYWY")
    public Map<String,Object> findByIDStorageYWY(SOR_Storage s){
        //根据入库交接单号查询出对应的入库详情详细
        Map<String,Object> map=new HashMap<>();
        List<SOR_Storagedetails> list = storagedetailsService.fingByIdDateils(s);
        map.put("strs",list);
        return map;
    }


    //分拣管理--入库------新增入库
    @RequestMapping("insertStor1YWY")
    public String insertStorAnPageYWY(SOR_Storage s){
        System.out.println(s);
        //新增入库表
        int i = storageService.insert(s);
        System.out.println(i);
        return "ok";
    }

    //新增对应的入库详情表
    @RequestMapping("insertStor2YWY")
    public String insertStor2YWY(SOR_Storagedetails d){
        //查询出刚刚新增的入库表
        List<SOR_Storage> timeNew = storageService.findTimeNew();
        SOR_Storage news = timeNew.get(0);
        System.out.println(news);
        d.setId(news.getId());
        //新增入库详细表
        int insert = storagedetailsService.insert(d);
        System.out.println(insert);
        return "ok";
    }


    //分拣管理----入库----新增异常记录
    @RequestMapping("insertYCYWY")
    public String insertYCYWY(SOR_Abnormal a){
        //新增异常记录
        System.out.println(a);
        int i = abnormalService.insert(a);
        System.out.println(i);
        return "ok";
    }

    //分拣管理---入库----根据入库表id查询出入库详情表中的和包号和单号
    @RequestMapping("findByIdAndHeYWY")
    public Map<String,Object> findByIdAndHeYWY(SOR_Storage s){
        Map<String,Object> map=new HashMap<>();
        List<SOR_Storagedetails> list = storagedetailsService.fingByIdDateils(s);
        map.put("stor",list.get(0));
        return map;
    }
}

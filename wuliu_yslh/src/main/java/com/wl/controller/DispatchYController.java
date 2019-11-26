package com.wl.controller;

import com.wl.model.ACC_Workorder;
import com.wl.model.DIS_Propagandatask;
import com.wl.service.ACC_BusinessadmissibilityService;
import com.wl.service.ACC_WorkorderService;
import com.wl.service.DIS_PropagandataskService;
import com.wl.service.SY_EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DispatchYController {
    //调度的控制类
    @Autowired
    private DIS_PropagandataskService propagandataskService;
    @Autowired
    private ACC_WorkorderService workorderService;
    @Autowired
    private ACC_BusinessadmissibilityService businessadmissibilityService;
    @Autowired
    private SY_EmpService empService;

    //查询全部的宣传任务-----调度
    @RequestMapping("findAllProTaskYWY")
    public Map<String,Object> findAllProTaskYWY(DIS_Propagandatask p){
        Map<String,Object> map=new HashMap<>();
        //查询出宣传对象
        List<DIS_Propagandatask> list = propagandataskService.findAllProTask(p);
        Integer page = p.getPage();
        Integer rows = p.getRows();
        p.setPage((page-1)*rows+1);
        p.setRows(rows*page);
        map.put("tasks",list);
        map.put("sums",propagandataskService.findsumCount(p));
        map.put("pro",p);
        return map;
    }

    //新增宣传任务-----调度
    @RequestMapping("insertProTaskYWY")
    public String insertProTaskYWY(DIS_Propagandatask p){
        propagandataskService.insert(p);
        return "ok";
    }

    //修改宣传任务-----调度
    @RequestMapping("updateProTaskYWY")
    public String updateProTaskYWY(DIS_Propagandatask p){
        propagandataskService.updateByPrimaryKeySelective(p);
        return "ok";
    }

    //查台转单-----调度
    @RequestMapping("findAllOrdAndUnitsYWY")
    public Map<String,Object> findAllOrdAndUnitsYWY(ACC_Workorder o){
        Map<String,Object> map=new HashMap<>();
        //查询工单表和受理表和对应的单位
        List<ACC_Workorder> list = workorderService.findAllWorAndUnitAndBli(o);
        //SY_Emp emp1 = empService.findByQueryPwd("1001");
        //System.out.println(emp1);
        map.put("wbuss",list);
        map.put("sums",workorderService.findsumcountUB(o));
        return map;
    }




}

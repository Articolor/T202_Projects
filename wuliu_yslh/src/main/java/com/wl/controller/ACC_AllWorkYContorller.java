package com.wl.controller;

import com.wl.model.ACC_Businessadmissibility;
import com.wl.model.ACC_Workorder;
import com.wl.model.ACC_Worksheet;
import com.wl.model.SY_Emp;
import com.wl.service.ACC_BusinessadmissibilityService;
import com.wl.service.ACC_WorkorderService;
import com.wl.service.ACC_WorksheetService;
import com.wl.service.SY_EmpService;
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
    @Autowired
    private SY_EmpService empService;

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
    public String insertBusinessYWY(ACC_Businessadmissibility b){
        //新增受理的同时要新增工单表
        businessadmissibilityService.insertBusin(b);//新增受理表
        //查询出刚刚新增的受理表，获取其中的数据b
        List<ACC_Businessadmissibility> list1 = businessadmissibilityService.findByNewDate();
        ACC_Businessadmissibility s1 = list1.get(0);
        //查询出小件员
        List<SY_Emp> xjy = empService.findXJY();
        SY_Emp emp1 = xjy.get(0);
        //新增受理表对应的工单表
        ACC_Workorder w=new ACC_Workorder();
        w.setBusinessnoticeno(s1.getBusinessnoticeno());
        w.setJobtype(new BigDecimal(1));//默认是新1
        w.setPickupstatus(new BigDecimal(1));//默认新单1
        w.setAftersinglenum(new BigDecimal(0));//默认是0次
        w.setSmallmembernum(emp1.getId());//设置小件员
        w.setPickupunit(emp1.getEmpunit());//设置单位
        workorderService.insertOrder(w);
        return "ok";
    }


    //根据受理表的业务通知单号修改工单表的工单类型  ----业务受理
    //修改工单状态---追单2 销单3   4销单   改单1  1:新,2:追,3:销
    @RequestMapping("updateWOrderYWY")
    public String updateWOrderYWY(ACC_Workorder o){
        //如果是追单就查询出之前的次数，然后在基础上新增+1
        System.out.println(o);
        if(o.getJobtype().equals(new BigDecimal(2))){
           System.out.println("追单");
           ACC_Workorder aa = workorderService.selecByBusineNo(o.getBusinessnoticeno());
           BigDecimal b1 = aa.getAftersinglenum();
           b1=b1.add(new BigDecimal("1"));
           o.setAftersinglenum(b1);
           System.out.println(o);
            workorderService.updateJobTypeById(o);
       }else if(o.getJobtype().equals(new BigDecimal(3))){
            //销单
           System.out.println("销单");
            workorderService.updateJobTypeById(o);
       }else if(o.getJobtype().equals(new BigDecimal(1))){
            //改单---修改用户的信息
           System.out.println("改单");
           //workorderService.updateJobTypeById(o);
       }

        return "ok";
    }

    //改单和编辑---业务受理
    @RequestMapping("updateByWorkOrder")
    public String updateByWorkOrder(ACC_Businessadmissibility o){
        System.out.println(o);
        businessadmissibilityService.updateByPrimaryKeySelective(o);
        return "ok";
    }



    //新增工单表的--------工作单快速入录
    @RequestMapping("insertWSheetYWY")
    public String insertWSheetYWY(ACC_Worksheet sheet){
        System.out.println(sheet);
        worksheetService.insertWSheet(sheet);
        return "ok";
    }

    //工作单查询-------受理
    @RequestMapping("findWOrderAndUnityYWY")
    public Map<String,Object> findWOrderAndUnityYWY(ACC_Workorder o){
        System.out.println(o);
        Map<String,Object> map=new HashMap<>();
        Integer rows = o.getRows();
        Integer page = o.getPage();
        o.setPage((page-1)*rows+1);
        o.setRows(page*rows);
        //查询全部的工单表，再查询出对应的受理表
        List<ACC_Workorder> list = workorderService.findAllWorderAndBility(o);
        for (ACC_Workorder acc_workorder : list) {
            //查询出受理表中对应业务通知单号的数据
            finddd(acc_workorder.getBusinessnoticeno(),acc_workorder);
        }

        map.put("works",list);
        map.put("work",o);
        map.put("sums",workorderService.sumCount(o));
        return map;
    }

    //根据业务通知单号查询出工单对象
    public void finddd(String id,ACC_Workorder w){
        ACC_Businessadmissibility b1 = businessadmissibilityService.findBilityAndUnityAndEmp(id);
       w.setBusinessadmissibility(b1);
    }
}



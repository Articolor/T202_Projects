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
    @Autowired
    private SY_UnitsService unitsService;
    @Autowired
    private DIS_DispatchhistoryService dispatchhistoryService;
    @Autowired
    private DIS_WorkordersignService workordersignService;

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
        map.put("units",unitsService.findAllUnits());//查询所有的单位表数据
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
        Integer page = o.getPage();
        Integer rows = o.getRows();
        o.setPage((page-1)*rows+1);
        o.setRows(page*rows);
        Map<String,Object> map=new HashMap<>();
        //查询工单表和受理表和对应的单位
        List<ACC_Workorder> list = workorderService.findAllWorAndUnitAndBli(o);
        map.put("wbuss",list);
        map.put("sums",workorderService.findsumcountUB(o));
        map.put("work",o);
        return map;
    }

    //根据员工工号查询出查单密码-----查台转单
    @RequestMapping("findByQueryPwd")
    public Map<String,Object> findByQueryPwd(SY_Emp e){
        Map<String,Object> map=new HashMap<>();
        String empno = e.getEmpno();
        SY_Emp emp1 = empService.findByQueryPwd(e);
        map.put("emp",emp1);
        return map;
    }

    //人工调度----查询---查询业务通知单和对应的工单号
    @RequestMapping("findAllRGBusYWY")
    public Map<String,Object> findAllRGBusYWY(ACC_Businessadmissibility b){
        Integer page = b.getPage();
        Integer rows = b.getRows();
        b.setPage((page-1)*rows+1);
        b.setRows(page*rows);
        Map<String,Object> map=new HashMap<>();
        List<ACC_Businessadmissibility> list = businessadmissibilityService.findAllBusinessR(b);
        map.put("blist",list);
        map.put("sums",businessadmissibilityService.sumCountR(b));
        map.put("units",unitsService.findAllUnits());//查询全部的单位
        map.put("bus",b);
        return map;
    }

    //人工调度  --------分配
    @RequestMapping("updateWOrderByYW")
    public String updateWOrderByYW(ACC_Workorder o){
        //根据页面上传的业务通知单号，修改分拣编码和所属单位
        System.out.println(o);
        workorderService.updateByOrderAndUnits(o);
        return "ok";
    }

    //人工调度--------退回
    @RequestMapping("insertDispatchYWY")
    public String insertDispatchYWY(DIS_Dispatchhistory d){
        //点击退回按钮是，新增一条调度历史表
        dispatchhistoryService.insert(d);
        return "ok";
    }

    //人工调度----详情
    @RequestMapping("findByywidYWY")
    public Map<String,Object> findByywidYWY(ACC_Workorder o){
        System.out.println(o);
        //根据工单表的业务受理id查询出受理表和工单表和调度历史
        Map<String,Object> map=new HashMap<>();
        //根据业务通知单查询出受理对象
        ACC_Businessadmissibility bus = businessadmissibilityService.findBilityAndUnityAndEmp(o.getBusinessnoticeno());
        //根据业务通知单查询出工单表对象
        ACC_Workorder work = workorderService.selecByBusineNo(o.getBusinessnoticeno());
        //根据工单表中的id查询出调度历史表
        DIS_Dispatchhistory byDisp = dispatchhistoryService.findByDisp(work.getId());
        map.put("buss",bus);
        map.put("work",work);
        map.put("disp",byDisp);
        return map;
    }


    //签收入录------页面查询
    @RequestMapping("findAllBySignAndUnitsAndEmp")
    public Map<String,Object> findAllBySignAndUnitsAndEmp(DIS_Workordersign o){
        //查询出签收表和员工和单位
        Integer page = o.getPage();
        Integer rows = o.getRows();
        o.setPage((page-1)*rows+1);
        o.setRows((page*rows));
        Map<String,Object> map=new HashMap<>();
        List<DIS_Workordersign> list = workordersignService.findAllByUnitsAndEmp(o);
        map.put("sigs",list);
        map.put("sums",workordersignService.findSumCount(o));
        map.put("sing",o);
        map.put("emps",empService.findXJY());//查询出所有的派送人员
        return map;
    }


    //签收录入------新增
    @RequestMapping("insertSignYWY")
    public String insertSignYWY(DIS_Workordersign o){
        workordersignService.insert(o);
        return "ok";
    }

    //签收录入-----编辑
    @RequestMapping("updateSignYWY")
    public String updateSignYWY(DIS_Workordersign o){
        return "ok";
    }


    //签收录入------详情
    @RequestMapping("findByIDSignYWY")
    public Map<String,Object> findByIDSignYWY(DIS_Workordersign o){
        //根据编号查询出签收单的信息
        Map<String,Object> map=new HashMap<>();
        DIS_Workordersign singn = workordersignService.findByIdUnitsAndEmp(o);
        map.put("singn",singn);
        return map;
    }

    //取消签收申请确认----查询全部
    @RequestMapping("findAllBySign2YWY")
    public Map<String,Object> findAllBySign2YWY(DIS_Workordersign o){
        Map<String,Object> map=new HashMap<>();
        List<DIS_Workordersign> list = workordersignService.findAllByUnits2AndEmp(o);
        map.put("sings",list);
        map.put("sing",o);
        map.put("sums",workordersignService.findSumCount2(o));
        return map;
    }

    //取消签收确认----详情
    @RequestMapping("findAllByIDSign2YWY")
    public Map<String,Object> findAllByIDSign2YWY(DIS_Workordersign o){
        Map<String,Object> map=new HashMap<>();
        DIS_Workordersign worksign = workordersignService.findByID2UnitsAndEmp(o);
        map.put("worksign",worksign);
        return map;
    }

}

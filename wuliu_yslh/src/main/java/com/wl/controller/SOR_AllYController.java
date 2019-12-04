package com.wl.controller;

import com.wl.model.*;
import com.wl.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
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
    @Autowired
    private SOR_OutbounddetailsService outbounddetailsService;
    @Autowired
    private SOR_CheckboundService checkboundService;
    @Autowired
    private SOR_CheckbounddetailsService checkbounddetailsService;
    @Autowired
    private SOR_PackageService packageService;
    @Autowired
    private SOR_PackagedetailsService packagedetailsService;

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



    //分拣管理----出库-------查询全部
    @RequestMapping("findAllOutBoundYWY")
    public Map<String,Object> findAllOutBoundYWY(SOR_Outbound o){
        //查询出出库信息
        Integer page = o.getPage();
        Integer rows = o.getRows();
        o.setPage((page-1)*rows+1);
        o.setRows((page*rows));
        Map<String,Object> map=new HashMap<>();
        List<SOR_Outbound> list = outboundService.findAllOutBo(o);
        map.put("outs",list);
        map.put("sums",outboundService.sumCount(o));
        map.put("bound",o);
        map.put("emps",empService.findemono());//查询全部的用户名
        map.put("units",unitsService.findAllUnits());//查询全部的单位
        return map;
    }


    //分拣管理---出库-----查看明细
    @RequestMapping("findByIDBoundYWY")
    public Map<String,Object> findByIDBoundYWY(SOR_Outbounddetails o){
        Map<String,Object> map=new HashMap<>();
        //根据出库单号查询出出库详细信息
        List<SOR_Outbounddetails> list = outbounddetailsService.findByIdOutDeta(o);
        map.put("outdates",list);
        return map;
    }

    //分拣管理----出库----新增出库表
    @RequestMapping("insertOutBanYWY")
    public String insertOutBanYWY(SOR_Outbound o){
        System.out.println(o);
        int i = outboundService.insert(o);
        System.out.println(i);
        return "ok";
    }

    //分拣管理----出库---新增出表表对应的出库详情表信息
    @RequestMapping("insertOutBanDateYWY")
    public String insertOutBanDateYWY(SOR_Outbounddetails d){
        List<SOR_Outbound> list = outboundService.findNewDate();
        SOR_Outbound s = list.get(0);
        d.setId(s.getId());
        System.out.println(d);
        outbounddetailsService.insert(d);
        return "ok";
    }





    //分拣管理------盘库-------查询
    @RequestMapping("findAllCheckBYWY")
    public Map<String,Object> findAllCheckBYWY(SOR_Checkbound  o){
        Integer page = o.getPage();
        Integer rows = o.getRows();
        o.setPage((page-1)*rows+1);
        o.setRows(page*rows);
        Map<String,Object> map=new HashMap<>();
        List<SOR_Checkbound> list = checkboundService.findAllCheckBound(o);
        map.put("checks",list);
        map.put("sums",checkboundService.sumCount(o));
        map.put("check",o);
        map.put("emps",empService.findemono());//查询全部的用户名
        map.put("units",unitsService.findAllUnits());//查询全部的单位
        return map;
    }


    //分拣管理---------盘库------明细数据
    @RequestMapping("findByIDdateils")
    public Map<String,Object> findByIDdateils(SOR_Checkbounddetails c){
        //根据盘库表查询出盘库详细表信息
        System.out.println(c);
        Map<String,Object> map=new HashMap<>();
        List<SOR_Checkbounddetails> list = checkbounddetailsService.findByIDBound(c);
        map.put("checdateils",list);
        return map;
    }

    //分拣管理----盘库----新增盘库
    @RequestMapping("insertCheckBountDateilsYWY")
    public String insertCheckBountDateilsYWY(SOR_Checkbound c){
        //新增盘库信息
        System.out.println(c);
        int i = checkboundService.insert(c);
        return "ok";
    }

    //分拣管理----盘库----新增盘库详细信息
    @RequestMapping("insertBountDateilsYWY")
    public String insertBountDateilsYWY(SOR_Checkbounddetails d){
        //查询出之前新增的盘库信息
        List<SOR_Checkbound> newDate = checkboundService.findNewDate();
        SOR_Checkbound s = newDate.get(0);
        d.setPackageid(s.getScanid().toString());
        System.out.println(d);
        checkbounddetailsService.insert(d);
        return "ok";
    }

    //分拣管理----合包----根据设备号查询
    @RequestMapping("findByPageIdYWY")
    public Map<String,Object> findByPageIdYWY(SOR_Checkbounddetails c){
        Map<String,Object> map=new HashMap<>();
        List<SOR_Checkbounddetails> list = checkbounddetailsService.findByIDBound(c);
        map.put("pageid",list.get(0));
        return map;
    }

    //分拣管理-----合包----查询所有的设备号
    @RequestMapping("findByPageAllYWY")
    public Map<String,Object> findByPageAllYWY(){
        Map<String,Object> map=new HashMap<>();
        List<SOR_Checkbounddetails> list = checkbounddetailsService.findByIDBound(new SOR_Checkbounddetails());
        map.put("pageids",list);
        map.put("units",unitsService.findAllUnits());//查询全部的单位
        return map;
    }


    //分拣管理-----合包----保存
    @RequestMapping("insertPackAgeYWY")
    public String insertPackAgeYWY(SOR_Package p){
        //新增和包信息
        System.out.println(p);
        int i = packageService.insert(p);
        System.out.println(i);
        return "ok";
    }

    //分拣管理----和包-----保存
    @RequestMapping("insertPageAgeDateilsYWY")
    public String insertPageAgeDateilsYWY(SOR_Packagedetails d){
        //根据最新时间查询出刚刚新增的和包信息
        List<SOR_Package> newDate = packageService.findNewDate();
        d.setId(newDate.get(0).getId());
        //新增和包信息对应的和详细信息
        System.out.println(d);
        int i = packagedetailsService.insert(d);
        System.out.println(i);
        return "ok";
    }


    //分拣管理-----拆包-----查询全部的合包号
    @RequestMapping("findOutPackageYWY")
    public Map<String,Object> findOutPackageYWY(SOR_Package p){
        //查询所有的合包号
        Map<String,Object> map=new HashMap<>();
        p.setState(new BigDecimal(2));
        List<SOR_Package> list = packageService.findAllPackYWY(p);
        map.put("packids",list);
        return map;
    }

    //分拣管理-----拆包---和包号
    @RequestMapping("findByPageidsYWY")
    public Map<String,Object> findByPageidsYWY(SOR_Package p){
        //根据id查询和合包对象
        Map<String,Object> map=new HashMap<>();
        p.setState(new BigDecimal(2));
        List<SOR_Package> list = packageService.findAllPackYWY(p);
        map.put("packids",list.get(0));
        return map;
    }



    //分拣管理----拆包-----保存
    @RequestMapping("insertOutPageAgeDateilsYWY")
    public String insertOutPageAgeDateilsYWY(SOR_Packagedetails d){
        //新增和包信息对应的和详细信息
        System.out.println(d);
        int i = packagedetailsService.insert(d);
        System.out.println(i);
        //修改合包状态为已合包  1   2未合包
        SOR_Package p=new SOR_Package();
        p.setId(d.getId());
        p.setState(new BigDecimal(1));
        System.out.println(p);
        packageService.updateByPrimaryKeySelective(p);
        return "ok";
    }
}

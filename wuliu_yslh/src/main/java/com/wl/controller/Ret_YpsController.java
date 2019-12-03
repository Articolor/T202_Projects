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
public class Ret_YpsController {
    @Autowired
    private Ret_YpsService rets;
    @Autowired
    private PAC_packagingService pac;
    @Autowired
    private PAC_StockService pas;
    @Autowired
    private PAC_StockItemService pos;
    @Autowired
    private SY_UnitsService su;
    @Autowired
    private SY_EmpService emp;
    @Autowired
    private SOR_AbnormalService sor;

    //模糊查询分页一体
    @RequestMapping("/findRet")
    public Map<String,Object> findAllRet(RET_Returnlist ret,int page, int rows){
        System.out.println("findRet");

        System.out.println(ret+"...."+page+"\t"+rows);
        List<RET_Returnlist> list = rets.selectResult(ret, (page - 1) * rows + 1, rows*page);
        for (RET_Returnlist l:list){
            System.out.println(l);
        }
        Map<String,Object> map=new HashMap<>();
        map.put("ret",list);
        Integer count = rets.selectCount(ret);
        map.put("count",count);
        return map;
    }

    //修改
    @RequestMapping("upRet")
    public int upRet(RET_Returnlist ret){
        System.out.println("修改"+ret);
        return rets.updateByPrimaryKeySelective(ret);
    }

    //新增
    @RequestMapping("addRet")
    public int addRet(RET_Returnlist ret){
        System.out.println("新增"+ret);
        System.out.println(rets.insert(ret));
        return  rets.insert(ret);
    }


    //申请返货
    @RequestMapping("findRetWork")
    public Map<String,Object> find(RET_Returnlist ret,int page, int rows){
        System.out.println(ret);
        List<RET_Returnlist> list = rets.selectRetWork(ret, (page-1)*rows+1, rows*page);
        for (RET_Returnlist l:list){
            System.out.println(l);
        }
        Map<String,Object> map=new HashMap<>();
        map.put("ret",list);
        map.put("count",rets.selectRetWorkCount(ret));
        return map;
    }


    //包装材料管理
    @RequestMapping("findPac")
    public Map<String,Object> findPac(PAC_Packaging p,int page,int rows){
        System.out.println(p);
        Map<String,Object> map=new HashMap<>();
        map.put("pac",pac.selectPacking(p,(page-1)*rows+1,rows*page));
        map.put("count",pac.selectPackingCount(p));
        map.put("emps",emp.findemono());//查询全部的用户名
        return map;
    }

    //包装材料修改
    @RequestMapping("upPac")
    public int upPac(PAC_Packaging p){
        System.out.println(p+"-----up");
        return  pac.updateByPrimaryKeySelective(p);
    }

    //包装材料新增
    @RequestMapping("addPac")
    public int addPac(PAC_Packaging p){
        return pac.insertSelective(p);
    }

    //作废
    @RequestMapping("upPacZf")
    public int upPacZf(PAC_Packaging p){
        return pac.updateByPrimaryKey(p);
    }

    //入库
    @RequestMapping("findPas")
    public Map<String,Object> findPas(PAC_Stock p,int page,int rows){
        System.out.println(p);
        Map<String,Object> map=new HashMap<>();
        System.out.println(pas.findStockManage(p,(page-1)*rows+1,rows*page));
        map.put("pas",pas.findStockManage(p,(page-1)*rows+1,rows*page));
        map.put("count",pas.findStockManageCount(p));
        map.put("emps",emp.findemono());//查询全部的用户名
        return map;
    }
    //下拉框单位表
    @RequestMapping("findAllUnitsYPS")
    public List<SY_Units> findAllUnits(){
        System.out.println(su.findAllUnits());
        return su.findAllUnits();
    }

    //新增入库
    @RequestMapping("addStock")
    public int addStock(PAC_Stock p){
        return pas.insertStock(p);
    }

    //修改
    @RequestMapping("upStock")
    public int upStock(PAC_Stock p){
        return pas.updatepacsk(p);
    }

    @RequestMapping("findStokItemByW")
    public List<PAC_Stockitem> findStokItemByW(String warehouseno){
        return pos.selectByPrimaryKey(warehouseno);
    }
    //新增明细
    @RequestMapping("addStockItem")
    public int addStockItem(PAC_Stockitem p){
        return pos.insert(p);
    }
    //修改明细
    @RequestMapping("upStockItem")
    public int upStockItem(PAC_Stockitem p){
        return pos.updateByPrimaryKey(p);
    }
    //库存管理
    @RequestMapping("findStock")
    public Map<String,Object> findStock(PAC_Stockitem p, int page, int rows, String symbol, String symbol2){
        System.out.println(p+symbol+symbol2);
        Map<String,Object> map=new HashMap<>();
        map.put("pos", pos.selectStock(p,page,rows,symbol,symbol2));
        System.out.println(pos.selectStock(p, page, rows, symbol, symbol2));
        map.put("count",pos.selectStockCount(p,symbol,symbol2));
        return map;
    }

    @RequestMapping("findAbnormal")
    public Map<String,Object> findAbnormal(SOR_Abnormal a,int page,int rows){
        Map<String,Object> map=new HashMap<>();
        map.put("abn",sor.findAbnormals(a, page, rows));
        map.put("count",sor.findAbnormalCount(a));
        map.put("emps",emp.findemono());//查询全部的用户名
        return map;
    }
}

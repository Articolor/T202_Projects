package com.wl.controller;

import com.wl.model.BAS_Basicarchives;
import com.wl.model.BAS_Deliverystandard;
import com.wl.model.BAS_Shuttlebus;
import com.wl.model.BAS_Substitute;
import com.wl.service.BAS_BasicarchivesService;
import com.wl.service.BAS_DeliverystandardService;
import com.wl.service.BAS_ShuttlebusService;
import com.wl.service.BAS_SubstituteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BAS_DeliverystandardController {
    @Autowired
    private BAS_DeliverystandardService bas_deliverystandardService;
    @Autowired
    private BAS_BasicarchivesService basicarchivesService;
    @Autowired
    private BAS_ShuttlebusService bas_shuttlebusService;
    @Autowired
    private BAS_SubstituteServices bas_substituteServices;

    //分页查询所有收派标准
    @RequestMapping("findAllBASDeliverystandardAndSY_EMP")
    public  Map<String,Object> findAllBASDeliverystandardAndSY_EMP(int page,int rows){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Deliverystandard> list = bas_deliverystandardService.findAllBASDeliverystandardAndSY_EMP((page-1)*rows+1,page*rows);
        int i = bas_deliverystandardService.findAllBASDELIVERYSTANDARD();
        for (BAS_Deliverystandard i1 : list) {
            System.out.println(i1);
        }
        map.put("shuju",list);
        map.put("count",i);
        return map;
    }
    //分页高级查询所有收派标准
    @RequestMapping("findAllBASDeliverystandardAndSY_EMPKEY")
    public List<BAS_Deliverystandard> findAllBASDeliverystandardAndSY_EMPKEY(String name, BigDecimal invalidatemark, BigDecimal maxweight, BigDecimal minweight, String empname, Date operationtime,int page,int rows){
        List<BAS_Deliverystandard> empkey = bas_deliverystandardService.findAllBASDeliverystandardAndSY_EMPKEY(name, invalidatemark, maxweight, minweight, empname, operationtime,page,rows);
        return empkey;
    }
    //收派作废
    @RequestMapping("updateByPrimaryKeySelective")
    public int updateByPrimaryKeySelective(int id){
        bas_deliverystandardService.updateByPrimaryKeySelective(new BAS_Deliverystandard(1,2));
        return 1;
    }
    //查询基础档案
    @RequestMapping("findBAS_BasicarchivesAndSY_EmpAndSY_Units")
    public Map<String,Object> findBAS_BasicarchivesAndSY_EmpAndSY_Units(int page,int rows){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Basicarchives> list = basicarchivesService.findBAS_BasicarchivesAndSY_EmpAndSY_Units((page-1)*rows,page*rows);
        map.put("shuju",list);

        return map;
    }
    //分页查询基础档案
    @RequestMapping("findfindBASBasicarchivesAndSYEmpAndSYUnitsKey")
    public  List<BAS_Basicarchives> findfindBASBasicarchivesAndSYEmpAndSYUnitsKey(Integer parentid, String ename, String empname, Date boperationtime   ,  int page, int rows){
        List<BAS_Basicarchives> list = basicarchivesService.findfindBASBasicarchivesAndSYEmpAndSYUnitsKey(parentid, ename, empname, boperationtime, page, rows);
        return list;
    }
    //查询班车
    @RequestMapping("findBUSANDEMPANDUNITS")
    public  Map<String,Object> findBUSANDEMPANDUNITS(int page,int rows){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Shuttlebus> list = bas_shuttlebusService.findBUSANDEMPANDUNITS((page-1)*rows,page*rows);
        int i = bas_shuttlebusService.GetBUSCOUNT();
        map.put("shuju",list);
        map.put("count",i);
        return  map;
    }
    //高级查询班车
    @RequestMapping("findBUSANDEMPANDUNITSfenye")
    public  List<BAS_Shuttlebus> findBUSANDEMPANDUNITSfenye(Integer lineid,Integer lineType,String licenseplateint,String driver,String carrier,Integer page,int rows){
        List<BAS_Shuttlebus> list = bas_shuttlebusService.findBUSANDEMPANDUNITSfenye( lineid,lineType,licenseplateint,driver,carrier,page,rows);

        return  list;
    }
    //查询取派员设置
    @RequestMapping("findBAS_SubstituteAndSY_Units")
    public  Map<String,Object> findBAS_SubstituteAndSY_Units(Integer page,Integer rows){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Substitute> list = bas_substituteServices.findBAS_SubstituteAndSY_Units((page-1)*rows,page*rows);
        map.put("shuju",list);
        return map;
    }
    //高级查询取派员设置
    @RequestMapping("findBAS_SubstituteAndSY_Unitsfenye")
    public  Map<String,Object> findBAS_SubstituteAndSY_Unitsfenye(String empno,String empname,Integer mobileno,Integer type,BigDecimal pda,Integer page,Integer rows){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Substitute> list = bas_substituteServices.findBAS_SubstituteAndSY_Unitsfenye(empno,empname,mobileno,type,pda,(page-1)*rows,page*rows);
        map.put("shuju",list);
        return map;
    }


}

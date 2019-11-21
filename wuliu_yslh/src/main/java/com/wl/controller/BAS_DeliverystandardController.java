package com.wl.controller;

import com.wl.mapper.BAS_BasicarchivesMapper;
import com.wl.model.BAS_Basicarchives;
import com.wl.model.BAS_Deliverystandard;
import com.wl.service.BAS_BasicarchivesService;
import com.wl.service.BAS_DeliverystandardService;
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


    @RequestMapping("findAllBASDeliverystandardAndSY_EMP")
    public  Map<String,Object> findAllBASDeliverystandardAndSY_EMP(int page,int rows){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Deliverystandard> list = bas_deliverystandardService.findAllBASDeliverystandardAndSY_EMP((page-1)*rows+1,page*rows);
        int i = bas_deliverystandardService.findAllBASDELIVERYSTANDARD();

        map.put("shuju",list);
        map.put("count",i);
        return map;
    }

    @RequestMapping("findAllBASDeliverystandardAndSY_EMPKEY")
    public List<BAS_Deliverystandard> findAllBASDeliverystandardAndSY_EMPKEY(String name, BigDecimal invalidatemark, BigDecimal maxweight, BigDecimal minweight, String empname, Date operationtime,int page,int rows){
        List<BAS_Deliverystandard> empkey = bas_deliverystandardService.findAllBASDeliverystandardAndSY_EMPKEY(name, invalidatemark, maxweight, minweight, empname, operationtime,page,rows);
        return empkey;
    }

    @RequestMapping("updateByPrimaryKeySelective")
    public int updateByPrimaryKeySelective(int id){
        bas_deliverystandardService.updateByPrimaryKeySelective(new BAS_Deliverystandard(1,2));
        return 1;
    }
    @RequestMapping("findBAS_BasicarchivesAndSY_EmpAndSY_Units")
    public Map<String,Object> findBAS_BasicarchivesAndSY_EmpAndSY_Units(int page,int rows){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Basicarchives> list = basicarchivesService.findBAS_BasicarchivesAndSY_EmpAndSY_Units((page-1)*rows,page*rows);
        for (BAS_Basicarchives i : list) {
            System.out.println(i.getBas_basicarchivesentry().getParentid()+"jhhhhhhhhhhhhhhhh");
        }
        map.put("shuju",list);

        return map;
    }

    @RequestMapping("findfindBASBasicarchivesAndSYEmpAndSYUnitsKey")
    public  List<BAS_Basicarchives> findfindBASBasicarchivesAndSYEmpAndSYUnitsKey(Integer parentid, String ename, String empname, Date boperationtime   ,  int page, int rows){
        List<BAS_Basicarchives> list = basicarchivesService.findfindBASBasicarchivesAndSYEmpAndSYUnitsKey(parentid, ename, empname, boperationtime, page, rows);
        return list;
    }





}

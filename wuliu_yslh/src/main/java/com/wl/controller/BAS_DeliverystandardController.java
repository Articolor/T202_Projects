package com.wl.controller;

import com.wl.model.*;
import com.wl.service.*;
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
    @Autowired
    private BAS_AreaService bas_areaService;
    @Autowired
    private BAS_PartitionService bas_partitionService;
    @Autowired
    private BAS_Standartimeservice bas_standartimeservice;
    @Autowired
    private BAS_ZoneinfoService bas_zoneinfoService;

    //分页查询所有收派标准
    @RequestMapping("findAllBASDeliverystandardAndSY_EMP")
    public  Map<String,Object> findAllBASDeliverystandardAndSY_EMP(BAS_Deliverystandard d){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Deliverystandard> list = bas_deliverystandardService.findAllBASDeliverystandardAndSY_EMPKEY(d);
        int i = bas_deliverystandardService.findAllBASDELIVERYSTANDARD();

        map.put("shuju",list);
        map.put("count",i);
        return map;
    }
    //分页高级查询所有收派标准
    /*@RequestMapping("findAllBASDeliverystandardAndSY_EMPKEY")
    public List<BAS_Deliverystandard> findAllBASDeliverystandardAndSY_EMPKEY(BAS_Deliverystandard d){
        List<BAS_Deliverystandard> empkey = bas_deliverystandardService.findAllBASDeliverystandardAndSY_EMPKEY(d);
        return empkey;
    }*/
    //收派作废
    @RequestMapping("updateByPrimaryKeySelective")
    public int updateByPrimaryKeySelective(int id){
        bas_deliverystandardService.updateByPrimaryKeySelective(new BAS_Deliverystandard(1,2));
        return 1;
    }
    //收派新增
    @RequestMapping("insert")
    public int insert(BAS_Deliverystandard bas_deliverystandard){
        BAS_Deliverystandard bas = new BAS_Deliverystandard("收派名称",new BigDecimal(1),new BigDecimal(100),new BigDecimal(1),new BigDecimal(1),new BigDecimal(1),null);
        int i = bas_deliverystandardService.insert(bas);
        return 1;
    }

    //收派编辑
    @RequestMapping("updateByPrimaryKey")
    public int updateByPrimaryKey(BAS_Deliverystandard bas_deliverystandard){
        BAS_Deliverystandard bas = new BAS_Deliverystandard("收派具体名称",new BigDecimal(1),new BigDecimal(100),new BigDecimal(1),new BigDecimal(1),new BigDecimal(0),null);
        bas.setId(new BigDecimal(1));
        int i = bas_deliverystandardService.updateByPrimaryKey(bas);
        return i;
    }

    //查询基础档案
    @RequestMapping("findBAS_BasicarchivesAndSY_EmpAndSY_Units")
    public Map<String,Object> findBAS_BasicarchivesAndSY_EmpAndSY_Units(Integer page,Integer rows){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Basicarchives> list = basicarchivesService.findBAS_BasicarchivesAndSY_EmpAndSY_Units((page-1)*rows+1,page*rows);
        map.put("shuju",list);
        return map;
    }
    //分页查询基础档案
    @RequestMapping("findfindBASBasicarchivesAndSYEmpAndSYUnitsKey")
    public  List<BAS_Basicarchives> findfindBASBasicarchivesAndSYEmpAndSYUnitsKey( String ename ,  Integer page, Integer rows){
        List<BAS_Basicarchives> list = basicarchivesService.findfindBASBasicarchivesAndSYEmpAndSYUnitsKey(ename, (page-1)*rows+1,page*rows);
        return list;
    }
    //查询班车
    @RequestMapping("findBUSANDEMPANDUNITS")
    public  Map<String,Object> findBUSANDEMPANDUNITS(int page,int rows){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Shuttlebus> list = bas_shuttlebusService.findBUSANDEMPANDUNITS((page-1)*rows+1,page*rows);
        int i = bas_shuttlebusService.GetBUSCOUNT();
        map.put("shuju",list);
        map.put("count",i);
        return  map;
    }
    //高级查询班车
    @RequestMapping("findBUSANDEMPANDUNITSfenye")
    public  List<BAS_Shuttlebus> findBUSANDEMPANDUNITSfenye(String licenseplateint,String driver,String carrier, Integer page,Integer rows){
        List<BAS_Shuttlebus> list = bas_shuttlebusService.findBUSANDEMPANDUNITSfenye( licenseplateint,driver,carrier,page,rows);

        return  list;
    }
    //查询取派员设置
    @RequestMapping("findBAS_SubstituteAndSY_Units")
    public  Map<String,Object> findBAS_SubstituteAndSY_Units(Integer page,Integer rows){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Substitute> list = bas_substituteServices.findBAS_SubstituteAndSY_Units((page-1)*rows+1,page*rows);
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

    //查询区域设置
    @RequestMapping("findBASAreaAndsy_units")
    public  Map<String,Object> findBASAreaAndsy_units(Integer page,Integer rows){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Area> units = bas_areaService.findBASAreaAndsy_units((page - 1) * rows, rows*page);
        int i = bas_areaService.getcount();
        map.put("shuju",units);
        map.put("count",i);
        return map;
    }
    //高级查询区域设置
    @RequestMapping("findBASAreaAndsy_unitsFenye")
    public List<BAS_Area> findBASAreaAndsy_unitsFenye(String province,String city,String county,String simplecode, Integer citycode,Integer page, Integer rows){
        List<BAS_Area> basAreaAndsy_unitsFenye = bas_areaService.findBASAreaAndsy_unitsFenye(province, city, county, simplecode, citycode, (page-1)*rows, rows*page);
        return basAreaAndsy_unitsFenye;
    }

    //管理分区
    @RequestMapping("findBAS_Partition")
    public  Map<String,Object> findBAS_Partition(Integer page,Integer rows){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Partition> i = bas_partitionService.findBAS_Partition((page-1) * rows,rows*page);
        map.put("shuju",i);
        return map;
    }
    //管理分区
    @RequestMapping("findBAS_PartitionGAOJI")
    public List<BAS_Partition> findBAS_PartitionGAOJI(String province,String city,String county,String zonecode,String keyword,Integer page, Integer rows){
        List<BAS_Partition> gaoji = bas_partitionService.findBAS_PartitionGAOJI(province, city, county, zonecode, keyword, (page-1)*rows, rows*page);
        return gaoji;
    }

    //收派时间管理
    @RequestMapping("findBAS_StandartimeAndSy_units")
    public Map<String,Object> findBAS_StandartimeAndSy_units(Integer page,Integer rows){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Standartime> units = bas_standartimeservice.findBAS_StandartimeAndSy_units(page, rows);
        map.put("shuju",units);
        return map;
    }
    //收派时间管理分页
    @RequestMapping("findBAS_StandartimeAndSy_unitsfenye")
    public Map<String,Object> FIND(String timename,String name,Integer page,Integer rows ){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Standartime> syUnitsfenye = bas_standartimeservice.findBAS_StandartimeAndSy_unitsfenye(timename, name, page, rows);
        map.put("shuju",syUnitsfenye);
        return map;
    }

    //管理定区
    @RequestMapping("findBAS_ZoneinfoAndSY_EmpAndSY_Units")
    public Map<String,Object> findBAS_ZoneinfoAndSY_EmpAndSY_Units(Integer page,Integer rows){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Zoneinfo> empAndSYUnits = bas_zoneinfoService.findBAS_ZoneinfoAndSY_EmpAndSY_Units((page - 1) * rows, rows * page);
        map.put("shuju",empAndSYUnits);
        return map;
    }

}

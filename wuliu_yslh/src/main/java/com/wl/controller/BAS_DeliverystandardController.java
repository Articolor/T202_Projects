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
    @Autowired
    private BAS_ZonecustominfoService bas_zonecustominfoService;
    @Autowired
    private LOG_LogisticsService log_logisticsService;
    @Autowired
    private LOG_LogisticstransferService log_logisticstransferService;
    @Autowired
    private LOG_TrackService trackService;
    //分页查询所有收派标准
    @RequestMapping("findAllBASDeliverystandardAndSY_EMP")
    public  Map<String,Object> findAllBASDeliverystandardAndSY_EMP(BAS_Deliverystandard d){
        Integer page = d.getPage();
        Integer rows = d.getRows();
        d.setPage((page-1)*rows+1);
        d.setRows(page*rows);
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
        System.out.println(id);
        bas_deliverystandardService.updateByPrimaryKeySelective(new BAS_Deliverystandard(id,2));
        return 1;
    }
    //收派新增
    @RequestMapping("insert")
    public int insert(BAS_Deliverystandard bas_deliverystandard){
        bas_deliverystandard.setOperationunitid(new BigDecimal(2));
        bas_deliverystandard.setOperatorid(new BigDecimal(2));
        int i = bas_deliverystandardService.insert(bas_deliverystandard);
        return 1;
    }

    //收派编辑
    @RequestMapping("updateByPrimaryKey12121")
    public int updateByPrimaryKey(BAS_Deliverystandard bas_deliverystandard){


        System.out.println(bas_deliverystandard);
        bas_deliverystandard.setOperatorid(new BigDecimal(1));
      bas_deliverystandard.setOperationunitid(new BigDecimal(1));
        int i = bas_deliverystandardService.updateByPrimaryKey(bas_deliverystandard);
        return i;
    }

    //查询基础档案
    @RequestMapping("findBAS_BasicarchivesAndSY_EmpAndSY_Units")
    public Map<String,Object> findBAS_BasicarchivesAndSY_EmpAndSY_Units(Integer page,Integer rows){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Basicarchives> list = basicarchivesService.findBAS_BasicarchivesAndSY_EmpAndSY_Units((page-1)*rows+1,page*rows);
        int sy_unitscount = basicarchivesService.findBAS_BasicarchivesAndSY_EmpAndSY_Unitscount(page, rows);
        map.put("shuju",list);
        map.put("count",sy_unitscount);
        return map;
    }
    //分页查询基础档案
    @RequestMapping("findfindBASBasicarchivesAndSYEmpAndSYUnitsKey")
    public  List<BAS_Basicarchives> findfindBASBasicarchivesAndSYEmpAndSYUnitsKey( String ename ,  Integer page, Integer rows){
        List<BAS_Basicarchives> list = basicarchivesService.findfindBASBasicarchivesAndSYEmpAndSYUnitsKey(ename, (page-1)*rows+1,page*rows);
        return list;
    }

    //新增基础数据
    @RequestMapping("insertbasicrchives")
    public int insertbasicrchives(BAS_Basicarchives basicrchives){
        System.out.println(basicrchives);
        basicrchives.setOperatorid(new BigDecimal(5));
        basicrchives.setOperationunitid(new BigDecimal(6));
        int i = basicarchivesService.insert(basicrchives);
        return i;
    }
    //修改基础数据
    @RequestMapping("updateByPrimaryKey1")
    public int updateByPrimaryKey1(BAS_Basicarchives basicrchives){
        int i = basicarchivesService.updateByPrimaryKey(basicrchives);
        return i;
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

    //新增班车
    @RequestMapping("insertbus")
    public int insertbus(BAS_Shuttlebus bas_shuttlebus){
        bas_shuttlebus.setLineid(new BigDecimal(8));
        bas_shuttlebus.setOperatorid(new BigDecimal(2));
        bas_shuttlebus.setOperationunitid(new BigDecimal(3));
        int i = bas_shuttlebusService.insert(bas_shuttlebus);
        return i;
    }

    //修改班车
    @RequestMapping("updateByPrimaryKeybbus")
    public int updateByPrimaryKeybus(BAS_Shuttlebus bas_shuttlebus){
        int i = bas_shuttlebusService.updateByPrimaryKey(bas_shuttlebus);
        return i;
    }

    //删除班车
    @RequestMapping("deleteByPrimaryKey11")
    public int deleteByPrimaryKey11(BigDecimal id){
        System.out.println(id);
        int i = bas_shuttlebusService.deleteByPrimaryKey(id);
        return i;
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
    public  Map<String,Object> findBAS_SubstituteAndSY_Unitsfenye(String empno,String empname,Integer mobileno,Integer page,Integer rows){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Substitute> list = bas_substituteServices.findBAS_SubstituteAndSY_Unitsfenye(empno,empname,mobileno,(page-1)*rows+1,page*rows);
        map.put("shuju",list);
        return map;
    }

    //新增
    @RequestMapping("insertBAS_Substitute")
    public int insertBAS_Substitute(BAS_Substitute  bas_substitute){
        bas_substitute.setType(new BigDecimal(8));
        bas_substitute.setSubordinateunit(new BigDecimal(6));
        bas_substitute.setMobileno(new BigDecimal(1808031754));
        int i = bas_substituteServices.insert(bas_substitute);
        return i;
    }

    //修改
    @RequestMapping("updateByPrimaryKeysub")
    public int updateByPrimaryKey(BAS_Substitute  bas_substitute) {
        int i = bas_substituteServices.updateByPrimaryKey(bas_substitute);
        return i;
    }

    //删除
    @RequestMapping("deleteByPrimaryKeyshu")
    public int deleteByPrimaryKeyshu(BigDecimal id){
        int i = bas_substituteServices.deleteByPrimaryKey(id);
        return i;
    }
    //查询区域设置
    @RequestMapping("findBASAreaAndsy_units")
    public  Map<String,Object> findBASAreaAndsy_units(Integer page,Integer rows){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Area> units = bas_areaService.findBASAreaAndsy_units((page - 1) * rows+1, rows*page);
        int i = bas_areaService.getcount();
        map.put("shuju",units);
        map.put("count",i);
        return map;
    }
    //高级查询区域设置
    @RequestMapping("findBASAreaAndsy_unitsFenye")
    public List<BAS_Area> findBASAreaAndsy_unitsFenye(String province,String city,String county,Integer page, Integer rows){
        List<BAS_Area> basAreaAndsy_unitsFenye = bas_areaService.findBASAreaAndsy_unitsFenye(province, city, county, (page-1)*rows+1, rows*page);
        return basAreaAndsy_unitsFenye;
    }
    //新增区域
    @RequestMapping("insertArea")
    public int insert(BAS_Area bas_area){
        bas_area.setEntryunitid("3");
        bas_area.setComplementunitid("4");
        int i = bas_areaService.insert(bas_area);
        return i;
    }
    //修改区域
    @RequestMapping("updateByPrimaryKeyarea")
    public int updateByPrimaryKeyarea(BAS_Area bas_area) {
        int i = bas_areaService.updateByPrimaryKey(bas_area);
        return i;
    }
    //删除
    @RequestMapping("deleteByPrimaryKeyarea")
    public int deleteByPrimaryKeyarea(BigDecimal id){
        int i = bas_areaService.deleteByPrimaryKey(id);
        return i;
    }
    //管理分区
    @RequestMapping("findBAS_Partition")
    public  Map<String,Object> findBAS_Partition(Integer page,Integer rows){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Partition> i = bas_partitionService.findBAS_Partition((page-1) * rows+1,rows*page);
        map.put("shuju",i);
        return map;
    }
    //管理分区
    @RequestMapping("findBAS_PartitionGAOJI")
    public List<BAS_Partition> findBAS_PartitionGAOJI(String province,String city,String county,Integer page, Integer rows){
        List<BAS_Partition> gaoji = bas_partitionService.findBAS_PartitionGAOJI(province, city, county, (page-1)*rows+1, rows*page);
        return gaoji;
    }

    //新增分区
    @RequestMapping("insertoart")
    public int insertoart(BAS_Partition bas_partition){
        int i = bas_partitionService.insert(bas_partition);
        return i;
    }
    //修改分区
    @RequestMapping("updateByPrimaryKeypart")
    public int updateByPrimaryKey(BAS_Partition bas_partition){
        int i = bas_partitionService.updateByPrimaryKey(bas_partition);
        return i;
    }
    //删除分区
    @RequestMapping("deleteByPrimaryKeypart")
    public int deleteByPrimaryKey(BigDecimal id){
        int i = bas_partitionService.deleteByPrimaryKey(id);
        return i;
    }

    //收派时间管理
    @RequestMapping("findBAS_StandartimeAndSy_units")
    public Map<String,Object> findBAS_StandartimeAndSy_units(Integer page,Integer rows){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Standartime> units = bas_standartimeservice.findBAS_StandartimeAndSy_units((page-1)*rows+1, rows*page);
        map.put("shuju",units);
        return map;
    }
    //收派时间管理分页
    @RequestMapping("findBAS_StandartimeAndSy_unitsfenye")
    public Map<String,Object> FIND(String timename,String name,Integer page,Integer rows ){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Standartime> syUnitsfenye = bas_standartimeservice.findBAS_StandartimeAndSy_unitsfenye(timename, name, (page-1)*rows+1, rows*page);
        map.put("shuju",syUnitsfenye);
        return map;
    }
    //新增收派时间
    @RequestMapping("insertStandartime")
    public int insert(BAS_Standartime record) {
        int insert = bas_standartimeservice.insert(record);
        return insert;
    }

    //删除收派时间
    @RequestMapping("deleteByPrimaryKeytime")
    public int deleteByPrimaryKeytime(BigDecimal id){
        System.out.println(id);
        return bas_standartimeservice.deleteByPrimaryKey(id);
    }
    //管理定区
    @RequestMapping("findBAS_ZoneinfoAndSY_EmpAndSY_Units")
    public Map<String,Object> findBAS_ZoneinfoAndSY_EmpAndSY_Units(Integer page,Integer rows){

        Map<String,Object> map=new HashMap<>();
        List<BAS_Zoneinfo> empAndSYUnits = bas_zoneinfoService.findBAS_ZoneinfoAndSY_EmpAndSY_Units((page - 1) * rows+1, rows * page);
        map.put("shuju",empAndSYUnits);
        return map;
    }
    //管理定区gaoji
    @RequestMapping("findBAS_ZoneinfoAndSY_EmpAndSY_Unitsfenye")
    public Map<String,Object> findBAS_ZoneinfoAndSY_EmpAndSY_Unitsfenye(String name,String zonecode,Integer page,Integer rows){
        Map<String,Object> map=new HashMap<>();
        List<BAS_Zoneinfo> empAndSYUnits = bas_zoneinfoService.findBAS_ZoneinfoAndSY_EmpAndSY_Unitsfenye(name, zonecode, (page-1)*rows, rows*page);
        map.put("shuju",empAndSYUnits);
        return map;
    }

    //查询定区管理客户信息
    @RequestMapping("findBAS_ZonecustominfoANDBAS_ZONEINFO")
    public List<BAS_Zonecustominfo> findBAS_ZonecustominfoANDBAS_ZONEINFO(Integer id){
        List<BAS_Zonecustominfo> bas_zonecustominfoANDBAS_zoneinfo = bas_zonecustominfoService.findBAS_ZonecustominfoANDBAS_ZONEINFO(id);
        return bas_zonecustominfoANDBAS_zoneinfo;
    }

    @RequestMapping("insertbaszoneinfo1")
    public int insertbaszoneinfo(BAS_Zoneinfo bas_zoneinfo){
        bas_zoneinfo.setZonepeople(new BigDecimal(6));
        bas_zoneinfo.setSubordinateunit(new BigDecimal(5));
        int i = bas_zoneinfoService.insert(bas_zoneinfo);
        return i;
    }

    @RequestMapping("updateByPrimaryKeyzoneinfo")
    public int updateByPrimaryKey(BAS_Zoneinfo bas_zoneinfo){
        int i = bas_zoneinfoService.updateByPrimaryKey(bas_zoneinfo);
        return i;
    }

    @RequestMapping("deleteByPrimaryKeyZoneinfo")
    public int deleteByPrimaryKeyZoneinfo(BigDecimal id){
        int i = bas_zoneinfoService.deleteByPrimaryKey(id);
        return i;
    }

    //查询跟踪表登记
    @RequestMapping("findalltracck")
    public Map<String, Object> findalltracck(String linename, String logisticscar, Integer page, Integer rows) {
        Map<String, Object> map = new HashMap<>();
        List<LOG_Track> list = trackService.findalltracck(linename, logisticscar, (page - 1) * rows + 1, rows * page);
        map.put("shuju", list);
        return map;
    }

    //删除跟踪表记录
    @RequestMapping("deleteByPrimaryKeytracck")
    public int deleteByPrimaryKeytracck(BigDecimal id) {
        int i = trackService.deleteByPrimaryKey(id);
        return i;
    }

    //查询登记表查询
    @RequestMapping("selectfindLogistics")
    public Map<String, Object> selectfindLogistics(String logisticsint, Integer iscancel, Integer page, Integer rows) {
        Map<String, Object> map = new HashMap<>();
        List<LOG_Logistics> list = log_logisticsService.selectfindLogistics(logisticsint, iscancel, (page - 1) * rows + 1, rows * page);
        map.put("shuju",list);
        return map;
    }
    //物流交接单查询
    @RequestMapping("selectfindtransfer")
    public Map<String, Object> selectfindtransfer( String transferint,String driver, Integer page,Integer rows){
        Map<String, Object> map = new HashMap<>();
        List<LOG_Logisticstransfer> list = log_logisticstransferService.selectfindtransfer(transferint, driver, (page - 1) * rows + 1, rows * page);
        map.put("shuju",list);
        return map;
    }
}

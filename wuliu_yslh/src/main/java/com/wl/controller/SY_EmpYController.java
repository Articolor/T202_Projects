package com.wl.controller;

import com.wl.mapper.SY_UnitsMapper;
import com.wl.model.*;
import com.wl.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SY_EmpYController {

    @Autowired
    private SY_EmpService sy_empService;
    @Autowired
    private SY_RoleService sy_roleService;
    @Autowired
    private SY_UnitsService unitsService;
    @Autowired
    private SY_MenusService menusService;
    @Autowired
    private SY_RolesMenusService syRolesMenusService;

    //查询empno
    @RequestMapping("findemono")
    public List<SY_Emp> findemono(){
        List<SY_Emp> findemono = sy_empService.findemono();
        return findemono;
    }
    //根据员工号查询出name
    @RequestMapping("findByEmpnoFZS")
    public Map<String,Object> findByEmpnoFZS(SY_Emp emp){
        Map<String,Object> map=new HashMap<>();
        SY_Emp findbyid = sy_empService.findbyid(emp);
        map.put("shuju",findbyid);
        return map;
    }

    //登录的方法
    @RequestMapping("findEmpByLogin")
    public Map<String,Object> findEmpByLogin(SY_Emp emp){
        Map<String,Object> map=new HashMap<>();
        SY_Emp emp1 = sy_empService.findEmpByLogin(emp);
        //根据指定用户查询的角色查询出菜单
        if(emp1==null){
            return null;
        }
        SY_Role role = sy_roleService.selectByPrimaryKey(emp1.getRoleid());
        List<SY_Menus> menus = role.getMenus();
        map.put("emp",emp1);
        map.put("menus",menus);
        return map;
    }
    @RequestMapping("selectfindALL")
    public List<SY_Units> selectfindALL() {
        List<SY_Units> sy_units = unitsService.selectfindALL();
        return sy_units;
    }

    //查询所有单位---单位管理
    @RequestMapping("findAllUnits")
    public Map<String,Object> findAllUnits(SY_Units units){
        Map<String,Object> map=new HashMap<>();
        //查询全部的单位
        int page=units.getPage();
        int rows=units.getRows();
        units.setPage((page-1)*rows+1);
        units.setRows(page*rows);
        List<SY_Units> list = unitsService.findAllUnitsAndEmp(units);
        //查询全部的总行数
        Integer sum=unitsService.findMhCount(units);
        map.put("scott",list);
        map.put("sums",sum);//总行数
        map.put("un",units);
        return map;
    }

    //修改单位-----单位管理
    @RequestMapping("updateUnitsYWY")
    public String updateUnitsYWY(SY_Units units){
        try {
            unitsService.updateByPrimaryKeySelective(units);
        }catch (Exception e){
            return "error";
        }
        return "ok";
    }

    //删除单位-----单位管理
    @RequestMapping("deleteUnitesYWY")
    public String deleteUnitesYWY(SY_Units s){
        try {
            unitsService.deleteByPrimaryKey(s.getId());
        }catch (Exception e){
            return "error";
        }
        return "ok";
    }

    //新增单位-----单位管理
    @RequestMapping("addUnitsYWY")
    public String addUnitsYWY(SY_Units units){
        try {
            System.out.println(units);
            unitsService.insertUnits(units);
        }catch (Exception e){
            return "error";
        }
        return "ok";
    }


    //查询所有的用户和角色-----员工管理
    @RequestMapping("FindallEmpYWY")
    public Map<String,Object> FindallEmp(SY_Emp syEmp){
        Map<String,Object> map=new HashMap<>();
        Integer page = syEmp.getPage();
        Integer rows = syEmp.getRows();
        syEmp.setPage((page-1)*rows+1);
        syEmp.setRows(page*rows);
        //查询总行数
        Integer sum = sy_empService.findsumCount(syEmp);
        List<SY_Emp> list = sy_empService.findAllEmpAndRole(syEmp);
        map.put("scott",list);
        map.put("sums",sum);
        map.put("em",syEmp);
        return map;
    }

    @RequestMapping("testallE")
    public List<SY_Role> testallrole (SY_Role r){
        List<SY_Role> list = sy_roleService.findAllRoleAndMenu(r);
        System.out.println("xxx");
        return list;
    }

    //新增员工------员工管理
    @RequestMapping("InsertEmp")
    public String InsertEmp(SY_Emp emp){
        sy_empService.insertEMP(emp);
        return "ok";
    }


    //删除员工-----员工管理
    @RequestMapping("DeleteEmpById")
    public String DeleteEmpById(SY_Emp emp){
        try {
            sy_empService.deleteByPrimaryKey(emp.getId());
        }catch (Exception e){
            return "error";
        }
        return "ok";
    }

    //修改员工-----员工管理
    @RequestMapping("updateEmpYWY")
    public String updateEmpYWY(SY_Emp emp){
        sy_empService.updateByPrimaryKeySelective(emp);
        return "ok";
    }

    //查询所有的角色和单位----员工管理
    @RequestMapping("findRoleAndUnitsYWY")
    public Map<String ,Object> findRoleAndUnitsYWY(){
        Map<String ,Object> map=new HashMap<>();
        List<SY_Role> roles = sy_roleService.findAllRole();
        List<SY_Units> unitss = unitsService.findAllUnits();
        map.put("roles",roles);
        map.put("units",unitss);
        return map;
    }



    //查询全部的菜单-----栏目管理
    @RequestMapping("findAllMenuYWY")
    public Map<String,Object> findAllMenuYWY(SY_Menus menus){
        Map<String,Object> map=new HashMap<>();
        int rows=menus.getRows();
        int pages=menus.getPage();
        menus.setPage((pages-1)*rows+1);
        menus.setRows(pages*rows);
        //查询全部的集合
        List<SY_Menus> list = menusService.findAllMenuAndRole(menus);
        map.put("menus",list);
        map.put("menu",menus);
        map.put("sums",menusService.sumCount(menus));
        return map;
    }


    //新增菜单-----栏目管理
    @RequestMapping("insertMenuYWY")
    public String insertMenuYWY(SY_Menus menus){
        menusService.insert(menus);
        return "ok";
    }


    //修改菜单-----栏目管理
    @RequestMapping("updateMenusYWY")
    public String updateMenusYWY(SY_Menus menus){
        try {
            menusService.updateByPrimaryKeySelective(menus);
        }catch (Exception e){
            return "error";
        }
        return "ok";
    }

    //删除栏目-----栏目管理
    @RequestMapping("deleteMenusYWY")
    public String deleteMenusYWY(SY_Menus menus){
        try {
            menusService.deleteByPrimaryKey(menus.getId());
        }catch (Exception e){
            return "error";
        }
        return "ok";
    }

    //查询出所有的一级菜单  -----栏目管理
    @RequestMapping("findMneusPer")
    public Map<String,Object> findMneusPer(){
        Map<String,Object> map=new HashMap<>();
        List<SY_Menus> menus = menusService.findMenuParent();
        map.put("menus",menus);
        return map;
    }


    //查询所有的角色
    @RequestMapping("findAllRoleYWY")
    public Map<String,Object> findAllRoleYWY(SY_Role sy_role){
        Map<String,Object> map=new HashMap<>();
        //查询全部的角色
        Integer rowss=sy_role.getRows();
        Integer pages=sy_role.getPage();
        sy_role.setRows(pages*rowss);
        sy_role.setPage((pages-1)*rowss+1);
        List<SY_Role> list = sy_roleService.findAllRoleAndMenu(sy_role);
        Integer sum = sy_roleService.sumCount(sy_role);//总行数
        map.put("roles",list);
        map.put("sums",sum);
        map.put("role",sy_role);
        return map;
    }

    //删除角色
    @RequestMapping("deleteRoleYWY")
    public String deleteRoleYWY(SY_Role role){
        System.out.println(role);
        System.out.println(role.getId());
        sy_roleService.deleteByPrimaryKey(role.getId());
        return "ok";
    }

    //修改角色
    @RequestMapping("updateRolesYWY")
    public String updateRolesYWY(SY_Role role){
        System.out.println(role);
        sy_roleService.updateByPrimaryKeySelective(role);
        return "ok";
    }

    //新增角色
    @RequestMapping("insertRoleYWY")
    public String insertRoleYWY(SY_Role role){
        System.out.println(role);
        sy_roleService.insert(role);
        return "ok";
    }


    //根据角色的id把角色所有对应的权限查询出来
    @RequestMapping("findRoleById")
    public Map<String,Object> findRoleById(SY_Role role){
        Map<String,Object> map=new HashMap<>();
        //默认选中的数组
        //根据角色id把一级菜单查询出来

        SY_Role sy_role = sy_roleService.findRoleOrMenuByIdParents(role);
        System.out.println(sy_role);
        //然后根据一级菜单查询二级菜单
        List<SY_Menus> menus = sy_role.getMenus();
        Integer[] s=new Integer[menus.size()];
        for(int i=0;i<menus.size();i++){
            s[i]= new Integer(menus.get(i).getId().toString());
        }

        map.put("role",s);
        return map;
    }
    //查询全部的集合---显示在页面
    @RequestMapping("findAllRoleAssign")
    public Map<String,Object> findAllRoleAssign(){
        Map<String,Object> map=new HashMap<>();
        //查询一级菜单
        List<SY_Menus> listp = menusService.findMenuParent();
        for (SY_Menus sy_menus : listp) {
            findChildModule(sy_menus.getId(),sy_menus);
        }
        map.put("menus",listp);
        return map;
    }
    //查询二级菜单的方法
    public void findChildModule(BigDecimal pid, SY_Menus module){
        List<SY_Menus> list=menusService.findMenuChild(pid);
        module.setChildren(list);//将查询到的子节点放入对应根节点的集合中
    }

    //分配角色---第一步：删除所有的角色，然后给角色id新增权限@RequestBody String[] para, 加上注解。。。。
    @RequestMapping("AssignYWY")
    @ResponseBody
    public String AssignYWY(String roleid, String menus){
        System.out.println(roleid+"---"+menus);
        //删除中间表的关系
        syRolesMenusService.deleteByPrimaryKey(new BigDecimal(roleid.toString()));
        //截取menus的字符串
        String[] split = menus.split(",");
        for(int i=0;i<split.length;i++){
            System.out.println(split[i]);
            // 新增中间表的关系
            syRolesMenusService.insert(new SY_Rolesmenus(new BigDecimal(roleid.toString()),new BigDecimal(split[i])));
        }
        return "ok";
    }


}

package com.wl.controller;

import com.wl.model.SY_Emp;
import com.wl.model.SY_Role;
import com.wl.service.SY_EmpService;
import com.wl.service.SY_MenusService;
import com.wl.service.SY_RoleService;
import com.wl.service.SY_UnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

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

    //查询所有的用户和角色-----员工管理
    @RequestMapping("FindallEmp")
    public List<SY_Emp> FindallEmp(SY_Emp syEmp){
        Integer page = syEmp.getPage();
        Integer rows = syEmp.getRows();
        syEmp.setPage((page-1)*rows+1);
        syEmp.setRows(page*rows);
        List<SY_Emp> list = sy_empService.findAllEmpAndRole(syEmp);
        return list;
    }

    @RequestMapping("testallE")
    public List<SY_Role> testallrole (SY_Role r){
        List<SY_Role> list = sy_roleService.findAllRoleAndMenu(r);
        return list;
    }

    //新增员工
    @RequestMapping("InsertEmp")
    public String InsertEmp(SY_Emp emp){
        try {
            sy_empService.insertEMP(emp);
        }catch (Exception e){
            return "error";
        }
        return "OK";
    }


    @RequestMapping("DeleteEmpById")
    public String DeleteEmpById(int id){
        BigDecimal b=new BigDecimal(id);
        try {
            sy_empService.deleteByPrimaryKey(b);
        }catch (Exception e){
            return "error";
        }
        return "OK";
    }
}

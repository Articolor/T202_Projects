package com.wl.controller;

import com.wl.model.My_Emp;
import com.wl.service.My_EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class My_EmpController {
    @Autowired
    private My_EmpService my_empService;

    @RequestMapping("testall")
    public String testall(){
        for (My_Emp my_emp : my_empService.findAllEmp()) {
            System.out.println(my_emp);
        }
        return null;
    }

    @RequestMapping("insertEmp")
    public String insertemp(){
        Integer i;
        i = my_empService.insertemp(new My_Emp("嘻嘻","scott",123,null,123.0,20,"男"));
        System.out.println(i+"+++++++-嘻嘻嘻嘻嘻++++++++++++");
        return null;
    }

    @RequestMapping("deleteEmp")
    public String deleteEmp(){
        Integer i = my_empService.deleteEmp(9);
        System.out.println(i);
        return null;
    }

    @RequestMapping("updateEmp")
    public String updateEmp(){
        Integer admin = my_empService.updateEMP(new My_Emp(10, "admin"));
        System.out.println(admin);
        return null;
    }

    @RequestMapping("findFyEmp")
    public String findFyEmp(int page,int rows) {
        //page:从哪一行开始  rows：到哪一行结束测试
        int a1=(page-1)*rows+1;
        int a2=(page*rows);
        List<My_Emp> emps = my_empService.findAllFy((page-1)*rows+1, page*rows);
        for (My_Emp emp : emps) {
            System.out.println(emp);
        }
        return null;
    }


}


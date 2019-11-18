package com.wl.service;

import com.wl.model.My_Emp;

import java.util.List;

public interface My_EmpService {
    public List<My_Emp> findAllEmp();


    public Integer updateEMP(My_Emp my_emp);


    public Integer deleteEmp(int empno);

    public Integer insertemp(My_Emp emp);

    public List<My_Emp> findAllFy(int page, int rows);
}

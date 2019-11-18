package com.wl.service.impl;

import com.wl.mapper.My_EmpMapper;
import com.wl.model.My_Emp;
import com.wl.service.My_EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class My_EmpServiceImpl implements My_EmpService {
    @Autowired
    private My_EmpMapper my_empMapper;

    @Override
    public List<My_Emp> findAllEmp() {
        return my_empMapper.findAllEmp();
    }

    @Override
    public Integer updateEMP(My_Emp my_emp) {
        return my_empMapper.updateEMP(my_emp);
    }

    @Override
    public Integer deleteEmp(int empno) {
        return my_empMapper.deleteEmp(empno);
    }

    @Override
    public Integer insertemp(My_Emp emp) {
        return my_empMapper.insertemp(emp);
    }

    @Override
    public List<My_Emp> findAllFy(int page, int rows) {
        return my_empMapper.findAllFy(page,rows);
    }
}

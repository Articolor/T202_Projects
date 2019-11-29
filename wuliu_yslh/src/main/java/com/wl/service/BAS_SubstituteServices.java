package com.wl.service;

import com.wl.model.BAS_Substitute;

import java.math.BigDecimal;
import java.util.List;

public interface BAS_SubstituteServices {
    //取派员设置查询
    List<BAS_Substitute> findBAS_SubstituteAndSY_Units(Integer page, Integer rows);
    //取派员查询
    List<BAS_Substitute> findBAS_SubstituteAndSY_Unitsfenye(String empno,String empname,Integer mobileno,Integer page,Integer rows);
}

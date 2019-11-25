package com.wl.service;

import com.wl.model.BAS_Substitute;

import java.math.BigDecimal;
import java.util.List;

public interface BAS_SubstituteServices {
    //取派员设置查询
    List<BAS_Substitute> findBAS_SubstituteAndSY_Units(Integer page, Integer rows);
    //分页高级查询
    List<BAS_Substitute> findBAS_SubstituteAndSY_Unitsfenye(String empno, String empname, Integer mobileno, Integer type, BigDecimal pda, Integer page, Integer rows);
}

package com.wl.service.impl;

import com.wl.mapper.BAS_SubstituteMapper;
import com.wl.model.BAS_Substitute;
import com.wl.service.BAS_SubstituteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class BAS_SubstituteServicesImpl implements BAS_SubstituteServices {

    @Autowired
    private BAS_SubstituteMapper bas_substituteMapper;
    @Override
    public List<BAS_Substitute> findBAS_SubstituteAndSY_Units(Integer page, Integer rows) {
        List<BAS_Substitute> list = bas_substituteMapper.findBAS_SubstituteAndSY_Units(page, rows);
        return list;
    }

    @Override
    public List<BAS_Substitute> findBAS_SubstituteAndSY_Unitsfenye(String empno, String empname, Integer mobileno, Integer page,Integer rows) {
        List<BAS_Substitute> list = bas_substituteMapper.findBAS_SubstituteAndSY_Unitsfenye(empno, empname, mobileno,  page, rows);
        return list;
    }

}

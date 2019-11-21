package com.wl.service.impl;

import com.wl.mapper.BAS_BasicarchivesMapper;
import com.wl.mapper.BAS_DeliverystandardMapper;
import com.wl.model.BAS_Basicarchives;
import com.wl.model.BAS_Deliverystandard;
import com.wl.service.BAS_DeliverystandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
@Service
public class BAS_DeliverystandardServiseImpl implements BAS_DeliverystandardService {
    @Autowired
    private BAS_DeliverystandardMapper bas_deliverystandardMapper;



    @Override
    public List findAllBASDeliverystandardAndSY_EMP(int page,int rows) {
        List<BAS_Deliverystandard> list = bas_deliverystandardMapper.findAllBASDeliverystandardAndSY_EMP(page,rows);
        return list;
    }

    @Override
    public List<BAS_Deliverystandard> findAllBASDeliverystandardAndSY_EMPKEY(String name, BigDecimal invalidatemark, BigDecimal maxweight, BigDecimal minweight, String empname, Date operationtime,int page,int rows) {
        List<BAS_Deliverystandard> list1 = bas_deliverystandardMapper.findAllBASDeliverystandardAndSY_EMPKEY( name,  invalidatemark,  maxweight,  minweight,  empname,  operationtime, page, rows);
        return list1;
    }

    @Override
    public void updateByPrimaryKeySelective(BAS_Deliverystandard d) {
        bas_deliverystandardMapper.updateByPrimaryKeySelective(d);
    }

    @Override
    public int findAllBASDELIVERYSTANDARD() {
        int i = bas_deliverystandardMapper.findAllBASDELIVERYSTANDARD();
        return i;
    }


}

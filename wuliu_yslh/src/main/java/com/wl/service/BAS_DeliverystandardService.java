package com.wl.service;

import com.wl.model.BAS_Basicarchives;
import com.wl.model.BAS_Deliverystandard;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface BAS_DeliverystandardService {
    //BAS_Deliverystandard表
    //查询出派全部
    List<BAS_Deliverystandard> findAllBASDeliverystandardAndSY_EMP(int page,int rows);
    //高级条件查询
    List<BAS_Deliverystandard> findAllBASDeliverystandardAndSY_EMPKEY(BAS_Deliverystandard d);
    //作废修改
    void  updateByPrimaryKeySelective(BAS_Deliverystandard d);
    //查询最大值
    int findAllBASDELIVERYSTANDARD();
    //收派新增
    int insert(BAS_Deliverystandard record);
    //收派修改编辑
    int updateByPrimaryKey(BAS_Deliverystandard record);
}

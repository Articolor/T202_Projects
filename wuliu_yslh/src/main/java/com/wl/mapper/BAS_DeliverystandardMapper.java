package com.wl.mapper;

import com.wl.model.BAS_Deliverystandard;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
@Service
public interface BAS_DeliverystandardMapper {
    //高级查询
    List<BAS_Deliverystandard> findAllBASDeliverystandardAndSY_EMPKEY(BAS_Deliverystandard d);
    //查询出派全部
    List<BAS_Deliverystandard> findAllBASDeliverystandardAndSY_EMP(int page,int rows);
    //修改作废
    void  updateByPrimaryKeySelective(BAS_Deliverystandard record);
    //查询最大值
    int findAllBASDELIVERYSTANDARD();

    void deleteByPrimaryKey(BigDecimal id);
    //收派新增
    int insert(BAS_Deliverystandard record);

    int insertSelective(BAS_Deliverystandard record);

    BAS_Deliverystandard selectByPrimaryKey(BigDecimal id);


    //收派修改编辑
    int updateByPrimaryKey(BAS_Deliverystandard record);
}
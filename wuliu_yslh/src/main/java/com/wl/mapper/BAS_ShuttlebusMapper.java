package com.wl.mapper;

import com.wl.model.BAS_Shuttlebus;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface BAS_ShuttlebusMapper {
    //班车设置查询分页
    List<BAS_Shuttlebus> findBUSANDEMPANDUNITS(Integer page,int rows);
    //班车分页高级查询
    List<BAS_Shuttlebus> findBUSANDEMPANDUNITSfenye(String licenseplateint,String driver,String carrier, Integer page,Integer rows);
    //班车总行数查询
    int GetBUSCOUNT();
    //新增班车
    int insert(BAS_Shuttlebus record);
    //修改
    int updateByPrimaryKey(BAS_Shuttlebus record);
    //删除
    int deleteByPrimaryKey(BigDecimal id);



    int insertSelective(BAS_Shuttlebus record);

    BAS_Shuttlebus selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(BAS_Shuttlebus record);


}
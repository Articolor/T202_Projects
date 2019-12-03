package com.wl.service;

import com.wl.model.SOR_Abnormal;

import java.util.List;

public interface SOR_AbnormalService {

    //新增异单数据
    int insert(SOR_Abnormal record);

    //查询
    List<SOR_Abnormal> findAbnormals(SOR_Abnormal a, int page, int rows);

    Integer findAbnormalCount(SOR_Abnormal a);
}

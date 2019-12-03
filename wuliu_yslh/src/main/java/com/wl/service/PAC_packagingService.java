package com.wl.service;

import com.wl.model.PAC_Packaging;

import java.util.List;

public interface PAC_packagingService {
   public List<PAC_Packaging> querypack(PAC_Packaging p);
   public int getcountlq(PAC_Packaging p);

   public List<PAC_Packaging> selectPacking(PAC_Packaging p, int page, int rows);

   public  Integer selectPackingCount(PAC_Packaging p);

   public int updateByPrimaryKeySelective(PAC_Packaging record);

   public  int insertSelective(PAC_Packaging record);





   public int updateByPrimaryKey(PAC_Packaging record);
}

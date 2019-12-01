package com.wl.service;

import com.wl.model.IAE_Extract;

import java.util.List;

public interface IAE_ExtractService {
    public List<IAE_Extract> queryextract(IAE_Extract e);
    public int querycount(IAE_Extract e);
    public int insert(IAE_Extract record);
}

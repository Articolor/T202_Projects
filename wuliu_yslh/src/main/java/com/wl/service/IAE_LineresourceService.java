package com.wl.service;

import com.wl.model.IAE_Lineresource;

import java.util.List;

public interface IAE_LineresourceService {
    public List<IAE_Lineresource> queryline(IAE_Lineresource l);
    public int getcount(IAE_Lineresource l);
}

package com.wl.service;

import com.wl.model.IAE_Arrival;

import java.util.List;

public interface IAE_ArrivalService {
    public List<IAE_Arrival> queryarrival(IAE_Arrival a);
    public int getcount(IAE_Arrival a);
}

package com.wl.service;

import com.wl.model.IAE_Timeinput;

import java.util.List;

public interface IAE_TimeInputService {
    public List<IAE_Timeinput> queryinput(IAE_Timeinput i);
    public int querycount(IAE_Timeinput i);
}

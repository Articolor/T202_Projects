package com.wl.service;

import com.wl.model.PAC_Packaging;


import java.util.List;

public interface PAC_PackagingService {
    public List<PAC_Packaging> querypack(PAC_Packaging p);
    public int getcountlq(PAC_Packaging p);
}

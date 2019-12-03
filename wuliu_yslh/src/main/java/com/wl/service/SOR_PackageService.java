package com.wl.service;

import com.wl.model.SOR_Package;

import java.util.List;

public interface SOR_PackageService {

    List<SOR_Package> findSORPackage(SOR_Package s, int page, int rows);

    Integer findSORPackageCount(SOR_Package s);
}

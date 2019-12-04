package com.wl.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class SOR_Checkbounddetails {
    private BigDecimal id;

    private String packageid;

    private BigDecimal cargocount;

    private BigDecimal weight;

    private BigDecimal volume;

    private BigDecimal cargotype;

    private String direction;

    private BigDecimal storageperson;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date storagedate;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getPackageid() {
        return packageid;
    }

    public void setPackageid(String packageid) {
        this.packageid = packageid == null ? null : packageid.trim();
    }

    public BigDecimal getCargocount() {
        return cargocount;
    }

    public void setCargocount(BigDecimal cargocount) {
        this.cargocount = cargocount;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getCargotype() {
        return cargotype;
    }

    public void setCargotype(BigDecimal cargotype) {
        this.cargotype = cargotype;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction == null ? null : direction.trim();
    }

    public BigDecimal getStorageperson() {
        return storageperson;
    }

    public void setStorageperson(BigDecimal storageperson) {
        this.storageperson = storageperson;
    }

    public Date getStoragedate() {
        return storagedate;
    }

    public void setStoragedate(Date storagedate) {
        this.storagedate = storagedate;
    }


    @Override
    public String toString() {
        return "SOR_Checkbounddetails{" +
                "id=" + id +
                ", packageid='" + packageid + '\'' +
                ", cargocount=" + cargocount +
                ", weight=" + weight +
                ", volume=" + volume +
                ", cargotype=" + cargotype +
                ", direction='" + direction + '\'' +
                ", storageperson=" + storageperson +
                ", storagedate=" + storagedate +
                '}';
    }
}
package com.wl.model;

import java.math.BigDecimal;
import java.util.Date;

public class LOG_Track {
    private BigDecimal id;

    private String linetype;

    private String linename;

    private String logisticscar;

    private BigDecimal linestate;

    private String nodename;

    private Date starttime;

    private Date arrivaltime;

    private String carint;

    private String nextnodeload;

    private String describe;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getLinetype() {
        return linetype;
    }

    public void setLinetype(String linetype) {
        this.linetype = linetype == null ? null : linetype.trim();
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename == null ? null : linename.trim();
    }

    public String getLogisticscar() {
        return logisticscar;
    }

    public void setLogisticscar(String logisticscar) {
        this.logisticscar = logisticscar == null ? null : logisticscar.trim();
    }

    public BigDecimal getLinestate() {
        return linestate;
    }

    public void setLinestate(BigDecimal linestate) {
        this.linestate = linestate;
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename == null ? null : nodename.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(Date arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public String getCarint() {
        return carint;
    }

    public void setCarint(String carint) {
        this.carint = carint == null ? null : carint.trim();
    }

    public String getNextnodeload() {
        return nextnodeload;
    }

    public void setNextnodeload(String nextnodeload) {
        this.nextnodeload = nextnodeload == null ? null : nextnodeload.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
}
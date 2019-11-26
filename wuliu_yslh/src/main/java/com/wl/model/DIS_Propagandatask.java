package com.wl.model;

import java.math.BigDecimal;
import java.util.Date;

public class DIS_Propagandatask {
    private BigDecimal id;

    private String outline;

    private Date releasetime;

    private Date failuretime;

    private BigDecimal status;

    private String content;

    private Integer page=1;//起始页数
    private Integer rows=5;//到那一页

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline == null ? null : outline.trim();
    }

    public Date getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
    }

    public Date getFailuretime() {
        return failuretime;
    }

    public void setFailuretime(Date failuretime) {
        this.failuretime = failuretime;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
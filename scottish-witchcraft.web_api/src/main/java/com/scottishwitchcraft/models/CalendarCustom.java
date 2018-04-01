package com.scottishwitchcraft.models;

import java.sql.Date;
import java.util.Objects;

public class CalendarCustom {
    private String customref;
    private String customsystemid;
    private Long customid;
    private String customType;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Case wdbCaseByCaseref;

    public String getCustomref() {
        return customref;
    }

    public void setCustomref(String customref) {
        this.customref = customref;
    }

    public String getCustomsystemid() {
        return customsystemid;
    }

    public void setCustomsystemid(String customsystemid) {
        this.customsystemid = customsystemid;
    }

    public Long getCustomid() {
        return customid;
    }

    public void setCustomid(Long customid) {
        this.customid = customid;
    }

    public String getCustomType() {
        return customType;
    }

    public void setCustomType(String customType) {
        this.customType = customType;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getLastupdatedby() {
        return lastupdatedby;
    }

    public void setLastupdatedby(String lastupdatedby) {
        this.lastupdatedby = lastupdatedby;
    }

    public Date getLastupdatedon() {
        return lastupdatedon;
    }

    public void setLastupdatedon(Date lastupdatedon) {
        this.lastupdatedon = lastupdatedon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalendarCustom that = (CalendarCustom) o;
        return Objects.equals(customref, that.customref) &&
                Objects.equals(customsystemid, that.customsystemid) &&
                Objects.equals(customid, that.customid) &&
                Objects.equals(customType, that.customType) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(customref, customsystemid, customid, customType, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Case getWdbCaseByCaseref() {
        return wdbCaseByCaseref;
    }

    public void setWdbCaseByCaseref(Case wdbCaseByCaseref) {
        this.wdbCaseByCaseref = wdbCaseByCaseref;
    }
}

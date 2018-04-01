package com.scottishwitchcraft.webapi.data.models;

import java.sql.Date;
import java.util.Objects;

public class CounterStrategy {
    private String counterstrategyref;
    private String counterstrategysystemid;
    private Long counterstrategyid;
    private String counterstrategyType;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Case wdbCaseByCaseref;

    public String getCounterstrategyref() {
        return counterstrategyref;
    }

    public void setCounterstrategyref(String counterstrategyref) {
        this.counterstrategyref = counterstrategyref;
    }

    public String getCounterstrategysystemid() {
        return counterstrategysystemid;
    }

    public void setCounterstrategysystemid(String counterstrategysystemid) {
        this.counterstrategysystemid = counterstrategysystemid;
    }

    public Long getCounterstrategyid() {
        return counterstrategyid;
    }

    public void setCounterstrategyid(Long counterstrategyid) {
        this.counterstrategyid = counterstrategyid;
    }

    public String getCounterstrategyType() {
        return counterstrategyType;
    }

    public void setCounterstrategyType(String counterstrategyType) {
        this.counterstrategyType = counterstrategyType;
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
        CounterStrategy that = (CounterStrategy) o;
        return Objects.equals(counterstrategyref, that.counterstrategyref) &&
                Objects.equals(counterstrategysystemid, that.counterstrategysystemid) &&
                Objects.equals(counterstrategyid, that.counterstrategyid) &&
                Objects.equals(counterstrategyType, that.counterstrategyType) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(counterstrategyref, counterstrategysystemid, counterstrategyid, counterstrategyType, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Case getWdbCaseByCaseref() {
        return wdbCaseByCaseref;
    }

    public void setWdbCaseByCaseref(Case wdbCaseByCaseref) {
        this.wdbCaseByCaseref = wdbCaseByCaseref;
    }
}

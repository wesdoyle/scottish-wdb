package com.scottishwitchcraft.dao;

import com.scottishwitchcraft.models.Trial;

import java.sql.Date;
import java.util.Objects;

public class PrevCommission {
    private String prevcommref;
    private String prevcommsystemid;
    private Long prevcommid;
    private Boolean prevcommexists;
    private String prevcommdate;
    private Date prevcommdateAsDate;
    private String fromwhere;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Trial wdbTrialByTrialref;

    public String getPrevcommref() {
        return prevcommref;
    }

    public void setPrevcommref(String prevcommref) {
        this.prevcommref = prevcommref;
    }

    public String getPrevcommsystemid() {
        return prevcommsystemid;
    }

    public void setPrevcommsystemid(String prevcommsystemid) {
        this.prevcommsystemid = prevcommsystemid;
    }

    public Long getPrevcommid() {
        return prevcommid;
    }

    public void setPrevcommid(Long prevcommid) {
        this.prevcommid = prevcommid;
    }

    public Boolean getPrevcommexists() {
        return prevcommexists;
    }

    public void setPrevcommexists(Boolean prevcommexists) {
        this.prevcommexists = prevcommexists;
    }

    public String getPrevcommdate() {
        return prevcommdate;
    }

    public void setPrevcommdate(String prevcommdate) {
        this.prevcommdate = prevcommdate;
    }

    public Date getPrevcommdateAsDate() {
        return prevcommdateAsDate;
    }

    public void setPrevcommdateAsDate(Date prevcommdateAsDate) {
        this.prevcommdateAsDate = prevcommdateAsDate;
    }

    public String getFromwhere() {
        return fromwhere;
    }

    public void setFromwhere(String fromwhere) {
        this.fromwhere = fromwhere;
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
        PrevCommission that = (PrevCommission) o;
        return Objects.equals(prevcommref, that.prevcommref) &&
                Objects.equals(prevcommsystemid, that.prevcommsystemid) &&
                Objects.equals(prevcommid, that.prevcommid) &&
                Objects.equals(prevcommexists, that.prevcommexists) &&
                Objects.equals(prevcommdate, that.prevcommdate) &&
                Objects.equals(prevcommdateAsDate, that.prevcommdateAsDate) &&
                Objects.equals(fromwhere, that.fromwhere) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(prevcommref, prevcommsystemid, prevcommid, prevcommexists, prevcommdate, prevcommdateAsDate, fromwhere, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Trial getWdbTrialByTrialref() {
        return wdbTrialByTrialref;
    }

    public void setWdbTrialByTrialref(Trial wdbTrialByTrialref) {
        this.wdbTrialByTrialref = wdbTrialByTrialref;
    }
}

package com.scottishwitchcraft.webapi.models;

import java.sql.Date;
import java.util.Objects;

public class Torture {
    private String tortureref;
    private String torturesystemid;
    private Long tortureid;
    private Boolean tortureexists;
    private String torturedate;
    private Date torturedateAsDate;
    private String torturetype;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Trial wdbTrialByTrialref;

    public String getTortureref() {
        return tortureref;
    }

    public void setTortureref(String tortureref) {
        this.tortureref = tortureref;
    }

    public String getTorturesystemid() {
        return torturesystemid;
    }

    public void setTorturesystemid(String torturesystemid) {
        this.torturesystemid = torturesystemid;
    }

    public Long getTortureid() {
        return tortureid;
    }

    public void setTortureid(Long tortureid) {
        this.tortureid = tortureid;
    }

    public Boolean getTortureexists() {
        return tortureexists;
    }

    public void setTortureexists(Boolean tortureexists) {
        this.tortureexists = tortureexists;
    }

    public String getTorturedate() {
        return torturedate;
    }

    public void setTorturedate(String torturedate) {
        this.torturedate = torturedate;
    }

    public Date getTorturedateAsDate() {
        return torturedateAsDate;
    }

    public void setTorturedateAsDate(Date torturedateAsDate) {
        this.torturedateAsDate = torturedateAsDate;
    }

    public String getTorturetype() {
        return torturetype;
    }

    public void setTorturetype(String torturetype) {
        this.torturetype = torturetype;
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
        Torture torture = (Torture) o;
        return Objects.equals(tortureref, torture.tortureref) &&
                Objects.equals(torturesystemid, torture.torturesystemid) &&
                Objects.equals(tortureid, torture.tortureid) &&
                Objects.equals(tortureexists, torture.tortureexists) &&
                Objects.equals(torturedate, torture.torturedate) &&
                Objects.equals(torturedateAsDate, torture.torturedateAsDate) &&
                Objects.equals(torturetype, torture.torturetype) &&
                Objects.equals(createdby, torture.createdby) &&
                Objects.equals(createdate, torture.createdate) &&
                Objects.equals(lastupdatedby, torture.lastupdatedby) &&
                Objects.equals(lastupdatedon, torture.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tortureref, torturesystemid, tortureid, tortureexists, torturedate, torturedateAsDate, torturetype, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Trial getWdbTrialByTrialref() {
        return wdbTrialByTrialref;
    }

    public void setWdbTrialByTrialref(Trial wdbTrialByTrialref) {
        this.wdbTrialByTrialref = wdbTrialByTrialref;
    }
}

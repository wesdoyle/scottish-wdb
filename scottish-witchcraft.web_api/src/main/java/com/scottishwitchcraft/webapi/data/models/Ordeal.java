package com.scottishwitchcraft.webapi.data.models;

import java.sql.Date;
import java.util.Objects;

public class Ordeal {
    private String ordealref;
    private String ordealsystemid;
    private Long ordealid;
    private Boolean ordealexists;
    private String ordealdate;
    private Date ordealdateAsDate;
    private String ordealtype;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Trial wdbTrialByTrialref;

    public String getOrdealref() {
        return ordealref;
    }

    public void setOrdealref(String ordealref) {
        this.ordealref = ordealref;
    }

    public String getOrdealsystemid() {
        return ordealsystemid;
    }

    public void setOrdealsystemid(String ordealsystemid) {
        this.ordealsystemid = ordealsystemid;
    }

    public Long getOrdealid() {
        return ordealid;
    }

    public void setOrdealid(Long ordealid) {
        this.ordealid = ordealid;
    }

    public Boolean getOrdealexists() {
        return ordealexists;
    }

    public void setOrdealexists(Boolean ordealexists) {
        this.ordealexists = ordealexists;
    }

    public String getOrdealdate() {
        return ordealdate;
    }

    public void setOrdealdate(String ordealdate) {
        this.ordealdate = ordealdate;
    }

    public Date getOrdealdateAsDate() {
        return ordealdateAsDate;
    }

    public void setOrdealdateAsDate(Date ordealdateAsDate) {
        this.ordealdateAsDate = ordealdateAsDate;
    }

    public String getOrdealtype() {
        return ordealtype;
    }

    public void setOrdealtype(String ordealtype) {
        this.ordealtype = ordealtype;
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
        Ordeal ordeal = (Ordeal) o;
        return Objects.equals(ordealref, ordeal.ordealref) &&
                Objects.equals(ordealsystemid, ordeal.ordealsystemid) &&
                Objects.equals(ordealid, ordeal.ordealid) &&
                Objects.equals(ordealexists, ordeal.ordealexists) &&
                Objects.equals(ordealdate, ordeal.ordealdate) &&
                Objects.equals(ordealdateAsDate, ordeal.ordealdateAsDate) &&
                Objects.equals(ordealtype, ordeal.ordealtype) &&
                Objects.equals(createdby, ordeal.createdby) &&
                Objects.equals(createdate, ordeal.createdate) &&
                Objects.equals(lastupdatedby, ordeal.lastupdatedby) &&
                Objects.equals(lastupdatedon, ordeal.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ordealref, ordealsystemid, ordealid, ordealexists, ordealdate, ordealdateAsDate, ordealtype, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Trial getWdbTrialByTrialref() {
        return wdbTrialByTrialref;
    }

    public void setWdbTrialByTrialref(Trial wdbTrialByTrialref) {
        this.wdbTrialByTrialref = wdbTrialByTrialref;
    }
}

package com.scottishwitchcraft.webapi.models;

import java.sql.Date;
import java.util.Objects;

public class RitualObject {
    private String ritualobjectref;
    private String ritualobjectsystemid;
    private Long ritualobjectid;
    private String ritualobjectType;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Case wdbCaseByCaseref;

    public String getRitualobjectref() {
        return ritualobjectref;
    }

    public void setRitualobjectref(String ritualobjectref) {
        this.ritualobjectref = ritualobjectref;
    }

    public String getRitualobjectsystemid() {
        return ritualobjectsystemid;
    }

    public void setRitualobjectsystemid(String ritualobjectsystemid) {
        this.ritualobjectsystemid = ritualobjectsystemid;
    }

    public Long getRitualobjectid() {
        return ritualobjectid;
    }

    public void setRitualobjectid(Long ritualobjectid) {
        this.ritualobjectid = ritualobjectid;
    }

    public String getRitualobjectType() {
        return ritualobjectType;
    }

    public void setRitualobjectType(String ritualobjectType) {
        this.ritualobjectType = ritualobjectType;
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
        RitualObject that = (RitualObject) o;
        return Objects.equals(ritualobjectref, that.ritualobjectref) &&
                Objects.equals(ritualobjectsystemid, that.ritualobjectsystemid) &&
                Objects.equals(ritualobjectid, that.ritualobjectid) &&
                Objects.equals(ritualobjectType, that.ritualobjectType) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ritualobjectref, ritualobjectsystemid, ritualobjectid, ritualobjectType, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Case getWdbCaseByCaseref() {
        return wdbCaseByCaseref;
    }

    public void setWdbCaseByCaseref(Case wdbCaseByCaseref) {
        this.wdbCaseByCaseref = wdbCaseByCaseref;
    }
}

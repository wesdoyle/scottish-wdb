package com.scottishwitchcraft.webapi.models;

import java.sql.Date;
import java.util.Objects;

public class DevilAppearance {
    private String devilref;
    private String devilsystemid;
    private Long devilid;
    private String devilType;
    private String devilText;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Case wdbCaseByCaseref;

    public String getDevilref() {
        return devilref;
    }

    public void setDevilref(String devilref) {
        this.devilref = devilref;
    }

    public String getDevilsystemid() {
        return devilsystemid;
    }

    public void setDevilsystemid(String devilsystemid) {
        this.devilsystemid = devilsystemid;
    }

    public Long getDevilid() {
        return devilid;
    }

    public void setDevilid(Long devilid) {
        this.devilid = devilid;
    }

    public String getDevilType() {
        return devilType;
    }

    public void setDevilType(String devilType) {
        this.devilType = devilType;
    }

    public String getDevilText() {
        return devilText;
    }

    public void setDevilText(String devilText) {
        this.devilText = devilText;
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
        DevilAppearance that = (DevilAppearance) o;
        return Objects.equals(devilref, that.devilref) &&
                Objects.equals(devilsystemid, that.devilsystemid) &&
                Objects.equals(devilid, that.devilid) &&
                Objects.equals(devilType, that.devilType) &&
                Objects.equals(devilText, that.devilText) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(devilref, devilsystemid, devilid, devilType, devilText, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Case getWdbCaseByCaseref() {
        return wdbCaseByCaseref;
    }

    public void setWdbCaseByCaseref(Case wdbCaseByCaseref) {
        this.wdbCaseByCaseref = wdbCaseByCaseref;
    }
}

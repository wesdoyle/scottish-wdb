package com.scottishwitchcraft.webapi.models;

import java.sql.Date;
import java.util.Objects;

public class ReligiousMotif {
    private String motifref;
    private String motifsystemid;
    private Long motifid;
    private String motifType;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Case wdbCaseByCaseref;

    public String getMotifref() {
        return motifref;
    }

    public void setMotifref(String motifref) {
        this.motifref = motifref;
    }

    public String getMotifsystemid() {
        return motifsystemid;
    }

    public void setMotifsystemid(String motifsystemid) {
        this.motifsystemid = motifsystemid;
    }

    public Long getMotifid() {
        return motifid;
    }

    public void setMotifid(Long motifid) {
        this.motifid = motifid;
    }

    public String getMotifType() {
        return motifType;
    }

    public void setMotifType(String motifType) {
        this.motifType = motifType;
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
        ReligiousMotif that = (ReligiousMotif) o;
        return Objects.equals(motifref, that.motifref) &&
                Objects.equals(motifsystemid, that.motifsystemid) &&
                Objects.equals(motifid, that.motifid) &&
                Objects.equals(motifType, that.motifType) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(motifref, motifsystemid, motifid, motifType, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Case getWdbCaseByCaseref() {
        return wdbCaseByCaseref;
    }

    public void setWdbCaseByCaseref(Case wdbCaseByCaseref) {
        this.wdbCaseByCaseref = wdbCaseByCaseref;
    }
}

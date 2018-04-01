package com.scottishwitchcraft.models;

import java.sql.Date;
import java.util.Objects;

public class WhiteMagic {
    private String whitemagicref;
    private String whitemagicsystemid;
    private Long whitemagicid;
    private String whitemagicType;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Case wdbCaseByCaseref;

    public String getWhitemagicref() {
        return whitemagicref;
    }

    public void setWhitemagicref(String whitemagicref) {
        this.whitemagicref = whitemagicref;
    }

    public String getWhitemagicsystemid() {
        return whitemagicsystemid;
    }

    public void setWhitemagicsystemid(String whitemagicsystemid) {
        this.whitemagicsystemid = whitemagicsystemid;
    }

    public Long getWhitemagicid() {
        return whitemagicid;
    }

    public void setWhitemagicid(Long whitemagicid) {
        this.whitemagicid = whitemagicid;
    }

    public String getWhitemagicType() {
        return whitemagicType;
    }

    public void setWhitemagicType(String whitemagicType) {
        this.whitemagicType = whitemagicType;
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
        WhiteMagic that = (WhiteMagic) o;
        return Objects.equals(whitemagicref, that.whitemagicref) &&
                Objects.equals(whitemagicsystemid, that.whitemagicsystemid) &&
                Objects.equals(whitemagicid, that.whitemagicid) &&
                Objects.equals(whitemagicType, that.whitemagicType) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(whitemagicref, whitemagicsystemid, whitemagicid, whitemagicType, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Case getWdbCaseByCaseref() {
        return wdbCaseByCaseref;
    }

    public void setWdbCaseByCaseref(Case wdbCaseByCaseref) {
        this.wdbCaseByCaseref = wdbCaseByCaseref;
    }
}

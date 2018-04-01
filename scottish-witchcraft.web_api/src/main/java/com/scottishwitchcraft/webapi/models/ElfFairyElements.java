package com.scottishwitchcraft.webapi.models;

import java.sql.Date;
import java.util.Objects;

public class ElfFairyElements {
    private String elffairyref;
    private String elffairysystemid;
    private Long elffairyid;
    private String elffairyType;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Case wdbCaseByCaseref;

    public String getElffairyref() {
        return elffairyref;
    }

    public void setElffairyref(String elffairyref) {
        this.elffairyref = elffairyref;
    }

    public String getElffairysystemid() {
        return elffairysystemid;
    }

    public void setElffairysystemid(String elffairysystemid) {
        this.elffairysystemid = elffairysystemid;
    }

    public Long getElffairyid() {
        return elffairyid;
    }

    public void setElffairyid(Long elffairyid) {
        this.elffairyid = elffairyid;
    }

    public String getElffairyType() {
        return elffairyType;
    }

    public void setElffairyType(String elffairyType) {
        this.elffairyType = elffairyType;
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
        ElfFairyElements that = (ElfFairyElements) o;
        return Objects.equals(elffairyref, that.elffairyref) &&
                Objects.equals(elffairysystemid, that.elffairysystemid) &&
                Objects.equals(elffairyid, that.elffairyid) &&
                Objects.equals(elffairyType, that.elffairyType) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(elffairyref, elffairysystemid, elffairyid, elffairyType, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Case getWdbCaseByCaseref() {
        return wdbCaseByCaseref;
    }

    public void setWdbCaseByCaseref(Case wdbCaseByCaseref) {
        this.wdbCaseByCaseref = wdbCaseByCaseref;
    }
}

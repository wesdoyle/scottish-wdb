package com.scottishwitchcraft.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class OtherCharges {
    @Id
    private String otherchargesref;
    private String otherchargessystemid;
    private Long otherchargesid;
    private String otherchargesType;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Case wdbCaseByCaseref;

    public String getOtherchargesref() {
        return otherchargesref;
    }

    public void setOtherchargesref(String otherchargesref) {
        this.otherchargesref = otherchargesref;
    }

    public String getOtherchargessystemid() {
        return otherchargessystemid;
    }

    public void setOtherchargessystemid(String otherchargessystemid) {
        this.otherchargessystemid = otherchargessystemid;
    }

    public Long getOtherchargesid() {
        return otherchargesid;
    }

    public void setOtherchargesid(Long otherchargesid) {
        this.otherchargesid = otherchargesid;
    }

    public String getOtherchargesType() {
        return otherchargesType;
    }

    public void setOtherchargesType(String otherchargesType) {
        this.otherchargesType = otherchargesType;
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
        OtherCharges that = (OtherCharges) o;
        return Objects.equals(otherchargesref, that.otherchargesref) &&
                Objects.equals(otherchargessystemid, that.otherchargessystemid) &&
                Objects.equals(otherchargesid, that.otherchargesid) &&
                Objects.equals(otherchargesType, that.otherchargesType) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(otherchargesref, otherchargessystemid, otherchargesid, otherchargesType, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Case getWdbCaseByCaseref() {
        return wdbCaseByCaseref;
    }

    public void setWdbCaseByCaseref(Case wdbCaseByCaseref) {
        this.wdbCaseByCaseref = wdbCaseByCaseref;
    }
}

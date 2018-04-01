package com.scottishwitchcraft.models;

import java.sql.Date;
import java.util.Objects;

public class PropertyDamage {
    private String propertydamageref;
    private String propertydamagesystemid;
    private Long propertydamageid;
    private String propertydamageType;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Case wdbCaseByCaseref;

    public String getPropertydamageref() {
        return propertydamageref;
    }

    public void setPropertydamageref(String propertydamageref) {
        this.propertydamageref = propertydamageref;
    }

    public String getPropertydamagesystemid() {
        return propertydamagesystemid;
    }

    public void setPropertydamagesystemid(String propertydamagesystemid) {
        this.propertydamagesystemid = propertydamagesystemid;
    }

    public Long getPropertydamageid() {
        return propertydamageid;
    }

    public void setPropertydamageid(Long propertydamageid) {
        this.propertydamageid = propertydamageid;
    }

    public String getPropertydamageType() {
        return propertydamageType;
    }

    public void setPropertydamageType(String propertydamageType) {
        this.propertydamageType = propertydamageType;
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
        PropertyDamage that = (PropertyDamage) o;
        return Objects.equals(propertydamageref, that.propertydamageref) &&
                Objects.equals(propertydamagesystemid, that.propertydamagesystemid) &&
                Objects.equals(propertydamageid, that.propertydamageid) &&
                Objects.equals(propertydamageType, that.propertydamageType) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(propertydamageref, propertydamagesystemid, propertydamageid, propertydamageType, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Case getWdbCaseByCaseref() {
        return wdbCaseByCaseref;
    }

    public void setWdbCaseByCaseref(Case wdbCaseByCaseref) {
        this.wdbCaseByCaseref = wdbCaseByCaseref;
    }
}

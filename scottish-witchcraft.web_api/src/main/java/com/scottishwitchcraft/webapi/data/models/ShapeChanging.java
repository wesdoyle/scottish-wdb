package com.scottishwitchcraft.webapi.data.models;

import java.sql.Date;
import java.util.Objects;

public class ShapeChanging {
    private String shapechangingref;
    private String shapechangingsystemid;
    private Long shapechangingid;
    private String shapechangingType;
    private String details;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Case wdbCaseByCaseref;

    public String getShapechangingref() {
        return shapechangingref;
    }

    public void setShapechangingref(String shapechangingref) {
        this.shapechangingref = shapechangingref;
    }

    public String getShapechangingsystemid() {
        return shapechangingsystemid;
    }

    public void setShapechangingsystemid(String shapechangingsystemid) {
        this.shapechangingsystemid = shapechangingsystemid;
    }

    public Long getShapechangingid() {
        return shapechangingid;
    }

    public void setShapechangingid(Long shapechangingid) {
        this.shapechangingid = shapechangingid;
    }

    public String getShapechangingType() {
        return shapechangingType;
    }

    public void setShapechangingType(String shapechangingType) {
        this.shapechangingType = shapechangingType;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
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
        ShapeChanging that = (ShapeChanging) o;
        return Objects.equals(shapechangingref, that.shapechangingref) &&
                Objects.equals(shapechangingsystemid, that.shapechangingsystemid) &&
                Objects.equals(shapechangingid, that.shapechangingid) &&
                Objects.equals(shapechangingType, that.shapechangingType) &&
                Objects.equals(details, that.details) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(shapechangingref, shapechangingsystemid, shapechangingid, shapechangingType, details, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Case getWdbCaseByCaseref() {
        return wdbCaseByCaseref;
    }

    public void setWdbCaseByCaseref(Case wdbCaseByCaseref) {
        this.wdbCaseByCaseref = wdbCaseByCaseref;
    }
}

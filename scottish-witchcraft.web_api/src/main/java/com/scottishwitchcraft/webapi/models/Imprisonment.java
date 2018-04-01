package com.scottishwitchcraft.webapi.models;

import java.sql.Date;
import java.util.Objects;

public class Imprisonment {
    private String imprisonref;
    private String imprisonsystemid;
    private Long imprisonid;
    private Boolean centraltrialimprison;
    private String imprisondate;
    private Date imprisondateAsDate;
    private String prison;
    private String location;
    private Boolean moving;
    private String fateInPrison;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Trial wdbTrialByTrialref;

    public String getImprisonref() {
        return imprisonref;
    }

    public void setImprisonref(String imprisonref) {
        this.imprisonref = imprisonref;
    }

    public String getImprisonsystemid() {
        return imprisonsystemid;
    }

    public void setImprisonsystemid(String imprisonsystemid) {
        this.imprisonsystemid = imprisonsystemid;
    }

    public Long getImprisonid() {
        return imprisonid;
    }

    public void setImprisonid(Long imprisonid) {
        this.imprisonid = imprisonid;
    }

    public Boolean getCentraltrialimprison() {
        return centraltrialimprison;
    }

    public void setCentraltrialimprison(Boolean centraltrialimprison) {
        this.centraltrialimprison = centraltrialimprison;
    }

    public String getImprisondate() {
        return imprisondate;
    }

    public void setImprisondate(String imprisondate) {
        this.imprisondate = imprisondate;
    }

    public Date getImprisondateAsDate() {
        return imprisondateAsDate;
    }

    public void setImprisondateAsDate(Date imprisondateAsDate) {
        this.imprisondateAsDate = imprisondateAsDate;
    }

    public String getPrison() {
        return prison;
    }

    public void setPrison(String prison) {
        this.prison = prison;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getMoving() {
        return moving;
    }

    public void setMoving(Boolean moving) {
        this.moving = moving;
    }

    public String getFateInPrison() {
        return fateInPrison;
    }

    public void setFateInPrison(String fateInPrison) {
        this.fateInPrison = fateInPrison;
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
        Imprisonment that = (Imprisonment) o;
        return Objects.equals(imprisonref, that.imprisonref) &&
                Objects.equals(imprisonsystemid, that.imprisonsystemid) &&
                Objects.equals(imprisonid, that.imprisonid) &&
                Objects.equals(centraltrialimprison, that.centraltrialimprison) &&
                Objects.equals(imprisondate, that.imprisondate) &&
                Objects.equals(imprisondateAsDate, that.imprisondateAsDate) &&
                Objects.equals(prison, that.prison) &&
                Objects.equals(location, that.location) &&
                Objects.equals(moving, that.moving) &&
                Objects.equals(fateInPrison, that.fateInPrison) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(imprisonref, imprisonsystemid, imprisonid, centraltrialimprison, imprisondate, imprisondateAsDate, prison, location, moving, fateInPrison, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Trial getWdbTrialByTrialref() {
        return wdbTrialByTrialref;
    }

    public void setWdbTrialByTrialref(Trial wdbTrialByTrialref) {
        this.wdbTrialByTrialref = wdbTrialByTrialref;
    }
}

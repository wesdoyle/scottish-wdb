package com.scottishwitchcraft.webapi.models;

import java.sql.Date;
import java.util.Objects;

public class WitchesMeetingPlace {
    private String meetingplaceref;
    private String meetingplacesystemid;
    private Long meetingplaceid;
    private String meetingplacePlace;
    private Boolean inversion;
    private String location;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Case wdbCaseByCaseref;

    public String getMeetingplaceref() {
        return meetingplaceref;
    }

    public void setMeetingplaceref(String meetingplaceref) {
        this.meetingplaceref = meetingplaceref;
    }

    public String getMeetingplacesystemid() {
        return meetingplacesystemid;
    }

    public void setMeetingplacesystemid(String meetingplacesystemid) {
        this.meetingplacesystemid = meetingplacesystemid;
    }

    public Long getMeetingplaceid() {
        return meetingplaceid;
    }

    public void setMeetingplaceid(Long meetingplaceid) {
        this.meetingplaceid = meetingplaceid;
    }

    public String getMeetingplacePlace() {
        return meetingplacePlace;
    }

    public void setMeetingplacePlace(String meetingplacePlace) {
        this.meetingplacePlace = meetingplacePlace;
    }

    public Boolean getInversion() {
        return inversion;
    }

    public void setInversion(Boolean inversion) {
        this.inversion = inversion;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
        WitchesMeetingPlace that = (WitchesMeetingPlace) o;
        return Objects.equals(meetingplaceref, that.meetingplaceref) &&
                Objects.equals(meetingplacesystemid, that.meetingplacesystemid) &&
                Objects.equals(meetingplaceid, that.meetingplaceid) &&
                Objects.equals(meetingplacePlace, that.meetingplacePlace) &&
                Objects.equals(inversion, that.inversion) &&
                Objects.equals(location, that.location) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(meetingplaceref, meetingplacesystemid, meetingplaceid, meetingplacePlace, inversion, location, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Case getWdbCaseByCaseref() {
        return wdbCaseByCaseref;
    }

    public void setWdbCaseByCaseref(Case wdbCaseByCaseref) {
        this.wdbCaseByCaseref = wdbCaseByCaseref;
    }
}

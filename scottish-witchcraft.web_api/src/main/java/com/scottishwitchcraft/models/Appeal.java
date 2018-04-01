package com.scottishwitchcraft.models;

import java.sql.Date;
import java.util.Objects;

public class Appeal {
    private String appealref;
    private String appealsystemid;
    private Long appealid;
    private String centralauth;
    private String reason;
    private Boolean appealexists;
    private String appealdate;
    private Date appealdateAsDate;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Trial wdbTrialByTrialref;
    private Person wdbPersonByPersonref;

    public String getAppealref() {
        return appealref;
    }

    public void setAppealref(String appealref) {
        this.appealref = appealref;
    }

    public String getAppealsystemid() {
        return appealsystemid;
    }

    public void setAppealsystemid(String appealsystemid) {
        this.appealsystemid = appealsystemid;
    }

    public Long getAppealid() {
        return appealid;
    }

    public void setAppealid(Long appealid) {
        this.appealid = appealid;
    }

    public String getCentralauth() {
        return centralauth;
    }

    public void setCentralauth(String centralauth) {
        this.centralauth = centralauth;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Boolean getAppealexists() {
        return appealexists;
    }

    public void setAppealexists(Boolean appealexists) {
        this.appealexists = appealexists;
    }

    public String getAppealdate() {
        return appealdate;
    }

    public void setAppealdate(String appealdate) {
        this.appealdate = appealdate;
    }

    public Date getAppealdateAsDate() {
        return appealdateAsDate;
    }

    public void setAppealdateAsDate(Date appealdateAsDate) {
        this.appealdateAsDate = appealdateAsDate;
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
        Appeal appeal = (Appeal) o;
        return Objects.equals(appealref, appeal.appealref) &&
                Objects.equals(appealsystemid, appeal.appealsystemid) &&
                Objects.equals(appealid, appeal.appealid) &&
                Objects.equals(centralauth, appeal.centralauth) &&
                Objects.equals(reason, appeal.reason) &&
                Objects.equals(appealexists, appeal.appealexists) &&
                Objects.equals(appealdate, appeal.appealdate) &&
                Objects.equals(appealdateAsDate, appeal.appealdateAsDate) &&
                Objects.equals(createdby, appeal.createdby) &&
                Objects.equals(createdate, appeal.createdate) &&
                Objects.equals(lastupdatedby, appeal.lastupdatedby) &&
                Objects.equals(lastupdatedon, appeal.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(appealref, appealsystemid, appealid, centralauth, reason, appealexists, appealdate, appealdateAsDate, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Trial getWdbTrialByTrialref() {
        return wdbTrialByTrialref;
    }

    public void setWdbTrialByTrialref(Trial wdbTrialByTrialref) {
        this.wdbTrialByTrialref = wdbTrialByTrialref;
    }

    public Person getWdbPersonByPersonref() {
        return wdbPersonByPersonref;
    }

    public void setWdbPersonByPersonref(Person wdbPersonByPersonref) {
        this.wdbPersonByPersonref = wdbPersonByPersonref;
    }
}

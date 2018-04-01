package com.scottishwitchcraft.models;

import java.sql.Date;
import java.util.Objects;

public class TrialPerson {
    private String trialPersonref;
    private Long trialPersonid;
    private String trialPersonsystemid;
    private String involvement;
    private Boolean witchpricker;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Trial wdbTrialByTrialref;
    private Person wdbPersonByPersonref;
    private Case wdbCaseByCaseref;

    public String getTrialPersonref() {
        return trialPersonref;
    }

    public void setTrialPersonref(String trialPersonref) {
        this.trialPersonref = trialPersonref;
    }

    public Long getTrialPersonid() {
        return trialPersonid;
    }

    public void setTrialPersonid(Long trialPersonid) {
        this.trialPersonid = trialPersonid;
    }

    public String getTrialPersonsystemid() {
        return trialPersonsystemid;
    }

    public void setTrialPersonsystemid(String trialPersonsystemid) {
        this.trialPersonsystemid = trialPersonsystemid;
    }

    public String getInvolvement() {
        return involvement;
    }

    public void setInvolvement(String involvement) {
        this.involvement = involvement;
    }

    public Boolean getWitchpricker() {
        return witchpricker;
    }

    public void setWitchpricker(Boolean witchpricker) {
        this.witchpricker = witchpricker;
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
        TrialPerson that = (TrialPerson) o;
        return Objects.equals(trialPersonref, that.trialPersonref) &&
                Objects.equals(trialPersonid, that.trialPersonid) &&
                Objects.equals(trialPersonsystemid, that.trialPersonsystemid) &&
                Objects.equals(involvement, that.involvement) &&
                Objects.equals(witchpricker, that.witchpricker) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(trialPersonref, trialPersonid, trialPersonsystemid, involvement, witchpricker, createdby, createdate, lastupdatedby, lastupdatedon);
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

    public Case getWdbCaseByCaseref() {
        return wdbCaseByCaseref;
    }

    public void setWdbCaseByCaseref(Case wdbCaseByCaseref) {
        this.wdbCaseByCaseref = wdbCaseByCaseref;
    }
}

package com.scottishwitchcraft.webapi.data.models;

import java.sql.Date;
import java.util.Objects;

public class Confession {
    private String confessionref;
    private String confessionsystemid;
    private Long confessionid;
    private Boolean centraltrialconfession;
    private Boolean confessionrec;
    private String confessiondate;
    private Date confessiondateAsDate;
    private String confessionplace;
    private String confessionlocation;
    private Boolean confessiontext;
    private Boolean confessiondetails;
    private Boolean confessionret;
    private String notes;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Trial wdbTrialByTrialref;

    public String getConfessionref() {
        return confessionref;
    }

    public void setConfessionref(String confessionref) {
        this.confessionref = confessionref;
    }

    public String getConfessionsystemid() {
        return confessionsystemid;
    }

    public void setConfessionsystemid(String confessionsystemid) {
        this.confessionsystemid = confessionsystemid;
    }

    public Long getConfessionid() {
        return confessionid;
    }

    public void setConfessionid(Long confessionid) {
        this.confessionid = confessionid;
    }

    public Boolean getCentraltrialconfession() {
        return centraltrialconfession;
    }

    public void setCentraltrialconfession(Boolean centraltrialconfession) {
        this.centraltrialconfession = centraltrialconfession;
    }

    public Boolean getConfessionrec() {
        return confessionrec;
    }

    public void setConfessionrec(Boolean confessionrec) {
        this.confessionrec = confessionrec;
    }

    public String getConfessiondate() {
        return confessiondate;
    }

    public void setConfessiondate(String confessiondate) {
        this.confessiondate = confessiondate;
    }

    public Date getConfessiondateAsDate() {
        return confessiondateAsDate;
    }

    public void setConfessiondateAsDate(Date confessiondateAsDate) {
        this.confessiondateAsDate = confessiondateAsDate;
    }

    public String getConfessionplace() {
        return confessionplace;
    }

    public void setConfessionplace(String confessionplace) {
        this.confessionplace = confessionplace;
    }

    public String getConfessionlocation() {
        return confessionlocation;
    }

    public void setConfessionlocation(String confessionlocation) {
        this.confessionlocation = confessionlocation;
    }

    public Boolean getConfessiontext() {
        return confessiontext;
    }

    public void setConfessiontext(Boolean confessiontext) {
        this.confessiontext = confessiontext;
    }

    public Boolean getConfessiondetails() {
        return confessiondetails;
    }

    public void setConfessiondetails(Boolean confessiondetails) {
        this.confessiondetails = confessiondetails;
    }

    public Boolean getConfessionret() {
        return confessionret;
    }

    public void setConfessionret(Boolean confessionret) {
        this.confessionret = confessionret;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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
        Confession that = (Confession) o;
        return Objects.equals(confessionref, that.confessionref) &&
                Objects.equals(confessionsystemid, that.confessionsystemid) &&
                Objects.equals(confessionid, that.confessionid) &&
                Objects.equals(centraltrialconfession, that.centraltrialconfession) &&
                Objects.equals(confessionrec, that.confessionrec) &&
                Objects.equals(confessiondate, that.confessiondate) &&
                Objects.equals(confessiondateAsDate, that.confessiondateAsDate) &&
                Objects.equals(confessionplace, that.confessionplace) &&
                Objects.equals(confessionlocation, that.confessionlocation) &&
                Objects.equals(confessiontext, that.confessiontext) &&
                Objects.equals(confessiondetails, that.confessiondetails) &&
                Objects.equals(confessionret, that.confessionret) &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(confessionref, confessionsystemid, confessionid, centraltrialconfession, confessionrec, confessiondate, confessiondateAsDate, confessionplace, confessionlocation, confessiontext, confessiondetails, confessionret, notes, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Trial getWdbTrialByTrialref() {
        return wdbTrialByTrialref;
    }

    public void setWdbTrialByTrialref(Trial wdbTrialByTrialref) {
        this.wdbTrialByTrialref = wdbTrialByTrialref;
    }
}

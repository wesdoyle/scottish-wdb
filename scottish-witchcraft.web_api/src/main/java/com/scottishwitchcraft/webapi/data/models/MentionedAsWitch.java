package com.scottishwitchcraft.webapi.data.models;

import java.sql.Date;
import java.util.Objects;

public class MentionedAsWitch {
    private String mentionref;
    private String mentionsystemid;
    private Long mentionid;
    private String mentiondate;
    private Date mentiondateAsDate;
    private String mentiontype;
    private String trialofaccusedref;
    private String trialoffirstname;
    private String trialoflastname;
    private String mentionedintrialofref;
    private String dateofmentionedtrial;
    private Date dateofmentionedtrialAsDate;
    private String fateofmentionedwitch;
    private String notes;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Trial wdbTrialByTrialref;

    public String getMentionref() {
        return mentionref;
    }

    public void setMentionref(String mentionref) {
        this.mentionref = mentionref;
    }

    public String getMentionsystemid() {
        return mentionsystemid;
    }

    public void setMentionsystemid(String mentionsystemid) {
        this.mentionsystemid = mentionsystemid;
    }

    public Long getMentionid() {
        return mentionid;
    }

    public void setMentionid(Long mentionid) {
        this.mentionid = mentionid;
    }

    public String getMentiondate() {
        return mentiondate;
    }

    public void setMentiondate(String mentiondate) {
        this.mentiondate = mentiondate;
    }

    public Date getMentiondateAsDate() {
        return mentiondateAsDate;
    }

    public void setMentiondateAsDate(Date mentiondateAsDate) {
        this.mentiondateAsDate = mentiondateAsDate;
    }

    public String getMentiontype() {
        return mentiontype;
    }

    public void setMentiontype(String mentiontype) {
        this.mentiontype = mentiontype;
    }

    public String getTrialofaccusedref() {
        return trialofaccusedref;
    }

    public void setTrialofaccusedref(String trialofaccusedref) {
        this.trialofaccusedref = trialofaccusedref;
    }

    public String getTrialoffirstname() {
        return trialoffirstname;
    }

    public void setTrialoffirstname(String trialoffirstname) {
        this.trialoffirstname = trialoffirstname;
    }

    public String getTrialoflastname() {
        return trialoflastname;
    }

    public void setTrialoflastname(String trialoflastname) {
        this.trialoflastname = trialoflastname;
    }

    public String getMentionedintrialofref() {
        return mentionedintrialofref;
    }

    public void setMentionedintrialofref(String mentionedintrialofref) {
        this.mentionedintrialofref = mentionedintrialofref;
    }

    public String getDateofmentionedtrial() {
        return dateofmentionedtrial;
    }

    public void setDateofmentionedtrial(String dateofmentionedtrial) {
        this.dateofmentionedtrial = dateofmentionedtrial;
    }

    public Date getDateofmentionedtrialAsDate() {
        return dateofmentionedtrialAsDate;
    }

    public void setDateofmentionedtrialAsDate(Date dateofmentionedtrialAsDate) {
        this.dateofmentionedtrialAsDate = dateofmentionedtrialAsDate;
    }

    public String getFateofmentionedwitch() {
        return fateofmentionedwitch;
    }

    public void setFateofmentionedwitch(String fateofmentionedwitch) {
        this.fateofmentionedwitch = fateofmentionedwitch;
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
        MentionedAsWitch that = (MentionedAsWitch) o;
        return Objects.equals(mentionref, that.mentionref) &&
                Objects.equals(mentionsystemid, that.mentionsystemid) &&
                Objects.equals(mentionid, that.mentionid) &&
                Objects.equals(mentiondate, that.mentiondate) &&
                Objects.equals(mentiondateAsDate, that.mentiondateAsDate) &&
                Objects.equals(mentiontype, that.mentiontype) &&
                Objects.equals(trialofaccusedref, that.trialofaccusedref) &&
                Objects.equals(trialoffirstname, that.trialoffirstname) &&
                Objects.equals(trialoflastname, that.trialoflastname) &&
                Objects.equals(mentionedintrialofref, that.mentionedintrialofref) &&
                Objects.equals(dateofmentionedtrial, that.dateofmentionedtrial) &&
                Objects.equals(dateofmentionedtrialAsDate, that.dateofmentionedtrialAsDate) &&
                Objects.equals(fateofmentionedwitch, that.fateofmentionedwitch) &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(mentionref, mentionsystemid, mentionid, mentiondate, mentiondateAsDate, mentiontype, trialofaccusedref, trialoffirstname, trialoflastname, mentionedintrialofref, dateofmentionedtrial, dateofmentionedtrialAsDate, fateofmentionedwitch, notes, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Trial getWdbTrialByTrialref() {
        return wdbTrialByTrialref;
    }

    public void setWdbTrialByTrialref(Trial wdbTrialByTrialref) {
        this.wdbTrialByTrialref = wdbTrialByTrialref;
    }
}

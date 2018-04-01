package com.scottishwitchcraft.webapi.data.models;

import java.sql.Date;
import java.util.Objects;

public class OtherNamedWitch {
    private String namedwitchref;
    private String namedwitchsystemid;
    private Long namedwitchid;
    private String mentiontype;
    private String namedwitchaccusedref;
    private String namedwitchfirstname;
    private String namedwitchlastname;
    private String namedwitchtrialofref;
    private String dateofnamedwitchtrial;
    private Date dateofnamedwitchtrialAsDate;
    private String notes;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Trial wdbTrialByTrialref;

    public String getNamedwitchref() {
        return namedwitchref;
    }

    public void setNamedwitchref(String namedwitchref) {
        this.namedwitchref = namedwitchref;
    }

    public String getNamedwitchsystemid() {
        return namedwitchsystemid;
    }

    public void setNamedwitchsystemid(String namedwitchsystemid) {
        this.namedwitchsystemid = namedwitchsystemid;
    }

    public Long getNamedwitchid() {
        return namedwitchid;
    }

    public void setNamedwitchid(Long namedwitchid) {
        this.namedwitchid = namedwitchid;
    }

    public String getMentiontype() {
        return mentiontype;
    }

    public void setMentiontype(String mentiontype) {
        this.mentiontype = mentiontype;
    }

    public String getNamedwitchaccusedref() {
        return namedwitchaccusedref;
    }

    public void setNamedwitchaccusedref(String namedwitchaccusedref) {
        this.namedwitchaccusedref = namedwitchaccusedref;
    }

    public String getNamedwitchfirstname() {
        return namedwitchfirstname;
    }

    public void setNamedwitchfirstname(String namedwitchfirstname) {
        this.namedwitchfirstname = namedwitchfirstname;
    }

    public String getNamedwitchlastname() {
        return namedwitchlastname;
    }

    public void setNamedwitchlastname(String namedwitchlastname) {
        this.namedwitchlastname = namedwitchlastname;
    }

    public String getNamedwitchtrialofref() {
        return namedwitchtrialofref;
    }

    public void setNamedwitchtrialofref(String namedwitchtrialofref) {
        this.namedwitchtrialofref = namedwitchtrialofref;
    }

    public String getDateofnamedwitchtrial() {
        return dateofnamedwitchtrial;
    }

    public void setDateofnamedwitchtrial(String dateofnamedwitchtrial) {
        this.dateofnamedwitchtrial = dateofnamedwitchtrial;
    }

    public Date getDateofnamedwitchtrialAsDate() {
        return dateofnamedwitchtrialAsDate;
    }

    public void setDateofnamedwitchtrialAsDate(Date dateofnamedwitchtrialAsDate) {
        this.dateofnamedwitchtrialAsDate = dateofnamedwitchtrialAsDate;
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
        OtherNamedWitch that = (OtherNamedWitch) o;
        return Objects.equals(namedwitchref, that.namedwitchref) &&
                Objects.equals(namedwitchsystemid, that.namedwitchsystemid) &&
                Objects.equals(namedwitchid, that.namedwitchid) &&
                Objects.equals(mentiontype, that.mentiontype) &&
                Objects.equals(namedwitchaccusedref, that.namedwitchaccusedref) &&
                Objects.equals(namedwitchfirstname, that.namedwitchfirstname) &&
                Objects.equals(namedwitchlastname, that.namedwitchlastname) &&
                Objects.equals(namedwitchtrialofref, that.namedwitchtrialofref) &&
                Objects.equals(dateofnamedwitchtrial, that.dateofnamedwitchtrial) &&
                Objects.equals(dateofnamedwitchtrialAsDate, that.dateofnamedwitchtrialAsDate) &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(namedwitchref, namedwitchsystemid, namedwitchid, mentiontype, namedwitchaccusedref, namedwitchfirstname, namedwitchlastname, namedwitchtrialofref, dateofnamedwitchtrial, dateofnamedwitchtrialAsDate, notes, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Trial getWdbTrialByTrialref() {
        return wdbTrialByTrialref;
    }

    public void setWdbTrialByTrialref(Trial wdbTrialByTrialref) {
        this.wdbTrialByTrialref = wdbTrialByTrialref;
    }
}

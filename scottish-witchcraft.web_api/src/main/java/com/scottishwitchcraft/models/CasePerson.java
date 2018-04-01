package com.scottishwitchcraft.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "wdb_caseperson")
public class CasePerson {
    @Id
    private String casePersonref;
    private Long casePersonid;
    private String casePersonsystemid;
    private String involvement;
    private String notes;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    // private Case wdbCaseByCaseref;
    @OneToOne
    private Person wdbPersonByPersonref;

    public String getCasePersonref() {
        return casePersonref;
    }

    public void setCasePersonref(String casePersonref) {
        this.casePersonref = casePersonref;
    }

    public Long getCasePersonid() {
        return casePersonid;
    }

    public void setCasePersonid(Long casePersonid) {
        this.casePersonid = casePersonid;
    }

    public String getCasePersonsystemid() {
        return casePersonsystemid;
    }

    public void setCasePersonsystemid(String casePersonsystemid) {
        this.casePersonsystemid = casePersonsystemid;
    }

    public String getInvolvement() {
        return involvement;
    }

    public void setInvolvement(String involvement) {
        this.involvement = involvement;
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
        CasePerson that = (CasePerson) o;
        return Objects.equals(casePersonref, that.casePersonref) &&
                Objects.equals(casePersonid, that.casePersonid) &&
                Objects.equals(casePersonsystemid, that.casePersonsystemid) &&
                Objects.equals(involvement, that.involvement) &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(casePersonref, casePersonid, casePersonsystemid, involvement, notes, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    // public Case getWdbCaseByCaseref() {
    //    return wdbCaseByCaseref;
    // }

    // public void setWdbCaseByCaseref(Case wdbCaseByCaseref) {
    //    this.wdbCaseByCaseref = wdbCaseByCaseref;
    // }

    public Person getWdbPersonByPersonref() {
        return wdbPersonByPersonref;
    }

    public void setWdbPersonByPersonref(Person wdbPersonByPersonref) {
        this.wdbPersonByPersonref = wdbPersonByPersonref;
    }
}

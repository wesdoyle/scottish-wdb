package com.scottishwitchcraft.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Commission {
    @Id
    private String commissionref;
    private String commissionsystemid;
    private Long commissionid;
    private String commbody;
    private String commtype;
    private Boolean commexists;
    private String commdate;
    private Date commdateAsDate;
    private String seal;
    private String notes;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Trial wdbTrialByTrialref;

    public String getCommissionref() {
        return commissionref;
    }

    public void setCommissionref(String commissionref) {
        this.commissionref = commissionref;
    }

    public String getCommissionsystemid() {
        return commissionsystemid;
    }

    public void setCommissionsystemid(String commissionsystemid) {
        this.commissionsystemid = commissionsystemid;
    }

    public Long getCommissionid() {
        return commissionid;
    }

    public void setCommissionid(Long commissionid) {
        this.commissionid = commissionid;
    }

    public String getCommbody() {
        return commbody;
    }

    public void setCommbody(String commbody) {
        this.commbody = commbody;
    }

    public String getCommtype() {
        return commtype;
    }

    public void setCommtype(String commtype) {
        this.commtype = commtype;
    }

    public Boolean getCommexists() {
        return commexists;
    }

    public void setCommexists(Boolean commexists) {
        this.commexists = commexists;
    }

    public String getCommdate() {
        return commdate;
    }

    public void setCommdate(String commdate) {
        this.commdate = commdate;
    }

    public Date getCommdateAsDate() {
        return commdateAsDate;
    }

    public void setCommdateAsDate(Date commdateAsDate) {
        this.commdateAsDate = commdateAsDate;
    }

    public String getSeal() {
        return seal;
    }

    public void setSeal(String seal) {
        this.seal = seal;
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
        Commission that = (Commission) o;
        return Objects.equals(commissionref, that.commissionref) &&
                Objects.equals(commissionsystemid, that.commissionsystemid) &&
                Objects.equals(commissionid, that.commissionid) &&
                Objects.equals(commbody, that.commbody) &&
                Objects.equals(commtype, that.commtype) &&
                Objects.equals(commexists, that.commexists) &&
                Objects.equals(commdate, that.commdate) &&
                Objects.equals(commdateAsDate, that.commdateAsDate) &&
                Objects.equals(seal, that.seal) &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(commissionref, commissionsystemid, commissionid, commbody, commtype, commexists, commdate, commdateAsDate, seal, notes, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Trial getWdbTrialByTrialref() {
        return wdbTrialByTrialref;
    }

    public void setWdbTrialByTrialref(Trial wdbTrialByTrialref) {
        this.wdbTrialByTrialref = wdbTrialByTrialref;
    }
}

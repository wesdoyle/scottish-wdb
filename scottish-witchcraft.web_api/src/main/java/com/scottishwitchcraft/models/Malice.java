package com.scottishwitchcraft.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Malice {
    @Id
    private String maliceref;
    private String malicesystemid;
    private Long maliceid;
    private String causeofmalice;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Case wdbCaseByCaseref;

    public String getMaliceref() {
        return maliceref;
    }

    public void setMaliceref(String maliceref) {
        this.maliceref = maliceref;
    }

    public String getMalicesystemid() {
        return malicesystemid;
    }

    public void setMalicesystemid(String malicesystemid) {
        this.malicesystemid = malicesystemid;
    }

    public Long getMaliceid() {
        return maliceid;
    }

    public void setMaliceid(Long maliceid) {
        this.maliceid = maliceid;
    }

    public String getCauseofmalice() {
        return causeofmalice;
    }

    public void setCauseofmalice(String causeofmalice) {
        this.causeofmalice = causeofmalice;
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
        Malice malice = (Malice) o;
        return Objects.equals(maliceref, malice.maliceref) &&
                Objects.equals(malicesystemid, malice.malicesystemid) &&
                Objects.equals(maliceid, malice.maliceid) &&
                Objects.equals(causeofmalice, malice.causeofmalice) &&
                Objects.equals(createdby, malice.createdby) &&
                Objects.equals(createdate, malice.createdate) &&
                Objects.equals(lastupdatedby, malice.lastupdatedby) &&
                Objects.equals(lastupdatedon, malice.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(maliceref, malicesystemid, maliceid, causeofmalice, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Case getWdbCaseByCaseref() {
        return wdbCaseByCaseref;
    }

    public void setWdbCaseByCaseref(Case wdbCaseByCaseref) {
        this.wdbCaseByCaseref = wdbCaseByCaseref;
    }
}

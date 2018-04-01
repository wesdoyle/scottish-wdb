package com.scottishwitchcraft.webapi.data.models;

import java.sql.Date;
import java.util.Objects;

public class MusicalInstrument {
    private String musicalinstrumentref;
    private String musicalinstrumentsystemid;
    private Long musicalinstrumentid;
    private String musicalinstrumentType;
    private String musicalinstrumentText;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Case wdbCaseByCaseref;

    public String getMusicalinstrumentref() {
        return musicalinstrumentref;
    }

    public void setMusicalinstrumentref(String musicalinstrumentref) {
        this.musicalinstrumentref = musicalinstrumentref;
    }

    public String getMusicalinstrumentsystemid() {
        return musicalinstrumentsystemid;
    }

    public void setMusicalinstrumentsystemid(String musicalinstrumentsystemid) {
        this.musicalinstrumentsystemid = musicalinstrumentsystemid;
    }

    public Long getMusicalinstrumentid() {
        return musicalinstrumentid;
    }

    public void setMusicalinstrumentid(Long musicalinstrumentid) {
        this.musicalinstrumentid = musicalinstrumentid;
    }

    public String getMusicalinstrumentType() {
        return musicalinstrumentType;
    }

    public void setMusicalinstrumentType(String musicalinstrumentType) {
        this.musicalinstrumentType = musicalinstrumentType;
    }

    public String getMusicalinstrumentText() {
        return musicalinstrumentText;
    }

    public void setMusicalinstrumentText(String musicalinstrumentText) {
        this.musicalinstrumentText = musicalinstrumentText;
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
        MusicalInstrument that = (MusicalInstrument) o;
        return Objects.equals(musicalinstrumentref, that.musicalinstrumentref) &&
                Objects.equals(musicalinstrumentsystemid, that.musicalinstrumentsystemid) &&
                Objects.equals(musicalinstrumentid, that.musicalinstrumentid) &&
                Objects.equals(musicalinstrumentType, that.musicalinstrumentType) &&
                Objects.equals(musicalinstrumentText, that.musicalinstrumentText) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(musicalinstrumentref, musicalinstrumentsystemid, musicalinstrumentid, musicalinstrumentType, musicalinstrumentText, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Case getWdbCaseByCaseref() {
        return wdbCaseByCaseref;
    }

    public void setWdbCaseByCaseref(Case wdbCaseByCaseref) {
        this.wdbCaseByCaseref = wdbCaseByCaseref;
    }
}

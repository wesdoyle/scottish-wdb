package com.scottishwitchcraft.models;

import java.sql.Date;
import java.util.Objects;

public class Denunciation {
    private String denuncref;
    private String denuncsystemid;
    private Long denuncid;
    private Boolean denuncExists;
    private String denuncdate;
    private Date denuncdateAsDate;
    private String denuncText;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Trial wdbTrialByTrialref;

    public String getDenuncref() {
        return denuncref;
    }

    public void setDenuncref(String denuncref) {
        this.denuncref = denuncref;
    }

    public String getDenuncsystemid() {
        return denuncsystemid;
    }

    public void setDenuncsystemid(String denuncsystemid) {
        this.denuncsystemid = denuncsystemid;
    }

    public Long getDenuncid() {
        return denuncid;
    }

    public void setDenuncid(Long denuncid) {
        this.denuncid = denuncid;
    }

    public Boolean getDenuncExists() {
        return denuncExists;
    }

    public void setDenuncExists(Boolean denuncExists) {
        this.denuncExists = denuncExists;
    }

    public String getDenuncdate() {
        return denuncdate;
    }

    public void setDenuncdate(String denuncdate) {
        this.denuncdate = denuncdate;
    }

    public Date getDenuncdateAsDate() {
        return denuncdateAsDate;
    }

    public void setDenuncdateAsDate(Date denuncdateAsDate) {
        this.denuncdateAsDate = denuncdateAsDate;
    }

    public String getDenuncText() {
        return denuncText;
    }

    public void setDenuncText(String denuncText) {
        this.denuncText = denuncText;
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
        Denunciation that = (Denunciation) o;
        return Objects.equals(denuncref, that.denuncref) &&
                Objects.equals(denuncsystemid, that.denuncsystemid) &&
                Objects.equals(denuncid, that.denuncid) &&
                Objects.equals(denuncExists, that.denuncExists) &&
                Objects.equals(denuncdate, that.denuncdate) &&
                Objects.equals(denuncdateAsDate, that.denuncdateAsDate) &&
                Objects.equals(denuncText, that.denuncText) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(denuncref, denuncsystemid, denuncid, denuncExists, denuncdate, denuncdateAsDate, denuncText, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Trial getWdbTrialByTrialref() {
        return wdbTrialByTrialref;
    }

    public void setWdbTrialByTrialref(Trial wdbTrialByTrialref) {
        this.wdbTrialByTrialref = wdbTrialByTrialref;
    }
}

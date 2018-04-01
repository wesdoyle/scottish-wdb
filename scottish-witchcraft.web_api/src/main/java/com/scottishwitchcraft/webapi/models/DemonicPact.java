package com.scottishwitchcraft.webapi.models;

import java.sql.Date;
import java.util.Objects;

public class DemonicPact {
    private String demonicref;
    private String demonicsystemid;
    private Long demonicid;
    private String demonicType;
    private String demonicText;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Case wdbCaseByCaseref;

    public String getDemonicref() {
        return demonicref;
    }

    public void setDemonicref(String demonicref) {
        this.demonicref = demonicref;
    }

    public String getDemonicsystemid() {
        return demonicsystemid;
    }

    public void setDemonicsystemid(String demonicsystemid) {
        this.demonicsystemid = demonicsystemid;
    }

    public Long getDemonicid() {
        return demonicid;
    }

    public void setDemonicid(Long demonicid) {
        this.demonicid = demonicid;
    }

    public String getDemonicType() {
        return demonicType;
    }

    public void setDemonicType(String demonicType) {
        this.demonicType = demonicType;
    }

    public String getDemonicText() {
        return demonicText;
    }

    public void setDemonicText(String demonicText) {
        this.demonicText = demonicText;
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
        DemonicPact that = (DemonicPact) o;
        return Objects.equals(demonicref, that.demonicref) &&
                Objects.equals(demonicsystemid, that.demonicsystemid) &&
                Objects.equals(demonicid, that.demonicid) &&
                Objects.equals(demonicType, that.demonicType) &&
                Objects.equals(demonicText, that.demonicText) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(demonicref, demonicsystemid, demonicid, demonicType, demonicText, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Case getWdbCaseByCaseref() {
        return wdbCaseByCaseref;
    }

    public void setWdbCaseByCaseref(Case wdbCaseByCaseref) {
        this.wdbCaseByCaseref = wdbCaseByCaseref;
    }
}

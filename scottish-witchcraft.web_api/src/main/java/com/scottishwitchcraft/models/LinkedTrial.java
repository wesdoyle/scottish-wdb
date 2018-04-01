package com.scottishwitchcraft.models;

import java.sql.Date;
import java.util.Objects;

public class LinkedTrial {
    private String onetrialref;
    private String twotrialref;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;

    public String getOnetrialref() {
        return onetrialref;
    }

    public void setOnetrialref(String onetrialref) {
        this.onetrialref = onetrialref;
    }

    public String getTwotrialref() {
        return twotrialref;
    }

    public void setTwotrialref(String twotrialref) {
        this.twotrialref = twotrialref;
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
        LinkedTrial that = (LinkedTrial) o;
        return Objects.equals(onetrialref, that.onetrialref) &&
                Objects.equals(twotrialref, that.twotrialref) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(onetrialref, twotrialref, createdby, createdate, lastupdatedby, lastupdatedon);
    }
}

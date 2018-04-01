package com.scottishwitchcraft.webapi.data.models;

import java.sql.Date;
import java.util.Objects;

public class MovesToHLA {
    private String moveref;
    private String movesystemid;
    private Long moveid;
    private String moveto;
    private Boolean moveexists;
    private String movedate;
    private Date movedateAsDate;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Trial wdbTrialByTrialref;

    public String getMoveref() {
        return moveref;
    }

    public void setMoveref(String moveref) {
        this.moveref = moveref;
    }

    public String getMovesystemid() {
        return movesystemid;
    }

    public void setMovesystemid(String movesystemid) {
        this.movesystemid = movesystemid;
    }

    public Long getMoveid() {
        return moveid;
    }

    public void setMoveid(Long moveid) {
        this.moveid = moveid;
    }

    public String getMoveto() {
        return moveto;
    }

    public void setMoveto(String moveto) {
        this.moveto = moveto;
    }

    public Boolean getMoveexists() {
        return moveexists;
    }

    public void setMoveexists(Boolean moveexists) {
        this.moveexists = moveexists;
    }

    public String getMovedate() {
        return movedate;
    }

    public void setMovedate(String movedate) {
        this.movedate = movedate;
    }

    public Date getMovedateAsDate() {
        return movedateAsDate;
    }

    public void setMovedateAsDate(Date movedateAsDate) {
        this.movedateAsDate = movedateAsDate;
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
        MovesToHLA that = (MovesToHLA) o;
        return Objects.equals(moveref, that.moveref) &&
                Objects.equals(movesystemid, that.movesystemid) &&
                Objects.equals(moveid, that.moveid) &&
                Objects.equals(moveto, that.moveto) &&
                Objects.equals(moveexists, that.moveexists) &&
                Objects.equals(movedate, that.movedate) &&
                Objects.equals(movedateAsDate, that.movedateAsDate) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(moveref, movesystemid, moveid, moveto, moveexists, movedate, movedateAsDate, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Trial getWdbTrialByTrialref() {
        return wdbTrialByTrialref;
    }

    public void setWdbTrialByTrialref(Trial wdbTrialByTrialref) {
        this.wdbTrialByTrialref = wdbTrialByTrialref;
    }
}

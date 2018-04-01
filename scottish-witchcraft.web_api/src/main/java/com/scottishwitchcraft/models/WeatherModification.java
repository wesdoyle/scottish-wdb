package com.scottishwitchcraft.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class WeatherModification {
    @Id
    private String weathermodificationref;
    private String weathermodificationsystemid;
    private Long weathermodificationid;
    private String weathermodificationType;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Case wdbCaseByCaseref;

    public String getWeathermodificationref() {
        return weathermodificationref;
    }

    public void setWeathermodificationref(String weathermodificationref) {
        this.weathermodificationref = weathermodificationref;
    }

    public String getWeathermodificationsystemid() {
        return weathermodificationsystemid;
    }

    public void setWeathermodificationsystemid(String weathermodificationsystemid) {
        this.weathermodificationsystemid = weathermodificationsystemid;
    }

    public Long getWeathermodificationid() {
        return weathermodificationid;
    }

    public void setWeathermodificationid(Long weathermodificationid) {
        this.weathermodificationid = weathermodificationid;
    }

    public String getWeathermodificationType() {
        return weathermodificationType;
    }

    public void setWeathermodificationType(String weathermodificationType) {
        this.weathermodificationType = weathermodificationType;
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
        WeatherModification that = (WeatherModification) o;
        return Objects.equals(weathermodificationref, that.weathermodificationref) &&
                Objects.equals(weathermodificationsystemid, that.weathermodificationsystemid) &&
                Objects.equals(weathermodificationid, that.weathermodificationid) &&
                Objects.equals(weathermodificationType, that.weathermodificationType) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(weathermodificationref, weathermodificationsystemid, weathermodificationid, weathermodificationType, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Case getWdbCaseByCaseref() {
        return wdbCaseByCaseref;
    }

    public void setWdbCaseByCaseref(Case wdbCaseByCaseref) {
        this.wdbCaseByCaseref = wdbCaseByCaseref;
    }
}

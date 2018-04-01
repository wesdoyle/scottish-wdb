package com.scottishwitchcraft.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Source {
    @Id
    private String sourceref;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Collection<Reference> wdbReferencesBySourceref;

    public String getSourceref() {
        return sourceref;
    }

    public void setSourceref(String sourceref) {
        this.sourceref = sourceref;
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
        Source source = (Source) o;
        return Objects.equals(sourceref, source.sourceref) &&
                Objects.equals(createdby, source.createdby) &&
                Objects.equals(createdate, source.createdate) &&
                Objects.equals(lastupdatedby, source.lastupdatedby) &&
                Objects.equals(lastupdatedon, source.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sourceref, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Collection<Reference> getWdbReferencesBySourceref() {
        return wdbReferencesBySourceref;
    }

    public void setWdbReferencesBySourceref(Collection<Reference> wdbReferencesBySourceref) {
        this.wdbReferencesBySourceref = wdbReferencesBySourceref;
    }
}

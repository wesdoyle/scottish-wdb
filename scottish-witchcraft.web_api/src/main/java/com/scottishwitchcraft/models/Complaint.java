package com.scottishwitchcraft.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Complaint {
    @Id
    private String complaintref;
    private String complaintsystemid;
    private Long complaintid;
    private Boolean complaint;
    private String complaintType;
    private String complaintdate;
    private Date complaintdateAsDate;
    private String wherelodged;
    private String involvement;
    private Boolean witchpricker;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    @OneToOne
    private Person wdbPersonByPersonref;

    public String getComplaintref() {
        return complaintref;
    }

    public void setComplaintref(String complaintref) {
        this.complaintref = complaintref;
    }

    public String getComplaintsystemid() {
        return complaintsystemid;
    }

    public void setComplaintsystemid(String complaintsystemid) {
        this.complaintsystemid = complaintsystemid;
    }

    public Long getComplaintid() {
        return complaintid;
    }

    public void setComplaintid(Long complaintid) {
        this.complaintid = complaintid;
    }

    public Boolean getComplaint() {
        return complaint;
    }

    public void setComplaint(Boolean complaint) {
        this.complaint = complaint;
    }

    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public String getComplaintdate() {
        return complaintdate;
    }

    public void setComplaintdate(String complaintdate) {
        this.complaintdate = complaintdate;
    }

    public Date getComplaintdateAsDate() {
        return complaintdateAsDate;
    }

    public void setComplaintdateAsDate(Date complaintdateAsDate) {
        this.complaintdateAsDate = complaintdateAsDate;
    }

    public String getWherelodged() {
        return wherelodged;
    }

    public void setWherelodged(String wherelodged) {
        this.wherelodged = wherelodged;
    }

    public String getInvolvement() {
        return involvement;
    }

    public void setInvolvement(String involvement) {
        this.involvement = involvement;
    }

    public Boolean getWitchpricker() {
        return witchpricker;
    }

    public void setWitchpricker(Boolean witchpricker) {
        this.witchpricker = witchpricker;
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
        Complaint complaint1 = (Complaint) o;
        return Objects.equals(complaintref, complaint1.complaintref) &&
                Objects.equals(complaintsystemid, complaint1.complaintsystemid) &&
                Objects.equals(complaintid, complaint1.complaintid) &&
                Objects.equals(complaint, complaint1.complaint) &&
                Objects.equals(complaintType, complaint1.complaintType) &&
                Objects.equals(complaintdate, complaint1.complaintdate) &&
                Objects.equals(complaintdateAsDate, complaint1.complaintdateAsDate) &&
                Objects.equals(wherelodged, complaint1.wherelodged) &&
                Objects.equals(involvement, complaint1.involvement) &&
                Objects.equals(witchpricker, complaint1.witchpricker) &&
                Objects.equals(createdby, complaint1.createdby) &&
                Objects.equals(createdate, complaint1.createdate) &&
                Objects.equals(lastupdatedby, complaint1.lastupdatedby) &&
                Objects.equals(lastupdatedon, complaint1.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(complaintref, complaintsystemid, complaintid, complaint, complaintType, complaintdate, complaintdateAsDate, wherelodged, involvement, witchpricker, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Person getWdbPersonByPersonref() {
        return wdbPersonByPersonref;
    }

    public void setWdbPersonByPersonref(Person wdbPersonByPersonref) {
        this.wdbPersonByPersonref = wdbPersonByPersonref;
    }
}

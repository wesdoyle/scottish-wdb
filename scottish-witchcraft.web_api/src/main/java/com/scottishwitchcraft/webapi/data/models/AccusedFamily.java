package com.scottishwitchcraft.webapi.data.models;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

public class AccusedFamily {
    private String accusedFamilyref;
    private String accusedFamilysystemid;
    private Long accusedFamilyid;
    private String surname;
    private String firstname;
    private String alias;
    private String patronymic;
    private String destitle;
    private Integer estYearOfBirth;
    private Long age;
    private Boolean ageEstcareer;
    private Boolean ageEstchild;
    private String occupation;
    private String relationship;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private WdbAccused wdbAccusedByAccusedref;
    private Collection<Complaint> wdbComplaintsByAccusedFamilyref;

    public String getAccusedFamilyref() {
        return accusedFamilyref;
    }

    public void setAccusedFamilyref(String accusedFamilyref) {
        this.accusedFamilyref = accusedFamilyref;
    }

    public String getAccusedFamilysystemid() {
        return accusedFamilysystemid;
    }

    public void setAccusedFamilysystemid(String accusedFamilysystemid) {
        this.accusedFamilysystemid = accusedFamilysystemid;
    }

    public Long getAccusedFamilyid() {
        return accusedFamilyid;
    }

    public void setAccusedFamilyid(Long accusedFamilyid) {
        this.accusedFamilyid = accusedFamilyid;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDestitle() {
        return destitle;
    }

    public void setDestitle(String destitle) {
        this.destitle = destitle;
    }

    public Integer getEstYearOfBirth() {
        return estYearOfBirth;
    }

    public void setEstYearOfBirth(Integer estYearOfBirth) {
        this.estYearOfBirth = estYearOfBirth;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Boolean getAgeEstcareer() {
        return ageEstcareer;
    }

    public void setAgeEstcareer(Boolean ageEstcareer) {
        this.ageEstcareer = ageEstcareer;
    }

    public Boolean getAgeEstchild() {
        return ageEstchild;
    }

    public void setAgeEstchild(Boolean ageEstchild) {
        this.ageEstchild = ageEstchild;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
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
        AccusedFamily that = (AccusedFamily) o;
        return Objects.equals(accusedFamilyref, that.accusedFamilyref) &&
                Objects.equals(accusedFamilysystemid, that.accusedFamilysystemid) &&
                Objects.equals(accusedFamilyid, that.accusedFamilyid) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(alias, that.alias) &&
                Objects.equals(patronymic, that.patronymic) &&
                Objects.equals(destitle, that.destitle) &&
                Objects.equals(estYearOfBirth, that.estYearOfBirth) &&
                Objects.equals(age, that.age) &&
                Objects.equals(ageEstcareer, that.ageEstcareer) &&
                Objects.equals(ageEstchild, that.ageEstchild) &&
                Objects.equals(occupation, that.occupation) &&
                Objects.equals(relationship, that.relationship) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(accusedFamilyref, accusedFamilysystemid, accusedFamilyid, surname, firstname, alias, patronymic, destitle, estYearOfBirth, age, ageEstcareer, ageEstchild, occupation, relationship, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public WdbAccused getWdbAccusedByAccusedref() {
        return wdbAccusedByAccusedref;
    }

    public void setWdbAccusedByAccusedref(WdbAccused wdbAccusedByAccusedref) {
        this.wdbAccusedByAccusedref = wdbAccusedByAccusedref;
    }

    public Collection<Complaint> getWdbComplaintsByAccusedFamilyref() {
        return wdbComplaintsByAccusedFamilyref;
    }

    public void setWdbComplaintsByAccusedFamilyref(Collection<Complaint> wdbComplaintsByAccusedFamilyref) {
        this.wdbComplaintsByAccusedFamilyref = wdbComplaintsByAccusedFamilyref;
    }
}

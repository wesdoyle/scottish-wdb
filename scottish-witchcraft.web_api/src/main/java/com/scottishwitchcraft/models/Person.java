package com.scottishwitchcraft.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Person {
    @Id
    private String personref;
    private Long personid;
    private String personsystemid;
    private String firstname;
    private String lastname;
    private String otherDetails;
    private String title;
    private String occupation;
    private String office;
    private String residence;
    private Boolean isdeleted;
    private String notes;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    @OneToMany
    private Collection<Appeal> wdbAppealsByPersonref;
    @OneToMany
    private Collection<CasePerson> wdbCasePeopleByPersonref;
    @OneToMany
    private Collection<Complaint> wdbComplaintsByPersonref;
    @OneToMany
    private Collection<TrialPerson> wdbTrialPeopleByPersonref;

    public String getPersonref() {
        return personref;
    }

    public void setPersonref(String personref) {
        this.personref = personref;
    }

    public Long getPersonid() {
        return personid;
    }

    public void setPersonid(Long personid) {
        this.personid = personid;
    }

    public String getPersonsystemid() {
        return personsystemid;
    }

    public void setPersonsystemid(String personsystemid) {
        this.personsystemid = personsystemid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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
        Person person = (Person) o;
        return Objects.equals(personref, person.personref) &&
                Objects.equals(personid, person.personid) &&
                Objects.equals(personsystemid, person.personsystemid) &&
                Objects.equals(firstname, person.firstname) &&
                Objects.equals(lastname, person.lastname) &&
                Objects.equals(otherDetails, person.otherDetails) &&
                Objects.equals(title, person.title) &&
                Objects.equals(occupation, person.occupation) &&
                Objects.equals(office, person.office) &&
                Objects.equals(residence, person.residence) &&
                Objects.equals(isdeleted, person.isdeleted) &&
                Objects.equals(notes, person.notes) &&
                Objects.equals(createdby, person.createdby) &&
                Objects.equals(createdate, person.createdate) &&
                Objects.equals(lastupdatedby, person.lastupdatedby) &&
                Objects.equals(lastupdatedon, person.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(personref, personid, personsystemid, firstname, lastname, otherDetails, title, occupation, office, residence, isdeleted, notes, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Collection<Appeal> getWdbAppealsByPersonref() {
        return wdbAppealsByPersonref;
    }

    public void setWdbAppealsByPersonref(Collection<Appeal> wdbAppealsByPersonref) {
        this.wdbAppealsByPersonref = wdbAppealsByPersonref;
    }

    public Collection<CasePerson> getWdbCasePeopleByPersonref() {
        return wdbCasePeopleByPersonref;
    }

    public void setWdbCasePeopleByPersonref(Collection<CasePerson> wdbCasePeopleByPersonref) {
        this.wdbCasePeopleByPersonref = wdbCasePeopleByPersonref;
    }

    public Collection<Complaint> getWdbComplaintsByPersonref() {
        return wdbComplaintsByPersonref;
    }

    public void setWdbComplaintsByPersonref(Collection<Complaint> wdbComplaintsByPersonref) {
        this.wdbComplaintsByPersonref = wdbComplaintsByPersonref;
    }

    public Collection<TrialPerson> getWdbTrialPeopleByPersonref() {
        return wdbTrialPeopleByPersonref;
    }

    public void setWdbTrialPeopleByPersonref(Collection<TrialPerson> wdbTrialPeopleByPersonref) {
        this.wdbTrialPeopleByPersonref = wdbTrialPeopleByPersonref;
    }
}

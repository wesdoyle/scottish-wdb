package com.scottishwitchcraft.models;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

public class WdbAccused {
    private String accusedref;
    private String accusedsystemid;
    private Long accusedid;
    private String firstname;
    private String lastname;
    private String mFirstname;
    private String mSurname;
    private String alias;
    private String patronymic;
    private String destitle;
    private String sex;
    private Integer age;
    private Boolean ageEstcareer;
    private Boolean ageEstchild;
    private String resSettlement;
    private String resParish;
    private String resPresbytery;
    private String resCounty;
    private String resBurgh;
    private String resNgrLetters;
    private Integer resNgrEasting;
    private Integer resNgrNorthing;
    private String ethnicOrigin;
    private String maritalstatus;
    private String socioecstatus;
    private String occupation;
    private String notes;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Collection<AccusedFamily> wdbAccusedFamiliesByAccusedref;
    private Collection<Case> wdbCasesByAccusedref;

    public String getAccusedref() {
        return accusedref;
    }

    public void setAccusedref(String accusedref) {
        this.accusedref = accusedref;
    }

    public String getAccusedsystemid() {
        return accusedsystemid;
    }

    public void setAccusedsystemid(String accusedsystemid) {
        this.accusedsystemid = accusedsystemid;
    }

    public Long getAccusedid() {
        return accusedid;
    }

    public void setAccusedid(Long accusedid) {
        this.accusedid = accusedid;
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

    public String getmFirstname() {
        return mFirstname;
    }

    public void setmFirstname(String mFirstname) {
        this.mFirstname = mFirstname;
    }

    public String getmSurname() {
        return mSurname;
    }

    public void setmSurname(String mSurname) {
        this.mSurname = mSurname;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
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

    public String getResSettlement() {
        return resSettlement;
    }

    public void setResSettlement(String resSettlement) {
        this.resSettlement = resSettlement;
    }

    public String getResParish() {
        return resParish;
    }

    public void setResParish(String resParish) {
        this.resParish = resParish;
    }

    public String getResPresbytery() {
        return resPresbytery;
    }

    public void setResPresbytery(String resPresbytery) {
        this.resPresbytery = resPresbytery;
    }

    public String getResCounty() {
        return resCounty;
    }

    public void setResCounty(String resCounty) {
        this.resCounty = resCounty;
    }

    public String getResBurgh() {
        return resBurgh;
    }

    public void setResBurgh(String resBurgh) {
        this.resBurgh = resBurgh;
    }

    public String getResNgrLetters() {
        return resNgrLetters;
    }

    public void setResNgrLetters(String resNgrLetters) {
        this.resNgrLetters = resNgrLetters;
    }

    public Integer getResNgrEasting() {
        return resNgrEasting;
    }

    public void setResNgrEasting(Integer resNgrEasting) {
        this.resNgrEasting = resNgrEasting;
    }

    public Integer getResNgrNorthing() {
        return resNgrNorthing;
    }

    public void setResNgrNorthing(Integer resNgrNorthing) {
        this.resNgrNorthing = resNgrNorthing;
    }

    public String getEthnicOrigin() {
        return ethnicOrigin;
    }

    public void setEthnicOrigin(String ethnicOrigin) {
        this.ethnicOrigin = ethnicOrigin;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getSocioecstatus() {
        return socioecstatus;
    }

    public void setSocioecstatus(String socioecstatus) {
        this.socioecstatus = socioecstatus;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
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
        WdbAccused that = (WdbAccused) o;
        return Objects.equals(accusedref, that.accusedref) &&
                Objects.equals(accusedsystemid, that.accusedsystemid) &&
                Objects.equals(accusedid, that.accusedid) &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(mFirstname, that.mFirstname) &&
                Objects.equals(mSurname, that.mSurname) &&
                Objects.equals(alias, that.alias) &&
                Objects.equals(patronymic, that.patronymic) &&
                Objects.equals(destitle, that.destitle) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(age, that.age) &&
                Objects.equals(ageEstcareer, that.ageEstcareer) &&
                Objects.equals(ageEstchild, that.ageEstchild) &&
                Objects.equals(resSettlement, that.resSettlement) &&
                Objects.equals(resParish, that.resParish) &&
                Objects.equals(resPresbytery, that.resPresbytery) &&
                Objects.equals(resCounty, that.resCounty) &&
                Objects.equals(resBurgh, that.resBurgh) &&
                Objects.equals(resNgrLetters, that.resNgrLetters) &&
                Objects.equals(resNgrEasting, that.resNgrEasting) &&
                Objects.equals(resNgrNorthing, that.resNgrNorthing) &&
                Objects.equals(ethnicOrigin, that.ethnicOrigin) &&
                Objects.equals(maritalstatus, that.maritalstatus) &&
                Objects.equals(socioecstatus, that.socioecstatus) &&
                Objects.equals(occupation, that.occupation) &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(lastupdatedby, that.lastupdatedby) &&
                Objects.equals(lastupdatedon, that.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(accusedref, accusedsystemid, accusedid, firstname, lastname, mFirstname, mSurname, alias, patronymic, destitle, sex, age, ageEstcareer, ageEstchild, resSettlement, resParish, resPresbytery, resCounty, resBurgh, resNgrLetters, resNgrEasting, resNgrNorthing, ethnicOrigin, maritalstatus, socioecstatus, occupation, notes, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Collection<AccusedFamily> getWdbAccusedFamiliesByAccusedref() {
        return wdbAccusedFamiliesByAccusedref;
    }

    public void setWdbAccusedFamiliesByAccusedref(Collection<AccusedFamily> wdbAccusedFamiliesByAccusedref) {
        this.wdbAccusedFamiliesByAccusedref = wdbAccusedFamiliesByAccusedref;
    }

    public Collection<Case> getWdbCasesByAccusedref() {
        return wdbCasesByAccusedref;
    }

    public void setWdbCasesByAccusedref(Collection<Case> wdbCasesByAccusedref) {
        this.wdbCasesByAccusedref = wdbCasesByAccusedref;
    }
}

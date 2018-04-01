package com.scottishwitchcraft.webapi.data.models;

import java.sql.Date;
import java.util.Objects;

public class Reference {
    private String referenceref;
    private String refsystemid;
    private Long referenceid;
    private String reference;
    private Boolean kirksession;
    private Boolean presbytery;
    private Boolean burghcourt;
    private Boolean confession;
    private Boolean draftdittay;
    private Boolean commCourtmin;
    private Boolean justCourtmin;
    private Boolean circuitCourtmin;
    private Boolean dittay;
    private Boolean pleadings;
    private Boolean witdep;
    private Boolean witstatement;
    private Boolean commjust;
    private Boolean privycouncil;
    private Boolean parliament;
    private Boolean estates;
    private Boolean royal;
    private Boolean commtext;
    private Boolean verdict;
    private Boolean sentence;
    private Boolean chronicle;
    private Boolean financial;
    private String other;
    private String notes;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Case wdbCaseByCaseref;
    private Source wdbSourceBySourceref;

    public String getReferenceref() {
        return referenceref;
    }

    public void setReferenceref(String referenceref) {
        this.referenceref = referenceref;
    }

    public String getRefsystemid() {
        return refsystemid;
    }

    public void setRefsystemid(String refsystemid) {
        this.refsystemid = refsystemid;
    }

    public Long getReferenceid() {
        return referenceid;
    }

    public void setReferenceid(Long referenceid) {
        this.referenceid = referenceid;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Boolean getKirksession() {
        return kirksession;
    }

    public void setKirksession(Boolean kirksession) {
        this.kirksession = kirksession;
    }

    public Boolean getPresbytery() {
        return presbytery;
    }

    public void setPresbytery(Boolean presbytery) {
        this.presbytery = presbytery;
    }

    public Boolean getBurghcourt() {
        return burghcourt;
    }

    public void setBurghcourt(Boolean burghcourt) {
        this.burghcourt = burghcourt;
    }

    public Boolean getConfession() {
        return confession;
    }

    public void setConfession(Boolean confession) {
        this.confession = confession;
    }

    public Boolean getDraftdittay() {
        return draftdittay;
    }

    public void setDraftdittay(Boolean draftdittay) {
        this.draftdittay = draftdittay;
    }

    public Boolean getCommCourtmin() {
        return commCourtmin;
    }

    public void setCommCourtmin(Boolean commCourtmin) {
        this.commCourtmin = commCourtmin;
    }

    public Boolean getJustCourtmin() {
        return justCourtmin;
    }

    public void setJustCourtmin(Boolean justCourtmin) {
        this.justCourtmin = justCourtmin;
    }

    public Boolean getCircuitCourtmin() {
        return circuitCourtmin;
    }

    public void setCircuitCourtmin(Boolean circuitCourtmin) {
        this.circuitCourtmin = circuitCourtmin;
    }

    public Boolean getDittay() {
        return dittay;
    }

    public void setDittay(Boolean dittay) {
        this.dittay = dittay;
    }

    public Boolean getPleadings() {
        return pleadings;
    }

    public void setPleadings(Boolean pleadings) {
        this.pleadings = pleadings;
    }

    public Boolean getWitdep() {
        return witdep;
    }

    public void setWitdep(Boolean witdep) {
        this.witdep = witdep;
    }

    public Boolean getWitstatement() {
        return witstatement;
    }

    public void setWitstatement(Boolean witstatement) {
        this.witstatement = witstatement;
    }

    public Boolean getCommjust() {
        return commjust;
    }

    public void setCommjust(Boolean commjust) {
        this.commjust = commjust;
    }

    public Boolean getPrivycouncil() {
        return privycouncil;
    }

    public void setPrivycouncil(Boolean privycouncil) {
        this.privycouncil = privycouncil;
    }

    public Boolean getParliament() {
        return parliament;
    }

    public void setParliament(Boolean parliament) {
        this.parliament = parliament;
    }

    public Boolean getEstates() {
        return estates;
    }

    public void setEstates(Boolean estates) {
        this.estates = estates;
    }

    public Boolean getRoyal() {
        return royal;
    }

    public void setRoyal(Boolean royal) {
        this.royal = royal;
    }

    public Boolean getCommtext() {
        return commtext;
    }

    public void setCommtext(Boolean commtext) {
        this.commtext = commtext;
    }

    public Boolean getVerdict() {
        return verdict;
    }

    public void setVerdict(Boolean verdict) {
        this.verdict = verdict;
    }

    public Boolean getSentence() {
        return sentence;
    }

    public void setSentence(Boolean sentence) {
        this.sentence = sentence;
    }

    public Boolean getChronicle() {
        return chronicle;
    }

    public void setChronicle(Boolean chronicle) {
        this.chronicle = chronicle;
    }

    public Boolean getFinancial() {
        return financial;
    }

    public void setFinancial(Boolean financial) {
        this.financial = financial;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
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
        Reference reference1 = (Reference) o;
        return Objects.equals(referenceref, reference1.referenceref) &&
                Objects.equals(refsystemid, reference1.refsystemid) &&
                Objects.equals(referenceid, reference1.referenceid) &&
                Objects.equals(reference, reference1.reference) &&
                Objects.equals(kirksession, reference1.kirksession) &&
                Objects.equals(presbytery, reference1.presbytery) &&
                Objects.equals(burghcourt, reference1.burghcourt) &&
                Objects.equals(confession, reference1.confession) &&
                Objects.equals(draftdittay, reference1.draftdittay) &&
                Objects.equals(commCourtmin, reference1.commCourtmin) &&
                Objects.equals(justCourtmin, reference1.justCourtmin) &&
                Objects.equals(circuitCourtmin, reference1.circuitCourtmin) &&
                Objects.equals(dittay, reference1.dittay) &&
                Objects.equals(pleadings, reference1.pleadings) &&
                Objects.equals(witdep, reference1.witdep) &&
                Objects.equals(witstatement, reference1.witstatement) &&
                Objects.equals(commjust, reference1.commjust) &&
                Objects.equals(privycouncil, reference1.privycouncil) &&
                Objects.equals(parliament, reference1.parliament) &&
                Objects.equals(estates, reference1.estates) &&
                Objects.equals(royal, reference1.royal) &&
                Objects.equals(commtext, reference1.commtext) &&
                Objects.equals(verdict, reference1.verdict) &&
                Objects.equals(sentence, reference1.sentence) &&
                Objects.equals(chronicle, reference1.chronicle) &&
                Objects.equals(financial, reference1.financial) &&
                Objects.equals(other, reference1.other) &&
                Objects.equals(notes, reference1.notes) &&
                Objects.equals(createdby, reference1.createdby) &&
                Objects.equals(createdate, reference1.createdate) &&
                Objects.equals(lastupdatedby, reference1.lastupdatedby) &&
                Objects.equals(lastupdatedon, reference1.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(referenceref, refsystemid, referenceid, reference, kirksession, presbytery, burghcourt, confession, draftdittay, commCourtmin, justCourtmin, circuitCourtmin, dittay, pleadings, witdep, witstatement, commjust, privycouncil, parliament, estates, royal, commtext, verdict, sentence, chronicle, financial, other, notes, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Case getWdbCaseByCaseref() {
        return wdbCaseByCaseref;
    }

    public void setWdbCaseByCaseref(Case wdbCaseByCaseref) {
        this.wdbCaseByCaseref = wdbCaseByCaseref;
    }

    public Source getWdbSourceBySourceref() {
        return wdbSourceBySourceref;
    }

    public void setWdbSourceBySourceref(Source wdbSourceBySourceref) {
        this.wdbSourceBySourceref = wdbSourceBySourceref;
    }
}

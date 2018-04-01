package com.scottishwitchcraft.webapi.data.models;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

public class Trial {
    private String trialref;
    private Long trialid;
    private String trialsystemid;
    private String trialtype;
    private String trialSettlement;
    private String trialParish;
    private String trialPresbytery;
    private String trialCounty;
    private String trialBurgh;
    private String trialNgrLetters;
    private Integer trialNgrEasting;
    private Integer trialNgrNorthing;
    private Boolean watching;
    private String watchingdate;
    private String watchingdateAsDate;
    private Boolean arrest;
    private String arrestdate;
    private Date arrestdateAsDate;
    private Boolean fled;
    private String fleddate;
    private Date fleddateAsDate;
    private Boolean actiondropped;
    private String actiondropdate;
    private Date actiondropdateAsDate;
    private String actiondroppedby;
    private String actionbody;
    private Boolean confrontingsuspects;
    private String pretrialnotes;
    private String processtype;
    private String trialdate;
    private Date trialdateAsDate;
    private String trialplace;
    private Long femaleAccusers;
    private Long maleAccusers;
    private Boolean highStatus;
    private Boolean defence;
    private String verdict;
    private String sentence;
    private Boolean cjtorder;
    private String cjtdate;
    private Date cjtdateAsDate;
    private Boolean circuit;
    private String circuitname;
    private Boolean localwithcrep;
    private Boolean noreftocentral;
    private String trialnotes;
    private Boolean execution;
    private String executionmethod;
    private String executiondate;
    private Date executiondateAsDate;
    private String executionplace;
    private String execSettlement;
    private String execParish;
    private String execPresbytery;
    private String execCounty;
    private String execBurgh;
    private String execNgrLetters;
    private Integer execNgrEasting;
    private Integer execNgrNorthing;
    private String posttrialnotes;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Collection<Appeal> wdbAppealsByTrialref;
    private Collection<Commission> wdbCommissionsByTrialref;
    private Collection<Complaint> wdbComplaintsByTrialref;
    private Collection<Confession> wdbConfessionsByTrialref;
    private Collection<Denunciation> wdbDenunciationsByTrialref;
    private Collection<Imprisonment> wdbImprisonmentsByTrialref;
    private Collection<MentionedAsWitch> wdbMentionedaswitchesByTrialref;
    private Collection<MovesToHLA> wdbMovestohlasByTrialref;
    private Collection<Ordeal> wdbOrdealsByTrialref;
    private Collection<OtherNamedWitch> wdbOthernamedwitchesByTrialref;
    private Collection<PrevCommission> wdbPrevcommissionsByTrialref;
    private Collection<Torture> wdbTorturesByTrialref;
    private Case wdbCaseByCaseref;
    private Collection<TrialPerson> wdbTrialPeopleByTrialref;

    public String getTrialref() {
        return trialref;
    }

    public void setTrialref(String trialref) {
        this.trialref = trialref;
    }

    public Long getTrialid() {
        return trialid;
    }

    public void setTrialid(Long trialid) {
        this.trialid = trialid;
    }

    public String getTrialsystemid() {
        return trialsystemid;
    }

    public void setTrialsystemid(String trialsystemid) {
        this.trialsystemid = trialsystemid;
    }

    public String getTrialtype() {
        return trialtype;
    }

    public void setTrialtype(String trialtype) {
        this.trialtype = trialtype;
    }

    public String getTrialSettlement() {
        return trialSettlement;
    }

    public void setTrialSettlement(String trialSettlement) {
        this.trialSettlement = trialSettlement;
    }

    public String getTrialParish() {
        return trialParish;
    }

    public void setTrialParish(String trialParish) {
        this.trialParish = trialParish;
    }

    public String getTrialPresbytery() {
        return trialPresbytery;
    }

    public void setTrialPresbytery(String trialPresbytery) {
        this.trialPresbytery = trialPresbytery;
    }

    public String getTrialCounty() {
        return trialCounty;
    }

    public void setTrialCounty(String trialCounty) {
        this.trialCounty = trialCounty;
    }

    public String getTrialBurgh() {
        return trialBurgh;
    }

    public void setTrialBurgh(String trialBurgh) {
        this.trialBurgh = trialBurgh;
    }

    public String getTrialNgrLetters() {
        return trialNgrLetters;
    }

    public void setTrialNgrLetters(String trialNgrLetters) {
        this.trialNgrLetters = trialNgrLetters;
    }

    public Integer getTrialNgrEasting() {
        return trialNgrEasting;
    }

    public void setTrialNgrEasting(Integer trialNgrEasting) {
        this.trialNgrEasting = trialNgrEasting;
    }

    public Integer getTrialNgrNorthing() {
        return trialNgrNorthing;
    }

    public void setTrialNgrNorthing(Integer trialNgrNorthing) {
        this.trialNgrNorthing = trialNgrNorthing;
    }

    public Boolean getWatching() {
        return watching;
    }

    public void setWatching(Boolean watching) {
        this.watching = watching;
    }

    public String getWatchingdate() {
        return watchingdate;
    }

    public void setWatchingdate(String watchingdate) {
        this.watchingdate = watchingdate;
    }

    public String getWatchingdateAsDate() {
        return watchingdateAsDate;
    }

    public void setWatchingdateAsDate(String watchingdateAsDate) {
        this.watchingdateAsDate = watchingdateAsDate;
    }

    public Boolean getArrest() {
        return arrest;
    }

    public void setArrest(Boolean arrest) {
        this.arrest = arrest;
    }

    public String getArrestdate() {
        return arrestdate;
    }

    public void setArrestdate(String arrestdate) {
        this.arrestdate = arrestdate;
    }

    public Date getArrestdateAsDate() {
        return arrestdateAsDate;
    }

    public void setArrestdateAsDate(Date arrestdateAsDate) {
        this.arrestdateAsDate = arrestdateAsDate;
    }

    public Boolean getFled() {
        return fled;
    }

    public void setFled(Boolean fled) {
        this.fled = fled;
    }

    public String getFleddate() {
        return fleddate;
    }

    public void setFleddate(String fleddate) {
        this.fleddate = fleddate;
    }

    public Date getFleddateAsDate() {
        return fleddateAsDate;
    }

    public void setFleddateAsDate(Date fleddateAsDate) {
        this.fleddateAsDate = fleddateAsDate;
    }

    public Boolean getActiondropped() {
        return actiondropped;
    }

    public void setActiondropped(Boolean actiondropped) {
        this.actiondropped = actiondropped;
    }

    public String getActiondropdate() {
        return actiondropdate;
    }

    public void setActiondropdate(String actiondropdate) {
        this.actiondropdate = actiondropdate;
    }

    public Date getActiondropdateAsDate() {
        return actiondropdateAsDate;
    }

    public void setActiondropdateAsDate(Date actiondropdateAsDate) {
        this.actiondropdateAsDate = actiondropdateAsDate;
    }

    public String getActiondroppedby() {
        return actiondroppedby;
    }

    public void setActiondroppedby(String actiondroppedby) {
        this.actiondroppedby = actiondroppedby;
    }

    public String getActionbody() {
        return actionbody;
    }

    public void setActionbody(String actionbody) {
        this.actionbody = actionbody;
    }

    public Boolean getConfrontingsuspects() {
        return confrontingsuspects;
    }

    public void setConfrontingsuspects(Boolean confrontingsuspects) {
        this.confrontingsuspects = confrontingsuspects;
    }

    public String getPretrialnotes() {
        return pretrialnotes;
    }

    public void setPretrialnotes(String pretrialnotes) {
        this.pretrialnotes = pretrialnotes;
    }

    public String getProcesstype() {
        return processtype;
    }

    public void setProcesstype(String processtype) {
        this.processtype = processtype;
    }

    public String getTrialdate() {
        return trialdate;
    }

    public void setTrialdate(String trialdate) {
        this.trialdate = trialdate;
    }

    public Date getTrialdateAsDate() {
        return trialdateAsDate;
    }

    public void setTrialdateAsDate(Date trialdateAsDate) {
        this.trialdateAsDate = trialdateAsDate;
    }

    public String getTrialplace() {
        return trialplace;
    }

    public void setTrialplace(String trialplace) {
        this.trialplace = trialplace;
    }

    public Long getFemaleAccusers() {
        return femaleAccusers;
    }

    public void setFemaleAccusers(Long femaleAccusers) {
        this.femaleAccusers = femaleAccusers;
    }

    public Long getMaleAccusers() {
        return maleAccusers;
    }

    public void setMaleAccusers(Long maleAccusers) {
        this.maleAccusers = maleAccusers;
    }

    public Boolean getHighStatus() {
        return highStatus;
    }

    public void setHighStatus(Boolean highStatus) {
        this.highStatus = highStatus;
    }

    public Boolean getDefence() {
        return defence;
    }

    public void setDefence(Boolean defence) {
        this.defence = defence;
    }

    public String getVerdict() {
        return verdict;
    }

    public void setVerdict(String verdict) {
        this.verdict = verdict;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public Boolean getCjtorder() {
        return cjtorder;
    }

    public void setCjtorder(Boolean cjtorder) {
        this.cjtorder = cjtorder;
    }

    public String getCjtdate() {
        return cjtdate;
    }

    public void setCjtdate(String cjtdate) {
        this.cjtdate = cjtdate;
    }

    public Date getCjtdateAsDate() {
        return cjtdateAsDate;
    }

    public void setCjtdateAsDate(Date cjtdateAsDate) {
        this.cjtdateAsDate = cjtdateAsDate;
    }

    public Boolean getCircuit() {
        return circuit;
    }

    public void setCircuit(Boolean circuit) {
        this.circuit = circuit;
    }

    public String getCircuitname() {
        return circuitname;
    }

    public void setCircuitname(String circuitname) {
        this.circuitname = circuitname;
    }

    public Boolean getLocalwithcrep() {
        return localwithcrep;
    }

    public void setLocalwithcrep(Boolean localwithcrep) {
        this.localwithcrep = localwithcrep;
    }

    public Boolean getNoreftocentral() {
        return noreftocentral;
    }

    public void setNoreftocentral(Boolean noreftocentral) {
        this.noreftocentral = noreftocentral;
    }

    public String getTrialnotes() {
        return trialnotes;
    }

    public void setTrialnotes(String trialnotes) {
        this.trialnotes = trialnotes;
    }

    public Boolean getExecution() {
        return execution;
    }

    public void setExecution(Boolean execution) {
        this.execution = execution;
    }

    public String getExecutionmethod() {
        return executionmethod;
    }

    public void setExecutionmethod(String executionmethod) {
        this.executionmethod = executionmethod;
    }

    public String getExecutiondate() {
        return executiondate;
    }

    public void setExecutiondate(String executiondate) {
        this.executiondate = executiondate;
    }

    public Date getExecutiondateAsDate() {
        return executiondateAsDate;
    }

    public void setExecutiondateAsDate(Date executiondateAsDate) {
        this.executiondateAsDate = executiondateAsDate;
    }

    public String getExecutionplace() {
        return executionplace;
    }

    public void setExecutionplace(String executionplace) {
        this.executionplace = executionplace;
    }

    public String getExecSettlement() {
        return execSettlement;
    }

    public void setExecSettlement(String execSettlement) {
        this.execSettlement = execSettlement;
    }

    public String getExecParish() {
        return execParish;
    }

    public void setExecParish(String execParish) {
        this.execParish = execParish;
    }

    public String getExecPresbytery() {
        return execPresbytery;
    }

    public void setExecPresbytery(String execPresbytery) {
        this.execPresbytery = execPresbytery;
    }

    public String getExecCounty() {
        return execCounty;
    }

    public void setExecCounty(String execCounty) {
        this.execCounty = execCounty;
    }

    public String getExecBurgh() {
        return execBurgh;
    }

    public void setExecBurgh(String execBurgh) {
        this.execBurgh = execBurgh;
    }

    public String getExecNgrLetters() {
        return execNgrLetters;
    }

    public void setExecNgrLetters(String execNgrLetters) {
        this.execNgrLetters = execNgrLetters;
    }

    public Integer getExecNgrEasting() {
        return execNgrEasting;
    }

    public void setExecNgrEasting(Integer execNgrEasting) {
        this.execNgrEasting = execNgrEasting;
    }

    public Integer getExecNgrNorthing() {
        return execNgrNorthing;
    }

    public void setExecNgrNorthing(Integer execNgrNorthing) {
        this.execNgrNorthing = execNgrNorthing;
    }

    public String getPosttrialnotes() {
        return posttrialnotes;
    }

    public void setPosttrialnotes(String posttrialnotes) {
        this.posttrialnotes = posttrialnotes;
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
        Trial trial = (Trial) o;
        return Objects.equals(trialref, trial.trialref) &&
                Objects.equals(trialid, trial.trialid) &&
                Objects.equals(trialsystemid, trial.trialsystemid) &&
                Objects.equals(trialtype, trial.trialtype) &&
                Objects.equals(trialSettlement, trial.trialSettlement) &&
                Objects.equals(trialParish, trial.trialParish) &&
                Objects.equals(trialPresbytery, trial.trialPresbytery) &&
                Objects.equals(trialCounty, trial.trialCounty) &&
                Objects.equals(trialBurgh, trial.trialBurgh) &&
                Objects.equals(trialNgrLetters, trial.trialNgrLetters) &&
                Objects.equals(trialNgrEasting, trial.trialNgrEasting) &&
                Objects.equals(trialNgrNorthing, trial.trialNgrNorthing) &&
                Objects.equals(watching, trial.watching) &&
                Objects.equals(watchingdate, trial.watchingdate) &&
                Objects.equals(watchingdateAsDate, trial.watchingdateAsDate) &&
                Objects.equals(arrest, trial.arrest) &&
                Objects.equals(arrestdate, trial.arrestdate) &&
                Objects.equals(arrestdateAsDate, trial.arrestdateAsDate) &&
                Objects.equals(fled, trial.fled) &&
                Objects.equals(fleddate, trial.fleddate) &&
                Objects.equals(fleddateAsDate, trial.fleddateAsDate) &&
                Objects.equals(actiondropped, trial.actiondropped) &&
                Objects.equals(actiondropdate, trial.actiondropdate) &&
                Objects.equals(actiondropdateAsDate, trial.actiondropdateAsDate) &&
                Objects.equals(actiondroppedby, trial.actiondroppedby) &&
                Objects.equals(actionbody, trial.actionbody) &&
                Objects.equals(confrontingsuspects, trial.confrontingsuspects) &&
                Objects.equals(pretrialnotes, trial.pretrialnotes) &&
                Objects.equals(processtype, trial.processtype) &&
                Objects.equals(trialdate, trial.trialdate) &&
                Objects.equals(trialdateAsDate, trial.trialdateAsDate) &&
                Objects.equals(trialplace, trial.trialplace) &&
                Objects.equals(femaleAccusers, trial.femaleAccusers) &&
                Objects.equals(maleAccusers, trial.maleAccusers) &&
                Objects.equals(highStatus, trial.highStatus) &&
                Objects.equals(defence, trial.defence) &&
                Objects.equals(verdict, trial.verdict) &&
                Objects.equals(sentence, trial.sentence) &&
                Objects.equals(cjtorder, trial.cjtorder) &&
                Objects.equals(cjtdate, trial.cjtdate) &&
                Objects.equals(cjtdateAsDate, trial.cjtdateAsDate) &&
                Objects.equals(circuit, trial.circuit) &&
                Objects.equals(circuitname, trial.circuitname) &&
                Objects.equals(localwithcrep, trial.localwithcrep) &&
                Objects.equals(noreftocentral, trial.noreftocentral) &&
                Objects.equals(trialnotes, trial.trialnotes) &&
                Objects.equals(execution, trial.execution) &&
                Objects.equals(executionmethod, trial.executionmethod) &&
                Objects.equals(executiondate, trial.executiondate) &&
                Objects.equals(executiondateAsDate, trial.executiondateAsDate) &&
                Objects.equals(executionplace, trial.executionplace) &&
                Objects.equals(execSettlement, trial.execSettlement) &&
                Objects.equals(execParish, trial.execParish) &&
                Objects.equals(execPresbytery, trial.execPresbytery) &&
                Objects.equals(execCounty, trial.execCounty) &&
                Objects.equals(execBurgh, trial.execBurgh) &&
                Objects.equals(execNgrLetters, trial.execNgrLetters) &&
                Objects.equals(execNgrEasting, trial.execNgrEasting) &&
                Objects.equals(execNgrNorthing, trial.execNgrNorthing) &&
                Objects.equals(posttrialnotes, trial.posttrialnotes) &&
                Objects.equals(createdby, trial.createdby) &&
                Objects.equals(createdate, trial.createdate) &&
                Objects.equals(lastupdatedby, trial.lastupdatedby) &&
                Objects.equals(lastupdatedon, trial.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(trialref, trialid, trialsystemid, trialtype, trialSettlement, trialParish, trialPresbytery, trialCounty, trialBurgh, trialNgrLetters, trialNgrEasting, trialNgrNorthing, watching, watchingdate, watchingdateAsDate, arrest, arrestdate, arrestdateAsDate, fled, fleddate, fleddateAsDate, actiondropped, actiondropdate, actiondropdateAsDate, actiondroppedby, actionbody, confrontingsuspects, pretrialnotes, processtype, trialdate, trialdateAsDate, trialplace, femaleAccusers, maleAccusers, highStatus, defence, verdict, sentence, cjtorder, cjtdate, cjtdateAsDate, circuit, circuitname, localwithcrep, noreftocentral, trialnotes, execution, executionmethod, executiondate, executiondateAsDate, executionplace, execSettlement, execParish, execPresbytery, execCounty, execBurgh, execNgrLetters, execNgrEasting, execNgrNorthing, posttrialnotes, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Collection<Appeal> getWdbAppealsByTrialref() {
        return wdbAppealsByTrialref;
    }

    public void setWdbAppealsByTrialref(Collection<Appeal> wdbAppealsByTrialref) {
        this.wdbAppealsByTrialref = wdbAppealsByTrialref;
    }

    public Collection<Commission> getWdbCommissionsByTrialref() {
        return wdbCommissionsByTrialref;
    }

    public void setWdbCommissionsByTrialref(Collection<Commission> wdbCommissionsByTrialref) {
        this.wdbCommissionsByTrialref = wdbCommissionsByTrialref;
    }

    public Collection<Complaint> getWdbComplaintsByTrialref() {
        return wdbComplaintsByTrialref;
    }

    public void setWdbComplaintsByTrialref(Collection<Complaint> wdbComplaintsByTrialref) {
        this.wdbComplaintsByTrialref = wdbComplaintsByTrialref;
    }

    public Collection<Confession> getWdbConfessionsByTrialref() {
        return wdbConfessionsByTrialref;
    }

    public void setWdbConfessionsByTrialref(Collection<Confession> wdbConfessionsByTrialref) {
        this.wdbConfessionsByTrialref = wdbConfessionsByTrialref;
    }

    public Collection<Denunciation> getWdbDenunciationsByTrialref() {
        return wdbDenunciationsByTrialref;
    }

    public void setWdbDenunciationsByTrialref(Collection<Denunciation> wdbDenunciationsByTrialref) {
        this.wdbDenunciationsByTrialref = wdbDenunciationsByTrialref;
    }

    public Collection<Imprisonment> getWdbImprisonmentsByTrialref() {
        return wdbImprisonmentsByTrialref;
    }

    public void setWdbImprisonmentsByTrialref(Collection<Imprisonment> wdbImprisonmentsByTrialref) {
        this.wdbImprisonmentsByTrialref = wdbImprisonmentsByTrialref;
    }

    public Collection<MentionedAsWitch> getWdbMentionedaswitchesByTrialref() {
        return wdbMentionedaswitchesByTrialref;
    }

    public void setWdbMentionedaswitchesByTrialref(Collection<MentionedAsWitch> wdbMentionedaswitchesByTrialref) {
        this.wdbMentionedaswitchesByTrialref = wdbMentionedaswitchesByTrialref;
    }

    public Collection<MovesToHLA> getWdbMovestohlasByTrialref() {
        return wdbMovestohlasByTrialref;
    }

    public void setWdbMovestohlasByTrialref(Collection<MovesToHLA> wdbMovestohlasByTrialref) {
        this.wdbMovestohlasByTrialref = wdbMovestohlasByTrialref;
    }

    public Collection<Ordeal> getWdbOrdealsByTrialref() {
        return wdbOrdealsByTrialref;
    }

    public void setWdbOrdealsByTrialref(Collection<Ordeal> wdbOrdealsByTrialref) {
        this.wdbOrdealsByTrialref = wdbOrdealsByTrialref;
    }

    public Collection<OtherNamedWitch> getWdbOthernamedwitchesByTrialref() {
        return wdbOthernamedwitchesByTrialref;
    }

    public void setWdbOthernamedwitchesByTrialref(Collection<OtherNamedWitch> wdbOthernamedwitchesByTrialref) {
        this.wdbOthernamedwitchesByTrialref = wdbOthernamedwitchesByTrialref;
    }

    public Collection<PrevCommission> getWdbPrevcommissionsByTrialref() {
        return wdbPrevcommissionsByTrialref;
    }

    public void setWdbPrevcommissionsByTrialref(Collection<PrevCommission> wdbPrevcommissionsByTrialref) {
        this.wdbPrevcommissionsByTrialref = wdbPrevcommissionsByTrialref;
    }

    public Collection<Torture> getWdbTorturesByTrialref() {
        return wdbTorturesByTrialref;
    }

    public void setWdbTorturesByTrialref(Collection<Torture> wdbTorturesByTrialref) {
        this.wdbTorturesByTrialref = wdbTorturesByTrialref;
    }

    public Case getWdbCaseByCaseref() {
        return wdbCaseByCaseref;
    }

    public void setWdbCaseByCaseref(Case wdbCaseByCaseref) {
        this.wdbCaseByCaseref = wdbCaseByCaseref;
    }

    public Collection<TrialPerson> getWdbTrialPeopleByTrialref() {
        return wdbTrialPeopleByTrialref;
    }

    public void setWdbTrialPeopleByTrialref(Collection<TrialPerson> wdbTrialPeopleByTrialref) {
        this.wdbTrialPeopleByTrialref = wdbTrialPeopleByTrialref;
    }
}

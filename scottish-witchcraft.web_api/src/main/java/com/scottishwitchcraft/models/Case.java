package com.scottishwitchcraft.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Case {
    @Id
    private String caseref;
    private Long caseid;
    private String casesystemid;
    private Integer namedindividual;
    private String casestartDate;
    private Date casestartDateAsDate;
    private String caseDate;
    private Date caseDateAsDate;
    private Integer ageAtCase;
    private String casecommonname;
    private String commission;
    private String complaint;
    private String correspondence;
    private String chronicle;
    private String other;
    private String suspectsText;
    private Boolean unorthodoxrelpractP;
    private Boolean unorthodoxrelpractS;
    private Boolean consultingP;
    private Boolean consultingS;
    private Boolean demonicP;
    private Boolean demonicS;
    private Boolean demonicPossessP;
    private Boolean demonicPossessS;
    private Boolean fairiesP;
    private Boolean fairiesS;
    private Boolean folkHealingP;
    private Boolean folkHealingS;
    private Boolean maleficiumP;
    private Boolean maleficiumS;
    private Boolean midwiferyP;
    private Boolean midwiferyS;
    private Boolean implicatedbyanotherP;
    private Boolean implicatedbyanotherS;
    private Boolean neighbhdDisputeP;
    private Boolean neighbhdDisputeS;
    private Boolean politicalmotiveP;
    private Boolean politicalmotiveS;
    private Boolean propertymotiveP;
    private Boolean propertymotiveS;
    private Boolean refusedcharityP;
    private Boolean refusedcharityS;
    private Boolean treasonP;
    private Boolean treasonS;
    private Boolean otherP;
    private Boolean otherS;
    private String othertext;
    private Boolean notenoughinfoP;
    private Boolean notenoughinfoS;
    private Boolean whitemagicP;
    private Boolean whitemagicS;
    private String charnotes;
    private Boolean demonicpact;
    private String devilnotes;
    private Boolean witchesmeeting;
    private String meetingname;
    private Boolean devilpresent;
    private Boolean maleficium;
    private Boolean communalsex;
    private Boolean devilworship;
    private Boolean foodanddrink;
    private Boolean dancing;
    private Boolean singing;
    private String singingtext;
    private String otherpractices;
    private String meetingnotes;
    private Boolean elphaneFairyland;
    private Boolean foodDrink;
    private Boolean specificverbalformulae;
    private Boolean specificritualacts;
    private Boolean familiars;
    private Boolean shapeChanging;
    private Boolean dreamsVisions;
    private Boolean unorthodoxreligiouspractice;
    private Boolean sympatheticmagic;
    private Boolean ridingdead;
    private String folknotes;
    private Boolean humanillness;
    private Boolean humandeath;
    private Boolean animalillness;
    private Boolean animaldeath;
    private Boolean femaleinfertility;
    private Boolean maleimpotence;
    private Boolean aggravatingdisease;
    private Boolean transferringdisease;
    private Boolean layingon;
    private Boolean removalbewitchment;
    private Boolean quarreling;
    private Boolean cursing;
    private Boolean poisoning;
    private Boolean rechealer;
    private Boolean healinghumans;
    private Boolean healinganimals;
    private Boolean midwifery;
    private String diseasenotes;
    private Boolean propertydamage;
    private Boolean weathermodification;
    private String othermaleficianotes;
    private String otherchargesnotes;
    private Boolean claimedbewitched;
    private Boolean claimedpossessed;
    private Boolean admitlessercharge;
    private Boolean claimednaturalcauses;
    private Boolean nodefence;
    private String defensenotes;
    private String casenotes;
    private String createdby;
    private Date createdate;
    private String lastupdatedby;
    private Date lastupdatedon;
    private Collection<CalendarCustom> wdbCalendarcustomsByCaseref;
    private WdbAccused wdbAccusedByAccusedref;
    private Collection<CasePerson> wdbCasePeopleByCaseref;
    private Collection<CounterStrategy> wdbCounterstrategiesByCaseref;
    private Collection<DemonicPact> wdbDemonicpactsByCaseref;
    private Collection<DevilAppearance> wdbDevilappearancesByCaseref;
    private Collection<ElfFairyElements> wdbElfFairyelementsByCaseref;
    private Collection<Malice> wdbMaliceByCaseref;
    private Collection<MusicalInstrument> wdbMusicalinstrumentsByCaseref;
    private Collection<OtherCharges> wdbOtherchargesByCaseref;
    private Collection<PropertyDamage> wdbPropertydamagesByCaseref;
    private Collection<Reference> wdbReferencesByCaseref;
    private Collection<ReligiousMotif> wdbReligiousmotifsByCaseref;
    private Collection<RitualObject> wdbRitualobjectsByCaseref;
    private Collection<ShapeChanging> wdbShapechangingsByCaseref;
    private Collection<Trial> wdbTrialsByCaseref;
    private Collection<TrialPerson> wdbTrialPeopleByCaseref;
    private Collection<WeatherModification> wdbWeathermodificationsByCaseref;
    private Collection<WhiteMagic> wdbWhitemagicsByCaseref;
    private Collection<WitchesMeetingPlace> wdbWitchesmeetingplacesByCaseref;

    public String getCaseref() {
        return caseref;
    }

    public void setCaseref(String caseref) {
        this.caseref = caseref;
    }

    public Long getCaseid() {
        return caseid;
    }

    public void setCaseid(Long caseid) {
        this.caseid = caseid;
    }

    public String getCasesystemid() {
        return casesystemid;
    }

    public void setCasesystemid(String casesystemid) {
        this.casesystemid = casesystemid;
    }

    public Integer getNamedindividual() {
        return namedindividual;
    }

    public void setNamedindividual(Integer namedindividual) {
        this.namedindividual = namedindividual;
    }

    public String getCasestartDate() {
        return casestartDate;
    }

    public void setCasestartDate(String casestartDate) {
        this.casestartDate = casestartDate;
    }

    public Date getCasestartDateAsDate() {
        return casestartDateAsDate;
    }

    public void setCasestartDateAsDate(Date casestartDateAsDate) {
        this.casestartDateAsDate = casestartDateAsDate;
    }

    public String getCaseDate() {
        return caseDate;
    }

    public void setCaseDate(String caseDate) {
        this.caseDate = caseDate;
    }

    public Date getCaseDateAsDate() {
        return caseDateAsDate;
    }

    public void setCaseDateAsDate(Date caseDateAsDate) {
        this.caseDateAsDate = caseDateAsDate;
    }

    public Integer getAgeAtCase() {
        return ageAtCase;
    }

    public void setAgeAtCase(Integer ageAtCase) {
        this.ageAtCase = ageAtCase;
    }

    public String getCasecommonname() {
        return casecommonname;
    }

    public void setCasecommonname(String casecommonname) {
        this.casecommonname = casecommonname;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String getCorrespondence() {
        return correspondence;
    }

    public void setCorrespondence(String correspondence) {
        this.correspondence = correspondence;
    }

    public String getChronicle() {
        return chronicle;
    }

    public void setChronicle(String chronicle) {
        this.chronicle = chronicle;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getSuspectsText() {
        return suspectsText;
    }

    public void setSuspectsText(String suspectsText) {
        this.suspectsText = suspectsText;
    }

    public Boolean getUnorthodoxrelpractP() {
        return unorthodoxrelpractP;
    }

    public void setUnorthodoxrelpractP(Boolean unorthodoxrelpractP) {
        this.unorthodoxrelpractP = unorthodoxrelpractP;
    }

    public Boolean getUnorthodoxrelpractS() {
        return unorthodoxrelpractS;
    }

    public void setUnorthodoxrelpractS(Boolean unorthodoxrelpractS) {
        this.unorthodoxrelpractS = unorthodoxrelpractS;
    }

    public Boolean getConsultingP() {
        return consultingP;
    }

    public void setConsultingP(Boolean consultingP) {
        this.consultingP = consultingP;
    }

    public Boolean getConsultingS() {
        return consultingS;
    }

    public void setConsultingS(Boolean consultingS) {
        this.consultingS = consultingS;
    }

    public Boolean getDemonicP() {
        return demonicP;
    }

    public void setDemonicP(Boolean demonicP) {
        this.demonicP = demonicP;
    }

    public Boolean getDemonicS() {
        return demonicS;
    }

    public void setDemonicS(Boolean demonicS) {
        this.demonicS = demonicS;
    }

    public Boolean getDemonicPossessP() {
        return demonicPossessP;
    }

    public void setDemonicPossessP(Boolean demonicPossessP) {
        this.demonicPossessP = demonicPossessP;
    }

    public Boolean getDemonicPossessS() {
        return demonicPossessS;
    }

    public void setDemonicPossessS(Boolean demonicPossessS) {
        this.demonicPossessS = demonicPossessS;
    }

    public Boolean getFairiesP() {
        return fairiesP;
    }

    public void setFairiesP(Boolean fairiesP) {
        this.fairiesP = fairiesP;
    }

    public Boolean getFairiesS() {
        return fairiesS;
    }

    public void setFairiesS(Boolean fairiesS) {
        this.fairiesS = fairiesS;
    }

    public Boolean getFolkHealingP() {
        return folkHealingP;
    }

    public void setFolkHealingP(Boolean folkHealingP) {
        this.folkHealingP = folkHealingP;
    }

    public Boolean getFolkHealingS() {
        return folkHealingS;
    }

    public void setFolkHealingS(Boolean folkHealingS) {
        this.folkHealingS = folkHealingS;
    }

    public Boolean getMaleficiumP() {
        return maleficiumP;
    }

    public void setMaleficiumP(Boolean maleficiumP) {
        this.maleficiumP = maleficiumP;
    }

    public Boolean getMaleficiumS() {
        return maleficiumS;
    }

    public void setMaleficiumS(Boolean maleficiumS) {
        this.maleficiumS = maleficiumS;
    }

    public Boolean getMidwiferyP() {
        return midwiferyP;
    }

    public void setMidwiferyP(Boolean midwiferyP) {
        this.midwiferyP = midwiferyP;
    }

    public Boolean getMidwiferyS() {
        return midwiferyS;
    }

    public void setMidwiferyS(Boolean midwiferyS) {
        this.midwiferyS = midwiferyS;
    }

    public Boolean getImplicatedbyanotherP() {
        return implicatedbyanotherP;
    }

    public void setImplicatedbyanotherP(Boolean implicatedbyanotherP) {
        this.implicatedbyanotherP = implicatedbyanotherP;
    }

    public Boolean getImplicatedbyanotherS() {
        return implicatedbyanotherS;
    }

    public void setImplicatedbyanotherS(Boolean implicatedbyanotherS) {
        this.implicatedbyanotherS = implicatedbyanotherS;
    }

    public Boolean getNeighbhdDisputeP() {
        return neighbhdDisputeP;
    }

    public void setNeighbhdDisputeP(Boolean neighbhdDisputeP) {
        this.neighbhdDisputeP = neighbhdDisputeP;
    }

    public Boolean getNeighbhdDisputeS() {
        return neighbhdDisputeS;
    }

    public void setNeighbhdDisputeS(Boolean neighbhdDisputeS) {
        this.neighbhdDisputeS = neighbhdDisputeS;
    }

    public Boolean getPoliticalmotiveP() {
        return politicalmotiveP;
    }

    public void setPoliticalmotiveP(Boolean politicalmotiveP) {
        this.politicalmotiveP = politicalmotiveP;
    }

    public Boolean getPoliticalmotiveS() {
        return politicalmotiveS;
    }

    public void setPoliticalmotiveS(Boolean politicalmotiveS) {
        this.politicalmotiveS = politicalmotiveS;
    }

    public Boolean getPropertymotiveP() {
        return propertymotiveP;
    }

    public void setPropertymotiveP(Boolean propertymotiveP) {
        this.propertymotiveP = propertymotiveP;
    }

    public Boolean getPropertymotiveS() {
        return propertymotiveS;
    }

    public void setPropertymotiveS(Boolean propertymotiveS) {
        this.propertymotiveS = propertymotiveS;
    }

    public Boolean getRefusedcharityP() {
        return refusedcharityP;
    }

    public void setRefusedcharityP(Boolean refusedcharityP) {
        this.refusedcharityP = refusedcharityP;
    }

    public Boolean getRefusedcharityS() {
        return refusedcharityS;
    }

    public void setRefusedcharityS(Boolean refusedcharityS) {
        this.refusedcharityS = refusedcharityS;
    }

    public Boolean getTreasonP() {
        return treasonP;
    }

    public void setTreasonP(Boolean treasonP) {
        this.treasonP = treasonP;
    }

    public Boolean getTreasonS() {
        return treasonS;
    }

    public void setTreasonS(Boolean treasonS) {
        this.treasonS = treasonS;
    }

    public Boolean getOtherP() {
        return otherP;
    }

    public void setOtherP(Boolean otherP) {
        this.otherP = otherP;
    }

    public Boolean getOtherS() {
        return otherS;
    }

    public void setOtherS(Boolean otherS) {
        this.otherS = otherS;
    }

    public String getOthertext() {
        return othertext;
    }

    public void setOthertext(String othertext) {
        this.othertext = othertext;
    }

    public Boolean getNotenoughinfoP() {
        return notenoughinfoP;
    }

    public void setNotenoughinfoP(Boolean notenoughinfoP) {
        this.notenoughinfoP = notenoughinfoP;
    }

    public Boolean getNotenoughinfoS() {
        return notenoughinfoS;
    }

    public void setNotenoughinfoS(Boolean notenoughinfoS) {
        this.notenoughinfoS = notenoughinfoS;
    }

    public Boolean getWhitemagicP() {
        return whitemagicP;
    }

    public void setWhitemagicP(Boolean whitemagicP) {
        this.whitemagicP = whitemagicP;
    }

    public Boolean getWhitemagicS() {
        return whitemagicS;
    }

    public void setWhitemagicS(Boolean whitemagicS) {
        this.whitemagicS = whitemagicS;
    }

    public String getCharnotes() {
        return charnotes;
    }

    public void setCharnotes(String charnotes) {
        this.charnotes = charnotes;
    }

    public Boolean getDemonicpact() {
        return demonicpact;
    }

    public void setDemonicpact(Boolean demonicpact) {
        this.demonicpact = demonicpact;
    }

    public String getDevilnotes() {
        return devilnotes;
    }

    public void setDevilnotes(String devilnotes) {
        this.devilnotes = devilnotes;
    }

    public Boolean getWitchesmeeting() {
        return witchesmeeting;
    }

    public void setWitchesmeeting(Boolean witchesmeeting) {
        this.witchesmeeting = witchesmeeting;
    }

    public String getMeetingname() {
        return meetingname;
    }

    public void setMeetingname(String meetingname) {
        this.meetingname = meetingname;
    }

    public Boolean getDevilpresent() {
        return devilpresent;
    }

    public void setDevilpresent(Boolean devilpresent) {
        this.devilpresent = devilpresent;
    }

    public Boolean getMaleficium() {
        return maleficium;
    }

    public void setMaleficium(Boolean maleficium) {
        this.maleficium = maleficium;
    }

    public Boolean getCommunalsex() {
        return communalsex;
    }

    public void setCommunalsex(Boolean communalsex) {
        this.communalsex = communalsex;
    }

    public Boolean getDevilworship() {
        return devilworship;
    }

    public void setDevilworship(Boolean devilworship) {
        this.devilworship = devilworship;
    }

    public Boolean getFoodanddrink() {
        return foodanddrink;
    }

    public void setFoodanddrink(Boolean foodanddrink) {
        this.foodanddrink = foodanddrink;
    }

    public Boolean getDancing() {
        return dancing;
    }

    public void setDancing(Boolean dancing) {
        this.dancing = dancing;
    }

    public Boolean getSinging() {
        return singing;
    }

    public void setSinging(Boolean singing) {
        this.singing = singing;
    }

    public String getSingingtext() {
        return singingtext;
    }

    public void setSingingtext(String singingtext) {
        this.singingtext = singingtext;
    }

    public String getOtherpractices() {
        return otherpractices;
    }

    public void setOtherpractices(String otherpractices) {
        this.otherpractices = otherpractices;
    }

    public String getMeetingnotes() {
        return meetingnotes;
    }

    public void setMeetingnotes(String meetingnotes) {
        this.meetingnotes = meetingnotes;
    }

    public Boolean getElphaneFairyland() {
        return elphaneFairyland;
    }

    public void setElphaneFairyland(Boolean elphaneFairyland) {
        this.elphaneFairyland = elphaneFairyland;
    }

    public Boolean getFoodDrink() {
        return foodDrink;
    }

    public void setFoodDrink(Boolean foodDrink) {
        this.foodDrink = foodDrink;
    }

    public Boolean getSpecificverbalformulae() {
        return specificverbalformulae;
    }

    public void setSpecificverbalformulae(Boolean specificverbalformulae) {
        this.specificverbalformulae = specificverbalformulae;
    }

    public Boolean getSpecificritualacts() {
        return specificritualacts;
    }

    public void setSpecificritualacts(Boolean specificritualacts) {
        this.specificritualacts = specificritualacts;
    }

    public Boolean getFamiliars() {
        return familiars;
    }

    public void setFamiliars(Boolean familiars) {
        this.familiars = familiars;
    }

    public Boolean getShapeChanging() {
        return shapeChanging;
    }

    public void setShapeChanging(Boolean shapeChanging) {
        this.shapeChanging = shapeChanging;
    }

    public Boolean getDreamsVisions() {
        return dreamsVisions;
    }

    public void setDreamsVisions(Boolean dreamsVisions) {
        this.dreamsVisions = dreamsVisions;
    }

    public Boolean getUnorthodoxreligiouspractice() {
        return unorthodoxreligiouspractice;
    }

    public void setUnorthodoxreligiouspractice(Boolean unorthodoxreligiouspractice) {
        this.unorthodoxreligiouspractice = unorthodoxreligiouspractice;
    }

    public Boolean getSympatheticmagic() {
        return sympatheticmagic;
    }

    public void setSympatheticmagic(Boolean sympatheticmagic) {
        this.sympatheticmagic = sympatheticmagic;
    }

    public Boolean getRidingdead() {
        return ridingdead;
    }

    public void setRidingdead(Boolean ridingdead) {
        this.ridingdead = ridingdead;
    }

    public String getFolknotes() {
        return folknotes;
    }

    public void setFolknotes(String folknotes) {
        this.folknotes = folknotes;
    }

    public Boolean getHumanillness() {
        return humanillness;
    }

    public void setHumanillness(Boolean humanillness) {
        this.humanillness = humanillness;
    }

    public Boolean getHumandeath() {
        return humandeath;
    }

    public void setHumandeath(Boolean humandeath) {
        this.humandeath = humandeath;
    }

    public Boolean getAnimalillness() {
        return animalillness;
    }

    public void setAnimalillness(Boolean animalillness) {
        this.animalillness = animalillness;
    }

    public Boolean getAnimaldeath() {
        return animaldeath;
    }

    public void setAnimaldeath(Boolean animaldeath) {
        this.animaldeath = animaldeath;
    }

    public Boolean getFemaleinfertility() {
        return femaleinfertility;
    }

    public void setFemaleinfertility(Boolean femaleinfertility) {
        this.femaleinfertility = femaleinfertility;
    }

    public Boolean getMaleimpotence() {
        return maleimpotence;
    }

    public void setMaleimpotence(Boolean maleimpotence) {
        this.maleimpotence = maleimpotence;
    }

    public Boolean getAggravatingdisease() {
        return aggravatingdisease;
    }

    public void setAggravatingdisease(Boolean aggravatingdisease) {
        this.aggravatingdisease = aggravatingdisease;
    }

    public Boolean getTransferringdisease() {
        return transferringdisease;
    }

    public void setTransferringdisease(Boolean transferringdisease) {
        this.transferringdisease = transferringdisease;
    }

    public Boolean getLayingon() {
        return layingon;
    }

    public void setLayingon(Boolean layingon) {
        this.layingon = layingon;
    }

    public Boolean getRemovalbewitchment() {
        return removalbewitchment;
    }

    public void setRemovalbewitchment(Boolean removalbewitchment) {
        this.removalbewitchment = removalbewitchment;
    }

    public Boolean getQuarreling() {
        return quarreling;
    }

    public void setQuarreling(Boolean quarreling) {
        this.quarreling = quarreling;
    }

    public Boolean getCursing() {
        return cursing;
    }

    public void setCursing(Boolean cursing) {
        this.cursing = cursing;
    }

    public Boolean getPoisoning() {
        return poisoning;
    }

    public void setPoisoning(Boolean poisoning) {
        this.poisoning = poisoning;
    }

    public Boolean getRechealer() {
        return rechealer;
    }

    public void setRechealer(Boolean rechealer) {
        this.rechealer = rechealer;
    }

    public Boolean getHealinghumans() {
        return healinghumans;
    }

    public void setHealinghumans(Boolean healinghumans) {
        this.healinghumans = healinghumans;
    }

    public Boolean getHealinganimals() {
        return healinganimals;
    }

    public void setHealinganimals(Boolean healinganimals) {
        this.healinganimals = healinganimals;
    }

    public Boolean getMidwifery() {
        return midwifery;
    }

    public void setMidwifery(Boolean midwifery) {
        this.midwifery = midwifery;
    }

    public String getDiseasenotes() {
        return diseasenotes;
    }

    public void setDiseasenotes(String diseasenotes) {
        this.diseasenotes = diseasenotes;
    }

    public Boolean getPropertydamage() {
        return propertydamage;
    }

    public void setPropertydamage(Boolean propertydamage) {
        this.propertydamage = propertydamage;
    }

    public Boolean getWeathermodification() {
        return weathermodification;
    }

    public void setWeathermodification(Boolean weathermodification) {
        this.weathermodification = weathermodification;
    }

    public String getOthermaleficianotes() {
        return othermaleficianotes;
    }

    public void setOthermaleficianotes(String othermaleficianotes) {
        this.othermaleficianotes = othermaleficianotes;
    }

    public String getOtherchargesnotes() {
        return otherchargesnotes;
    }

    public void setOtherchargesnotes(String otherchargesnotes) {
        this.otherchargesnotes = otherchargesnotes;
    }

    public Boolean getClaimedbewitched() {
        return claimedbewitched;
    }

    public void setClaimedbewitched(Boolean claimedbewitched) {
        this.claimedbewitched = claimedbewitched;
    }

    public Boolean getClaimedpossessed() {
        return claimedpossessed;
    }

    public void setClaimedpossessed(Boolean claimedpossessed) {
        this.claimedpossessed = claimedpossessed;
    }

    public Boolean getAdmitlessercharge() {
        return admitlessercharge;
    }

    public void setAdmitlessercharge(Boolean admitlessercharge) {
        this.admitlessercharge = admitlessercharge;
    }

    public Boolean getClaimednaturalcauses() {
        return claimednaturalcauses;
    }

    public void setClaimednaturalcauses(Boolean claimednaturalcauses) {
        this.claimednaturalcauses = claimednaturalcauses;
    }

    public Boolean getNodefence() {
        return nodefence;
    }

    public void setNodefence(Boolean nodefence) {
        this.nodefence = nodefence;
    }

    public String getDefensenotes() {
        return defensenotes;
    }

    public void setDefensenotes(String defensenotes) {
        this.defensenotes = defensenotes;
    }

    public String getCasenotes() {
        return casenotes;
    }

    public void setCasenotes(String casenotes) {
        this.casenotes = casenotes;
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
        Case aCase = (Case) o;
        return Objects.equals(caseref, aCase.caseref) &&
                Objects.equals(caseid, aCase.caseid) &&
                Objects.equals(casesystemid, aCase.casesystemid) &&
                Objects.equals(namedindividual, aCase.namedindividual) &&
                Objects.equals(casestartDate, aCase.casestartDate) &&
                Objects.equals(casestartDateAsDate, aCase.casestartDateAsDate) &&
                Objects.equals(caseDate, aCase.caseDate) &&
                Objects.equals(caseDateAsDate, aCase.caseDateAsDate) &&
                Objects.equals(ageAtCase, aCase.ageAtCase) &&
                Objects.equals(casecommonname, aCase.casecommonname) &&
                Objects.equals(commission, aCase.commission) &&
                Objects.equals(complaint, aCase.complaint) &&
                Objects.equals(correspondence, aCase.correspondence) &&
                Objects.equals(chronicle, aCase.chronicle) &&
                Objects.equals(other, aCase.other) &&
                Objects.equals(suspectsText, aCase.suspectsText) &&
                Objects.equals(unorthodoxrelpractP, aCase.unorthodoxrelpractP) &&
                Objects.equals(unorthodoxrelpractS, aCase.unorthodoxrelpractS) &&
                Objects.equals(consultingP, aCase.consultingP) &&
                Objects.equals(consultingS, aCase.consultingS) &&
                Objects.equals(demonicP, aCase.demonicP) &&
                Objects.equals(demonicS, aCase.demonicS) &&
                Objects.equals(demonicPossessP, aCase.demonicPossessP) &&
                Objects.equals(demonicPossessS, aCase.demonicPossessS) &&
                Objects.equals(fairiesP, aCase.fairiesP) &&
                Objects.equals(fairiesS, aCase.fairiesS) &&
                Objects.equals(folkHealingP, aCase.folkHealingP) &&
                Objects.equals(folkHealingS, aCase.folkHealingS) &&
                Objects.equals(maleficiumP, aCase.maleficiumP) &&
                Objects.equals(maleficiumS, aCase.maleficiumS) &&
                Objects.equals(midwiferyP, aCase.midwiferyP) &&
                Objects.equals(midwiferyS, aCase.midwiferyS) &&
                Objects.equals(implicatedbyanotherP, aCase.implicatedbyanotherP) &&
                Objects.equals(implicatedbyanotherS, aCase.implicatedbyanotherS) &&
                Objects.equals(neighbhdDisputeP, aCase.neighbhdDisputeP) &&
                Objects.equals(neighbhdDisputeS, aCase.neighbhdDisputeS) &&
                Objects.equals(politicalmotiveP, aCase.politicalmotiveP) &&
                Objects.equals(politicalmotiveS, aCase.politicalmotiveS) &&
                Objects.equals(propertymotiveP, aCase.propertymotiveP) &&
                Objects.equals(propertymotiveS, aCase.propertymotiveS) &&
                Objects.equals(refusedcharityP, aCase.refusedcharityP) &&
                Objects.equals(refusedcharityS, aCase.refusedcharityS) &&
                Objects.equals(treasonP, aCase.treasonP) &&
                Objects.equals(treasonS, aCase.treasonS) &&
                Objects.equals(otherP, aCase.otherP) &&
                Objects.equals(otherS, aCase.otherS) &&
                Objects.equals(othertext, aCase.othertext) &&
                Objects.equals(notenoughinfoP, aCase.notenoughinfoP) &&
                Objects.equals(notenoughinfoS, aCase.notenoughinfoS) &&
                Objects.equals(whitemagicP, aCase.whitemagicP) &&
                Objects.equals(whitemagicS, aCase.whitemagicS) &&
                Objects.equals(charnotes, aCase.charnotes) &&
                Objects.equals(demonicpact, aCase.demonicpact) &&
                Objects.equals(devilnotes, aCase.devilnotes) &&
                Objects.equals(witchesmeeting, aCase.witchesmeeting) &&
                Objects.equals(meetingname, aCase.meetingname) &&
                Objects.equals(devilpresent, aCase.devilpresent) &&
                Objects.equals(maleficium, aCase.maleficium) &&
                Objects.equals(communalsex, aCase.communalsex) &&
                Objects.equals(devilworship, aCase.devilworship) &&
                Objects.equals(foodanddrink, aCase.foodanddrink) &&
                Objects.equals(dancing, aCase.dancing) &&
                Objects.equals(singing, aCase.singing) &&
                Objects.equals(singingtext, aCase.singingtext) &&
                Objects.equals(otherpractices, aCase.otherpractices) &&
                Objects.equals(meetingnotes, aCase.meetingnotes) &&
                Objects.equals(elphaneFairyland, aCase.elphaneFairyland) &&
                Objects.equals(foodDrink, aCase.foodDrink) &&
                Objects.equals(specificverbalformulae, aCase.specificverbalformulae) &&
                Objects.equals(specificritualacts, aCase.specificritualacts) &&
                Objects.equals(familiars, aCase.familiars) &&
                Objects.equals(shapeChanging, aCase.shapeChanging) &&
                Objects.equals(dreamsVisions, aCase.dreamsVisions) &&
                Objects.equals(unorthodoxreligiouspractice, aCase.unorthodoxreligiouspractice) &&
                Objects.equals(sympatheticmagic, aCase.sympatheticmagic) &&
                Objects.equals(ridingdead, aCase.ridingdead) &&
                Objects.equals(folknotes, aCase.folknotes) &&
                Objects.equals(humanillness, aCase.humanillness) &&
                Objects.equals(humandeath, aCase.humandeath) &&
                Objects.equals(animalillness, aCase.animalillness) &&
                Objects.equals(animaldeath, aCase.animaldeath) &&
                Objects.equals(femaleinfertility, aCase.femaleinfertility) &&
                Objects.equals(maleimpotence, aCase.maleimpotence) &&
                Objects.equals(aggravatingdisease, aCase.aggravatingdisease) &&
                Objects.equals(transferringdisease, aCase.transferringdisease) &&
                Objects.equals(layingon, aCase.layingon) &&
                Objects.equals(removalbewitchment, aCase.removalbewitchment) &&
                Objects.equals(quarreling, aCase.quarreling) &&
                Objects.equals(cursing, aCase.cursing) &&
                Objects.equals(poisoning, aCase.poisoning) &&
                Objects.equals(rechealer, aCase.rechealer) &&
                Objects.equals(healinghumans, aCase.healinghumans) &&
                Objects.equals(healinganimals, aCase.healinganimals) &&
                Objects.equals(midwifery, aCase.midwifery) &&
                Objects.equals(diseasenotes, aCase.diseasenotes) &&
                Objects.equals(propertydamage, aCase.propertydamage) &&
                Objects.equals(weathermodification, aCase.weathermodification) &&
                Objects.equals(othermaleficianotes, aCase.othermaleficianotes) &&
                Objects.equals(otherchargesnotes, aCase.otherchargesnotes) &&
                Objects.equals(claimedbewitched, aCase.claimedbewitched) &&
                Objects.equals(claimedpossessed, aCase.claimedpossessed) &&
                Objects.equals(admitlessercharge, aCase.admitlessercharge) &&
                Objects.equals(claimednaturalcauses, aCase.claimednaturalcauses) &&
                Objects.equals(nodefence, aCase.nodefence) &&
                Objects.equals(defensenotes, aCase.defensenotes) &&
                Objects.equals(casenotes, aCase.casenotes) &&
                Objects.equals(createdby, aCase.createdby) &&
                Objects.equals(createdate, aCase.createdate) &&
                Objects.equals(lastupdatedby, aCase.lastupdatedby) &&
                Objects.equals(lastupdatedon, aCase.lastupdatedon);
    }

    @Override
    public int hashCode() {

        return Objects.hash(caseref, caseid, casesystemid, namedindividual, casestartDate, casestartDateAsDate, caseDate, caseDateAsDate, ageAtCase, casecommonname, commission, complaint, correspondence, chronicle, other, suspectsText, unorthodoxrelpractP, unorthodoxrelpractS, consultingP, consultingS, demonicP, demonicS, demonicPossessP, demonicPossessS, fairiesP, fairiesS, folkHealingP, folkHealingS, maleficiumP, maleficiumS, midwiferyP, midwiferyS, implicatedbyanotherP, implicatedbyanotherS, neighbhdDisputeP, neighbhdDisputeS, politicalmotiveP, politicalmotiveS, propertymotiveP, propertymotiveS, refusedcharityP, refusedcharityS, treasonP, treasonS, otherP, otherS, othertext, notenoughinfoP, notenoughinfoS, whitemagicP, whitemagicS, charnotes, demonicpact, devilnotes, witchesmeeting, meetingname, devilpresent, maleficium, communalsex, devilworship, foodanddrink, dancing, singing, singingtext, otherpractices, meetingnotes, elphaneFairyland, foodDrink, specificverbalformulae, specificritualacts, familiars, shapeChanging, dreamsVisions, unorthodoxreligiouspractice, sympatheticmagic, ridingdead, folknotes, humanillness, humandeath, animalillness, animaldeath, femaleinfertility, maleimpotence, aggravatingdisease, transferringdisease, layingon, removalbewitchment, quarreling, cursing, poisoning, rechealer, healinghumans, healinganimals, midwifery, diseasenotes, propertydamage, weathermodification, othermaleficianotes, otherchargesnotes, claimedbewitched, claimedpossessed, admitlessercharge, claimednaturalcauses, nodefence, defensenotes, casenotes, createdby, createdate, lastupdatedby, lastupdatedon);
    }

    public Collection<CalendarCustom> getWdbCalendarcustomsByCaseref() {
        return wdbCalendarcustomsByCaseref;
    }

    public void setWdbCalendarcustomsByCaseref(Collection<CalendarCustom> wdbCalendarcustomsByCaseref) {
        this.wdbCalendarcustomsByCaseref = wdbCalendarcustomsByCaseref;
    }

    public WdbAccused getWdbAccusedByAccusedref() {
        return wdbAccusedByAccusedref;
    }

    public void setWdbAccusedByAccusedref(WdbAccused wdbAccusedByAccusedref) {
        this.wdbAccusedByAccusedref = wdbAccusedByAccusedref;
    }

    public Collection<CasePerson> getWdbCasePeopleByCaseref() {
        return wdbCasePeopleByCaseref;
    }

    public void setWdbCasePeopleByCaseref(Collection<CasePerson> wdbCasePeopleByCaseref) {
        this.wdbCasePeopleByCaseref = wdbCasePeopleByCaseref;
    }

    public Collection<CounterStrategy> getWdbCounterstrategiesByCaseref() {
        return wdbCounterstrategiesByCaseref;
    }

    public void setWdbCounterstrategiesByCaseref(Collection<CounterStrategy> wdbCounterstrategiesByCaseref) {
        this.wdbCounterstrategiesByCaseref = wdbCounterstrategiesByCaseref;
    }

    public Collection<DemonicPact> getWdbDemonicpactsByCaseref() {
        return wdbDemonicpactsByCaseref;
    }

    public void setWdbDemonicpactsByCaseref(Collection<DemonicPact> wdbDemonicpactsByCaseref) {
        this.wdbDemonicpactsByCaseref = wdbDemonicpactsByCaseref;
    }

    public Collection<DevilAppearance> getWdbDevilappearancesByCaseref() {
        return wdbDevilappearancesByCaseref;
    }

    public void setWdbDevilappearancesByCaseref(Collection<DevilAppearance> wdbDevilappearancesByCaseref) {
        this.wdbDevilappearancesByCaseref = wdbDevilappearancesByCaseref;
    }

    public Collection<ElfFairyElements> getWdbElfFairyelementsByCaseref() {
        return wdbElfFairyelementsByCaseref;
    }

    public void setWdbElfFairyelementsByCaseref(Collection<ElfFairyElements> wdbElfFairyelementsByCaseref) {
        this.wdbElfFairyelementsByCaseref = wdbElfFairyelementsByCaseref;
    }

    public Collection<Malice> getWdbMaliceByCaseref() {
        return wdbMaliceByCaseref;
    }

    public void setWdbMaliceByCaseref(Collection<Malice> wdbMaliceByCaseref) {
        this.wdbMaliceByCaseref = wdbMaliceByCaseref;
    }

    public Collection<MusicalInstrument> getWdbMusicalinstrumentsByCaseref() {
        return wdbMusicalinstrumentsByCaseref;
    }

    public void setWdbMusicalinstrumentsByCaseref(Collection<MusicalInstrument> wdbMusicalinstrumentsByCaseref) {
        this.wdbMusicalinstrumentsByCaseref = wdbMusicalinstrumentsByCaseref;
    }

    public Collection<OtherCharges> getWdbOtherchargesByCaseref() {
        return wdbOtherchargesByCaseref;
    }

    public void setWdbOtherchargesByCaseref(Collection<OtherCharges> wdbOtherchargesByCaseref) {
        this.wdbOtherchargesByCaseref = wdbOtherchargesByCaseref;
    }

    public Collection<PropertyDamage> getWdbPropertydamagesByCaseref() {
        return wdbPropertydamagesByCaseref;
    }

    public void setWdbPropertydamagesByCaseref(Collection<PropertyDamage> wdbPropertydamagesByCaseref) {
        this.wdbPropertydamagesByCaseref = wdbPropertydamagesByCaseref;
    }

    public Collection<Reference> getWdbReferencesByCaseref() {
        return wdbReferencesByCaseref;
    }

    public void setWdbReferencesByCaseref(Collection<Reference> wdbReferencesByCaseref) {
        this.wdbReferencesByCaseref = wdbReferencesByCaseref;
    }

    public Collection<ReligiousMotif> getWdbReligiousmotifsByCaseref() {
        return wdbReligiousmotifsByCaseref;
    }

    public void setWdbReligiousmotifsByCaseref(Collection<ReligiousMotif> wdbReligiousmotifsByCaseref) {
        this.wdbReligiousmotifsByCaseref = wdbReligiousmotifsByCaseref;
    }

    public Collection<RitualObject> getWdbRitualobjectsByCaseref() {
        return wdbRitualobjectsByCaseref;
    }

    public void setWdbRitualobjectsByCaseref(Collection<RitualObject> wdbRitualobjectsByCaseref) {
        this.wdbRitualobjectsByCaseref = wdbRitualobjectsByCaseref;
    }

    public Collection<ShapeChanging> getWdbShapechangingsByCaseref() {
        return wdbShapechangingsByCaseref;
    }

    public void setWdbShapechangingsByCaseref(Collection<ShapeChanging> wdbShapechangingsByCaseref) {
        this.wdbShapechangingsByCaseref = wdbShapechangingsByCaseref;
    }

    public Collection<Trial> getWdbTrialsByCaseref() {
        return wdbTrialsByCaseref;
    }

    public void setWdbTrialsByCaseref(Collection<Trial> wdbTrialsByCaseref) {
        this.wdbTrialsByCaseref = wdbTrialsByCaseref;
    }

    public Collection<TrialPerson> getWdbTrialPeopleByCaseref() {
        return wdbTrialPeopleByCaseref;
    }

    public void setWdbTrialPeopleByCaseref(Collection<TrialPerson> wdbTrialPeopleByCaseref) {
        this.wdbTrialPeopleByCaseref = wdbTrialPeopleByCaseref;
    }

    public Collection<WeatherModification> getWdbWeathermodificationsByCaseref() {
        return wdbWeathermodificationsByCaseref;
    }

    public void setWdbWeathermodificationsByCaseref(Collection<WeatherModification> wdbWeathermodificationsByCaseref) {
        this.wdbWeathermodificationsByCaseref = wdbWeathermodificationsByCaseref;
    }

    public Collection<WhiteMagic> getWdbWhitemagicsByCaseref() {
        return wdbWhitemagicsByCaseref;
    }

    public void setWdbWhitemagicsByCaseref(Collection<WhiteMagic> wdbWhitemagicsByCaseref) {
        this.wdbWhitemagicsByCaseref = wdbWhitemagicsByCaseref;
    }

    public Collection<WitchesMeetingPlace> getWdbWitchesmeetingplacesByCaseref() {
        return wdbWitchesmeetingplacesByCaseref;
    }

    public void setWdbWitchesmeetingplacesByCaseref(Collection<WitchesMeetingPlace> wdbWitchesmeetingplacesByCaseref) {
        this.wdbWitchesmeetingplacesByCaseref = wdbWitchesmeetingplacesByCaseref;
    }
}

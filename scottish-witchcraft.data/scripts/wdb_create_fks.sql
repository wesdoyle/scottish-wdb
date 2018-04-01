-- This script is auto-generated 

ALTER TABLE public.wdb_accused_family
                         ADD CONSTRAINT fk_wdb_accused_family_to_accusedref
                         FOREIGN KEY (accusedref)
                         REFERENCES wdb_accused(accusedref);

ALTER TABLE public.wdb_appeal
                         ADD CONSTRAINT fk_wdb_appeal_to_trialref
                         FOREIGN KEY (trialref)
                         REFERENCES wdb_trial(trialref);

ALTER TABLE public.wdb_appeal
                         ADD CONSTRAINT fk_wdb_appeal_to_personref
                         FOREIGN KEY (personref)
                         REFERENCES wdb_person(personref);

ALTER TABLE public.wdb_calendarcustom
                         ADD CONSTRAINT fk_wdb_calendarcustom_to_caseref
                         FOREIGN KEY (caseref)
                         REFERENCES wdb_case(caseref);

ALTER TABLE public.wdb_case
                         ADD CONSTRAINT fk_wdb_case_to_accusedref
                         FOREIGN KEY (accusedref)
                         REFERENCES wdb_accused(accusedref);

ALTER TABLE public.wdb_case_person
                         ADD CONSTRAINT fk_wdb_case_person_to_caseref
                         FOREIGN KEY (caseref)
                         REFERENCES wdb_case(caseref);

ALTER TABLE public.wdb_case_person
                         ADD CONSTRAINT fk_wdb_case_person_to_personref
                         FOREIGN KEY (personref)
                         REFERENCES wdb_person(personref);

ALTER TABLE public.wdb_commission
                         ADD CONSTRAINT fk_wdb_commission_to_trialref
                         FOREIGN KEY (trialref)
                         REFERENCES wdb_trial(trialref);

ALTER TABLE public.wdb_complaint
                         ADD CONSTRAINT fk_wdb_complaint_to_trialref
                         FOREIGN KEY (trialref)
                         REFERENCES wdb_trial(trialref);

ALTER TABLE public.wdb_complaint
                         ADD CONSTRAINT fk_wdb_complaint_to_accused_familyref
                         FOREIGN KEY (accused_familyref)
                         REFERENCES wdb_accused_family(accused_familyref);

ALTER TABLE public.wdb_complaint
                         ADD CONSTRAINT fk_wdb_complaint_to_personref
                         FOREIGN KEY (personref)
                         REFERENCES wdb_person(personref);

ALTER TABLE public.wdb_confession
                         ADD CONSTRAINT fk_wdb_confession_to_trialref
                         FOREIGN KEY (trialref)
                         REFERENCES wdb_trial(trialref);

ALTER TABLE public.wdb_counterstrategy
                         ADD CONSTRAINT fk_wdb_counterstrategy_to_caseref
                         FOREIGN KEY (caseref)
                         REFERENCES wdb_case(caseref);

ALTER TABLE public.wdb_demonicpact
                         ADD CONSTRAINT fk_wdb_demonicpact_to_caseref
                         FOREIGN KEY (caseref)
                         REFERENCES wdb_case(caseref);

ALTER TABLE public.wdb_denunciation
                         ADD CONSTRAINT fk_wdb_denunciation_to_trialref
                         FOREIGN KEY (trialref)
                         REFERENCES wdb_trial(trialref);

ALTER TABLE public.wdb_devilappearance
                         ADD CONSTRAINT fk_wdb_devilappearance_to_caseref
                         FOREIGN KEY (caseref)
                         REFERENCES wdb_case(caseref);

ALTER TABLE public.wdb_elf_fairyelements
                         ADD CONSTRAINT fk_wdb_elf_fairyelements_to_caseref
                         FOREIGN KEY (caseref)
                         REFERENCES wdb_case(caseref);

ALTER TABLE public.wdb_imprisonment
                         ADD CONSTRAINT fk_wdb_imprisonment_to_trialref
                         FOREIGN KEY (trialref)
                         REFERENCES wdb_trial(trialref);

ALTER TABLE public.wdb_malice
                         ADD CONSTRAINT fk_wdb_malice_to_caseref
                         FOREIGN KEY (caseref)
                         REFERENCES wdb_case(caseref);

ALTER TABLE public.wdb_mentionedaswitch
                         ADD CONSTRAINT fk_wdb_mentionedaswitch_to_trialref
                         FOREIGN KEY (trialref)
                         REFERENCES wdb_trial(trialref);

ALTER TABLE public.wdb_movestohla
                         ADD CONSTRAINT fk_wdb_movestohla_to_trialref
                         FOREIGN KEY (trialref)
                         REFERENCES wdb_trial(trialref);

ALTER TABLE public.wdb_musicalinstrument
                         ADD CONSTRAINT fk_wdb_musicalinstrument_to_caseref
                         FOREIGN KEY (caseref)
                         REFERENCES wdb_case(caseref);

ALTER TABLE public.wdb_ordeal
                         ADD CONSTRAINT fk_wdb_ordeal_to_trialref
                         FOREIGN KEY (trialref)
                         REFERENCES wdb_trial(trialref);

ALTER TABLE public.wdb_othercharges
                         ADD CONSTRAINT fk_wdb_othercharges_to_caseref
                         FOREIGN KEY (caseref)
                         REFERENCES wdb_case(caseref);

ALTER TABLE public.wdb_othernamedwitch
                         ADD CONSTRAINT fk_wdb_othernamedwitch_to_trialref
                         FOREIGN KEY (trialref)
                         REFERENCES wdb_trial(trialref);

ALTER TABLE public.wdb_prevcommission
                         ADD CONSTRAINT fk_wdb_prevcommission_to_trialref
                         FOREIGN KEY (trialref)
                         REFERENCES wdb_trial(trialref);

ALTER TABLE public.wdb_propertydamage
                         ADD CONSTRAINT fk_wdb_propertydamage_to_caseref
                         FOREIGN KEY (caseref)
                         REFERENCES wdb_case(caseref);

ALTER TABLE public.wdb_reference
                         ADD CONSTRAINT fk_wdb_reference_to_caseref
                         FOREIGN KEY (caseref)
                         REFERENCES wdb_case(caseref);

ALTER TABLE public.wdb_reference
                         ADD CONSTRAINT fk_wdb_reference_to_sourceref
                         FOREIGN KEY (sourceref)
                         REFERENCES wdb_source(sourceref);

ALTER TABLE public.wdb_religiousmotif
                         ADD CONSTRAINT fk_wdb_religiousmotif_to_caseref
                         FOREIGN KEY (caseref)
                         REFERENCES wdb_case(caseref);

ALTER TABLE public.wdb_ritualobject
                         ADD CONSTRAINT fk_wdb_ritualobject_to_caseref
                         FOREIGN KEY (caseref)
                         REFERENCES wdb_case(caseref);

ALTER TABLE public.wdb_shapechanging
                         ADD CONSTRAINT fk_wdb_shapechanging_to_caseref
                         FOREIGN KEY (caseref)
                         REFERENCES wdb_case(caseref);

ALTER TABLE public.wdb_torture
                         ADD CONSTRAINT fk_wdb_torture_to_trialref
                         FOREIGN KEY (trialref)
                         REFERENCES wdb_trial(trialref);

ALTER TABLE public.wdb_trial
                         ADD CONSTRAINT fk_wdb_trial_to_caseref
                         FOREIGN KEY (caseref)
                         REFERENCES wdb_case(caseref);

ALTER TABLE public.wdb_trial_person
                         ADD CONSTRAINT fk_wdb_trial_person_to_trialref
                         FOREIGN KEY (trialref)
                         REFERENCES wdb_trial(trialref);

ALTER TABLE public.wdb_trial_person
                         ADD CONSTRAINT fk_wdb_trial_person_to_personref
                         FOREIGN KEY (personref)
                         REFERENCES wdb_person(personref);

ALTER TABLE public.wdb_trial_person
                         ADD CONSTRAINT fk_wdb_trial_person_to_caseref
                         FOREIGN KEY (caseref)
                         REFERENCES wdb_case(caseref);

ALTER TABLE public.wdb_weathermodification
                         ADD CONSTRAINT fk_wdb_weathermodification_to_caseref
                         FOREIGN KEY (caseref)
                         REFERENCES wdb_case(caseref);

ALTER TABLE public.wdb_whitemagic
                         ADD CONSTRAINT fk_wdb_whitemagic_to_caseref
                         FOREIGN KEY (caseref)
                         REFERENCES wdb_case(caseref);

ALTER TABLE public.wdb_witchesmeetingplace
                         ADD CONSTRAINT fk_wdb_witchesmeetingplace_to_caseref
                         FOREIGN KEY (caseref)
                         REFERENCES wdb_case(caseref);


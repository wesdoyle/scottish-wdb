-- Add empty missing person records so FKs can be made
INSERT INTO public.wdb_person(personref) VALUES
('JO_797'),
('JO_68'),
('LA_1457');

-- Add Primary Keys
ALTER TABLE public.wdb_person ADD PRIMARY KEY (personref);
ALTER TABLE public.wdb_case_person ADD PRIMARY KEY (case_personref);
ALTER TABLE public.wdb_appeal ADD PRIMARY KEY (appealref);
ALTER TABLE public.wdb_complaint ADD PRIMARY KEY (complaintref);
ALTER TABLE public.wdb_trial_person ADD PRIMARY KEY (trial_personref);

-- Add Foreign Keys
ALTER TABLE public.wdb_case_person
   ADD CONSTRAINT fk_case_to_person
   FOREIGN KEY (personref) 
   REFERENCES wdb_person(personref);
   
ALTER TABLE public.wdb_appeal
   ADD CONSTRAINT fk_appeal_to_person
   FOREIGN KEY (personref) 
   REFERENCES wdb_person(personref);

ALTER TABLE public.wdb_complaint
   ADD CONSTRAINT fk_complaint_to_person
   FOREIGN KEY (personref) 
   REFERENCES wdb_person(personref);
   
ALTER TABLE public.wdb_trial_person
   ADD CONSTRAINT fk_trial_to_person
   FOREIGN KEY (personref) 
   REFERENCES wdb_person(personref);



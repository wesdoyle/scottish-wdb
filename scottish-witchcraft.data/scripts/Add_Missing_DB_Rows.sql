-- Add missing records that have relationships so FKs can be made

INSERT INTO public.wdb_person(personref) VALUES ('JO_797'), ('JO_68'), ('LA_1457');

INSERT INTO public.wdb_case (caseref) VALUES ('C_EGD_1024'), ('C_EGD_1040'), ('C_EGD_1164'),
('C_EGD_1204'), ('C_EGD_1259'), ('C_EGD_1314'), ('C_EGD_1661'), ('C_EGD_174'), ('C_EGD_181'),
('C_EGD_182'), ('C_EGD_37'), ('C_EGD_399'), ('C_EGD_410');

INSERT INTO public.wdb_source(sourceref) VALUES ('Kirkcaldy_Burgh_Court_Book,_1595-1597');

INSERT INTO SEMANA(ID_SEM,DIA) VALUES (1,'Segunda-Ferira')
INSERT INTO SEMANA(ID_SEM,DIA) VALUES (2,'Terça-Ferira')
INSERT INTO SEMANA(ID_SEM,DIA) VALUES (3,'Quarta-Ferira')
INSERT INTO SEMANA(ID_SEM,DIA) VALUES (4,'Quinta-Ferira')
INSERT INTO SEMANA(ID_SEM,DIA) VALUES (5,'Sexta-Ferira')
INSERT INTO SEMANA(ID_SEM,DIA) VALUES (6,'Sabado')
INSERT INTO SEMANA(ID_SEM,DIA) VALUES (7,'Domingo')

INSERT INTO CIDADE(ID_CIDADE,NOME_CIDADE,LAT_CIDADE,LON_CIDADE) VALUES (1,'Conchas',28.0,-27.0)
INSERT INTO CIDADE(ID_CIDADE,NOME_CIDADE,LAT_CIDADE,LON_CIDADE) VALUES (2,'São Paulo',65,-54.0)
INSERT INTO CIDADE(ID_CIDADE,NOME_CIDADE,LAT_CIDADE,LON_CIDADE) VALUES (3,'Rio Grande',98.0,-25.0)
INSERT INTO CIDADE(ID_CIDADE,NOME_CIDADE,LAT_CIDADE,LON_CIDADE) VALUES (4,'Rio de Janeiro',78.0,-45.0)
INSERT INTO CIDADE(ID_CIDADE,NOME_CIDADE,LAT_CIDADE,LON_CIDADE) VALUES (5,'Minas Gerais',36.0,-54.0)
INSERT INTO CIDADE(ID_CIDADE,NOME_CIDADE,LAT_CIDADE,LON_CIDADE) VALUES (6,'São Matheus',15.0,-57.0)
INSERT INTO CIDADE(ID_CIDADE,NOME_CIDADE,LAT_CIDADE,LON_CIDADE) VALUES (7,'Pereiras',38.0,-17.0)

insert into PERIODO (ID_PERIODO,ID_SEM,ID_CIDADE,TEMPERATURAMIN,TEMPERATURAMAX,HUMIDADE,DISCRICAO,DATAHORA) values (3,1,1,20.6,27.8,85,'','06:32:00 27/03/2019');
insert into PERIODO (ID_PERIODO,ID_SEM,ID_CIDADE,TEMPERATURAMIN,TEMPERATURAMAX,HUMIDADE,DISCRICAO,DATAHORA) values (1,2,2,19.9,25.3,56,'','22:32:00 25/03/2019');
insert into PERIODO (ID_PERIODO,ID_SEM,ID_CIDADE,TEMPERATURAMIN,TEMPERATURAMAX,HUMIDADE,DISCRICAO,DATAHORA) values (2,3,3,21.4,27.2,56,'','12:32:00 26/03/2019');
insert into PERIODO (ID_PERIODO,ID_SEM,ID_CIDADE,TEMPERATURAMIN,TEMPERATURAMAX,HUMIDADE,DISCRICAO,DATAHORA) values (4,4,4,20.8,27.8,34,'','18:32:00 28/03/2019');
insert into PERIODO (ID_PERIODO,ID_SEM,ID_CIDADE,TEMPERATURAMIN,TEMPERATURAMAX,HUMIDADE,DISCRICAO,DATAHORA) values (5,5,5,20.1,27.7,56,'','19:32:00 29/03/2019');
insert into PERIODO (ID_PERIODO,ID_SEM,ID_CIDADE,TEMPERATURAMIN,TEMPERATURAMAX,HUMIDADE,DISCRICAO,DATAHORA) values (6,6,6,20.4,25.5,24,'','23:32:00 30/03/2019');
insert into PERIODO (ID_PERIODO,ID_SEM,ID_CIDADE,TEMPERATURAMIN,TEMPERATURAMAX,HUMIDADE,DISCRICAO,DATAHORA) values (7,7,7,22.3,27.2,56,'','20:32:00 31/03/2019');
insert into USUARIO (USER_ID,USER_USERNAME,USER_PASSWORD) values (1,'DanielSilvaol','mudar123')

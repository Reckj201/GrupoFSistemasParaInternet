ALTER TABLE ACTIVIDADES DROP FOREIGN KEY FK_ACTIVIDADES_ONG_CODIGO_ONG
ALTER TABLE ONG DROP FOREIGN KEY FK_ONG_ONGS_PROFESOR_DNI
ALTER TABLE VALORACIONACTIVIDAD DROP FOREIGN KEY FK_VALORACIONACTIVIDAD_ALUMNO_DNI
ALTER TABLE VALORACIONACTIVIDAD DROP FOREIGN KEY FK_VALORACIONACTIVIDAD_PROFESOR_DNI
ALTER TABLE VALORACIONACTIVIDAD DROP FOREIGN KEY FK_VALORACIONACTIVIDAD_ACTIVIDAD_CODIGO_ACT
ALTER TABLE jnd_usuario_actividad DROP FOREIGN KEY FK_jnd_usuario_actividad_usuario_fk
ALTER TABLE jnd_usuario_actividad DROP FOREIGN KEY FK_jnd_usuario_actividad_actividad_fk
DROP TABLE ACTIVIDADES
DROP TABLE USUARIO
DROP TABLE ONG
DROP TABLE VALORACIONACTIVIDAD
DROP TABLE jnd_usuario_actividad
DELETE FROM SEQUENCE WHERE SEQ_NAME = 'SEQ_GEN'

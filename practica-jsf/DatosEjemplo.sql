EXEC sp_msforeachtable "ALTER TABLE ? NOCHECK CONSTRAINT ALL";
--insert into ONG (fk_profesor,NOMBRE,DESCRIPCION,CODIGO_ONG) values("51a","ONG1","asd",1)
--insert into USUARIO (Password,Nombre,Email,Apellido2,Apellido1,DNI,DTYPE,Num_docente,fk_ong) values("bd","pepe","pepe@.com","asd","asd","51a","Profesor",45613,1)
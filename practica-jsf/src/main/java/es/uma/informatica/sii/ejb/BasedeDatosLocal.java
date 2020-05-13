package es.uma.informatica.sii.ejb;

import es.uma.informatica.sii.jsf.autenticacion.modelo.*;
import java.util.*;

import javax.ejb.Local;

@Local
public interface BasedeDatosLocal {
	List<ONG> todoONG();
	void aniadirONG (ONG o);
	void eliminarONG (ONG o);
	
	List<Actividades> todoActividades ();
	void aniadirActividad (Actividades a);
	void eliminarActividad (Actividades a);
	
	List<ValoracionActividad> todoValoracionActividad();
	void aniadirValoracionActividad (ValoracionActividad va);
	void eliminarValoracionActividad (ValoracionActividad va);
	
	List<Alumno> todoAlumnos();
	void aniadirAlumno (Alumno a);
	void eliminarAlumno (Alumno a);
	
	List<Profesor> todoProfesor();
	void aniadirProfesor (Profesor p);
	void eliminarProfesor (Profesor p);
	
	List<Usuario> todoUsuario();
	void aniadirUsuario (Usuario u);
	void eliminarUsuario (Usuario u);
	
	List<ValoracionProfesor> todoValoracionProfesor();
	void aniadirValoracionProfesor (ValoracionProfesor a);
	void eliminarValoracionProfesor (ValoracionProfesor a);
}

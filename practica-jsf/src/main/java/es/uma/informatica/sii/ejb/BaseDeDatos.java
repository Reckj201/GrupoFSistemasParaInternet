package es.uma.informatica.sii.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import es.uma.informatica.sii.jsf.autenticacion.modelo.Actividades;
import es.uma.informatica.sii.jsf.autenticacion.modelo.Alumno;
import es.uma.informatica.sii.jsf.autenticacion.modelo.ONG;
import es.uma.informatica.sii.jsf.autenticacion.modelo.Profesor;
import es.uma.informatica.sii.jsf.autenticacion.modelo.Usuario;
import es.uma.informatica.sii.jsf.autenticacion.modelo.ValoracionActividad;
import es.uma.informatica.sii.jsf.autenticacion.modelo.ValoracionProfesor;

@Stateless
public class BaseDeDatos implements BasedeDatosLocal{
	
	@PersistenceContext(unitName = "practica-jsf")
	private EntityManager em;
	
	@Override
	public List<ONG> todoONG() {
		// TODO Auto-generated method stub
		return em.createNamedQuery("ONG.todos", ONG.class).getResultList();
	}

	@Override
	public void aniadirONG(ONG o) {
		// TODO Auto-generated method stub
		em.persist(o);
	}

	@Override
	public void eliminarONG(ONG o) {
		// TODO Auto-generated method stub
		em.remove(em.merge(o));
	}

	@Override
	public List<Actividades> todoActividades() {
		// TODO Auto-generated method stub
		return em.createNamedQuery("Actividades.todos", Actividades.class).getResultList();
	}

	@Override
	public void aniadirActividad(Actividades a) {
		// TODO Auto-generated method stub
		em.persist(a);
	}

	@Override
	public void eliminarActividad(Actividades a) {
		// TODO Auto-generated method stub
		em.remove(em.merge(a));
	}

	@Override
	public List<ValoracionActividad> todoValoracionActividad() {
		// TODO Auto-generated method stub
		return em.createNamedQuery("ValoracionActividad.todos", ValoracionActividad.class).getResultList();
	}

	@Override
	public void aniadirValoracionActividad(ValoracionActividad va) {
		// TODO Auto-generated method stub
		em.persist(va);
	}

	@Override
	public void eliminarValoracionActividad(ValoracionActividad va) {
		// TODO Auto-generated method stub
		em.remove(em.merge(va));
	}

	@Override
	public List<Alumno> todoAlumnos() {
		// TODO Auto-generated method stub
		return em.createNamedQuery("Alumno.todos", Alumno.class).getResultList();
	}

	@Override
	public void aniadirAlumno(Alumno a) {
		// TODO Auto-generated method stub
		em.persist(a);
	}

	@Override
	public void eliminarAlumno(Alumno a) {
		// TODO Auto-generated method stub
		em.remove(em.merge(a));
	}

	@Override
	public List<Profesor> todoProfesor() {
		// TODO Auto-generated method stub
		return em.createNamedQuery("Profesor.todos", Profesor.class).getResultList();
	}

	@Override
	public void aniadirProfesor(Profesor p) {
		// TODO Auto-generated method stub
		em.persist(p);
		em.flush();
	}

	@Override
	public void eliminarProfesor(Profesor p) {
		// TODO Auto-generated method stub
		em.remove(em.merge(p));
	}

	@Override
	public List<ValoracionProfesor> todoValoracionProfesor() {
		// TODO Auto-generated method stub
		return em.createNamedQuery("ValoracionProfesor.todos", ValoracionProfesor.class).getResultList();
	}

	@Override
	public void aniadirValoracionProfesor(ValoracionProfesor vp) {
		// TODO Auto-generated method stub
		em.persist(vp);
	}

	@Override
	public void eliminarValoracionProfesor(ValoracionProfesor vp) {
		// TODO Auto-generated method stub
		em.remove(em.merge(vp));
	}

	@Override
	public List<Usuario> todoUsuario() {
		// TODO Auto-generated method stub
		return em.createNamedQuery("Usuario.todos", Usuario.class).getResultList();
	}

	@Override
	public void aniadirUsuario(Usuario u) {
		// TODO Auto-generated method stub
		em.persist(u);
	}

	@Override
	public void eliminarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		em.remove(em.merge(u));
	}
	
	/*
	public static void main(String args[]) {
		ONG o = new ONG();
		o.setCodigo_ong(123);
		o.setDescripcion("a");
		o.setNombre("CobrillaONG");
		o.setProfesor(new Profesor());
		
		
		aniadirONG(o);
	}
	*/
}

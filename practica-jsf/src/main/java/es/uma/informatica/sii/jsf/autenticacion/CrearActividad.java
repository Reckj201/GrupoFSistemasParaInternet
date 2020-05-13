/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.informatica.sii.jsf.autenticacion;

import java.util.Date;
import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import es.uma.informatica.sii.jsf.autenticacion.modelo.*;

/**
 *
 * @author ELcochedepeblo
 */
@Named(value = "crearActividad")
@RequestScoped
public class CrearActividad {

	Actividades b = new Actividades();
	
	
	private String nombre;
	
	private String descripcion;
	private Date Fecha_ini;
	private Date Fecha_fin;
	private String plazas;
	
	private String tipo;
	
  
    
	public String getDescripcion(){
		return descripcion;
	}
    
    public Date getFecha_ini() {
		return Fecha_ini;
	}

	public void setFecha_ini(Date fecha_ini) {
		Fecha_ini = fecha_ini;
	}

	public Date getFecha_fin() {
		return Fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		Fecha_fin = fecha_fin;
	}

	public String getPlazas() {
		return plazas;
	}

	public void setPlazas(String plazas) {
		this.plazas = plazas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
    }
    


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion=descripcion;
	}
    
    public CrearActividad() {
    	
    }
    
   
    public String crear() {
    	Actividades o = new Actividades();
    	o.setNombre(nombre);
    	o.setDescripcion(descripcion);
    	o.setPlazas(Integer.parseInt(plazas));
    	o.setTipo(tipo);
    	o.setParticipaUsuario(new ArrayList<Usuario>());
    	
    	return "perfilONGprof.xhtml";
    }
    
   /* public static void main (String args []) {
    	Login a = new Login();
    	Alumno act = new Alumno();
    	act.setDNI("javiA");
    	act.setApellido1("asd");
    	act.setApellido2("asd");
    	act.setPassword("bd");
    	int encontrado = Login.alumnos.indexOf(act);
    	
    	System.out.println(encontrado);
    	System.out.println(Login.alumnos.size());
    	Login.alumnos.add(act);
    	System.out.println(Login.alumnos.get(20).getPassword().equals("bd"));
    }*/
    
}

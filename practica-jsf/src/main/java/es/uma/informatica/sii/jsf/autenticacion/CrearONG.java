/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.informatica.sii.jsf.autenticacion;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.NamedQuery;

import es.uma.informatica.sii.ejb.BasedeDatosLocal;
import es.uma.informatica.sii.jsf.autenticacion.modelo.*;

/**
 *
 * @author ELcochedepeblo
 */

@Named(value = "crearONG")
@RequestScoped
public class CrearONG {

	@Inject
	private BasedeDatosLocal bd;
	
	@Inject
    private ControlAutorizacion ctrl;
	
	private String nombre;
	
	private String descripcion;
  
    
	public String getDescripcion(){
		return descripcion;
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

	




    
    public CrearONG() {
    	
    	
    	
    }
    
   
    public String crear() {
    	ONG o = new ONG();
    	o.setNombre(nombre);
    	o.setDescripcion(descripcion);
    	o.setOngs_profesor(ctrl.getCurrentprofesor());
    	o.setActividades(new ArrayList<Actividades>());
    	
    	bd.aniadirONG(o);
    	
    	return "mainBuenoprof.xhtml";
    	
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

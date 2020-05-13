package es.uma.informatica.sii.jsf.autenticacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import es.uma.informatica.sii.jsf.autenticacion.modelo.*;


/**
 *
 * @author cobrilla
 */
@Named(value = "crearValoracionActividad")
@RequestScoped
public class CrearValoracionActividad {

	private String descripcion;
    private String puntuacion;
    private Date fecha3 = new SimpleDateFormat("dd/MM/yyyy").parse("29/04/2020");
	
    public CrearValoracionActividad() throws ParseException {
    	
    }
	



	public String getDescripcion() {
		return descripcion;
	}




	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}




	public String getPuntuacion() {
		return puntuacion;
	}




	public void setPuntuacion(String puntuacion) {
		this.puntuacion = puntuacion;
	}




	public String crearValoracion() {
		if(puntuacion==null||descripcion==null) {
			FacesContext ctx = FacesContext.getCurrentInstance();
			ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Rellena los campos", "Rellena los campos"));
			return "crearValoracionActividad.xhtml";
		}
		ValoracionActividad v = new ValoracionActividad();
		v.setContenido(descripcion);
		v.setAlumno(Login.currentuser);
		v.setActividad(Login.currentActividad);
		v.setPuntuacion(Integer.parseInt(puntuacion));
		v.setFecha(fecha3);
		
		if(Login.currentuser.getEstaEnActividad().contains(Login.currentActividad)) {
		}else {
			FacesContext ctx = FacesContext.getCurrentInstance();
			ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "No puedes valorar si no estas inscrito", "No puedes valorar si no estas inscrito"));
		}
		
		return "perfilActividad.xhtml";
	}
    
    
  

    
    
    
    
}
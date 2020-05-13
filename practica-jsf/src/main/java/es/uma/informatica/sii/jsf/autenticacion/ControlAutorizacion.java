/*
º * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.informatica.sii.jsf.autenticacion;

import es.uma.informatica.sii.jsf.autenticacion.modelo.Alumno;
import es.uma.informatica.sii.jsf.autenticacion.modelo.Profesor;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.context.FacesContext;

/**
 *
 * @author francis
 */
@Named(value = "controlAutorizacion")
@SessionScoped
public class ControlAutorizacion implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private Profesor currentprofesor;
	private Alumno currentalumno;

	public void setProfesor(Profesor profesor) {
		this.currentprofesor = profesor;
	}

	public Profesor getCurrentprofesor() {
		return currentprofesor;
	}
	

	public void setAlumno(Alumno alumno) {
		this.currentalumno = alumno;
	}

	public Alumno getCurrentalumno() {
		return currentalumno;
	}

	public String home() {
		return "login.xhtml";
	}

	public String logout() {
		// Destruye la sesión (y con ello, el ámbito de este bean)
		FacesContext ctx = FacesContext.getCurrentInstance();
		ctx.getExternalContext().invalidateSession();
		currentalumno = null;
		currentprofesor = null;
		return "login.xhtml";
	}

	/**
	 * Creates a new instance of ControlAutorizacion
	 */
	public ControlAutorizacion() {
	}
}

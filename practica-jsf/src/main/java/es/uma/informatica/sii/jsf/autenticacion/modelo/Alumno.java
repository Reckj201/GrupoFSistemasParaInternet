package es.uma.informatica.sii.jsf.autenticacion.modelo;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

import es.uma.informatica.sii.jsf.autenticacion.modelo.Usuario;

/**
 * Entity implementation class for Entity: Alumno
 *
 */
@NamedQuery (name = "Alumno.todos", query = "Select a from Alumno a" )
@Entity

public class Alumno extends Usuario implements Serializable {

	
	private Integer Num_expediente;
	private static final long serialVersionUID = 1L;

	public Alumno() {
		super();
	}   
	public Integer getNum_expediente() {
		return this.Num_expediente;
	}

	public void setNum_expediente(Integer Num_expediente) {
		this.Num_expediente = Num_expediente;
	}
   
}

package es.uma.informatica.sii.jsf.autenticacion.modelo;

import java.io.Serializable;
import java.lang.Integer;
import java.util.List;

import javax.persistence.*;

import es.uma.informatica.sii.jsf.autenticacion.modelo.Usuario;

/**
 * Entity implementation class for Entity: Profesor
 *
 */
@NamedQuery (name = "Profesor.todos", query = "Select p from Profesor p" )
@Entity

public class Profesor extends Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer Num_docente;
	@OneToMany (mappedBy = "ongs_profesor")
	private List<ONG> ong;
	
	
	public List<ONG> getOng() {
		return ong;
	}
	public void setOng(List<ONG> ong) {
		this.ong = ong;
	}
	public Profesor() {
		super();
	}   
	public Integer getNum_docente() {
		return this.Num_docente;
	}

	public void setNum_docente(Integer Num_docente) {
		this.Num_docente = Num_docente;
	}
   
}

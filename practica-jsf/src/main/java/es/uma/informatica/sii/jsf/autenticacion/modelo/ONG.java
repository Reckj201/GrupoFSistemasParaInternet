package es.uma.informatica.sii.jsf.autenticacion.modelo;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ONG
 *
 */
@NamedQuery (name = "ONG.todos", query = "Select o from ONG o" )
@Entity

public class ONG implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Integer Codigo_ong;
	@Column (nullable = false)
	private String Nombre;
	private String Descripcion;
	
	@ManyToOne
	private Profesor ongs_profesor;
	
	
	public Profesor getOngs_profesor() {
		return ongs_profesor;
	}
	public void setOngs_profesor(Profesor ongs_profesor) {
		this.ongs_profesor = ongs_profesor;
	}
	public List<Actividades> getActividades() {
		return actividades;
	}
	public void setActividades(List<Actividades> actividades) {
		this.actividades = actividades;
	}

	@OneToMany (mappedBy = "ong")
	private List<Actividades> actividades;
	

	public ONG() {
		super();
	}   
	public Integer getCodigo_ong() {
		return this.Codigo_ong;
	}

	public void setCodigo_ong(Integer Codigo_ong) {
		this.Codigo_ong = Codigo_ong;
	}   
	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}   
	public String getDescripcion() {
		return this.Descripcion;
	}

	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}
   
}

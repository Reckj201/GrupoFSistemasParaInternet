/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.informatica.sii.jsf.autenticacion;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import es.uma.informatica.sii.ejb.BasedeDatosLocal;
import es.uma.informatica.sii.jsf.autenticacion.modelo.Alumno;
import es.uma.informatica.sii.jsf.autenticacion.modelo.ONG;
import es.uma.informatica.sii.jsf.autenticacion.modelo.Profesor;
import es.uma.informatica.sii.jsf.autenticacion.modelo.Usuario;

/**
 *
 * @author ELcochedepeblo
 */
@Named(value = "crearUser")
@RequestScoped
public class CrearUser {
	
	@Inject
	private BasedeDatosLocal bd;
	
	private String nombre;
	private String dni;
	private String contrasenia;
    private String email;
    private Integer num_expediente;
    private String apellido1;
    private String apellido2;
    
    
    public String getNombre() {
		return nombre;
	}


    public void setApellido1(String a) {
    	apellido1=a;
    }
    
    public void setApellido2(String a) {
    	apellido2=a;
    }
    
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getContrasenia() {
		return contrasenia;
	}
	
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public Integer getNum_expediente() {
		return num_expediente;
	}




	public void setNum_expediente(Integer num_expediente) {
		this.num_expediente = num_expediente;
	}



    
    public CrearUser() {
    
    }
    
   
    
    
    public String crearUser() {    	
    	String destino;
    	
    	if(dni==null || apellido1==null || apellido2==null || nombre==null || email==null || num_expediente==null || contrasenia==null ){
    		destino="crearUser.xhtml";
    	}else {
    		FacesContext ctx = FacesContext.getCurrentInstance();
    		Alumno act = new Alumno();
        	act.setDNI(dni);
        	act.setApellido1(apellido1);
        	act.setApellido2(apellido2);
        	act.setNombre(nombre);
        	act.setEmail(email);
        	act.setPassword(contrasenia);
        	act.setNum_expediente(num_expediente);
        	
        	int encontrado = Login.alumnos.indexOf(act);
            
        	if(encontrado==-1) {
        		bd.aniadirAlumno(act);
            	destino="login.xhtml";
        	}else {
        		ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario YA existente", "Usuario YA existente"));
                destino="crearUser.xhtml";
            }
    	}
    	
        return destino;
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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.informatica.sii.jsf.autenticacion;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import es.uma.informatica.sii.ejb.*;
import es.uma.informatica.sii.jsf.autenticacion.modelo.*;

/**
 *
 * @author cobrilla
 */
@Named(value = "login")
@RequestScoped
public class Login {

	@Inject
	private BasedeDatosLocal bd;
	
    private static String usuario;
    private static String contrasenia;
    
    
    public static List<Alumno> alumnos = new ArrayList<Alumno>();
    public static List<Profesor> prof =new ArrayList<Profesor>();

    public static List<ONG> ong = new ArrayList<ONG>();
    public static Alumno currentuser;
    public static Profesor currentuser2;
    public static ONG currentONG;
    public static Actividades currentActividad;

    @Inject
    private ControlAutorizacion ctrl;

    /**
     * Creates a new instance of Login
     * @throws ParseException 
     */
    public Login() throws ParseException {
    	
    	/*
    	System.out.println("LLEGO1");
    	
    	Date fecha2 = new SimpleDateFormat("dd/MM/yyyy").parse("28/04/2020");
    	Date fecha1 = new SimpleDateFormat("dd/MM/yyyy").parse("27/04/2020");
    	
    	
    	for(int i=20;i<30;i++) {
        	   Profesor u = new Profesor();
        	   u.setDNI(i+"A");
        	   u.setNombre("Pepe"+i);
        	   u.setApellido1("Aux"+i);
        	   u.setApellido2("Aux"+i);
        	   u.setDireccion("misHuvoes");
        	   u.setEmail("cobrilla/gmail");
        	   u.setPassword("bd");
        	   u.setNum_docente(56+i);
        	   prof.add(u);
        	   System.out.println("LLEGO2");
        	   bd.aniadirProfesor(u);
        	   System.out.println("LLEGO3");
           }
    	
    	System.out.println("LLEGO3");
    	for(int i=0;i<20;i++) {
       	   Alumno u = new Alumno();
       	   u.setDNI(i+"A");
       	   u.setNombre("Pepe"+i);
       	   u.setApellido1("Aux"+i);
       	   u.setApellido2("Aux"+i);
       	   u.setDireccion("misHuvoes");
       	   u.setEmail("cobrilla/gmail");
       	   u.setPassword("bd");
       	   u.setNum_expediente(i+781);
       	   List<Actividades> b = new ArrayList<Actividades>();
       	   u.setEstaEnActividad(b);
       	   alumnos.add(u);
       	   bd.aniadirAlumno(u);
       	   
       	   
       	   ONG o =new ONG();
        	   o.setCodigo_ong(i);
        	   o.setDescripcion("aaa"+i);
        	   o.setNombre("cobrillaONG"+i);
        	   o.setProfesor(prof.get(1));
        	   
        	   ong.add(o);
        	   
        	   
        	ArrayList<Actividades> as= new ArrayList<Actividades>();
        	
        	   for(int j = 100; j<110; j++) {
           		Actividades a = new Actividades();
           		a.setCodigo_Act(j);
           		a.setDescripcion("Miramidescri"+j);
           		a.setFecha_Fin(fecha2);
           		a.setFecha_Inicio(fecha1);
           		a.setNombre("minombre"+j);
           		a.setPlazas(35);
           		a.setTipo("Ayuda");
           		//participausuario lo cambio a lista de alumnos para usarlo?
           		List<Usuario> c = new ArrayList<Usuario>();
           		a.setParticipaUsuario(c);
           		
           		bd.aniadirActividad(a);
           		
           		as.add(a);
           		
           		
           		}
        	   o.setActividades(as);
        	   bd.aniadirONG(o);
          }
    	
    	*/
    	
    }
    
    
    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public  void setUsuario(String usuariol) {
        usuario = usuariol;
    }

    public void setContrasenia(String contrasenial) {
        contrasenia = contrasenial;
    }

    public String crearUser() {
		return "crearUser.xhtml";
    }
    
    public String getcurrentNombre() {
        return currentuser.getNombre();
    }
    public String getcurrentApellido1() {
        return currentuser.getApellido1();
    }
    public String getcurrentApellido2() {
        return currentuser.getApellido2();
    }
    public String getcurrentDNI() {
        return currentuser.getDNI();
    }
    public String getcurrentEmail() {
        return currentuser.getEmail();
    }
    public String getcurrentDireccion() {
        return currentuser.getDireccion();
    }
    public String getcurrentNum_expediente() {
        return Integer.toString(currentuser.getNum_expediente());
    }
    
    public String getcurrentNombre2() {
        return currentuser2.getNombre();
    }
    public String getcurrentApellido12() {
        return currentuser2.getApellido1();
    }
    public String getcurrentApellido22() {
        return currentuser2.getApellido2();
    }
    public String getcurrentDNI2() {
        return currentuser2.getDNI();
    }
    public String getcurrentEmail2() {
        return currentuser2.getEmail();
    }
    public String getcurrentDireccion2() {
        return currentuser2.getDireccion();
    }
    public String getcurrentNum_docente() {
        return Integer.toString(currentuser2.getNum_docente());
    }
    
    public String getcurrentONGNombre() {
        return currentONG.getNombre();
    }
    public String getcurrentONGDescripcion() {
        return currentONG.getDescripcion();
    }
    public String getcurrentONGProfesor() {
        return currentONG.getOngs_profesor().getNombre();
    }
    
    public String getcurrentActividadNombre() {
        return currentActividad.getNombre();
    }
    public String getcurrentActividadDescripcion() {
        return currentActividad.getDescripcion();
    }
    public String getcurrentActividadPlazas() {
        String a = Integer.toString(currentActividad.getParticipaUsuario().size()) + "/" + Integer.toString(currentActividad.getPlazas());
    	return a;
    }
    
    public String getcurrentActividadFecha_Inicio() {
    	return currentActividad.getFecha_Inicio().toString();
    }
    public String getcurrentActividadFecha_Fin() {
    	return currentActividad.getFecha_Fin().toString();
    }
    
    public String getcurrentONGNombreActividad(String a) {
    	Integer n = Integer.parseInt(a);
    	return currentONG.getActividades().get(n).getNombre();
    }
    
    public String verOng(String a) {
    	Integer n = Integer.parseInt(a);
    	currentONG = ong.get(n);
    	return "perfilONG.xhtml";
    }
    
    public String verOngprof(String a) {
    	Integer n = Integer.parseInt(a);
    	currentONG = ong.get(n);
    	return "perfilONGprof.xhtml";
    }
    
    public String crearOng() {
    	
    	return "crearONG.xhtml";
    }
    
    public String crearActividad() {
    	
    	return "crearActividad.xhtml";
    }
    
    public String verActividad(String a) {
    	Integer n = Integer.parseInt(a);
    	currentActividad = currentONG.getActividades().get(n);
    	return "perfilActividad.xhtml";
    }
    
    public String valorar() {
    	return "crearValoracionActividad.xhtml";
    }
    
    public List<ONG> getlistaOng(){
    	return ong;
    }
    
    public String inscribirse() {
    	String destino = "";
    	FacesContext ctx = FacesContext.getCurrentInstance();
    	if(currentActividad.getParticipaUsuario().isEmpty()) {
    		currentuser.getEstaEnActividad().add(currentActividad);
    		currentActividad.getParticipaUsuario().add(currentuser);
    		destino = "perfilActividad.xhtml";
    	}else if(currentActividad.getParticipaUsuario().size() >= currentActividad.getPlazas()) {
    		ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "No hay espacio para ti", "No cabes bro"));
    		destino = "perfilAl.xhtml";
    	}else if(currentuser.getEstaEnActividad().contains(currentActividad)) {
    		ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Ya estas en esta actividad", "No te apuntes dos veces bro"));
    		destino = "perfilActividad.xhtml";
    	}else {
    		currentuser.getEstaEnActividad().add(currentActividad);
    		currentActividad.getParticipaUsuario().add(currentuser);
    		destino = "perfilActividad.xhtml";
    	}
    	
    	return destino;
    }
    
    public String autenticar() {
    	alumnos = bd.todoAlumnos();
    	prof = bd.todoProfesor();
		FacesContext ctx = FacesContext.getCurrentInstance();
		//Login a= new Login();
		
		
    	Alumno act=new Alumno();
    	String destino = "login.xhtml";
    
    	act.setDNI(usuario);
    	act.setPassword(contrasenia);
    	int encontrado = alumnos.indexOf(act);
    	if(encontrado!=-1) {
    		if(!alumnos.get(encontrado).getPassword().equals(contrasenia)) {
                ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Contraseña errónea", "Contraseña errónea"));
    		}else {
    			currentuser= alumnos.get(encontrado);
    			ctrl.setAlumno(currentuser);
    			destino = "mainBueno.xhtml";
    		}
    	}else {
    		Profesor act2 = new Profesor();
    		act2.setDNI(usuario);
        	act2.setPassword(contrasenia);
        	
            encontrado = prof.indexOf(act2);
        	if(encontrado!=-1) {
        		if(!prof.get(encontrado).getPassword().equals(contrasenia)) {
                    ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Contraseña errónea", "Contraseña errónea"));
        		}else {
        			currentuser2 = prof.get(encontrado);
        			ctrl.setProfesor(currentuser2);
        			destino = "mainBuenoprof.xhtml";
        		}
        	}else {
                ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario no existente", "Usuario no existente"));
        	}
    	}
        return destino;
    }
    
    
    
    
    public static void main (String args []) throws ParseException {
    	
		Login a= new Login();
		
		System.out.println("LLEGO");
		
    	
    }
    
    
    
    
}
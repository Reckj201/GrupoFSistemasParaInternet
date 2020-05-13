package es.uma.informatica.sii.jsf.paginators;

import java.io.Serializable;
import java.util.*;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import es.uma.informatica.sii.jsf.autenticacion.modelo.ONG;



@ManagedBean
@RequestScoped
public class OngsGo implements Serializable {
	
	private List<ONG> ongs;

    @PostConstruct
    public void init() {
        //System.out.println("A new backing bean has been created");
        ongs = new ArrayList<ONG>();
        populate(ongs, 200);
    }

    private void populate(List<ONG> list, int size) {
    	for(int i=0;i<size;i++) {
  		   ONG o =new ONG();
      	   o.setCodigo_ong(i);
      	   o.setDescripcion("aaa"+i);
      	   o.setNombre("cobrillaONG"+i);
      	   
      	   list.add(o);
  	   }
    }

    public List<ONG> getOngs() {
//If i populate the list here I can still get the correct result.
//        cars = new ArrayList<Car>();
//        populateRandomCars(cars, 30000);
        return ongs;
    }

    public void setCars(List<ONG> cars) {
        this.ongs = cars;
    }
	
	
	
	/*public List<ONG> ongs;
    
    @Inject
    private ONGService service;
 
    @PostConstruct
    public void init() {
       // ongs = service.createOngs();
    }
     
    public List<ONG> getCars() {
        return ongs;
    }
 
    public void setService(ONGService service) {
        this.service = service;
    }*/
}

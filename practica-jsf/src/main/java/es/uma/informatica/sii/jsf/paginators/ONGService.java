package es.uma.informatica.sii.jsf.paginators;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;

import es.uma.informatica.sii.jsf.autenticacion.modelo.ONG;


public enum ONGService {
	INSTANCE;
	
	private List<ONG> ongList = new ArrayList<>();
	
	ONGService() {
		for(int i=0;i<20;i++) {
	 		   ONG o =new ONG();
	     	   o.setCodigo_ong(i);
	     	   o.setDescripcion("aaa"+i);
	     	   o.setNombre("cobrillaONG"+i);
	     	   
	     	   ongList.add(o);
	 	   }
		
	}
	
	   /*public static List<ONG> createOngs() {
		   List<ONG> res= new ArrayList<>();
 	   for(int i=0;i<20;i++) {
 		   ONG o =new ONG();
     	   o.setCodigo_ong(i);
     	   o.setDescripcion("aaa"+i);
     	   o.setNombre("cobrillaONG"+i);
     	   
     	   res.add(o);
 	   }
 	   return res;
    }*/
	
	public List<ONG> getOngs(){
		return ongList;
	}
	
	
	   
}



package es.uma.informatica.sii.jsf.paginators;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

import es.uma.informatica.sii.jsf.autenticacion.modelo.Alumno;
import es.uma.informatica.sii.jsf.autenticacion.modelo.ONG;


@ManagedBean
@RequestScoped
@Named(value = "beans")

public class OngBean {

    private static List<ONG> lista =new ArrayList<ONG>();

    public static List<ONG> getLista() {
        return lista;
    }

    public static void setLista(List<ONG> lista) {
        OngBean.lista = lista;
    }

    public void listar() {
        for(int i=0;i<20;i++) {

                  ONG o =new ONG();
                   o.setCodigo_ong(i);
                   o.setDescripcion("aaa"+i);
                   o.setNombre("cobrillaONG"+i);
                   lista.add(o);
              }
    }
}
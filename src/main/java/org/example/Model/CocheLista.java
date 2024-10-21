package org.example.Model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "coches")
public class CocheLista {

    @XmlElement(name = "coche")
    private List<Coche> listaCoches;

    //Constructor pro defecto
    public CocheLista(){}

    public CocheLista(List<Coche> listaCoches) {
        this.listaCoches = listaCoches;
    }

    public List<Coche> getListaCoches() {
        return listaCoches;
    }
}

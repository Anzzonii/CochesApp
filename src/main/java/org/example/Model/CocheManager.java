package org.example.Model;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CocheManager {
    private static final String PATH = "coches.xml";

    public void guardarCoches(List<Coche> coches){
        try {

            JAXBContext context = JAXBContext.newInstance(CocheLista.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(new CocheLista(coches), new File(PATH));

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Coche> cargarCoches(){
        File file = new File(PATH);
        if(!file.exists()){
            System.out.println("El archivo no existe. Se devolverá una lista vacía");
            return new ArrayList<>();
        }

        try{

            JAXBContext context = JAXBContext.newInstance(CocheLista.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            CocheLista lista = (CocheLista) unmarshaller.unmarshal(file);
            return lista.getListaCoches();

        } catch (JAXBException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}

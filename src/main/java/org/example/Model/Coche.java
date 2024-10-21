package org.example.Model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;

@XmlRootElement(name = "coche")
public class Coche {

    @XmlElement
    private String marca;

    @XmlElement
    private String modelo;

    @XmlElement
    private String matricula;

    @XmlElement
    private int anno;

    @XmlElement
    private String fechaVenta;

    public Coche(){}    //Constructor por defecto

    public Coche(String marca, String modelo, String matricula, int anno, String fechaVenta) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anno = anno;
        this.fechaVenta = fechaVenta;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAnno() {
        return anno;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", anno=" + anno +
                ", fechaVenta=" + fechaVenta +
                '}';
    }
}

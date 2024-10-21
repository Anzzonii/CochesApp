package org.example.controller;


import org.example.Model.*;
import org.example.view.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CocheController {
    private MainFrame view;
    private CocheManager model;
    private List<Coche> coches;

    public CocheController(MainFrame view, CocheManager model) {
        this.view = view;
        this.model = model;
        this.coches = model.cargarCoches();

        view.setAgregarButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarCoches();
            }
        });

        view.setListarButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarCoches();
            }
        });
    }

    public void agregarCoches(){
        String marca = view.getMarca();
        String modelo = view.getModelo();
        String matricula = view.getMatricula();
        String fechaVenta = view.getFechaVenta();

        try{
            int anno = Integer.parseInt(view.getAnno());
            Coche coche = new Coche(marca, modelo, matricula, anno, fechaVenta);
            coches.add(coche);
            model.guardarCoches(coches);
            view.mostrarMensaje("Coche agregado correctamente");
        } catch (NumberFormatException e) {
            view.mostrarMensaje("Introduce un año válido");
        }

    }

    public void listarCoches(){
        StringBuilder sb = new StringBuilder();
        for(Coche coche : coches){
            sb.append(coche.toString()).append("\n");
        }
        view.mostrarCoches(sb.toString());
    }
}

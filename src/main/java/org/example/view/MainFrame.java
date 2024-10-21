package org.example.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel panel1;
    private JTextField marcaField;
    private JTextField modeloField;
    private JTextField matriculaField;
    private JTextField annoField;
    private JTextField fechaVentaField;
    private JButton agregarButton;
    private JButton listarButton;
    private JTextArea cochesArea;

    private JLabel logoLabel;

    public MainFrame(){
        setTitle("Compraventa Coches");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(panel1);

        setVisible(true);


    }

    //marca modelo matricula año fechaventa
    public String getMarca(){return marcaField.getText();}
    public String getModelo(){return modeloField.getText();}
    public String getMatricula(){return matriculaField.getText();}
    public String getAnno(){return annoField.getText();}
    public String getFechaVenta(){return fechaVentaField.getText();}

    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }
    public void mostrarCoches(String coches){
        cochesArea.setText(coches);
    }

    public void setAgregarButtonListener(ActionListener listener) {
        agregarButton.addActionListener(listener);
    }

    public void setListarButtonListener(ActionListener listener) {
        listarButton.addActionListener(listener);
    }
}

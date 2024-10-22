package org.example;


import org.example.Model.CocheManager;
import org.example.controller.CocheController;
import org.example.view.MainFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            CocheManager model = new CocheManager();
            new CocheController(frame, model);
            frame.setVisible(true);
        });
    }
}
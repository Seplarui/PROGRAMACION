/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Eventos {
    
    private static JLabel label= new JLabel("---");
    private static JButton botonLimpia = new JButton("Limpia");
    private static JButton botonEscribe= new JButton("Escribe");
    
    
    public static void  acciones (ActionEvent e) {
        Object obj = e.getSource();
        if(obj==botonLimpia) {
            label.setText("");
            
        }
        if (obj==botonEscribe) {
            label.setText("Hola Mundo");
        }
    }
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {}
        JFrame frame=new JFrame("Controlador de Eventos");
        
        botonLimpia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        
        botonEscribe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        
        frame.getContentPane().add(label);
        frame.getContentPane().add(botonLimpia);
        frame.getContentPane().add(botonEscribe);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
            
            
        });
        
        frame.setLayout(new GridLayout(0,1));
        frame.pack();
        frame.setVisible(true);


    }
    
    
    
}

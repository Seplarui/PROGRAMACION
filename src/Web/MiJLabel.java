/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sepla
 */

import javax.swing.*;
import java.awt.*;

public class MiJLabel {
    
    MiJLabel() {
        JFrame f= new JFrame();
        f.setTitle("Ejemplo JLabel");
        f.setLayout(new GridLayout());
        f.setSize(230,100);
        
        //Añadimos el Jpanel al JFrame
        
        JPanel p= new JPanel();
        f.add(p);
        
        //Creamos el JLabel y lo añadimos
        JLabel l= new JLabel();
        l.setText("Texto del JLabel");
        p.add(l);
        
        //Visualizamos el JFrame
        
        f.setVisible(true);
        
        }
    public static void main(String[] args) {
            new MiJLabel();
        }
        
    }
    
    
}

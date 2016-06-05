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

public class MiJTextField {
    
    public static void muestra() {
        JFrame f= new JFrame();
        JPanel p= new JPanel();
        JTextField t= new JTextField();
        JLabel l= new JLabel();
        f.setTitle("Mi JFrame");
        l.setText("Nombre");
        t.setText("Pepe");
        t.setColumns(10);
        f.setLayout(new FlowLayout());
        f.add(p);
        p.add(l);
        p.add(t);
        f.setSize(200,100);
        f.setVisible(true);
        
    }
    public static void main(String[] args) {
        muestra();
    }
    
}

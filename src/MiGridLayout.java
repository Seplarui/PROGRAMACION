/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */

import java.awt.*;
import javax.swing.*;

public class MiGridLayout  extends JFrame{
    
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private GridLayout g1;
    
    public MiGridLayout() {
        l1=new JLabel("Dato1");
        l2= new JLabel("Dato2");
        l3=new JLabel("Dato3");
        l4=new JLabel("Dato4");
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        
        g1=new GridLayout();
        g1.setRows(2);
        g1.setHgap(10);
        g1.setColumns(2);
        g1.setVgap(10);
        
        setLayout(g1);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(100,100);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new GridLayout();
    }
}

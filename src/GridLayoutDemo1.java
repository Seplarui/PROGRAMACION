/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GridLayoutDemo1 extends JFrame {
    
    private JPanel p1;
    private JLabel l1;
    private JTextField t1;
    
    private JPanel p2;
    private JLabel l2;
    private JPasswordField t2;
    
    public GridLayoutDemo1() {
        GridLayout g1= new GridLayout();
        FlowLayout f1= new FlowLayout();
        
        p1= new JPanel();
        p2= new JPanel();
        
        g1.setRows(2);
        g1.setHgap(10);
        g1.setColumns(1);
        g1.setVgap(10);
        
        setLayout(g1);
        p1.setLayout(f1);
        p2.setLayout(f1);
        
        l1= new JLabel("User");
        l2= new JLabel("Pass");
        
        t1= new JTextField("Paco");
        t1.setColumns(15);
        
        t2=new JPasswordField();
        t2.setColumns(15);
        
        add(p1);
        add(p2);
        
        p1.add(l1);
        p1.add(t1);
        
        p2.add(l2);
        p2.add(t2);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300,100);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new GridLayoutDemo1();
    }
}

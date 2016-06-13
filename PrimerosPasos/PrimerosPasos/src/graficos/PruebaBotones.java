/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

/**
 *
 * @author sepla
 */
import java.awt.*;
import javax.swing.*;

public class PruebaBotones extends JFrame{
    
    private JLabel jlabel1;
    private JLabel jlabel2;
    private JTextField jtext1;
    private JTextField jtext2;
    private JPanel jpanel1;
    private JPanel jpanel2;
    private JPanel jpanel3;
    private JButton boton1;
    private JButton boton2;
    
    
    public PruebaBotones() {
        super("Prueba Botones");
        //setSize(500,500);
        initComponents();
    }
    
    public void initComponents() {
        int filas=1;
        int columnas=3;
        int espaciofilas=10;
        this.setLayout(new FlowLayout());
        jpanel1= new JPanel(new FlowLayout());
        jpanel2= new JPanel(new FlowLayout(filas, columnas,espaciofilas));
        jpanel3= new JPanel(new FlowLayout());
        add(jpanel1);
        add(jpanel2);
        add(jpanel3);
        
        jlabel1= new JLabel("Etiqueta 1");
        jlabel2= new JLabel("Etiqueta 2");
        jtext1= new JTextField(10);
        jtext2= new JTextField(10);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        boton1= new JButton("ACEPTAR");
        boton2= new JButton("CANCELAR");
       
        jpanel1.add(jlabel1);
        jpanel1.add(jtext1);
        jpanel3.add(boton1);
        jpanel2.add(jlabel2);
        jpanel2.add(jtext2);
        jpanel3.add(boton2);
        pack();
    }
    
    public static void main(String[] args) {
        
        PruebaBotones boton=new PruebaBotones();
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boton;

import java.awt.*;
import javax.swing.*;


public class Vista extends JFrame {
    
    private JPanel jpPanel1;
    private JPanel jpPanel2;
    private JLabel jlbInforma;
    private JButton jbtGrMysql;
    private JButton jbtGrDb4o;
    private JButton jbtSalir;
    private JButton boton1;
    
    public Vista() {
        setTitle("Datos a Guardar");
         //setSize(500,500);
        setVisible(true);
        
        jlbInforma= new JLabel("Pulse para guardar los datos");
        jbtGrMysql= new JButton("Grabar MYSQL");
        jbtGrDb4o= new JButton("Grabar DB4o");
        jbtSalir= new JButton("Salir");
        boton1= new JButton("Boton1");
        
        int filas=1;
        int columnas=3;
        int espacioFilas=5;
        jpPanel1= new JPanel(new FlowLayout());
        jpPanel2= new JPanel(new FlowLayout());
        //jpPanel1= new JPanel(new FlowLayout());
        //jpPanel2= new JPanel(new FlowLayout(filas,columnas, espacioFilas));
        jpPanel1.add(jlbInforma);
        jpPanel2.add(jbtGrMysql);
        jpPanel2.add(jbtGrDb4o);
        jpPanel2.add(jbtSalir);
        jpPanel2.add(boton1);
        this.setLayout(new FlowLayout());
        add(jpPanel1);
        add(jpPanel2);
        jlbInforma.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        
    }
    public static void main(String[] args) {
        
        Vista mimarco=new Vista();

}
    public JButton getBotonMysql() {
        return jbtGrMysql;
    }
    public JButton getBotonDB4o() {
        return jbtGrDb4o;
    }
    public JButton getSalir() {
        return jbtSalir;
    }
}

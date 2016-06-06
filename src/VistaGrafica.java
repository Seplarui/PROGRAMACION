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
public class VistaGrafica  extends JFrame implements Vista {
    
    private JButton convertirApesetas;
    private JButton convertirAeuros;
    private JTextField cantidad;
    private JLabel resultado;
    
    public VistaGrafica() {
        super("Conversor de Euros y Pesetas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelPrincipal= new JPanel();
        panelPrincipal.setLayout(new BorderLayout(10,10));
        cantidad= new JTextField(8);
        JPanel panelaux= new JPanel();
        panelaux.add(cantidad);
        panelPrincipal.add(panelaux, BorderLayout.NORTH);
        resultado= new JLabel("Indique una cantidad y pulse uno de los botones");
        JPanel panelaux2= new JPanel();
        panelaux2.add(resultado);
        panelPrincipal.add(panelaux2, BorderLayout.CENTER);
        convertirApesetas=new JButton("A Pesetas");
        convertirAeuros=new JButton("A Euros");
        convertirAeuros.setActionCommand(AEUROS);
        JPanel botonera= new JPanel();
        botonera.add(convertirApesetas);
        botonera.add(convertirAeuros);
        panelPrincipal.add(botonera, BorderLayout.SOUTH);
        getContentPane().add(panelPrincipal);
       
    }
    //Métodos de la interfaz Vista:
    public void escribeCambio(String s) {
        resultado.setText(s);
    }
    public double getCantidad() {
        try {
            return Double.parseDouble(cantidad.getText());
        } catch (NumberFormatException e) {
            return 0.0D;
        }
    }
    public void setControlador(Controlador c) {
        convertirApesetas.addActionListener(c);
        convertirAeuros.addActionListener(c);
    }
    public void arranca() {
        pack(); //COLOCA LOS COMPONENTES
        setLocationRelativeTo(null); //CENTRA LA VENTANA EN LA PANTALLA
        setVisible(true); //VISUALIZA LA VENTANA
    }
}

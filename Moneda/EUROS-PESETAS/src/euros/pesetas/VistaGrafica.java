/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euros.pesetas;

/**
 *
 * @author sepla
 */

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
    

public class VistaGrafica  extends JFrame implements Vista{
    
    private JButton convertirApesetas;
    private JButton convertirAeuros;
    private JTextField cantidad;
    private JLabel resultado;
    
    public VistaGrafica() {
        /*Se crea un panel principal panelPrincipal
        donde se añaden otros paneles: panelaux al Norte, panelaux2 al centro y botonera al sur.
        */
        
        super("Conversor de Euros y Pesetas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelPrincipal= new JPanel();
        panelPrincipal.setLayout(new BorderLayout(10,100));
        cantidad= new JTextField(8);
        JPanel panelaux=new JPanel();
        panelaux.add(cantidad);
        panelPrincipal.add(panelaux, BorderLayout.NORTH);
        resultado= new JLabel ("Indique una cantidad y pulse uno de los botones");
        JPanel panelaux2= new JPanel();
        panelaux2.add(resultado);
        panelPrincipal.add(panelaux2, BorderLayout.CENTER);
        convertirApesetas= new JButton("A pesetas");
        convertirApesetas.setActionCommand(APESETAS);
        convertirAeuros=new JButton("A Euros");
        convertirAeuros.setActionCommand(AEUROS);
        JPanel botonera= new JPanel();
        botonera.add(convertirApesetas);
        botonera.add(convertirAeuros);
        panelPrincipal.add(botonera,BorderLayout.SOUTH);
        getContentPane().add(panelPrincipal);
    }
    
    //METODOS DE LA INTERFAZ VISTA
    public void escribeCambio(String s) {
        resultado.setText(s);
    }
    
    public double getCantidad() {
        try {
            return Double.parseDouble(cantidad.getText());
            
        } catch(NumberFormatException e ) {
            return 0.0D;
        }
        
    }
    
    public void setControlador(Controlador c) {
        convertirApesetas.addActionListener((ActionListener) c);
        convertirAeuros.addActionListener((ActionListener) c);
    }
    
    public void arranca() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}

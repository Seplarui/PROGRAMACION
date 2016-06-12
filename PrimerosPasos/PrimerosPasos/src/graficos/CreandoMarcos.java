/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.Frame;
import javax.swing.*;


public class CreandoMarcos {
    
    public static void main(String[] args) {
        
        //INSTANCIAMOS MIMARCO
        
        miMarco marco1= new miMarco();
       
        
        
    }
    
}


class miMarco extends JFrame{
    
    
    //CONSTRUCTOR
    
    public miMarco() {
        //super("PRUEBA TEXTO");
        //setSize(500,300);
        setVisible(true);
        //setLocation(300,300);
        //UBICACION-TAMAÑO
        setBounds(500,300,250,250);
        //PONER TÍTULO A LA VENTANA
        setTitle("Mi Ventana");

        //REDIMENSIONAR O NO
       // setResizable(false);
       
        //ABRIR MARCO A PANTALLA COMPLETA
        //setExtendedState(Frame.MAXIMIZED_BOTH);
        
        //QUE HACER CUANDO LA VENTANA SE CIERRE
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
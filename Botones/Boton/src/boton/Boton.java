
package boton;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author haplo
 */
public class Boton {
    
    public static void main(String[] args) {
        
        miMarco marco1= new miMarco();
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

 class miMarco extends JFrame{
     
     public miMarco() {
         setSize(700,700);
         setVisible(true);
         setTitle("Probando botones");
         LaminaBotones milamina= new LaminaBotones();
         add(milamina);
     }
    
    
}

//PANEL
class LaminaBotones extends JPanel implements ActionListener{
    
    JButton botonazul=new JButton("Azul");
    
    //CONSTRUCTOR
    
    public LaminaBotones() {
        add(botonazul);
        botonazul.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        
        setBackground(Color.blue);
        
    }
    
}
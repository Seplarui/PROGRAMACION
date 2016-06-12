/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;
import javax.swing.*;
import java.awt.*;



public class EscribiendoEnMarco {
    
    public static void main(String[] args) {
        
        MarcoConTexto mimarco= new MarcoConTexto();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

class MarcoConTexto extends JFrame {
    
    public MarcoConTexto() {
        
        setVisible(true);
        setSize(600,450);
        setLocation(400, 200);
        setTitle("PRIMER TEXTO");
        Lamina milamina= new Lamina();
        add(milamina);
    }
}

class Lamina extends JPanel {
    
    public void paintComponent(Graphics g) {
        
        //A LA METODO PAINTCOMPONENT LLAMA DE JCOMPONENT DE LA CLASE PADRE
        super.paintComponent(g);
        g.drawString("Estamos aprendiendo SWING", 100, 100);
        
    }
    
    
}

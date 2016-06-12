/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import javax.swing.*;
import java.awt.*;


/**
 *
 * @author sepla
 */
public class PruebaDibujo {
    
    public static void main(String[] args) {
        MarcoConDibujos mimarco= new MarcoConDibujos();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}

class MarcoConDibujos extends JFrame {
    
    public MarcoConDibujos() {
        setTitle("Prueba de DIBUJO");
        setSize(400,400);
        setVisible(true);
        LaminaConFiguras milamina=new LaminaConFiguras();
        //AÑADIR LAMINA AL PANEL
        add(milamina);
    }
}

class LaminaConFiguras extends JPanel {
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.drawRect(50, 50, 200, 200);
        
        //g.drawLine(100, 100, 200, 200);
        
        g.drawArc(50, 100, 200, 200, 120, 150);
        
    }
}
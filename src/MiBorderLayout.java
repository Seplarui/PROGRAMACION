/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */

import javax.swing.*;
import java.awt.*;

public class MiBorderLayout  extends JFrame {
    
    Button btnOeste= new Button();
    Button btnEste= new Button();
    Button btnNorte= new Button();
    Button btnSur=new Button();
    Button btnCentro= new Button();
    
    BorderLayout borderLayout1=new BorderLayout();
    
    public MiBorderLayout() {
        this.setSize(new Dimension(336,253));
        this.setLayout(borderLayout1);
        btnOeste.setLabel("Oeste");
        btnEste.setLabel("Este");
        btnNorte.setLabel("Norte");
        btnSur.setLabel("Sur");
        btnCentro.setLabel("Centro");
        
        borderLayout1.setHgap(20);
        this.add(btnOeste, BorderLayout.WEST);
        this.add(btnEste, BorderLayout.EAST);
        this.add(btnNorte, BorderLayout.NORTH);
        this.add(btnSur, BorderLayout.SOUTH);
        this.add(btnCentro, BorderLayout.CENTER);
        
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new BorderLayout();
    }
    
    
}

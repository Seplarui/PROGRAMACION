/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sepla
 */
import javax.swing.*;

public class HolaMundoS  extends JFrame {
    public HolaMundoS() {
        super("Hola Mundo");
        JLabel label=new JLabel("Hola Mundo");
        this.getContentPane().add(label);
        setSize(200,100);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new HolaMundoS();
    }
    
    
    
    
    
}

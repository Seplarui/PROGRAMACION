/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.*;
import javax.swing.*;


public class Ejemplo extends JFrame {
    
    private JPanel jpanel1;
    private JLabel label1;
    private JTextField jtext1;
    private JPanel jpanel2;
    private JLabel label2;
    private JPasswordField jpass1;
    private JButton btnaceptar;
    private JButton btncancelar;
    
    public  Ejemplo() {
        super("Ventana Ejemplo");
        iniciarComponentes();
        
    }
    public void iniciarComponentes() {
        
       jpanel1=new JPanel(new FlowLayout());
       label1= new JLabel("Usuario");
       jtext1= new JTextField(10);
       jtext1.setText("Usuario");
            jpanel2= new JPanel(new FlowLayout());

       label2= new JLabel("Contraseña");
       jpass1= new JPasswordField(10);
       jpass1.setText("1234");
       btnaceptar=new JButton("Aceptar");
       btncancelar= new JButton("Cancelar");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(new FlowLayout());
       add(jpanel1);
       add(jpanel2);
       
       
       jpanel1.add(label1);
       jpanel1.add(jtext1);
       jpanel1.add(btnaceptar);
       jpanel2.add(label2);
       jpanel2.add(jpass1);
       jpanel2.add(btncancelar);
       this.setVisible(true);
       this.setSize(500,500);
       pack();
       
        
    }
    
    public JButton getbtnaceptar(){
        return btnaceptar;
    }
    public JButton getbtcancelar() {
        return btncancelar;
    }
    
    
    public static void main(String[] args) {
        
        Ejemplo ventana= new Ejemplo();
        
        
    }
    

    
    
    
}

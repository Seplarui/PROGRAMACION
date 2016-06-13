/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author sepla
 */
public class Ventana extends JFrame{
    
    private JLabel jl1;
    private JLabel jl2;
    private JLabel jl3;
    private JTextField jtf1;
    private JPasswordField jpf1;
    private JPanel jp1;
    private JPanel jp2;
    private JPanel jp3;
    private JButton jb1;
    private JButton jb2;
    
    
    
    public Ventana() {
        
        jp1= new JPanel(new FlowLayout());
        int filas=1;
        int columnas=2;
        int espacioFilas=10;
        
        jp2= new JPanel(new FlowLayout(filas, columnas, espacioFilas));
        jp3= new JPanel(new FlowLayout(filas, columnas, espacioFilas));
        
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setTitle("Título");
        this.setVisible(true);
        add(jp1);
        add(jp2);
        add(jp3);
        
        //ETIQUETAS
        
        jl1= new JLabel("Usuario");
        jl2= new JLabel("Contraseña");
        jtf1= new JTextField(10);
        jtf1.setText("Admin");
        jpf1= new JPasswordField(10);
        jpf1.setText("123");
        jb1= new JButton("Aceptar");
        jb2= new JButton("Salir");
        jl3= new JLabel("");
        
        jp1.add(jl1);
        jp1.add(jtf1);
        jp1.add(jl2);
        jp1.add(jpf1);
        jp2.add(jb1);
        jp2.add(jb2);
        this.setLocationRelativeTo(null);
        
        pack();
       
    }
    
    public static void main(String[] args) {
        
        Ventana marco= new Ventana();
        
    }
    public JButton getBt1() {
return jb1;
}
    public JButton getBt2() {
        return jb2;
    }
    public JTextField getJtf1() {
        return jtf1;
    }
    public JPasswordField getjPf1() {
    return jpf1;
}
    public JLabel getJl3() {
        return jl3;
    }
    
}



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
public class VistaPersona extends JFrame{
    
    private JLabel jl1;
    private JLabel jl2;
    private JLabel jl3;
    private JLabel jl4;
    private JLabel jl5;
    private JLabel jl6;
    private JLabel jl7;
    private JLabel jl8;
    private JTextField jtf1;
    private JTextField jtf2;
    private JTextField jtf3;
    private JTextField jtf4;
    private JPanel jp1;
    private JPanel jp2;
    private JPanel jp3;
    private JButton jb1;
    private JButton jb2;
    private VistaPersona vistapersona;
    private FlowLayout fl;
    
    public VistaPersona() {
        super("Vista Persona");
        initComponentes();
    }
    public void initComponentes() {
        jl1= new JLabel("IdPersona");
        jtf1= new JTextField(10);
        jtf1.setEditable(false);
        
        jl2= new JLabel("Pass");
        jtf2= new JTextField(10);
        jtf2.setEditable(false);
        
        jl3=new JLabel("Contraseña");
        jtf3=new JTextField(10);
        jtf3.setEditable(false);
        
        jl4= new JLabel("Grupo");
        jtf4= new JTextField(10);
        jtf4.setEditable(false);
        
        jb1= new JButton("Salir");
        jb2= new JButton("Grabar");
        
        fl= new FlowLayout();
        
        jp1= new JPanel(fl);
        jp1.add(jl1);
        jp1.add(jtf1);
        jp1.add(jl2);
        jp1.add(jtf2);
        
        jp1.add(jl3);
        jp1.add(jtf3);
        
        jp1.add(jl4);
        jp1.add(jtf4);
        
        jp1.add(jb2);
        jp1.add(jb1);
        
        
        add(jp1);
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(400,125));
        pack();
        
               
    }
    
    public static void main(String[] args) {
        VistaPersona vista= new VistaPersona();
        vista.setVisible(true);
    }
            
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
import java.awt.*;
import javax.swing.*;

public class MiFlowLaout extends JFrame{
    
    public MiFlowLaout() {
        Button button1=new Button("Ok");
        Button button2=new Button("Open");
        Button button3=new Button("Close");
        add(button1);
        add(button2);
        add(button3);
        
        //FRAME
        setLayout(new FlowLayout());
        setSize(100,100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //pack();
        
    }
    public static void main(String[] args) {
        new MiFlowLaout().setVisible(true);
    }
    
    
}

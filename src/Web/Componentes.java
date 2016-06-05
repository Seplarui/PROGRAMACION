/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web;

/**
 *
 * @author sepla
 */

import javax.swing.*;
import java.awt.*;

public class Componentes {
    
    public static void main(String[] args) {
        JLabel jlabel= new JLabel("JLabel");
        JButton jbutton= new JButton("JButton");
        JTextField jtextfield= new JTextField("JTextField");
        JTextArea jtextarea= new JTextArea("JTextArea");
        JCheckBox jcheckbox= new JCheckBox("JCheckBox");
        JRadioButton jradiobutton= new JRadioButton("JRadioButton");
        String[] opciones={"Opcion1", "Opcion2","Opcion3"};
        JComboBox jcombobox= new JComboBox(opciones);
        JScrollBar jscrollbar= new JScrollBar(Scrollbar.HORIZONTAL,0,64,0,255);
        try {
            JFrame frame= new JFrame("Frame");
            frame.add(jlabel);
            frame.add(jbutton);
            frame.add(jtextfield);
            frame.add(jtextarea);
            frame.add(jcheckbox);
            frame.add(jradiobutton);
            frame.add(jcombobox);
            frame.add(jscrollbar);
            frame.setLayout(new GridLayout(0,1));
            frame.pack();
            frame.setVisible(true);
            
        } catch(Exception e) {}
                 
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sepla
 */

import java.awt.*;
import javax.swing.*;

public class VerificarEntradas  extends JFrame {
    
    public VerificarEntradas() {
        
        JLabel jlabel1= new JLabel("Número: ");
        JTextField jtextfield1= new JTextField("");
        JLabel jl2=new JLabel("Texto: ");
        JTextField jtf2= new JTextField("");
        
        add(jlabel1);
        add(jtextfield1);
        add(jl2);
        add(jtf2);
        setLayout(new GridLayout(2,2));
        
        //Verificar la entrada.
        
        jtextfield1.setInputVerifier(new Verificador());
    }
    
    
    public static void main(String[] args){
        Frame f= new VerificarEntradas();
        f.pack();
        f.setSize(200,100);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        
    }

}

class Verificador extends(JComponent input) {
    
    public boolean verify(JComponent input) {

if (input instanceof JTextField) {
String texto=((JTextField) input).getText();
try {

Integer.parseInt(texto);
return true;

} catch (Exception e) {



}
}
}


}







}





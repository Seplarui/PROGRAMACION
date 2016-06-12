/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.*;




public class CreandoMarcoCentrado {
    
    public static void main(String[] args) {
        
        MarcoCentrado mimarco= new MarcoCentrado();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
        
       
        
    }
}
    
    class MarcoCentrado extends JFrame{
        
        //CONSTRUCTOR
        public MarcoCentrado() {
            
            //setVisible(true);
            
            Toolkit mipantalla= Toolkit.getDefaultToolkit();
            mipantalla.getScreenSize();
            
            //SE GUARDA EN TAMANOPANTALLA SE GUARDA EL TAMAÑO DE LA PANTALLA
            Dimension tamanoPantalla=  mipantalla.getScreenSize();
            int alturaPantalla=tamanoPantalla.height;
            int anchoPantalla=tamanoPantalla.width;
            
            setSize(anchoPantalla/2,alturaPantalla/2);
            setLocation(anchoPantalla/4,alturaPantalla/4);
            setTitle("marcoCentrado");
            
            //ICONO EN LA VENTANA
            //Image miIcono=mipantalla.getImage("icono.gif");
            //setIconImage(miIcono);
            
        }
        
        
        
    }
   

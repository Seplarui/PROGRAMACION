/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class rectanguloSobrecargado {
    
        private int ancho=0;
        private int alto=0;
        
        rectanguloSobrecargado( ) {
            ancho=0;
            this.alto=0;
            System.out.println("Constructor 1");
            
        }
        
        rectanguloSobrecargado(int d) {
            System.out.println("Constructor 2");
            ancho=alto=d;
        }
        rectanguloSobrecargado(int an, int al) {
            ancho=an;
            this.alto=al;
            System.out.println("Constructor 3");
            
        }
        
        public void muestra() {
            System.out.println("Ancho: "+ancho+" Alto: "+this.alto);
            
        }
        
        public static void main(String[] args) {
            rectanguloSobrecargado a=new rectanguloSobrecargado();
            rectanguloSobrecargado b= new rectanguloSobrecargado(8);
            rectanguloSobrecargado c= new rectanguloSobrecargado(2,3);
            
            a.muestra();
            b.muestra();
            c.muestra();
        }
    
    
}

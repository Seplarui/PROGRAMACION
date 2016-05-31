/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class rectangulo implements Cloneable {
    
    private int ancho;
    private int alto;
    
    public Object clone() {
        Object objeto=null;
        try{
            objeto=super.clone();
            
        }catch (CloneNotSupportedException e) {
            System.out.println("Error al duplicar");
        }
        return objeto;
    }
    
    rectangulo(int an, int al) {
    ancho=an;
    this.alto=al;
}
    public rectangulo incrementarAncho() {
        ancho++;
        return this;
    }
    public int getAncho() {
        return this.ancho;
    }
    public void muestra() {
        int a=getAncho();
        System.out.println("Ancho: "+a+" Alto: "+this.alto);
    }
    
}

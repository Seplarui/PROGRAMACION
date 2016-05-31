/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class ConstructorCopia {
    
    private int ancho=0;
    private int alto=0;
    
    ConstructorCopia() {
        ancho=alto=0;
    }
    ConstructorCopia(int dato) {
        ancho=alto=dato;
    }
    ConstructorCopia(int an, int al) {
        ancho=an;
        this.alto=al;
    }
    ConstructorCopia(ConstructorCopia r) {
        ancho=r.ancho;
        alto=r.alto;
    }
    
    public void incrementaAnco() {
        ancho++;
    }
    public void incrementaAlto() {
        alto++;
    }
    public void muestra() {
        System.out.println("Ancho: "+ancho+ " Alto: "+this.alto);
        
    }
    public static void main(String[] args) {
        ConstructorCopia r1= new ConstructorCopia(5,7);
        ConstructorCopia r2= new ConstructorCopia(r1);
        r2.incrementaAnco();
        r2.incrementaAlto();
        r1.muestra();
        r2.muestra();
        
    }
}

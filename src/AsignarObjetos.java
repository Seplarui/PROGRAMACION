/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class AsignarObjetos {
    
    private int ancho=0;
    private int alto=0;
    
    AsignarObjetos() {
        ancho=alto=0;
    }
    AsignarObjetos(int dato) {
        ancho=alto=dato;
    }
    AsignarObjetos(int an, int al) {
        ancho=an;
        this.alto=al;
    }
    AsignarObjetos(AsignarObjetos r) {
        ancho=r.ancho;
        alto=r.alto;
    }
    public void incrementaAncho() {
        ancho++;
    }
    public void incrementaAlto() {
        alto++;
    }
    public void muestra() {
        System.out.println("Ancho: "+ancho+" Alto: "+this.alto);
    }
    
    public static void main(String [] args) {
        AsignarObjetos r1=new AsignarObjetos(5,7);
        AsignarObjetos r2=new AsignarObjetos(4,3);
        r2=r1;
        r2.incrementaAncho();
        r2.incrementaAlto();
        r1.muestra();
        r2.muestra();
    }
    
}

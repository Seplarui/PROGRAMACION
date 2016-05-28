/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class Ejercicio0209 {
    
    private double meridiano;
    private double paralelo;
    private double distancia_tierra;
    
    
    Ejercicio0209(double m, double p, double d) {
        
        meridiano=m;
        paralelo=p;
        distancia_tierra=d;
                
    }
    Ejercicio0209() {
        meridiano=paralelo=distancia_tierra=0;
    }
    
    public void printPosicion() {
        System.out.println("El satélite se encuentra en el paralelo "+ paralelo + " Meridiano "+ meridiano+ " "
                + " a una distancia de la tierra de " + distancia_tierra+ " Kilomentros ");
    }
    
    public void variaAltura(double desplazamiento) {
        
         distancia_tierra+=desplazamiento;
    
    }
    
    public boolean enOrbita() {
        
        if(distancia_tierra==0){
            return false;
        }
        return true;
    }
    
    public void variaPosicion(double variap, double variam) {
        
        meridiano += variam;
        paralelo += variap;
        
    }
    
    public static void main(String args[]) {
        
        Ejercicio0209 a = new Ejercicio0209();
        a.variaPosicion(1.0, 1.0);
        a.variaAltura(1);
        a.printPosicion();

        
    }
    
}

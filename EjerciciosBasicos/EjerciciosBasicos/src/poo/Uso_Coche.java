/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

public class Uso_Coche {
    
    public static void main(String[] args) {
        
       // Coche car= new Coche();


        //System.out.println("El coche tiene "+car.ruedas+" ruedas");
        
        
       // System.out.println(car.getLargo());
       
       Coche micoche= new Coche();
       
       System.out.println(micoche.getDatosGenerales());
       
       
       //System.out.println(micoche.getColor());
       
       micoche.configura_asientos("no");
       System.out.println(micoche.getAsientos());
      
       
       
    
    }
    
}

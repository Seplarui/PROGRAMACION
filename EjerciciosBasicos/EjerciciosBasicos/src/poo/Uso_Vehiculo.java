/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

public class Uso_Vehiculo {
    
    public static void main(String[] args) {
        
        Coche miCoche1=new Coche();
        
        miCoche1.setColor("rojo");
        
        Furgoneta miFurgoneta1= new Furgoneta(7,580);
        
        miFurgoneta1.setColor("verde");
        miFurgoneta1.configura_asientos("Si");
        miFurgoneta1.configura_climatizador("Si");
        
        System.out.println(miCoche1.getDatosGenerales()+ " "+miCoche1.getColor());
        
        System.out.println(miFurgoneta1.getDatosGenerales()+ " "+miFurgoneta1.getDatosFurgoneta());
        
        
        
    
    }
    
}

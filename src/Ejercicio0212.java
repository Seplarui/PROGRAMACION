/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sepla
 */
public class Ejercicio0212 {
    
    String marca;
    String modelo;
    
    Ejercicio0212() {
        
        marca="Seat";
        modelo="Leon";
}
    Ejercicio0212(String mar, String mod) {
        marca=mar;
        modelo=mod;
                
    }
    public String show() {
        return marca+" "+modelo;
    }
    public static void main(String[] args) {
        Ejercicio0212 c1=new Ejercicio0212();
        Ejercicio0212 c2=new Ejercicio0212("Volvo", "V60");
        System.out.println(c1.show());
        System.out.println(c2.show());
    }
    
}

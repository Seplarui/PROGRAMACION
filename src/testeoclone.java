/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class testeoclone {
    
    public static void main(String[] args) {
        rectangulo r1=new rectangulo(5,7);
        rectangulo r2=(rectangulo)r1.clone();
        rectangulo r3=r1; //COPIA DIRECCIÓN DE MEMORIA
        
        r1.muestra();
        r2.muestra();
        r3.muestra();
        
        if(r1.equals(r2)) System.out.println("Iguales");
        else System.out.println("No iguales");
        
        if(r1.equals(r3)) System.out.println("Iguales");
        else System.out.println("No iguales");
        
        r1.incrementarAncho();
        System.out.println("Nombre: "+r1.toString()+" ");r1.muestra();
        System.out.println("Nombre: "+r2.toString()+" ");r2.muestra();
        System.out.println("Nombre: "+r3.toString()+" ");r3.muestra();
    }
    
}

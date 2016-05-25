/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
import java.util.*;
import java.math.*;
public class Ejercicio0108 {
    
    public static void main(String[] args) {
        
        double longitud=0.0;
        double radio=0;
        Scanner linea=new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia");
        radio=linea.nextInt();
        longitud= 2*(Math.PI)*radio;
        System.out.println("El radio de la circunferencia es: "+longitud);
        
    }
    
}

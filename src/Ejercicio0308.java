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

public class Ejercicio0308 {
    
    public static void main(String[] args) {
        Random rnd=new Random();
        int valor=rnd.nextInt();
        valor=(valor%101);
        if(valor<0) {
            
            valor=-1*valor;
            
        }
        System.out.println(valor);
        
        if(valor%2==0) {
            
            System.out.println("Es par");
            
        } else {
            System.out.println("No es par");
        }
    }
    
}

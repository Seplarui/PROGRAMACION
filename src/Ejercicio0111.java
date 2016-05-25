/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class Ejercicio0111 {
    
    public static void main (String[] args) {
        
        char [] chr={'a','b','c','d','e','f','g'};
        char [] aleatorio= new char[25];
        
        for(int i=0;i<=24;i++) {
            
            aleatorio[i]=chr[(int)(Math.random()*3)];
            
            System.out.println(aleatorio[i]);
            
            
        }
        
        
        
    }
    
}

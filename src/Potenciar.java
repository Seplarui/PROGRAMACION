/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class Potenciar {
    
    public static int potencia(int x, int y) {
        if( y==1) {
            return x;
        } else {
            return x*potencia(x,y-1);
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println(potencia(2,4));
    }
    
}

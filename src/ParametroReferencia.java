/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class ParametroReferencia {
    
    public static void funcion(int[] y) {
        
        y[0]=5;
        
    }
    
    public static void main(String[] args) {
        
        int[]x={3};
        funcion(x);
        System.out.println(x[0]);
        
    }
    
}

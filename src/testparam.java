/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class testparam {
    
    public static void cambiar(int x) {
        x++;
        
    }
    public static void cambiar2(int[] par) {
        par[0]++;
    }
    
    public static void main(String[] args) {
        int x=3;
        int[]array={3};
        cambiar(x);
        System.out.println(x);
        cambiar2(array);
        System.out.println(array[0]);
                
    }
}

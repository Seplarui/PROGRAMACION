/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;
import java.util.*;
        

/**
 *
 * @author haplo
 */
public class Suma {
    
    public static void main(String[] args) {
        
        int a=0;
        int b=0;
        int c=0;
        
        Scanner linea=new Scanner(System.in);
        
        System.out.println("Introduce valor a");
        a=linea.nextInt();
        System.out.println("Introduce valor c");
        b=linea.nextInt();
        c=a+b;
        System.out.println("La suma de a y b es: "+ c);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sepla
 */
import java.io.*;

public class Printwriter01 {
    
    public static void main(String[] args) {
        
        PrintWriter pantalla=new PrintWriter(System.out);
        char[] array= {'A','l','d','a','r','i','a','s'};
        String str=new String("Paco");
        
        pantalla.write(str);
        pantalla.print(" ");
        pantalla.write(array,0,5);
        pantalla.println("");
        pantalla.flush();
        
                
    }
    
}

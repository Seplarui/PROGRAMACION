/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */

package util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Util {
    
    public int pedirInt() throws IOException {
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader buffer= new BufferedReader(input);
        String linea;
        int numero;
        linea=buffer.readLine();
        numero=Integer.parseInt(linea);
        return numero;
    }
    
    public String pedirString() {
        
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader buffer=new BufferedReader(input);
        String linea=null;
        try {
            linea=buffer.readLine();
            
        }catch (Exception e) {
            
        }
        return linea;
    }
    
}

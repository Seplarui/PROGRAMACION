/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LeeNumero {
    
    public static void main(String[] args) {
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader buffer=new BufferedReader(input);
        int numero;
        String linea;
        
        try {
            System.out.println("Introduce Número: ");
            linea=buffer.readLine();
            numero=Integer.parseInt(linea);
            System.out.println("Número leído "+numero);
        }
        catch (IOException | NumberFormatException e) {
            
        }
    }
    
    
}

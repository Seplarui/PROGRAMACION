/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */

import java.io.*;

public class LeeCaracter {
    
    public static void main(String[] args) {
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader buffer= new BufferedReader(input);
        char caracter;
        
        try {
            System.out.println("Introduce caracter: ");
            caracter=(char)buffer.read();
            System.out.println("Caracter leido: "+caracter);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}

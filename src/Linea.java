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

public class Linea {
    
    public static void main(String[] args) {
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader buffer= new BufferedReader(input);
        try {
            System.out.print("Introduce Linea: ");
            String linea=buffer.readLine();
            System.out.println("Linea leida: "+linea);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}

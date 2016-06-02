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

public class bufferedreader01 {
    
    public static String leercadena() {
        String cad="";
        BufferedReader bufferdReader= new BufferedReader(new InputStreamReader(System.in));
        try {
            cad=bufferdReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cad;
    }
    
    public static void main(String[] args) {
        String cad;
        System.out.println("Hace eco hasa que escribes para");
        do {
            cad=leercadena();
            System.out.println(cad);
        }while (!cad.equals("para"));
        }
    }
    


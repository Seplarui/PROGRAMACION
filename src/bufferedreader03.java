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
public class bufferedreader03 {
    
    public String cad="";
    
    public void leercadena() {
        BufferedReader bufferedReader;
        bufferedReader=new BufferedReader(new  InputStreamReader(System.in));
        
     try
    {
    cad=bufferedReader.readLine();
}catch (IOException e) {
    e.printStackTrace();
}
    
    }
    public void leercadenas() {
        System.out.println("Hace eco hasta que escribas para");
        do {
            leercadena();
            System.out.println(cad);
        } while (!cad.equals("para"));
        }
        
        public static void main(String[] args) {
            new bufferedreader03().leercadenas();
        }
    
}


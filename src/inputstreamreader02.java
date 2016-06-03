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
public class inputstreamreader02 {
    public static void main(String[] args) {
        
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
        
        try {
            System.out.println("Sumandi 1 :");
            int s1= Integer.parseInt(bufferedReader.readLine());
            System.out.println("Sumando 2 : ");
            int s2=Integer.parseInt(bufferedReader.readLine());
            int suma=s1+s2;
            System.out.println("La suma es: "+suma);
            
        }catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
    
}

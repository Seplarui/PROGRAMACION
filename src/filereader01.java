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
import java.util.StringTokenizer;
public class filereader01 {
    public int cuentaPalabras(String fichero) {
        int contador=0;
        try{ 
            String s;
            File fe= new File(fichero);
            FileReader fr=new FileReader(fe);
            BufferedReader f = new BufferedReader(fr);
            while((s=f.readLine())!=null) {
                StringTokenizer str= new StringTokenizer(s);
                contador+=str.countTokens();
            }
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: No existe"+fichero);
        } catch (IOException e) {
            
        } catch (Throwable e) {}
        return contador;
    }
    
    public static void main(String [] args) {
        filereader01 c=new filereader01();
        int d= c.cuentaPalabras(args[0]);
        if(d!=0) {
            System.out.println("Fichero: "+args[0]);
            System.out.println("Palabras: "+d);
        }
            
    }
    
}

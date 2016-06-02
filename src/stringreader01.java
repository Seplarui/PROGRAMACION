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

public class stringreader01 {
    
    public static void main(String[] args) {
        String string="Probando 1 2 3...";
        StringReader stringReader=new StringReader(string);
        int len;
        char []vector=new char[256];
        try {
            while ((len=stringReader.read(vector,0,256)) !=-1) {
                System.out.println("Reader leido "+(new String(vector,0,len)));
            }
        }catch (IOException ioe) {
            
        }
    }
    
}

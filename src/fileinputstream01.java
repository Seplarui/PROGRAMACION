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

public class fileinputstream01 {
    
    public static void main(String args[]) {
        
        FileInputStream f=null;
        String s="";
        char c;
        
        try {
            f=new FileInputStream("datos.bin");
            int size=f.available();
            
            for (int i=0;i<size;i++) {
                c=(char)f.read();
                s=s+c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println(s);
            try {
                f.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
        
        
    }
    
}

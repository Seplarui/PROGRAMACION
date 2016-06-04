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
public class Fileoutputstream01 {

public static void main(String[] args)     {
    
    FileOutputStream f=null;
    String s="texto";
    char c=0;
    
    try {
        f=new FileOutputStream("datos.bin");
        for (int i=0;i<s.length();i++) {
        c=s.charAt(i);
        f.write((byte)c);
        
    }
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try{
            System.out.println("Texto grabado");
            f.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */

//CONVIERTE UN STRING EN UN READER Y LO MUESTRA POR PANTALLA USANDO UN CHAR.

import java.io.*;
public class stringreader03 {
    
    public static void main(String[] args) {
        String string="Probando 1 2 3...";
        StringReader stringReader=new StringReader(string);
        int car;
        
        try {
            while((car=stringReader.read())!=-1) {
                System.out.print((char)car);
                
            }
            System.out.println("");
        }catch (IOException ioe){
            
    }
    
}
}
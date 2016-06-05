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

public class filewriter02 {
    
    public static void main(String[] args) throws IOException {
        
        //Nombre del fichero
        String f="EjemploFileWriter2.txt";
        //Abrimos fichero para escritura
        FileWriter fw= new FileWriter(f);
        try {
            //Grabamos el string prueba
            fw.write("prueba");
        } catch (IOException ex) {
            
        } finally {
            fw.close();
        }
        //Abrimos fichero de texto para lectura
        
        FileReader fr=new FileReader(f);
        
        BufferedReader br= new BufferedReader(fr);
        try {
            //char c=(char)br.read();
            //System.out.println(c);
            //Leemos una linea y la mostramos en pantalla
            System.out.println(br.readLine());
        } catch (IOException ex) {
            
        } finally {
            fw.close();
        }
    }
    
}

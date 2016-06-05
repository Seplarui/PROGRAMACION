/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sepla
 */
import java.io.File;

public class file01 {
    
    public static void main(String args[]) {
        String nomdir="G:\\OneDrive\\Programacion";
        File dir=new File(nomdir);
        if(dir.exists()) {
            System.out.println("Existe directorio: "+dir.getName());
        } else {
            System.out.println("No Tiene permiso de lectura: "+dir.getName());
        }
        File[] ficheros=dir.listFiles();
        System.out.println("El contenido de "+nomdir+" es: ");
        for (File f: ficheros) {
            System.out.println(f.getName());
            
        }
    }
    
    
    
}

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
public class TodoAMayusculas {
    public static void main(String[] arguments) {
        TodoAMayusculas may= new TodoAMayusculas("Ejemplo.txt");
        may.convertir();
    }
    
    String nombreFuente;
    
    TodoAMayusculas(String fuenteArg) {
        nombreFuente=fuenteArg;
    }
    
    void convertir() {
        File fuente= new File(nombreFuente);
        File temp= new File("may"+nombreFuente+".tmp");
        
        FileReader fr= new FileReader(fuente);
        BufferedReader in = new BufferedReader(fr);
        
        FileWriter fw=new FileWriter(temp);
        BufferedWriter out= new BufferedWriter(fw);
        boolean eof=false;
        int inChar=0;
        
        do {
            inChar=in.read();
            System.out.println((char)inChar);
            System.out.println();
            if (inChar!=-1) {
                
                char outChar=Character.toUpperCase((char)inChar);
                out.write(outChar);
                System.out.println();
                

            } else {
                eof=true;
            }
        } while (!eof);
        in.close();
        out.close();
        boolean borrado=fuente.delete();
        if(borrado) {
            temp.renameTo(fuente);
        }
        
        
        
        
    }catch (IOException e) {
    
}catch (SecurityException se) {
}

}

    
}

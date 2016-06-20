package programacion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Iteracion {
    
    public static void main(String[] args) {
        
        ArrayList<String> listaDeNombres= new ArrayList<String>();
        listaDeNombres.add("Juan Pérez Pérez");
        listaDeNombres.add("José Alberto Reverón Montes");
        
        String cadenaBuscar="Alberto";
        System.out.println("La cadena que buscamos es "+cadenaBuscar);
        
        Iterator<String> it= listaDeNombres.iterator();
        String tmpAnalizando;
        
        while(it.hasNext()) {
            tmpAnalizando=it.next();
            System.out.println("Analizando elemento..."+tmpAnalizando);
            if(tmpAnalizando.contains(cadenaBuscar)) {
                System.out.println("Cadena encontrada!!!");
            } else {};
        }
        
        
    }

}

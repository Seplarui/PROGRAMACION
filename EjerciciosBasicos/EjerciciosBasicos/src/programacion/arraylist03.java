/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;
import java.util.ArrayList;
import java.util.Iterator;

public class arraylist03 {
    
    public static void mostrar(ArrayList arrayList) {
        System.out.println("LISTADO:");
        
        Iterator iter= arrayList.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
    
    public static void main(String[] args) {
        //DEFINIMOS UN ARRAYLIST
        
        ArrayList<String> arrayList= new ArrayList<String>();
        //AÑADIMOS ELEMENTOS
        
        arrayList.add("Elemento1");
        arrayList.add("Elemento2");
        
        mostrar(arrayList);
        
        //AÑADIR EN POSICION
        
        arrayList.add(1,"Elemento3");
        
        //MOSTRAMOS LA LISTA
        
        mostrar(arrayList);
    }
    
}

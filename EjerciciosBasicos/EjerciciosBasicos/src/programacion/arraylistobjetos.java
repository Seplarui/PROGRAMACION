/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;

import java.util.*;


public class arraylistobjetos {
    
    public static void main(String[] args) {
        ArrayList<Articulo> articulos= new ArrayList<Articulo>(3);
        int i;
        
        for (i=0;i<3;i++) {
            articulos.add(new Articulo("Artículo: "+i));
        }
        
        Iteracion iter= articulos.iterator();
        i=0;
        while(iter.hasNext()) {
            Articulo articulo= (Articulo) inter.next();
            System.out.println(i+". "+ articulo.getNombre());
            i++;
        }
    }
    
}

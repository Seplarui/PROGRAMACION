/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;

import java.util.*;

public class arrayListborrar {

    public static void mostrar(ArrayList<Persona0734> arrayList) {

        System.out.println("LISTADO:");
        int i = 0;

        for (Persona0734 p : arrayList) {
            //System.out.println(i + " [" p.getNombre() + "] ");
            System.out.println(i+ " Nombre: "+p.getNombre()+" "+p.getEdad());
            
            i++;
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        Persona0734 persona1 = new Persona0734("Julian", 20);
        Persona0734 persona2 = new Persona0734("Betty", 200);
        Persona0734 persona3 = new Persona0734("Marta", 220);

        ArrayList<Persona0734> arrayList = new ArrayList<>();

        arrayList.add(persona1);
        arrayList.add(persona2);
        arrayList.add(persona3);

        mostrar(arrayList);
        arrayList.remove(1);
        mostrar(arrayList);
    }
}

class Persona0734 {

    String nombre;
    int edad;

    Persona0734(String n, int e) {
        nombre = n;
        edad = e;
    }

String getNombre() {
return nombre;
}
int getEdad() {
    return edad;
}
}


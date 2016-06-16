/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

public class Pruebas {

    public static void main(String[] args) {

        Empleados trabajador1 = new Empleados("Perico");
        Empleados trabajador2 = new Empleados("Ana");
        Empleados trabajador3 = new Empleados("Antonia");
        Empleados trabajador4 = new Empleados("Mario");

        trabajador1.setSeccion("RRHH");

        System.out.println(trabajador1.getDatos());
        System.out.println(trabajador2.getDatos());
        System.out.println(trabajador3.getDatos());
        System.out.println(trabajador4.getDatos());

    }

     static class Empleados {

       

        public Empleados(String nom) {

            nombre = nom;
            seccion = "Administración";
            Id=IdSiguiente;
            IdSiguiente++;
        }

        public void setSeccion(String seccion) { //SETTER
            this.seccion = seccion;
        }
        
        public void setNombre(String nombre) { //SETTER
            this.nombre=nombre;
        }

        public String getDatos() {//GETTER
            return "El nombre es: " + nombre + " y la sección es: " + seccion+ " y el ID: "+Id;
        }
         private  String nombre;
        private String seccion;
        private int Id;
        private static int IdSiguiente=1;
    }

}

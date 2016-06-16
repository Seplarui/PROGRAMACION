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

        trabajador1.setSeccion("RRHH");
        trabajador1.setNombre("Maria");

        System.out.println(trabajador1.getDatos());
        System.out.println(trabajador2.getDatos());

    }

     static class Empleados {

        private  String nombre;
        private String seccion;

        public Empleados(String nom) {

            nombre = nom;
            seccion = "Administración";
        }

        public void setSeccion(String seccion) { //SETTER
            this.seccion = seccion;
        }
        
        public void setNombre(String nombre) { //SETTER
            this.nombre=nombre;
        }

        public String getDatos() {
            return "El nombre es: " + nombre + " y la sección es: " + seccion;
        }
    }

}

package poo;
import java.util.*;

public class Pruebas {

    public static void main(String[] args) {

        Empleados trabajador1 = new Empleados("Perico");
        Empleados trabajador2 = new Empleados("Ana");
        Empleados trabajador3 = new Empleados("Antonia");
        Empleados trabajador4 = new Empleados("Mario");

        trabajador1.setSeccion("RRHH");

        System.out.println(trabajador1.getDatos() + "\n" + trabajador2.getDatos() + "\n"
                + trabajador3.getDatos() + "\n" + trabajador4.getDatos());

        System.out.println(Empleados.getIdSiguiente());
        
      

    }

    static class Empleados {

        public Empleados(String nom) {

            nombre = nom;
            seccion = "Administración";
            Id = IdSiguiente;
            IdSiguiente++;
        }

        public void setSeccion(String seccion) { //SETTER
            this.seccion = seccion;
        }

        public void setNombre(String nombre) { //SETTER
            this.nombre = nombre;
        }

        public String getDatos() {//GETTER
            return "El nombre es: " + nombre + " y la sección es: " + seccion + " y el ID: " + Id;
        }

        public static String getIdSiguiente() {
            return "El IdSiguiente es: " + IdSiguiente;
        }

        private String nombre;
        private String seccion;
        private int Id;
        private static int IdSiguiente = 1;
    }

}

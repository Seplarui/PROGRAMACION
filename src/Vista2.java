/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
package vista;
    import java.io.IOException;
    import modelo.Alumno;
    import util.Util;
public class Vista {
    
    
    
        public Alumno tomaDatos() throws IOException {
            Alumno alumno=new Alumno();
            Util util= new Util();
            String nombre;
            int edad;
            System.out.println("TOMA DE DATOS");
            System.out.print("Nombre: ");
            nombre=util.pedirString();
            alumno.setNombre(nombre);
            
            System.out.println("Edad: ");
            edad=util.pedirInt();
            alumno.setEdad(edad);
            
            return alumno;
        }
        public static void muestraDatos(Alumno p) 
        {
            System.out.println("MOSTRANDO DATOS");
            System.out.println(p.getNombre() + " "+p.getEdad());
        }
    }
    


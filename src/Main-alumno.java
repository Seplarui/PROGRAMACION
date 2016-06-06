/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
package controlador;
import java.io.IOException;
import modelo.Alumno;
import vista.Vista;


public class Main {
    
    public static void main(String[] args) throws IOException {
        
        /*Clase Main
        Se encargará del control del programa
        Estará la función principal
        Importará las clases de los paquetes de VISTA y  MODELO
        */
        
        Vista vista;
        Alumno p;
        
        /*Creamos un objeto con el modelo*/
        p=new Alumno();
        
        /* Creamos un objeto vista coger y mostrar datos*/
        
        vista= new Vista();
        
        /*Cogemos los datos con la vista*/
        
        p=vista.tomaDatos();
        
        /* Mostramos los datos con la vista*/
        vista.muestraDatos(p);
        
    }
    
}

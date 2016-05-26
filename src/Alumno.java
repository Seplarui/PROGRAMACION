/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
package modelo;
public class Alumno {
    
    /*Proporciona los constructores para crear personas*/
    
    private String nombre;
    private int edad;
    
    public Alumno() {
        nombre="Paco";
        edad=25;
    }
    
    public Alumno(String n, int e) {
        nombre=n;
        edad=e;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad=edad;
    }
    
}

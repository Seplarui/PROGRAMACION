/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    private int peso_plataforma;
    
    String color;
    int peso_total;
    boolean asientos_cuero;
    boolean climatizador;

    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
        peso_plataforma=500;
    }
    
    public String getLargo() { //GETTER
        return "El largo del coche es: "+largo;
    }
    
    public void setColor() { //SETTER
        color="azul";
    }
    
    public String getColor() {
        return "El color del coche es: "+color;
    }

}

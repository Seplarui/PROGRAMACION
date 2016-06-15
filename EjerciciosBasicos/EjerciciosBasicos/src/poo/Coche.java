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

    private String color;
    private int peso_total;
    private boolean asientos_cuero;
    private boolean climatizador;

    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
        peso_plataforma = 500;
    }

    public String getDatosGenerales() { //GETTER
        return "La plataforma del vehículo tiene " + ruedas + " ruedas"
                + ". Mide " + largo / 1000 + " metros con un ancho de " + ancho
                + " cm y un peso de plataforma de " + peso_plataforma + " kg.";
    }

    public void setColor(String color_coche) { //SETTER

        color = color_coche;

    }

    public void configura_asientos(String asientos_cuero) { //SETTER

        if (asientos_cuero == "si") {
            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }
        
    }

    public String getAsientos() { //GETTER

        if (asientos_cuero == true) {
            return "El coche tiene asientos de cuero";
        } else {
            return "El coche no tiene asientos de cuero";
        }
    }



public String getColor() {
        return "El color del coche es: "+color;
    }

}

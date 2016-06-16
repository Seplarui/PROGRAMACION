/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

public class Furgoneta extends Coche{
    
    private int capacidad_carga;
    
    private int plazas_extra;
    
    public Furgoneta(int plazas_extra, int capacidad_carga) {
        
        super(); //LLAMAR AL CONSTRUCTOR DE LA CLASE PADRE
        this.plazas_extra=plazas_extra;
        this.capacidad_carga=capacidad_carga;
        
        
    }
    
    public String getDatosFurgoneta() {
        return "Los capacidad de carga es "+this.capacidad_carga + " Y las plazas son: "+this.plazas_extra;
    }
    
    
    
    
}

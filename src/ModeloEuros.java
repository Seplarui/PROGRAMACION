/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class ModeloEuros {
    
    private double cambio;
    
    public ModeloEuros(double valorCambio) {
        cambio=valorCambio;
        
    }
    
    public double eurosAmoneda(double cantidad) {
        return cantidad*cambio;
    }
    public double monedaAeuros(double cantidad) {
        return cantidad/cambio;
    }
    
}

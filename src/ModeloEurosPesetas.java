/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class ModeloEurosPesetas extends ModeloEuros {
    
    public ModeloEurosPesetas() {
        super(166.386D);
    }
    public double eurosApestas(double cantidad) {
        return eurosAmoneda(cantidad);
    }
    public double pesetasAeuros(double cantidad) {
        return monedaAeuros(cantidad);
    }
    
    
}

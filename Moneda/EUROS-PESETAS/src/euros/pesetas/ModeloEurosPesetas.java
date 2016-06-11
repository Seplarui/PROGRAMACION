/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euros.pesetas;

/**
 *
 * @author sepla
 */
public class ModeloEurosPesetas  extends ModeloEuros {
    public ModeloEurosPesetas() {
        
        super(166.386D);
    }
    public double eurosApesetas(double cantidad) {
        return eurosAmoneda(cantidad);
    }
    public double pesetasAeuros(double cantidad) {
        return monedaAeuros(cantidad);
    }
    
}

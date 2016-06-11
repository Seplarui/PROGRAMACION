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
public interface Vista {
    
    void setControlador(Controlador c);
    void arranca();
    double getCantidad();
    void escribeCambio(String s);
    static final String AEUROS="Pesetas a Euros";
    static final String APESETAS="Euros a Pesetas";
    
}

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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    
    private Vista vista;
    private ModeloEurosPesetas modelo;
    
    public Controlador(Vista vista, ModeloEurosPesetas modelo) {
        this.vista=vista;
        this.modelo=modelo;
    }
    
    public void actionPermormed(ActionEvent evento) {
        
        double cantidad=vista.getCantidad();
        
        if(evento.getActionCommand().equals(Vista.AEUROS)) {
            vista.escribeCambio(cantidad + " pesetas son: "+modelo.pesetasAeuros(cantidad)+" euros");
        } else if (evento.getActionCommand().equals(Vista.APESETAS)) {
            vista.escribeCambio(cantidad + " euros son: "+ modelo.eurosApesetas(cantidad) + " pesetas");
        } else {
            vista.escribeCambio("ERROR");
        }
    }

  
    
    
    
    
    
    
    
}

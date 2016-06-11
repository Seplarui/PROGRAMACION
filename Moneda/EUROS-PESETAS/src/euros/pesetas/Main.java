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
public class Main {
    
    public static void main(String[] args) {
        //EL MODELO
        ModeloEurosPesetas modelo=new ModeloEurosPesetas();
        //LA VISTA
        Vista vista=new VistaGrafica();
        //CONTROL
        Controlador control= new Controlador(vista, modelo);
        //CONFIGURAR LA VISTA
        
        vista.setControlador(control);
        //ARRANCA LA INTERFAZ DE LA VISTA(VISTA)
        vista.arranca();
    }
    
}

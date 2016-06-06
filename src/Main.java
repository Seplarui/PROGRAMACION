/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class Main {
    
    public static void main(String args[]) {
        //MODELO
        ModeloEurosPesetas modelo= new ModeloEurosPesetas();
        //VISTA
        Vista vista= new VistaGrafica();
        //CONTROLADOR
        Controlador control = new Controlador(vista, modelo);
        //CONFIGURA LA VISTA
        vista.setControlador(control);
        //ARRANCA LA INTERFAZ (VISTA)
        vista.arranca();
        
    }
    
}

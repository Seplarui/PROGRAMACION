/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VistaTexto implements Vista {
    
    private Controlador controlador;
    
    private BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
    
    private int leeOpcion() {
        String s=null;
        try {
            s=in.readLine();
            return Double.parseDouble(s);
            
        } catch (Exception e) {
            System.out.println("Error en formato del número, tiene que ser 99.99");
            return leeCantidad();
        }
    }
    
    private void solicitaOperacion() {
        System.out.println("Indica la operación que quiere realizar");
        System.out.println("1: convertir euros a pesetas");
        System.out.println("2: convertir pesetas a euros");
        System.out.println("0: Salir");
        
    }
    private void procesaNuevaOperacion() {
        int operacion;
        solicitaOperacion();
        operacion= leeOpcion();
        if(operacion==0) {
            System.out.println("Adiós");
            System.exit(0);
            
        }
        if(operacion==1) {
            controlador.actionPerformed(new ActionEvent(this,operacion, AEUROS));
            
        }
        if(operacion==2) {
            controlador.actionPerformed(new ActionEvent(this,operacion,APESETAS));
        }
        operacionIncorrecta();
    }
    
    private void operacionIncorrecta() {
        System.out.println("Operacion incorrecta");
        procesaNuevaOperacion();
    }
    
    //Metodos de la interfaz de la Vista
    
    public void setControlador(Controlador c) {
        controlador=c;
    }
    public void arranca() {
        procesaNuevaOperacion();
    }
    public void escribeCambio(String s) {
        System.out.println(s);
        procesaNuevaOperacion();
    }
    public double getCantidad() {
        System.out.println("Cantidad a convertir (formato 99.99)");
        return leeCantidad();
    }
}

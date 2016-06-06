/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public interface Vista {
    
    void setControlador(Controlador c);
        //COMIENZA LA VISUALIZACIÓN
    
        void arranca();
        
        //CANTIDAD A CONVERTIR
        double  getCantidad();
        
        void escribeCambio(String s);
        static final String AEUROS="Pesetas a Euros";
        static final String APESETAS="Euros a Pesetas";
            
        }
        
    
    


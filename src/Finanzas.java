/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sepla
 */
public class Finanzas {
    
    double cambio=1.36;
    
    
    
    Finanzas() {
        
        cambio=1.36;
        
    }
    
    Finanzas(double c) {
        cambio=c;
    }
    
    public double dolaresToEuros(double dol)  {
        
        return dol/cambio;
    }
    
    public double eurosToDolares(double eur) {
        return eur*cambio;
    }
    
    public static void main(String[] args) {
        
        Finanzas f= new Finanzas(1.36);
        
        double misdol=50;
        double miseur=f.dolaresToEuros(misdol);
        System.out.println(misdol);
        System.out.println(miseur);
        System.out.println(f.eurosToDolares(miseur));
        
        
        
        
    }
    
}

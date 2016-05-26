/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class Ejercicio0206 {
    
    double cambio=1.36;
    
    Ejercicio0206() {
        cambio=1.36;
    }
    Ejercicio0206(double c) {
        cambio=c;
    }
    
    public double dolaresToEuros(double dol) {
        return dol/cambio;
    }
    public double eurosToDolares(double eur) {
        return eur*cambio;
    }
    
    public static void main(String[] args) {
        
        Ejercicio0206 f=new Ejercicio0206(1.36);
        double misdol=50;
        double miseur=f.dolaresToEuros(misdol);
        System.out.println(misdol);
        System.out.println(miseur);
        System.out.println(f.eurosToDolares(miseur));
    }
}

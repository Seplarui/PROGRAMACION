/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sepla
 */
public class Ejercicio0211 {
    
    public double millasAMetros(int millas) {
        return 1852*millas;
    }
    
    public double millasAKilometros(int millas) {
        return 1852*millas;
    }
    
    public static void main(String[] args) {
        Ejercicio0211 m=new Ejercicio0211();
        System.out.println(m.millasAKilometros(1));
        System.out.println(m.millasAMetros(1));
    }
    
    
}

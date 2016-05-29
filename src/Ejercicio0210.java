/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sepla
 */
public class Ejercicio0210 {
    
    double p; //almacena el peso en Kg.
    
    Ejercicio0210(double dat, String tipo) {
        p=dat;
        
        if("Lb".equals(tipo)) {
            p=p/getLibras();
        }
        if ("Li".equals(tipo)) {
            p=p/getLingotes();
        }
        if ("Oz".equals(tipo)) {
            p=p/getOnzas();
        }
        if("P".equals(tipo)) {
            p=p/getPeniques();
        }
        if("G".equals(tipo)) {
            p=p/1000;
        }
        if("Q".equals(tipo)) {
            p=p/getQuintales();
        }
    }
    
    private double getLibras() {
        return p/0.453;
    }
    private double getLingotes() {
        return p/14.59;
    }
    private double getOnzas() {
        return p/0.02835;
    }
    private double getPeniques() {
        return p/0.00155;
    }
    private double getQuintales() {
        return p/43.3;
    }
    
    public double getPeso(String tipo) {
        if("Lb".equals(tipo)) {
            return getLibras();
        }
        if("Li".equals(tipo)) {
            return getOnzas();
        }
        if("Oz".equals(tipo)) {
            return getOnzas();
        }
        if("P".equals(tipo)) {
            return getPeniques();
        }
        if("K".equals(tipo)) {
            return p;
        }
        if("G".equals(tipo)) {
            return getQuintales();
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Ejercicio0210 c=new Ejercicio0210(1000,"G");
        System.out.println(c.getPeso("K"));
        System.out.println(c.getLibras());
    }
}

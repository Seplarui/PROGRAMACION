/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sepla
 */
public class Ejercicio0213 {
    
            double kms, litros, vmed, pgas;

    //CONSTRUCTOR
            
    Ejercicio0213() {
        
        kms=litros=vmed=100;
        pgas=1.50;
        
        }
    public double getTiempo() {
        return kms/vmed;
    }
    public double consumoMedio() {
        return (litros*100)/kms;
    }
    public double consumoEuros() {
        return litros*pgas;
    }
    
    public String show() {
        return "kms: "+kms+" litros: "+" v: " + "vmed  "+vmed+" consumo: "+ pgas;
    }
    
    public static void main(String[] args) {
        Ejercicio0213 c=new Ejercicio0213();
        System.out.println(c.show());
    }
        
    }
    
    
    
    


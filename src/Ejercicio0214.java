/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sepla
 */
public class Ejercicio0214 {
    
            double kms, litros, vmed, pgas;

    //CONSTRUCTOR
            
    Ejercicio0214() {
        
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
    
    public void setKms(double k) {
        kms=k;
    }
    public void setLitros(double l) {
        litros=l;
    }
    public void setVmed(double v) {
        vmed=v;
    }
    public void setPgas(double p) {
        pgas=p;
    }
    
    public String show() {
        return "kms: "+kms+" litros: "+" v: " + "vmed  "+vmed+" consumo: "+ pgas+" consumoMedio: "+ consumoMedio() + " tiempo: "+getTiempo();
    }
    
    
    public static void main(String[] args) {
        Ejercicio0214 c=new Ejercicio0214();
        c.setKms(1000);
        c.setLitros(100);
        c.setVmed(100);
        c.setPgas(100);
        System.out.println(c.show());
    }
        
    }
    
    
    
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class MetodoStatic {
    
    int a=1;
    static int b=2;
    
    static void funcionStatic() {
        //System.out.println(a);
        System.out.println(b);
    }
    
    void funcion() {
        System.out.println(a);
    }
    
    public static void main(String[] args ) {
        MetodoStatic p= new MetodoStatic();
        funcionStatic();
        p.funcion();
        System.out.println(b);
    }
    
}

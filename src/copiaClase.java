/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class copiaClase {
    
    private int a;
    copiaClase(int i) {
        this.a=i;
    }
    
    copiaClase(copiaClase x) {
        this.a=x.a;
    }
    
    public static void main(String[] args) {
        copiaClase x=new copiaClase(1);
        copiaClase y=new copiaClase(x);
        System.out.println(y.a);
    
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */


package ejemplo0518;
import ejemplo0518a.Objeto;



public class ParametroReferencia1 {
    
    public static void main(String[] args) {
        Objeto v=new Objeto();
        v.a=2;
        v.funcion(v);
        System.out.println(v.a);
    }
    
    
    
}

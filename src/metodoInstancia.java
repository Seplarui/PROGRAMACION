/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class metodoInstancia {
    
    public static int var;
    public int var2;
    
    public void prueba() {
        var=3;
        var2=5;
    }
    public static void main(String args[]) {
        metodoInstancia t=new metodoInstancia();
        t.prueba();
    }
    
}

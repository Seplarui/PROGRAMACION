/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class Pajaro20 {
    
    private static int numpajaros=0;
    private char color;
    private int edad;
    
    static void nuevopajaro() {
        numpajaros++;
    }
    
    Pajaro20() {
        color='v';
        edad=0;
        nuevopajaro();
    }
    Pajaro20(char c, int e) {
        color=c;
        edad=e;
        nuevopajaro();
    }
    
    static void muestrapajaros() {
        System.out.println(numpajaros);
    }
    public static void main(String[] args) {
        Pajaro20 p1,p2;
        p1=new Pajaro20();
        p2=new Pajaro20('a',3);
        p1.muestrapajaros();
        p2.muestrapajaros();
    }
    
    
}

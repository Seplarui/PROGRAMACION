/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class Constructor {
    
    private int atributo;
    
    Constructor() {
        System.out.println("Constructor sin");
    }
    
    Constructor(int parametro) {
        System.out.println("Constructor con");
    }
    
    public static void main(String args[]) {
        Constructor e1=new Constructor();
        Constructor e2=new Constructor(1);
    }
}

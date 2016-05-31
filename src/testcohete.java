/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class testcohete {
    
    public static void main(String[] args) {
        cohete c1=new cohete();
        cohete c2=new cohete();
        
        System.out.println(c1.getcohetes());
        System.out.println(c2.getcohetes());
        c2.lanza();
        System.out.println(c2.getcohetes());
        //System.out.println(c2.numcohetes); //ERROR
        
    }
    
}

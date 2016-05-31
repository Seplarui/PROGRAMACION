/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class thistest {
    
    private int a;
    private String s;
    
    thistest(int i){
        this("Texto");
        System.out.println(i);
        
    }
    
    thistest(String p) {
        System.out.println(p);
        this.s=p;
    }
    
    public static void main(String[] args) {
        thistest t=new thistest(1);
    }
}

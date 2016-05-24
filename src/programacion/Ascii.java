/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;

/**
 *
 * @author sepla
 */
public class Ascii {
    
    public static void main(String[] args) {
        
        int i,j;
        char c;
        
        System.out.println("Ascii entre A y z");
        for(c='A';c<='z';c++) {
            i=(int)c;
            System.out.println(i+": "+c+"\t");
        }
        
    }
    
}

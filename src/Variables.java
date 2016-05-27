/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sepla
 */
public class Variables {
    char ch;
    public Variables(char c) {
        ch=c;
    }
    public void repetir(int num) {
        int i;
        for (i=0;i<num;i++) {
            System.out.println(ch);
        }
    }
    
    public static void main(String [] args) {
        
        Variables var;
        var= new Variables('H');
        var.repetir(20);
    }
    
    
}

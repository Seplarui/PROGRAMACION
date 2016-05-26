/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class Pajaro21 {
    
    private static int numpajaros=0;
    private char color;
    
    public void setColor(char c) {
        color=c;
    }
    
    public char getColor() {
        return color;
    }
    
    public static void main(String[] args) {
        Pajaro21 p1;
        char color;
        p1=new Pajaro21();
        p1.setColor('c');
        color=p1.getColor();
        System.out.println(color);
    }
    
}

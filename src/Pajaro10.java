/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class Pajaro10 {
    
    private char color;
    private int edad;
    
    //***METODOS DE LA CLASE****//
    
    public void setedad(int e) {
        edad=e;
    }
    public void printedad() {
        System.out.println(edad);
    }
    
    public void setcolor(char c) {
        color=c;
    }
    public void printcolor() {
        switch(color) {
            
            case 'v':
                System.out.println("verde");
                break;
            case 'a':
                System.out.println("amarillo");
                break;
            case 'g':
                System.out.print("gris");
                break;
            case 'n':
                System.out.println("negro");
                break;
            default:
                System.out.println("color no establecido");
        }
        
    }
    
}

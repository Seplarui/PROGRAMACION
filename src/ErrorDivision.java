/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class ErrorDivision {
    
    public static void main(String[] args) {
        int num1=2,num2=0,cociente=0;
        String linea;
        try {
            cociente=num1/num2;
        } catch (ArithmeticException ae) {
            System.err.println("Error aritmético: "+ae.getMessage());
        }
        System.out.println("El cociente es: "+cociente);
    }
    
}

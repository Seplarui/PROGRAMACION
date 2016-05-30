/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class Ejercicio0314 {
    
    private char letra;
    
    Ejercicio0314(char let) {
        letra=let;
        
        if(let>='a'){
            letra-='a';
            letra+='A';
        }
    }
    
    public char getLetra() {
        return letra;
    }
    public void printLetra() {
        System.out.println(letra);
    }
    
    public static void main(String[] args) {
        
        Ejercicio0314 l1=new Ejercicio0314('a');
        Ejercicio0314 l2=new Ejercicio0314('A');
        Ejercicio0314 l3=new Ejercicio0314('s');
        Ejercicio0314 l4=new Ejercicio0314('g');
        l1.printLetra();
        l2.printLetra();
        System.out.println(l3.getLetra());
        System.out.println(l4.getLetra());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicos;

public class ManipularCadenas {
    
    public static void main(String[] args){
        
    
    String nombre="Felipe Juan Froilán de Todos los Santos";
    System.out.println("Mi nombre es: "+nombre);
    
    System.out.println("Mi nombre tiene: "+nombre.length()+ " letras.");
    System.out.println("La primera letra de mi nombre es: "+nombre.charAt(0));
    
    int ultima_letra;
    ultima_letra=nombre.length();
    System.out.println("La última letra es: "+nombre.charAt(ultima_letra-1));
    
    }
    
}

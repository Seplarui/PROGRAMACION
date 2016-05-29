/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sepla
 */
public class Ejercicio0207 {
    
    int num;
    
    Ejercicio0207(int d) {
        num=d;
    }
    
    public int Doble(int num) {
        return num*2;
    }
    public int Triple(int num) {
        return num*3;
    }
    public int Cuadruple(int num) {
        return num*4;
    }
    public void printNumero(int n) {
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        
        int numero=5;
        
        Ejercicio0207 calculo= new Ejercicio0207(numero);
        System.out.println(calculo.Doble(numero));
        System.out.println(calculo.Triple(numero));
        System.out.println(calculo.Cuadruple(numero));
        
        
        
    }
    
}

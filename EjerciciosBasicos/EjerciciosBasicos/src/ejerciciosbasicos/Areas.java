/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicos;
import java.util.*;
import javax.swing.*;

public class Areas {
    
    public static void main(String[] args){
    
    Scanner entrada= new Scanner(System.in);
    
    System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
    
    int figura=entrada.nextInt();
    
    switch(figura) {
        case 1: 
            int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
            System.out.println("El área del cuadrado es "+ Math.pow(lado,2));
            break;
        case 2:
            int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
            int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
            System.out.println("El área del rectángulo es "+base*altura);
            break;
    }
    
    }
    
    
    
}

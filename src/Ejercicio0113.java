/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */

import java.util.*;
public class Ejercicio0113 {
    
    public static void main(String[] args) {
        
        int edad, nivel_de_estudios, ingresos;
        boolean jasp;
        Scanner linea= new Scanner(System.in);
        
        System.out.println("Introduce tu edad");
        edad=linea.nextInt();
        System.out.println("Introduce tu nivel de estudios");
        nivel_de_estudios=linea.nextInt();
        System.out.println("Introduce tus ingresos");
        ingresos=linea.nextInt();
        if (((edad<=28) && (nivel_de_estudios>3)) || ((edad<30) && (ingresos>28000))) {
            jasp=true;
        
    } else {
            jasp=false;
        }
        
        System.out.println("El resultado es: "+jasp);
        
        
    }
    
    
        
        
        
    }
    
    



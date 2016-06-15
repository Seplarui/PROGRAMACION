/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicos;

import javax.swing.*;
import java.util.*;

public class Acceso_Aplicacion {
    
    public static void main(String[] args) {
        
        String clave="Juan";
        String pass="";
        
        while (clave.equals(pass)==false) {
            
            pass=JOptionPane.showInputDialog("Introduce la contraseña por favor");
            if (clave.equals(pass)==false) {
                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Contraseña correcta, acceso permitido");
        
        
    }
    
}

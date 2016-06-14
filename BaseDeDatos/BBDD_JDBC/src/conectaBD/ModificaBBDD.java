/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author sepla
 */
public class ModificaBBDD {
    
    public static void main(String[] args) {
        
        try{
            
            //1.- CREAR CONEXIÓN A LA BASE DE DATOS
            
            Connection miConexion=DriverManager.getConnection("jdbc:mysql://192.168.31.134:3306/pruebas","pruebas","pruebas");
            
            //2.- CREAR OBJETO STATEMENT(PARA CONSULTAS)
            
            Statement miStatement=  miConexion.createStatement();
            
            String instruccionSql= "INSERT INTO PRODUCTOS (CODIGOARTICULO, SECCION, NOMBREARTICULO,PRECIO, FECHA, IMPORTADO) VALUES (20,21, 22,60.35,23,24)";
            miStatement.executeUpdate(instruccionSql);
            
            System.out.println("Datos insertados correctamente");
        }catch (Exception e){
            
            System.out.println("No conecta a la base de datos");
            
            e.printStackTrace();
        
        
        }
        
    }
    
}

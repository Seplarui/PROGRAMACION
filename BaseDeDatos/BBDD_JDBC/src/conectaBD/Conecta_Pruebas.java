/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectaBD;
import java.sql.*;

/**
 *
 * @author sepla
 */
public class Conecta_Pruebas {
    
    public static void main(String[] args) {
        
        try{
            
            //1.- CREAR CONEXIÓN A LA BASE DE DATOS
            
            Connection miConexion=DriverManager.getConnection("jdbc:mysql://192.168.31.134:3306/pruebas","pruebas","pruebas");
            
            //2.- CREAR OBJETO STATEMENT(PARA CONSULTAS)
            
            Statement miStatement=  miConexion.createStatement();
            
            //3.- EJECUTAR LA INSTRUCCIÓN SQL
            
            ResultSet miResultset= miStatement.executeQuery("SELECT * FROM PRODUCTOS");
            
            //4.- RECORRER RESULTSET
            
            while(miResultset.next()) {
                System.out.println(miResultset.getString("NOMBREARTICULO")+ " "+ miResultset.getString("CODIGOARTICULO")+" "+miResultset.getString("PRECIO"));
                
            }
            
        }catch (Exception e){
            
            System.out.println("No conecta a la base de datos");
            
            e.printStackTrace();
        
        
        }
        
    }
    
}

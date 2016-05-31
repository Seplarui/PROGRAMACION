/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class staticTest {
    
    public int dato;
    public static int datostatico=0;
    
    public void Test() {
        dato=-1;
    }
    
    public void metodo() {
        this.datostatico++;
    }
    
    public static void metodostatico() {
        //Error 1: Metodo static no puede usar this.
        //this.datostatico++
        datostatico++;
    }
    public int metodoMath() {
        return Math.abs(dato);
    }
    
    public static void main(String[] args) {
        staticTest a=new staticTest();
        //Error2 Metodo static no accede a miembros no static
        //dato++
        datostatico++;
        metodostatico();
        //Error 3 Metodo static no puede acceder a metodos no estáticos
        //metodo();
        System.out.println(Math.random());
        //La clase math tiene metodos static, que se pueden llamar desde metodos static.
        System.out.println(a.metodoMath());
    }
    
    
}

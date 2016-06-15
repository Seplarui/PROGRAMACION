/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicos;

public class Uso_Arrays_II {
    
    public static void main(String[] args) {
        
        
        /*String[] paises= new String[8];
        
        paises[0]="España";
        paises[1]="México";
        paises[2]="Colombia";
        paises[3]="Perú";
        paises[4]="Chile";
        paises[5]="Argentina";
        paises[6]="Francia";
        paises[7]="Portugal";*/
        
       // String[]paises={"España","México","Colombia", "Perú", "Chile", "Argentina", "Francia", "Portugal"};
        
        /*for (int i=0;i<paises.length;i++){
            System.out.println("País "+(i+1)+" "+paises[i]);
        }*/
        
        /*for(String elemento:paises) {
            System.out.println(elemento);
        }*/
        
        int[] matriz_aleatorios= new int[10000];
        for(int i=0;i<matriz_aleatorios.length;i++) {
            matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
        }
        
        for(int elementos:matriz_aleatorios) {
            
            System.out.println(elementos+" ");
            
        }
        
        
    }
    
}

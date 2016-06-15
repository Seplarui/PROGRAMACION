/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicos;

public class Arrays_Bidimensionales {
    
    public static void main(String[] args) {
        
        int[][] matrix= new int[4][5];
        
        matrix[0][0]=11;
        matrix[0][1]=12  ;
        matrix[0][2]= 13 ;
        matrix[0][3]= 14 ;
        matrix[0][4]=15  ;
        
        matrix[1][0]=  43;
        matrix[1][1]= 44 ;
        matrix[1][2]=  42;
        matrix[1][3]= 445 ;
        matrix[1][4]= 32 ;
        
        matrix[2][0]= 76 ;
        matrix[2][1]= 67 ;
        matrix[2][2]= 66 ;
        matrix[2][3]= 65 ;
        matrix[2][4]= 63 ;
        
        matrix[3][0]= 55 ;
        matrix[3][1]= 54 ;
        matrix[3][2]= 53 ;
        matrix[3][3]= 532 ;
        matrix[3][4]= 23 ;
        
        //System.out.println(matrix[1][1]);
        int contador=0;
        
        for (int i=0;i<4;i++)  {
            System.out.println();
            for (int j=0;j<5;j++){
                System.out.print(matrix[i][j]+" ");
                contador++;
            }
        }
        System.out.println("Contador: "+contador);
    }
    
}

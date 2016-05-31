/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */

/**
 * Variables miembro Static de una clase. Las variables miembros de una clase mantienen su valor
 * 
 */
public class cohete {
    
    private static int numcohetes=0;
    cohete() {
        numcohetes++;
    }
    public int getcohetes() {
        return numcohetes;
    }
    public void lanza() {
        numcohetes++;
    }
    
    
    
}

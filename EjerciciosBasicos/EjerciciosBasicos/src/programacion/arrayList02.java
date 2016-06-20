/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;


public class arrayList02 {
    
    public static void main(String[] args) {
        
        String[] arrayString= new String[]{"1","2","3","4"};
        
        for(String s:arrayString) {
            System.out.println(s);
        }
        System.out.println("");
        ArrayList<String> arrayList= new ArrayList<String>(arrayString.length);
        for(int i=0;i<arrayString.length;i++) {
            arrayList.add(arrayString[i]);
        }
        
        
        Iterator it=arrayList.iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
        System.out.println("");
        
        Vector<String> vector= new Vector<String>(arrayString.length);
        for (int i=0; i<arrayString.length;i++) {
            vector.add(arrayString[i]);
        }
        
        it=vector.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("");
        
        
    }
    
}

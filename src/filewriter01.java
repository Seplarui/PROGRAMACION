/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sepla
 */

import java.io.*;

public class filewriter01 {
    
    public static void main(String[] args) {
        String []amigos={"Juan Garcia","Pepe Serrano", "Paco Lucia"};
        File fs=new File("amigos.txt");
        try {
            FileWriter fw= new FileWriter(fs);
            for(String s:amigos) {
                fw.write(s,0,s.length());
                fw.write("\r\n");
            }
            if (fw!=null) {
                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        File fe=new File("amigos.txt");
        if (fe.exists()) {
            try {
                FileReader fr=new FileReader(fe);
                BufferedReader br=new BufferedReader(fr);
                String s;
                while((s=br.readLine())!=null) {
                    System.out.println(s);
                }
                if(fr!=null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sepla
 */

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Web {
    
    public static void main(String[] args) {
        try{
            URL url= new URL("http://www.eltiempo.es/valencia.html");
            URLConnection urlCon=url.openConnection();
            System.out.println(urlCon.getContentType());
            InputStream is=urlCon.getInputStream();
            FileOutputStream fos= new FileOutputStream("web.html");
            byte[] array= new byte[1000];
            int leido=is.read(array);
            while (leido>0) {
                fos.write(array,0, leido);
                leido=is.read(array);
            }
            is.close();
            fos.close();
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    
    
}

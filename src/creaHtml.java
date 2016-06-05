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

public class creaHtml {
    
    public static void main(String[] args) {
        String cad="EjemploHtml";
        FileWriter filewriter=null;
        PrintWriter printw=null;
        
        try {
            filewriter=new FileWriter("EjemploHtml.html");
            printw=new PrintWriter(filewriter);
            printw.println("<html>");
            printw.println("<head><title>Ejemplo</title></html>");
            printw.println("<body> bgcolor=\"#99CC99\">");
            printw.println("<center><h1>"+cad+"</h1></center>");
            printw.println("</body>");
            printw.println("</html>");
            printw.close();
        }catch (Exception e) {}
        System.out.println("Generada página web");
    }
    
}

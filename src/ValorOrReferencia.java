/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haplo
 */
public class ValorOrReferencia {
    
    private String param1=new String();
    public ValorOrReferencia(String param1) {
        this.setParam1(param1);
        
    }
    public static void CambiarObjeto(ValorOrReferencia objeto) {
        objeto=new ValorOrReferencia("Este es el nuevo objeto");
        System.out.println("Luego de \"reasignar\"pass: "+objeto);
    }
    public static void cambiarParam1(ValorOrReferencia objeto) {
        objeto.setParam1("Este es un nuevo valor para param1");
    }
    public String getParam1() {
        return param1;
    }
    public void setParam1(String param1) {
        this.param1=param1;
    }
    public String toString() {
        return "[param1= "+this.getParam1()+ "]";
    }
    
    public static void main(String[] args) {
        ValorOrReferencia pass=new ValorOrReferencia("Objeto inicial.");
        System.out.println("Entender que Java pasa parametros por valor");
        System.out.println("Antes de modificar passes : "+pass);
        ValorOrReferencia.CambiarObjeto(pass);
        System.out.println("De vuelta en main pass es: "+pass);
        System.out.println("Ahora vamos a cambiar solo param1:");
        ValorOrReferencia.cambiarParam1(pass);
        System.out.println("De seguro param 1 ha cambiado: "+pass);
        System.out.println("Parece difícil pero no lo es.");
        
    }
    
}

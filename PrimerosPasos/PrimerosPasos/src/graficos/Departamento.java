/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;




public class Departamento {
    
    private String iddepartamento;
    private String nombre;
    
    public Departamento (String i, String n){
        this.iddepartamento= i;
        this.nombre=n;
    }
    
    public String getIddepartamento() {
        return this.iddepartamento;
    }
    public String getnombredepartamento() {
        return this.nombre;
    }
    
    public void setIddepartamento(String iddepartamento) {
        this.iddepartamento=iddepartamento;
    }
    public void setnombredepartamento(String nombre) {
        this.nombre=nombre;
    }
    
}

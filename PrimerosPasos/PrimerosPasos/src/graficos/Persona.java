
package graficos;

public class Persona {
    
    private String idpersona;
    private String usuario;
    private String password;
    private Departamento departamento;
    
    
    public String getidpersona() {
        return this.idpersona;
    }
    public String getusuario() {
        return this.usuario;
    }
    public String getpassword() {
        return this.password;
    }
    public Departamento getDepartamento() {
        return this.departamento;
    }
    public void setidpersona(String id) {
        this.idpersona=id;
    }
    public void setusuario(String usuari) {
        this.usuario=usuari;
    }
    public void setpassword(String pass) {
        this.password=pass;
    }
    public void setDepartamento(Departamento dpto) {
        this.departamento=dpto; 
    }
    
}

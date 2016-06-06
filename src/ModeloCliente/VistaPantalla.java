/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloCliente;

/**
 *
 * @author haplo
 */
public class VistaPantalla extends javax.swing.JFrame {
    
    public VistaPantalla() {
        initComponents();
    }
    public JButton getjButtonAnterior() {
        return jButtonAnterior;
    }
    
    public JButton getjButtonSiguiente() {
        return jButtonSiguiente;
    }
    public void setjTextFieldId(String a) {
        jTextFieldId.setText(s);
    }
    public void setjTextFieldNombre(String a) {
        jTextFieldNombre.setText(s);
    }
    
}

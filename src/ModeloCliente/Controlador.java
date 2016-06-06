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
public class Controlador implements ActionListener {
    
    VistaPantalla vista=null;
    ModeloCliente ciente=null;
    VistaFichero f= new VistaFichero();
    
    Controlador (VistaPantalla v, ModeloCliente m) {
        vista=v;
        cliente=m;
        
        vista.setVisible(true);
        primero();
        rellenavista(cliente);
        programaBotones();
    }
    
    private void programaBotones() {
        vista.getjButtonAnterior().setActionCommand("Anterior");
        vista.getjButtonSiguiente().setActionCommand("Siguiente");
        vista.getjButtonAnterior().addActionListener(this);
        vista.getjButtonSiguiente().addActionListener(this);
        
        private void rellenavista(ModeloCliente cliente) {
            vista.setjTextFieldId(cliente.getId());
            vista.setjTextFieldNombre(cliente.getNombre());
            
        }
        @Override
        public void actionPerformed(ActionEvent ae) {
            String comando=ae.getActionCommand();
        }
    }
    
    
    
}

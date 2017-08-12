/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vistas.Paneles.PanelRegistroProducto;
import javax.swing.JInternalFrame;

/**
 *
 * @author MARIANA
 */
public class ControladorPrecios {
    
    PanelRegistroProducto prp;
    
    
    public void setPanelRegistroProducto(JInternalFrame jif) {
        this.prp = (PanelRegistroProducto) jif;
                          
    }
            
    
    public void insertarDatos() {
    
        
        
        
       /* int codOperador = 0;
        String numeroCelular = pr.jtfNumeroCelular.getText();
        String nombreOperador = pr.jcbOperador.getSelectedItem().toString();
        float cantidadRecargada = Float.parseFloat(pr.jtfCantidadRecargada.getText());
       

         RecargaDAO recargaDao = new RecargaDAO();
         
        
        try {
            codOperador = recargaDao.obtenerCodigo(nombreOperador);
            System.out.println(codOperador);
            recargaDao.obtenerCodigo(nombreOperador);
            
            recargaDao.registrarRecarga(numeroCelular,codOperador,cantidadRecargada);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    
    
    
    }
    
    
}

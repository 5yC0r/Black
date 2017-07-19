/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAO.RecargaDAO;
import Vistas.Paneles.PanelRecarga;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

/**
 *
 * @author MARIANA
 */
public class ControladorRecarga {
    PanelRecarga pr;
    
    public void setPanelRecarga(JInternalFrame jif) {
        this.pr = (PanelRecarga) jif;
    }
    
    public void insertarDatos() {
    
        String numeroCelular = pr.jtfNumeroCelular.getText();
        String nombreOperador = pr.jcbOperador.getSelectedItem().toString();
        float cantidadRecargada = Float.parseFloat(pr.jtfCantidadRecargada.getText());
       

         RecargaDAO recargaDao = new RecargaDAO();
        
        try {
            recargaDao.registrarRecarga(numeroCelular,nombreOperador,cantidadRecargada);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
}

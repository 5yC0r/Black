/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAO.RecargaDAO;
import Modelo.DAO.UsuarioDAO;
import Vistas.Paneles.AgregarOperador;
import Vistas.Paneles.PanelRecarga;
import Vistas.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MARIANA
 */
public class ControladorRecarga  {
    PanelRecarga pr;
    AgregarOperador ao;
    
    public void setPanelRecarga(JInternalFrame jif) {
        this.pr = (PanelRecarga) jif;
                          
    }
            
    
    public void insertarDatos() {
    
        int codOperador = 0;
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
        }
    
    
    
    }
}

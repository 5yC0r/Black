/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAO.OperadorDAO;
import Vistas.Paneles.AgregarOperador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

/**
 *
 * @author MARIANA
 */
public class ControladorOperador {
    AgregarOperador pao;
    
    public void setAgregarOperador(JInternalFrame jif) {
        this.pao = (AgregarOperador) jif;
    }
    
    public void insertarDatos() {
    
        String nombreOperador = pao.jtfNombreOperador.getText();
        
        OperadorDAO operadorDao = new OperadorDAO();
        
        try {
            operadorDao.registrarOperador(nombreOperador);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAO.CategoriaDAO;
import Vistas.Paneles.PanelNuevaCategoria;
import java.sql.SQLException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

/**
 *
 * @author MARIANA
 */
public class ControladorCategoria {
    
    PanelNuevaCategoria pnc;
    
    public void setPanelNuevaCategoria(JInternalFrame jif) {
        this.pnc = (PanelNuevaCategoria) jif;
    }
    
    public void insertarDatos() {
    
        String nombreNuevaCategoria = pnc.jtfNombreNuevaCategoria.getText();
       
        CategoriaDAO categoriaDao = new CategoriaDAO();
        
        try {
            categoriaDao.registrarCategoria(nombreNuevaCategoria);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
}

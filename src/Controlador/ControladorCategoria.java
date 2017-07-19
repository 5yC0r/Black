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
        String nombrePrecio1 = pnc.jtfNombrePrecio1.getText();
        String nombrePrecio2 = pnc.jtfNombrePrecio2.getText();
        String nombrePrecio3 = pnc.jtfNombrePrecio3.getText();
        String nombrePrecio4 = pnc.jtfNombrePrecio4.getText();
       
        CategoriaDAO categoriaDao = new CategoriaDAO();
        
        try {
            categoriaDao.registrarCategoria(nombreNuevaCategoria,nombrePrecio1,nombrePrecio2,nombrePrecio3,nombrePrecio4);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
}

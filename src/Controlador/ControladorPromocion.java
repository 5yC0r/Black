/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAO.PromocionDAO;
import Vistas.Paneles.PanelPromociones;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

/**
 *
 * @author MARIANA
 */
public class ControladorPromocion {
    
    PanelPromociones pp;
    
    public void setPanelPromociones(JInternalFrame jif) {
        this.pp = (PanelPromociones) jif;
    }
    
    public void insertarDatos(){
      
        PromocionDAO promocionDao = new PromocionDAO();
            
            String nombrePromocion = pp.jtfNombrePromocion.getText();
            String descripcion = pp.jtpDescripcion.getText();
            String categoria = pp.jcbCategoriaProducto.getSelectedItem().toString();
            String producto = pp.jcbProducto.getSelectedItem().toString();
            int unidades = Integer.parseInt(pp.jtfUnidades.getText());
            float importe = Float.parseFloat(pp.jtfImporte.getText());       
        
        try {
            promocionDao.registrarPromocion(nombrePromocion,descripcion,categoria,producto,unidades,importe);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}

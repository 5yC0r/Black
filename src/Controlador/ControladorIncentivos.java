/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAO.ClienteDAO;
import Modelo.DAO.IncentivosDAO;
import Vistas.Paneles.PanelBonosyComisiones;
import Vistas.Paneles.PanelRegistroCliente;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

/**
 *
 * @author MARIANA
 */
public class ControladorIncentivos {
    
    PanelBonosyComisiones pbc;
    DateFormat df = DateFormat.getDateInstance();
    
    public void setPanelBonosyComisiones(JInternalFrame jif) {
        this.pbc = (PanelBonosyComisiones) jif;
    }
    
    public void insertarDatos(){
    
        
        
        IncentivosDAO incentivosDao = new IncentivosDAO();
            
            String tipoIncentivo = pbc.jcbTipoIncentivo.getSelectedItem().toString();
            String nombreIncentivo = pbc.jtfNombreIncentivo.getText();
            String cantidadIncentivo = pbc.jtfCantidadIncentivo.getText();
            String sueldoVenta = pbc.jcbSueldoVentas.getSelectedItem().toString();
            String estadoIncentivo = pbc.jcbEstadoIncentivo.getSelectedItem().toString();

            String descripcionIncentivo = pbc.jtfDescripcionIncentivo.getText();
            String fechaIncentivo = df.format(pbc.jdcFechaIncentivo.getDate());
        
        try {
            incentivosDao.registrarIncentivo(tipoIncentivo,nombreIncentivo,cantidadIncentivo,sueldoVenta,estadoIncentivo,descripcionIncentivo,fechaIncentivo);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAO.CompraDAO;
import Vistas.Paneles.PanelNuevaCompra;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

/**
 *
 * @author MARIANA
 */
public class ControladorCompra {
    
    PanelNuevaCompra pnc;
    DateFormat df = DateFormat.getDateInstance();
    
     public void setPanelNuevaCompra(JInternalFrame jif) {
        this.pnc = (PanelNuevaCompra) jif;
    }
    
    public void insertarDatos() {
    
        String numeroComprobante = pnc.jtfNumeroComprobante.getText();
        int codProveedor = pnc.jcbProveedor.getSelectedIndex();
//        String vendedor = pnc.jtfNombreVendedor.getText();
        int codEmpleado =1; //revisar ojo
        String fechaCompra = df.format(pnc.jdcFechaCompra.getDate());
        String tipoPago = pnc.jcbTipoPago.getSelectedItem().toString();
        int diasPago = Integer.parseInt(pnc.jtfDiasPago.getText());
        float totalPago = Float.parseFloat(pnc.jtfTotalPagar.getText());
       
        CompraDAO compraDao = new CompraDAO();
        
        try {
            compraDao.registrarCompra(numeroComprobante,codProveedor,codEmpleado,fechaCompra,tipoPago,diasPago,totalPago);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
}

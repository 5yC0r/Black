/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAO.VentaDAO;
import Vistas.Paneles.PanelRegistroVentas;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

/**
 *
 * @author MARIANA
 */
public class ControladorVenta {
    
    PanelRegistroVentas prv;
    DateFormat df = DateFormat.getDateInstance();
    
    public void setPanelRegistroVentas(JInternalFrame jif) {
        this.prv = (PanelRegistroVentas) jif;
    }
    
    public void insertarDatos() {
    
        
        //int codigoVenta = Integer.parseInt(prv.jtfCodigoVenta.getText()); //se jalara de la base de datos codigo autoincrement
        String fechaVenta = df.format(prv.jdcFechaVenta.getDate());
        int responsableVenta = Integer.parseInt(prv.jtfResponsableVenta.getText());
        int codigoCliente = Integer.parseInt(prv.jtfCodigoCliente.getText());
        //String nombreCliente,
        float subTotalVenta = Float.parseFloat(prv.jtfSubtotalVenta.getText());
        float descuento = Float.parseFloat(prv.jtfDescuento.getText());
        float totalNetoVenta = Float.parseFloat(prv.jtfTotalVenta.getText());
       
        VentaDAO ventaDao = new VentaDAO();
        
        try {
            ventaDao.registrarVenta(fechaVenta,responsableVenta,codigoCliente,subTotalVenta,descuento,totalNetoVenta);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
}

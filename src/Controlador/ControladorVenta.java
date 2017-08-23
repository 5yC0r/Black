/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAO.ClienteDAO;
import Modelo.DAO.VentaDAO;
import Vistas.Paneles.PanelRegistroVentas;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;


public class ControladorVenta {
    
    PanelRegistroVentas prv;
    DateFormat df = DateFormat.getDateInstance();
    VentaDAO ventaDao = new VentaDAO();
    ClienteDAO clienteDao = new ClienteDAO();
    
    public void setPanelRegistroVentas(JInternalFrame jif) {
        this.prv = (PanelRegistroVentas) jif;
    }
    
    public void insertarDatos() {
        
        String fechaVenta = df.format(prv.jdcFechaVenta.getDate());        
        int codCliente = Integer.parseInt(prv.jtfCodigoCliente.getText());        
        try {
            String nomCliente = clienteDao.obtenerNombre(codCliente);
            System.out.println(nomCliente);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        float subTotalVenta = Float.parseFloat(prv.jtfSubtotalVenta1.getText());
        float descuento = Float.parseFloat(prv.jtfDescuento1.getText());
        float totalNetoVenta = Float.parseFloat(prv.jtfTotalVenta1.getText());
        int codEmpleado=1;
        
        try {
            ventaDao.registrarVenta(fechaVenta,codEmpleado,codCliente,subTotalVenta,descuento,totalNetoVenta);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAO.ProveedorDAO;
import Vistas.Paneles.PanelRegistroProveedor;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

/**
 *
 * @author MARIANA
 */
public class ControladorProveedor {
    
    PanelRegistroProveedor prp;
    
    public void setPanelRegistroProveedor(JInternalFrame jif) {
        this.prp = (PanelRegistroProveedor) jif;
    }
    
    public void insertarDatos() {
    
        String nombreProveedor = prp.jtfNombreProveedor.getText();
        String direccion = prp.jtfDireccionProveedor.getText();
        String telefono = prp.jtfTelefonoProveedor.getText();
        String celular = prp.jtfCelularProveedor.getText();
        String numeroCuenta = prp.jtfNumeroCuenta.getText();
        String diaPedido1 = prp.jtfPedido1.getText();
        String diaPedido2 = prp.jtfPedido2.getText();
       
        ProveedorDAO proveedorDao = new ProveedorDAO();
        
        try {
            proveedorDao.registrarProveedor(nombreProveedor,direccion,telefono,celular,numeroCuenta,diaPedido1,diaPedido2);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
}

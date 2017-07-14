/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAO.ClienteDAO;
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
public class ControladorCliente {
    
    PanelRegistroCliente prc;
    DateFormat df = DateFormat.getDateInstance();
    
    public void setPanelRegistroCliente(JInternalFrame jif) {
        this.prc = (PanelRegistroCliente) jif;
    }
    
    public void insertarDatos(){
                
        String tipoCliente = prc.jcbTipoCliente.getSelectedItem().toString();
        String tipoDoc = prc.jcbTipoDoc.getSelectedItem().toString();
        String numDoc = prc.jtfNumDoc.getText();
        String razonSocial = prc.jtfRazonSocial.getText();
        String nombresApellidos = prc.jtfNombresApellidos.getText();
        String fechaNacimiento = df.format(prc.jdcFechaNacimiento.getDate());
        String sexoCliente = prc.jcbSexoCliente.getSelectedItem().toString();
        String telefonoCliente = prc.jtfTelefonoCliente.getText();
        String celularCliente = prc.jtfCelularCliente.getText();
        String correoCliente = prc.jtfCorreoCliente.getText();
        String direccion = prc.jtfDireccionCliente.getText();

        String vendedor = prc.jtfVendedor.getText();
        String fechaRegistroCliente = df.format(prc.jdcFechaRegistro.getDate());
        
        ClienteDAO clienteDao = new ClienteDAO();
        
        try {
            clienteDao.registrarNuevoCliente(tipoCliente,tipoDoc,numDoc,razonSocial,nombresApellidos,fechaNacimiento,sexoCliente,telefonoCliente,celularCliente,correoCliente,direccion,vendedor,fechaRegistroCliente);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

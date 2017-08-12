/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAO.ClienteDAO;
import Modelo.DAO.EmpleadoDAO;
import Modelo.DAO.UsuarioDAO;
import Modelo.Usuario;
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
    Usuario usu = new Usuario();
    DateFormat df = DateFormat.getDateInstance();
    
    public void setPanelRegistroCliente(JInternalFrame jif) {
        this.prc = (PanelRegistroCliente) jif;
    }
    
    public void insertarDatos(){
        
        ClienteDAO clienteDao = new ClienteDAO();
        EmpleadoDAO empleadoDao = new EmpleadoDAO();
        
        int codEmpleado=1;
        String fechaNacimiento;
        
        // this.prc.jtfVendedor.setText("Fernada Ganoza");
        
        String tipoCliente = prc.jcbTipoCliente.getSelectedItem().toString();
        
        if(tipoCliente.equals("Persona Natural")){
            
            fechaNacimiento = df.format(prc.jdcFechaNacimiento.getDate());
        }else{
            fechaNacimiento = "";
        }
        String tipoDoc = prc.jcbTipoDoc.getText();
        String numDoc = prc.jtfNumDoc.getText();
        String razonSocial = prc.jtfRazonSocial.getText();
        String nombresApellidos = prc.jtfNombresApellidos.getText();
        
        String sexoCliente = prc.jcbSexoCliente.getSelectedItem().toString();
        
        if(sexoCliente.equals("Seleccione")){sexoCliente="";}
        
        String telefonoCliente = prc.jtfTelefonoCliente.getText();
        String celularCliente = prc.jtfCelularCliente.getText();
        String correoCliente = prc.jtfCorreoCliente.getText();
        String direccion = prc.jtfDireccionCliente.getText();

        String vendedor = prc.jtfVendedor.getText();
        String fechaRegistroCliente = df.format(prc.jdcFechaRegistro.getDate());
        
        
        
        try {
            
            
            codEmpleado = empleadoDao.obtenerCodigo(vendedor);
            clienteDao.registrarNuevoCliente(tipoCliente,tipoDoc,numDoc,razonSocial,nombresApellidos,fechaNacimiento,sexoCliente,telefonoCliente,celularCliente,correoCliente,direccion,codEmpleado,fechaRegistroCliente);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

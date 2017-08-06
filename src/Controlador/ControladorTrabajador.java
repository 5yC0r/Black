
package Controlador;

import Modelo.DAO.EmpleadoDAO;
import Modelo.DAO.UsuarioDAO;
import Vistas.Paneles.PanelRegistroTrabajador;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;


public class ControladorTrabajador {
    PanelRegistroTrabajador prt;
    DateFormat df = DateFormat.getDateInstance();

    public void setPanelRegistroTrabajador(JInternalFrame jif) {
        this.prt = (PanelRegistroTrabajador) jif;
    }
    
    public void insertarDatos(){
        //datos usuario
        String usuario = prt.jtfUsuario.getText();
        String clave = prt.jtfClaveUsuario.getText();
        String fechaRegistro = df.format(prt.jcFechaRegistroTrabajador.getDate());
        String tipoUsuario = prt.jcbCargoTrabajador.getSelectedItem().toString();
        
        //datos personales
        String nombresApellidos = prt.jtfApellidosNombres.getText();
        String telefonoContacto = prt.jtfTelefonoTrab.getText();
        String celular = prt.jtfCelularTrab.getText();
        String telefonoReferencia = prt.jtfTelRefTrab.getText();
        String direccion = prt.jtfDireccionTrab.getText();
        String fechaNacimiento = df.format(prt.jdcFechNacTrab.getDate());
        String correo = prt.jtfCorreoTrab.getText();
        String numeroCuenta = prt.jtfNumCuentaTrab.getText();
        int fechaPago = Integer.parseInt(prt.jtfFechaPago.getText());
        String hobby = prt.jtfHobbyTrab.getText();
        String sexo = prt.jcbSexoTrab.getSelectedItem().toString();
        int dni = Integer.parseInt(prt.jtfDniTrab.getText());        
        float sueldo = Float.parseFloat(prt.jtfSueldoTrab.getText());
       
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        EmpleadoDAO empleadoDao = new EmpleadoDAO();
        try {
            usuarioDao.registrarNuevoUsuario(usuario, clave, fechaRegistro, tipoUsuario);
            int codUsuario = usuarioDao.obtenerCodigo(usuario, clave);
            System.out.println(codUsuario);
            empleadoDao.registrarNuevoEmpleado(nombresApellidos,telefonoContacto,celular,telefonoReferencia, direccion,fechaNacimiento,correo,numeroCuenta, fechaPago, hobby, sexo,dni,sueldo,codUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


package Controlador;

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
        String fechaPago = prt.jtfFechaPago.getText();
        String hobby = prt.jtfHobbyTrab.getText();

        String sexo = prt.jcbSexoTrab.getSelectedItem().toString();;
        //char tipo;  //persona natural o juridica/* esto es para cliente*/

        //int dni = ;
        //int edad;
        //float sueldo;
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        try {
            usuarioDao.registrarNuevoUsuario(usuario, clave, fechaRegistro, tipoUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

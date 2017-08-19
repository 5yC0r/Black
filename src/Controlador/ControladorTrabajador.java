
package Controlador;

import Modelo.DAO.EmpleadoDAO;
import Modelo.DAO.UsuarioDAO;
import Vistas.Paneles.PanelRegistroTrabajador;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;


public class ControladorTrabajador {
    PanelRegistroTrabajador prt;
    //DateFormat df = DateFormat.getDateInstance();

    public void setPanelRegistroTrabajador(JInternalFrame jif) {
        this.prt = (PanelRegistroTrabajador) jif;
    }
    
    public int calculaEdad(int dia, int mes, int año) {
        Calendar today = Calendar.getInstance();

        int diff_year = today.get(Calendar.YEAR) -  año;
        int diff_month = today.get(Calendar.MONTH) - mes;
        int diff_day = today.get(Calendar.DAY_OF_MONTH) - dia;

        //Si está en ese año pero todavía no los ha cumplido
        if (diff_month < 0 || (diff_month == 0 && diff_day < 0)) {
            diff_year = diff_year - 1; //no aparecían los dos guiones del postincremento :|
        }
        return diff_year;
    }
    
    public void insertarDatos(){
        //datos usuario
        String usuario = prt.jtfUsuario.getText();
        String clave = prt.jtfClaveUsuario.getText();
        String fechaRegistro = prt.jcFechaRegistroTrabajador.getCalendar().toString();
        String tipoUsuario = prt.jcbCargoTrabajador.getSelectedItem().toString();
        
        //datos personales
        String nombresApellidos = prt.jtfApellidosNombres.getText();
        String telefonoContacto = prt.jtfTelefonoTrab.getText();
        String celular = prt.jtfCelularTrab.getText();
        String telefonoReferencia = prt.jtfTelRefTrab.getText();
        String direccion = prt.jtfDireccionTrab.getText();
        int dia = prt.jdcFechNacTrab.getCalendar().get(Calendar.DAY_OF_MONTH);
        int mes = prt.jdcFechNacTrab.getCalendar().get(Calendar.MONTH)+1;
        int año = prt.jdcFechNacTrab.getCalendar().get(Calendar.YEAR);
        String fechaNacimiento = prt.jdcFechNacTrab.getCalendar().toString();
        
       // calcularEdad(prt.jdcFechNacTrab.getCalendar());
        
        String correo = prt.jtfCorreoTrab.getText();
        String numeroCuenta = prt.jtfNumCuentaTrab.getText();
        int fechaPago = Integer.parseInt(prt.jtfFechaPago.getText());
        String hobby = prt.jtfHobbyTrab.getText();
        String sexo = prt.jcbSexoTrab.getSelectedItem().toString();
        String dni = prt.jtfDniTrab.getText();        
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

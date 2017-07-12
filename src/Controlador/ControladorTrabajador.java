
package Controlador;

import Modelo.DAO.UsuarioDAO;
import Vistas.Paneles.PanelRegistroTrabajador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

public class ControladorTrabajador {
    PanelRegistroTrabajador prt;

    public void setPanelRegistroTrabajador(JInternalFrame jif) {
        this.prt = (PanelRegistroTrabajador) jif;
    }
    
    public void insertarDatos(){
        String usuario = prt.jtfUsuario.getText();
        String clave = prt.jtfClaveUsuario.getText();

        UsuarioDAO usuarioDao = new UsuarioDAO();
        try {
            usuarioDao.registrarNuevoUsuario(usuario, clave);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

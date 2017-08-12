
package Controlador;

import Modelo.DAO.EmpresaDAO;
import Vistas.Bienvenida;
import Vistas.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorBienvenida  implements ActionListener{
    
    Bienvenida bienvenida;  
    Login login;
    EmpresaDAO empresaDao = new EmpresaDAO();
    
    public void darEventoABoton(){
        bienvenida.btnBienvenida.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== bienvenida.btnBienvenida){
            
            try {
                empresaDao.obtenerDatos(login);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorBienvenida.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            login.setVisible(true);
            login.setLocationRelativeTo(null);
            bienvenida.dispose();
        }
    }

    public Bienvenida getBienvenida() {
        return bienvenida;
    }

    public void setBienvenida(Bienvenida bienvenida) {
        this.bienvenida = bienvenida;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}

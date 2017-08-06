
package Controlador;

import Modelo.DAO.UsuarioDAO;
import Modelo.Usuario;
import Vistas.Login;
import Vistas.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControladorLogin implements ActionListener{
    
    Login login;
    Principal principal;
    UsuarioDAO usuarioDao;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    //EmpresaDAO empresaDao;
    String nom;
    
    public void darEventoABotones(){
        login.btnIngresar.addActionListener(this);
        login.btnSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == login.btnIngresar){
            //abrir ventana principal
            
            String user = login.tfUsuario.getText();
            String contra = String.valueOf(login.tfContra.getPassword());
            
            
            usuarioDao = new UsuarioDAO();
            //empresaDao = new EmpresaDAO();
            int rpta = 0;
            int cod = 0;
            
            if("".equals(user) && "".equals(user)){
               
                JOptionPane.showMessageDialog(null, "Ingrese sus datos porfavor !", "Advertencia", JOptionPane.WARNING_MESSAGE);
                

           //System.out.println("1");
            }else{
                try {
                //empresaDao.obtenerDatos();
                rpta = usuarioDao.validarUsuario(user, contra);
                cod = usuarioDao.obtenerCodigo(user, contra);
                nom = usuarioDao.obtenerNombre(cod);
                
                System.out.println(cod);
                System.out.println(nom);
                
                } catch (SQLException ex) {
                Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
           //System.out.println("0");
                if(rpta == 1){
                    principal.setVisible(true);
                    principal.setLocationRelativeTo(null);
                    principal.setExtendedState(Principal.MAXIMIZED_BOTH);
                    principal.setResizable(false);
                    login.dispose();
                    System.out.println("login correcto");
                }else{
                    System.out.println("datos erroneos");
                    login.tfContra.setText("");
                    login.tfUsuario.setText("");
                    JOptionPane.showMessageDialog(null, "Los datos son incorrectos !", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
             }
            
            
            
            
            
            
        }else{
            if(ae.getSource() == login.btnSalir){
                //cerrar ventana
                //System.out.println("hola");
                System.exit(0);
            }
        }
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }
    
    public Login getLogin() {
        return login;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public UsuarioDAO getUsuarioDao() {
        return usuarioDao;
    }
    
    public void setUsuarioDao(UsuarioDAO usuarioDao) {
        this.usuarioDao = usuarioDao;
    }
}

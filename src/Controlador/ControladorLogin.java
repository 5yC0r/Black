
package Controlador;

import Modelo.Usuario;
import Vistas.Login;
import Vistas.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorLogin implements ActionListener{
    
    Login login;
    Principal principal;
    Usuario usuario;
    
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
            
            usuario = new Usuario(user, contra);
            
            int rpta = usuario.validarUsuario(user, contra);
            
            if(rpta == 1){
                principal.setVisible(true);
                principal.setLocationRelativeTo(null);
                login.dispose();
            }else{
                System.out.println("datos erroneos");
            }
            
        }else{
            if(ae.getSource() == login.btnSalir){
                //cerrar ventana
                System.out.println("hola");
            }
        }
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }
}

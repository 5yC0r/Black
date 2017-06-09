
package Controlador;

import Vistas.Bienvenida;
import Vistas.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorBienvenida  implements ActionListener{
    
    Bienvenida bienvenida;  
    Login login;
    
    public void darEventoABoton(){
        bienvenida.btnBienvenida.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== bienvenida.btnBienvenida){
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

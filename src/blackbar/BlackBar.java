
package blackbar;

import Controlador.ControladorBienvenida;
import Controlador.ControladorLogin;
import Controlador.ControladorPrincipal;
import Vistas.Bienvenida;
import Vistas.Login;
import Vistas.Principal;

public class BlackBar {

    public static void main(String[] args) { 
        
        Bienvenida bienvenida = new Bienvenida();
        Login login = new Login();
        Principal principal = new Principal();
        
        ControladorBienvenida cb = new ControladorBienvenida();
        ControladorLogin cl = new ControladorLogin();
        ControladorPrincipal cp = new ControladorPrincipal();
        
        cb.setBienvenida(bienvenida);
        cb.setLogin(login);
        cb.darEventoABoton();
        
        cl.setLogin(login);
        cl.darEventoABotones();
        cl.setPrincipal(principal);
        
        cp.setPrincipal(principal);
        cp.darEventoBotones();

        bienvenida.setLocationRelativeTo(null);
        bienvenida.setVisible(true);
    }
}

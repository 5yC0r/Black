
package blackbar;

import Controlador.ControladorBienvenida;
import Controlador.ControladorLogin;
import Controlador.ControladorPrincipal;
import Modelo.Conexion;
import Vistas.Bienvenida;
import Vistas.Login;
import Vistas.Principal;

public class BlackBar {

    public static void main(String[] args) { 
        
        Conexion con = new Conexion();
        
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
        cp.setLogin(login);
        cp.darEventoBotones();

        bienvenida.setLocationRelativeTo(null);
        bienvenida.setVisible(true);
    }
}

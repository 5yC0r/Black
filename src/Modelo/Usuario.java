
package Modelo;

public class Usuario {
    //atributos
    String usuario;
    String contraseña;

    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
    public int validarUsuario(String usuario, String contraseña){
       if("admin".equals(usuario) && "123456".equals(contraseña)){
            return 1;
        }else{
            return 0;
        }
    }
}

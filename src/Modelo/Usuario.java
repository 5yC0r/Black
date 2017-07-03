
package Modelo;

public class Usuario {
    //atributos
    String usuario;
    String contraseña;
    String tipo;
    String fechaRegistro;

    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tipo = "";
        this.fechaRegistro = "" ;
                
        
    }
    
    public int validarUsuario(String usuario, String contraseña){
       if("admin".equals(usuario) && "123456".equals(contraseña)){
            return 1;
        }else{
            return 0;
        }
    }
}
